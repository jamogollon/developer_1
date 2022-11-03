package EjemplosClase;
/**
 * Genera array de enteros aleatorios y con dimensión 5 hasta que sea capicua.
 * Debe imprimir el array conseguido y los intentos 
 * @author MiPc
 *
 */
public class GeneraArrayCapicua {

	public static void main(String[] args) {
		boolean contb=true;
		int cont=0;
		int[]miArray= new int[5];
		
		do {
			miArray=generaArray(5);
			if(esCapicua(miArray)) {
				System.out.println("Encontrado array capicua");
				muestraArray(miArray);
				System.out.println("Números de intentos:"+ cont);
				contb=false;
			}
			cont++;
		}while(contb);
		
	}
	/**
	 * genera un array de la dimensión que se le pasa con números aleatorios de 0 a 10.
	 * @param dimension
	 * @return
	 */
	public static int[] generaArray(int dimension) {
		int[] elArray=new int[dimension];
		
		for(int i=0; i<dimension; i++) {
			elArray[i]=(int)(Math.floor(10*Math.random()));
		}
		return elArray;
	}
	/**
	 * imprime por pantalla el array que se le pasa por parámetros
	 * @param elArray
	 */
	public static void muestraArray(int[] elArray) {
		
		for(int i=0; i< elArray.length; i++) {
			System.out.println(elArray[i]+" ");
		}
	}
	/**
	 * comprueba si el array que se le pasa por parámetros es capicua, en caso afirmativo devuelve true
	 * en caso negativo false.
	 * @param elArray
	 * @return
	 */
	public static boolean esCapicua(int[] elArray) {
		int[] arrayInverso = new int[elArray.length];
		
		//invierto el array original y lo guarado en arrayInverso
		for (int i=0; i< elArray.length; i++) {
			arrayInverso[i]=elArray[elArray.length-1-i];
		}
		//comparo los elementos de los dos arrays
		for(int i=0; i< elArray.length; i++) {
			if(arrayInverso[i]!=elArray[i])
				return false;
		}
		return true;
	}
}
