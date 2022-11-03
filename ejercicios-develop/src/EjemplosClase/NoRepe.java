/**
 * 
 *Rellenar una matriz de 5x5 con n�meros aleatorios enteros del 1 al 100 y que no se repita ninguno
 */
package EjemplosClase;


public class NoRepe {
	private static int miArray[][];
	public static void main(String[] args) {
		
		rellenaAleatBidi(5,5);

	}
	/**
	 *M�todo que rellena una matriz con n�meros int aleatorios de 0 a 100. Se le pasa la dimensi�n que queremos para la matriz.
	 * @param i
	 * @param j
	 */
	public static void rellenaAleatBidi(int i, int j) {
		int num;
		miArray=new int[i][j];
		for(int k=0;k<i;k++ ) {
			for(int l=0;l<j;l++) {
				do {
					num=(int) ( 100*Math.random());
				}while(compruebaRepeBidi(num, k, l));
				miArray[k][l]=num;
				System.out.print(miArray[k][l]+ " ");
			}
			System.out.println();
		}
	}
	/**
	 * M�todo que se le pasa 3 par�metros, le numero a buscar si est� repe, y hasta que posici�n mira (porque est� rellenando y va por ah�)
	 * @param num
	 * @param k
	 * @param l
	 * @return un boolean, si true=repe, false=no repe
	 */
	public static boolean compruebaRepeBidi(int num, int k, int l) {
		
		for (int i=0; i<miArray[0].length; i++) {
			for(int j=0; j<miArray.length; j++) {
				if (num== miArray[i][j]) {
					return true;
				}
				if (i>k || j>l) {
					return false;
				}
			}
		}
		return false;
	}
}
