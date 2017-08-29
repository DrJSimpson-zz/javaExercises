import java.util.Scanner;

public class MainDos {
	static int cantPasadas1 = 0;
	public static void main(String args[]) {
		int[] arreglo = {15,32,48,3,21,1,1,5};
		int[] arreglo2 = {15,32,48,3,21,1,1,5};
		mostrarArreglo(arreglo);

		System.out.println("-------------");
		/*for (int i = 1; i < arreglo.length; i++) {
			//m1(arreglo);
			m2(arreglo, i);
		}*/

		/*for (int i = arreglo2.length-1; i > 1; i--) {
			m3(arreglo2, i);
		}*/

		int min = 1;
		int max = arreglo.length - 1;
		while (max - min > 1) {
			m2(arreglo2, min);
			min++;
			if (max - min < 1) {
				continue;
			}
			m3(arreglo2, max);
			max--;

		}

		System.out.println("Cantidad de pasadas:" + cantPasadas1);
		mostrarArreglo(arreglo2);

	}

	public static void mostrarArreglo(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " | ");
		}
		System.out.println();
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

	//Este método sirve para mover el número mas pequeño a la primer
	//posición de un arreglo
	public static void m1(int[] arr) {
		cantPasadas1++;
		for (int i = arr.length - 1; i >= 1; i--) {
			cantPasadas1++;
			if (arr[i] < arr[i - 1]) {
				swap(arr, i, i-1);
			}
		}

	}
	
	//Este procedimiento pone el numero mas chico del arreglo
	//en la posición posMasChico - 1
	public static void m2(int[] arr, int posMasChico) {
		cantPasadas1++;
		System.out.println("Pos mas chico: " + posMasChico);
		for (int i = arr.length - 1; i >= posMasChico; i--) {
			cantPasadas1++;
			if (arr[i] < arr[i - 1]) {
				swap(arr, i, i-1);
			}
		}

	}

	//Este procedimiento pone el numero mas grande en la posicion
	//posMasGrande - 1
	public static void m3(int[] arr, int posMasGrande) {
		cantPasadas1++;
		System.out.println("Pos mas grande: " + posMasGrande);
		for (int i = 0; i <= posMasGrande-1; i++) {
			cantPasadas1++;
			if (arr[i] > arr[i + 1]) {
				swap(arr, i, i+1);
			}
		}

	}

}
