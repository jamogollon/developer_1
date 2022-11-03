package tema2.actividad3;
/**
 * Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: 
 * la posición T[n,m]debe contener n+m. Después se debe mostrar su contenido.
 * @author MiPc
 *
 */
public class Actividad3Tema2Ejercicio4 {

	public static void main(String[] args) {
		int miMatriz[][] = new int[5][5];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++){
				miMatriz[i][j] = i+j;
				System.out.printf("%2d ",miMatriz[i][j]);
			}
			System.out.println();
		}
	}

}
