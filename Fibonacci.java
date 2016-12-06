/**
 * @author gbene
 * Clase que resuelve fibonacci recursivo
 */
public class Fibbonaci {

	public static void main(String[] args) {
		//Ejemplo de sucesión
		//0 1 1 2 3 5 8 13 21 34
		System.out.println(nFib(4));
	}

	
	/**
	 * Esta funcion calcula el enésimo elmento de la sucesión de fibonacci
	 * @param n
	 * @return
	 * 0 -> 0
	 * 1 -> 1
	 * 2 -> 1
	 * 3 -> 2
	 */
	public static int nFib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int val1 = nFib(n-1);
		int val2 = nFib(n-2);
		return val1 + val2;
	}
}
