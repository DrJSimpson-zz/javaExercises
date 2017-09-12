public class Polimorfismo2 {

    public static void main(String[] args) {
        A[] arregloDeA = new A[5];
        arregloDeA[0] = new A();
        arregloDeA[1] = new B();
        arregloDeA[2] = new C();
        arregloDeA[3] = new D();
        arregloDeA[4] = new C();
        
        for (int i = 0; i < arregloDeA.length; i++) {
            System.out.println(arregloDeA[i].dameNumero());
        }
    }

    public static void primerPrueba() {
        A test = new A();
        B testB = new B();
        C testC = new C();
        D testD = new D();
        System.out.println(test.dameNumero());
        System.out.println(testB.dameNumero());
        System.out.println(testC.dameNumero());
        System.out.println(testD.dameNumero());
    }
}

class A {

    public int dameNumero() {
        return 6;
    }
}

class B extends A {

    @Override
    public int dameNumero() {
        return super.dameNumero() + 2;
    }

}

class C extends B {

}

class D extends C {

    @Override
    public int dameNumero() {
        return super.dameNumero() + 30;
    }

}
