public class Main {

	public static void main(String[] args) {
		int a = 5; // a es un entero que guarda 5
		int b = 5; // b es un entero que guarda 5

		System.out.println(a == b); // a es equivalente con b?
		System.out.println(!(a == b)); // niego el resultado
		System.out.println(a > b); // a es mayor a b?
		System.out.println(a < b); // a es menor que b?
		System.out.println(a >= b); // a es mayor o igual que b?
		System.out.println(a <= b); // a es menor o igual que b?

		///////////////
		// Condicional//
		///////////////

		// Para true, se ejecuta el siguiente bloque
		if (true) {
			System.out.println("Es verdadero, me ejecuto");
		}

		// Para false, el bloque del if no se ejecuta, pero el else si!!!
		if (false) {
			System.out.println("Nunca me voy a ejecutar :(");
		} else {
			System.out.println("Siempre me voy a ejecutar :)");
		}

		////////////////////////
		// Operadores booleanos//
		////////////////////////

		if (true && true) {
			System.out.println("El && solo da true si todas las entradas son true");
		}

		if (false || false) {
			System.out.println("Nunca se va a ejecutar, || da false si todas las entradas son false");
		} else {
			System.out.println("Pero el else si se ejecuta!!!");
		}

		if (!false) {
			System.out.println("Quién se ejecutara?!");
		} else {
			System.out.println("Creo que yo no :P");
		}

		/////////////
		// Iteración//
		/////////////
		int i = 0;

		// while, itera mientras se cumpla la condición, evalua, luego itera
		while (i < 5) {
			System.out.println("i vale: " + i);
			i++;
		}

		// do while, itera mientras se cumpla la condición, pero hace primero
		// una vez
		i = 0;
		do {
			System.out.println("i vale: " + i);
			i++;
		} while (i < 5);

		// for, itera a sabiendas de cuantas veces debe hacer la iteración
		for (int j = 0; j < 5; j++) {
			System.out.println("i vale: ");
		}

		decirHola();
		
		//llamo sin resguardar lo que estoy retornando
		sumarNumeros(5, 10);
		
		//llamo y resguardo
		int x = sumarNumeros(2, 2);
		System.out.println("X guarda el resultado del llamado!!! : " + x);
	}
	
	//funciones, dentro de la clase Main, las usaremos
	//empiezan siempre con public static
	//y luego va el tipo que retornan
	//el nombre
	//y los parámetros
	public static void decirHola() {
		System.out.println("Hola desde un procedimiento");
	}

	public static int sumarNumeros(int a, int b) {
		System.out.println("sumo a: " + a);
		System.out.println("+ b: " + b);
		return a + b;
	}
}
