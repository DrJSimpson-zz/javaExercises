import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int[] arreglo = {15,32,48,3,21,1,1,5};
		swap(arreglo, 0, 1);
		swap(arreglo, 2, 4);
		mostrarArreglo(arreglo);

	}

	public static void mostrarArreglo(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	//*
	//swap Mueve el valor de posDesde y lo guarda en posHasta
	//luego, mueve el valor que teníamos previamente en posHasta
	//al lugar de posDesde, por lo tanto hace un intercambio
	//por ejemplo, para posDesde = 1 y posHasta = 6, el valor de la
	//posición 1 pasa a la posición 6, y el valor de la posición 6
	//pasa a la posición 1
	public static void swap(int[] arr, int posDesde, int posHasta) {
		int aux = arr[posHasta];
		arr[posHasta] = arr[posDesde];
		arr[posDesde] = aux;
	}
}
