/**
 * 
 *Rellenar una matriz de 5x5 con números aleatorios enteros del 1 al 100 y que no se repita ninguno
 */
package EjemplosClase;


public class NoRepe {
	private static int miArray[][];
	public static void main(String[] args) {
		
		rellenaAleatBidi(5,5);

	}
	/**
	 *Método que rellena una matriz con números int aleatorios de 0 a 100. Se le pasa la dimensión que queremos para la matriz.
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
	 * Método que se le pasa 3 parámetros, le numero a buscar si está repe, y hasta que posición mira (porque está rellenando y va por ahí)
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
