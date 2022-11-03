//Ejemplo de array bidimensional. Rellenarlo y enseñarlo por pantalla
package EjemplosClase;

public class ArrayBidi {

	public static void main(String[] args) {
		
		int[][]miMatriz=new int[3][3];
		
		for(int i=0; i<3;i++) {
			for(int j=0; j<3;j++) {
				miMatriz[i][j]=(int)(100*Math.random());//dando valores a la matriz con números aleatorios entre 0 y 99
			}
		}
		
		for(int i=0; i<3;i++) {
			for(int j=0; j<3;j++) {
				System.out.print(miMatriz[i][j]+" ");//imprime en la misma línea
			}
			System.out.println();//salto de línea
		}

		
	}

}
