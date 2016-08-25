import java.util.Scanner;


public class Est {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int comb;
		int pos;
		System.out.println("Ingrese la cantidad a combinar (cant dados)");
		comb = s.nextInt();
		System.out.println("Ingrese la cantidad de posibilidades (cant caras)");
		pos = s.nextInt();
		
		//hardcodeo cuz im dumb
		comb = 3;
		pos = 6;
		
		int cant = pos;
		
		for (int i = comb; i > 1; i--) {
			cant = cant * pos;
		}
		
		int[][] matriz = new int[cant][comb + 1];

		int d1, d2, d3;
		d1 = 1;
		d2 = 1;
		d3 = 1;
		
		for (int i = 0; i < cant; i++) {
			
			matriz[i][0] = d1;
			matriz[i][1] = d2;
			matriz[i][2] = d3;
			matriz[i][3] = d1+d2+d3;
			d3++;
			
			if (d3 > 6) {
				d2++;
				d3 = 1;
			}
			
			if (d2 > 6) {
				d1++;
				d2 = 1;
			}
			
			
			
		}
		
		for (int i = 0; i < cant; i++) {
			System.out.println("Posibilidad-> "+ (i+1) +" D1: " + matriz[i][0] + " D2: " + matriz[i][1] +" D3: " + matriz[i][2] + " Suma: " + matriz[i][3]);
		}
		
		
		
	}

}
