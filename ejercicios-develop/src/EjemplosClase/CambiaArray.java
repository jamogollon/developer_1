package EjemplosClase;
/**
 * Ejemplo de clase: 
 * 1-Construye un método que se le pase la dimensión de
 * una matriz y la devuelva llena con números aleatorios.
 * 2-Diseña un método que se le pase una matriz y cambie todos los números 3
 * que encuentre por ceros.
 * 3-Otro método que ordene una matriz o array bidimensional, utilizando el algoritmo
 * o método de la burbuja. Dos formas distintas de hacerlo.
 * @author Antonio Moreno
 *
 */
public class CambiaArray {

	public static void main(String[] args) {
		int[][]myMatriz=new int[5][5];
		
			myMatriz=generarAleatorio(5,5);
			System.out.println();
			myMatriz=cambiaTres(myMatriz);
			System.out.println();
			myMatriz=ordenaArray(myMatriz);
			System.out.println();
			imprimePorConsola(myMatriz);
	}
	/**
	 * Método que recorre buscando el número 3 y si lo encuentra lo sustituye
	 * por un cero.
	 * @param p es una matriz que se le pasa como parametro
	 * @return devuelve una matriz.
	 */
	public static int[][]cambiaTres(int[][]p){
		
		for(int i=0; i< p[0].length;i++) {
			for(int j=0; j< p.length; j++) {
				if(p[i][j]==3)
					p[i][j]=0;
				System.out.print(p[i][j]+" ");
			}
			System.out.println();
		}
		return p;
	}
	/**
	 * Método que llena una matriz con números aleatorios (de 0 a 100)
	 * @param filas
	 * @param columnas
	 * @return una matriz con sus elementos generados.
	 */
	public static int[][] generarAleatorio(int filas, int columnas){
		int[][]generado= new int[filas][columnas];
		
		for(int i=0; i<filas; i++) {
			for(int j=0; j<columnas; j++) {
				generado[i][j]=(int)(100*Math.random());
				System.out.print(generado[i][j]+" ");
			}
			System.out.println();
		}
		return generado;
	}
	/**
	 * Metodo 1 o primera forma de hacerlo.
	 * método que ordena una matriz bidimensional. Cuando llega al final de la fila
	 * incrementa la fila y pone a cero la columna para continuar con el siguiente.
	 * @param miMatriz
	 * @return matriz bidi
	 */
	public static int[][] ordenaArray(int[][]miMatriz){
		int aux,k, l;
		for(int m=0; m<(miMatriz[0].length*miMatriz.length);m++) {
			for(int i=0; i<miMatriz[0].length; i++) {
				for(int j=0; j<miMatriz.length; j++) {
					if (j==miMatriz.length-1 && i<miMatriz[0].length-1) {	
						k=i+1;
						l=0;
					}
					else {
						k=i;
						l=j+1;
					}
					if(l>miMatriz.length-1)
						continue;
					if (miMatriz[i][j] > miMatriz[k][l]) {
						aux=miMatriz[i][j];
						miMatriz[i][j]=miMatriz[k][l];
						miMatriz[k][l]=aux;
					}
				}
			}
		}

		return miMatriz;
	}
	/**
	 * Método 2
	 * Este ordena, transformando el array bidimensional en uno monodimensional,
	 * despues se aplica el método de la burbuja y luego los valores se copian en 
	 * el bidimensional.
	 * @param miMatriz
	 * @return la matriz ordenada
	 */
	public static int[][] ordena1Array(int[][]miMatriz){
		int aux,k=0;
		int[] monoArray= new int[miMatriz[0].length*miMatriz.length];

		//rellenamos el array monodimensional con los valores del bidimensional	
		for(int i=0; i<miMatriz[0].length; i++) {
			for(int j=0; j<miMatriz.length; j++) {
				monoArray[k]=miMatriz[i][j];
				k++;
			}
		}
		//aplicamos el método de la burbuja al array monodimensional
		for(int i=0; i<monoArray.length-1; i++) {
			for(int j=0; j<monoArray.length; j++) {
				if (monoArray[j] > monoArray[j+1]) {
					aux=monoArray[j];
					monoArray[j]=monoArray[j+1];
					monoArray[j+1]=aux;
				}
			}
		}
		//copiamos los valores en el array bidimensional
		k=0;
		for(int i=0; i<miMatriz[0].length; i++) {
			for(int j=0; j<miMatriz.length; j++) {
				miMatriz[i][j]=monoArray[k];
				k++;
			}
		}
		return miMatriz;
	}
	public static void imprimePorConsola(int[][]miMatriz) {
		
		for(int i=0; i<miMatriz[0].length;i++) {
			for(int j=0; j<miMatriz.length;j++) {
				System.out.print(miMatriz[i][j]+" ");
			}
			System.out.println();
		}
	}

}




