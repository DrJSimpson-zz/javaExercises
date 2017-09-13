public class Polimorfismo2 {

    public static void main(String[] args) {
	//Creo un arreglo del tipo superior de la jerarquía de clases creada
	//o sea es un arreglo del tipo A
        A[] arregloDeA = new A[5];
	//En este caso asigno un objeto del tipo A
        arregloDeA[0] = new A();
	//En este caso asigno un objeto del tipo B
        arregloDeA[1] = new B();
	//En este caso asigno un objeto del tipo C
        arregloDeA[2] = new C();
	//En este caso asigno un objeto del tipo D
        arregloDeA[3] = new D();
        arregloDeA[4] = new C();
        
        for (int i = 0; i < arregloDeA.length; i++) {
	    //En este caso cada método resuelve como está implementado
	    //en la subclase
            System.out.println(arregloDeA[i].dameNumero());
        }
    }

    public static void primerPrueba() {
	//crear objetos, y usar variables de referencia del tipo del objeto
	//que estoy creando
        A test = new A();
        B testB = new B();
        C testC = new C();
        D testD = new D();
	//la salida, va a ser la que corresponda con cada implementación
        System.out.println(test.dameNumero());
	//6
        System.out.println(testB.dameNumero());
	//8
        System.out.println(testC.dameNumero());
	//8
        System.out.println(testD.dameNumero());
	//38
    }
}

//Esta es una clase de prueba, solamente tiene un método trivial, que 
//simplemente retorna el número 6
class A {

    public int dameNumero() {
        return 6;
    }
}

//Esta clase, es una subclase, o hereda de la clase A
//Herencia: permite extender o especializar la funcionalidad de una superclase
//en este caso, usamos B para sobreescribir (override) del método trivial
//dameNumero
class B extends A {
    //la notación Override, sirve para dejar especificado que se ha sobre
    //escrito el método dameNumero()
    @Override
    public int dameNumero() {
	//cambiamos el comportamiento del método dameNumero() a partir de la
	//clase B, en la jerarquía de clases, este método va a retornar el
	//valor que retornaba la implementación de la superclase, sumando 2
        return super.dameNumero() + 2;
	//la palabra super, apunta al scope de la clase padre
	//en este caso, B es subclase de A, por lo tanto, llama a la
	//implementación del método dameNumero de la clase A
    }

}

//Este ejemplo, también trivial, es subclase de la clase B, si bien está
//un poco mas alejada de A que está al tope de la jerarquía, también comparte
//atributos y métodos
class C extends B {
    //En este caso, yo no redefino el método (o sobreescribo) el método 
    //dameNumero, es decir que si yo llamo a dameNumero desde C, el método
    //invocado va a ser la implementación de dameNumero inmediatamente 
    //superior
}

class D extends C {

    @Override
    public int dameNumero() {
        return super.dameNumero() + 30;
    }

}
