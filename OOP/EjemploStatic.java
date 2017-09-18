import java.util.Scanner;

public class EjemploStatic {
	public static void main(String[] args) {
		//Creo una instancia de la clase Test
		Test t1 = new Test();
		t1.num = 10;
		//Creo otra instanca de la clase Test
		Test t2 = new Test();
		t2.num = 20;
		System.out.println(t1.getNum() + " " + Test.snum);
		System.out.println(t2.getNum()  + " " + t2.snum);
	}
}

class Test {
	//variable de instancia
	int num;
	//al ser static el número corresponde a la clase
	static int snum = 10;
	
	//al no ser static el método corresponde a una instancia
	public int getNum() {
		return num;
	}
	
	/*
	//intento crear un método estático
	public static int getNumTimes2() {
		//no puedo utilizar la palabra clave this
		//porque no tengo un contexto de objeto
		//en un método estático
		return this.num * 2;
	}*/
	
	public static Test testFactory() {
		Scanner s = new Scanner(System.in);
		Test toReturn = new Test();
		
		System.out.println("Ingrese el numero");
		toReturn.num = s.nextInt();
		
		return toReturn;
	}

	//Este método debe clonar una instancia
	public Test clonar() {
		
	}
	
	
}
