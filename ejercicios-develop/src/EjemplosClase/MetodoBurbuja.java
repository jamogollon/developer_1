package EjemplosClase;
import java.util.Scanner;

public class MetodoBurbuja {

	public static void main(String[] args) {
		int dimension, aux;
		int[] numeros;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la dimensión del array:");
		dimension=entrada.nextInt();
		
		numeros=new int[dimension];
		
		for(int i=0; i<dimension;i++) {
			System.out.println("Introduce un número:");
			numeros[i]= entrada.nextInt();//
		}
		
		//METODO BURBUJA
		for(int i=0; i<dimension-1; i++) {
			for(int j=0; j<dimension-1;j++) {
				if(numeros[j]>numeros[j+1]) {
					aux=numeros[j];
					numeros[j]=numeros[j+1];
					numeros[j+1]=aux;
				}
			}
		}
		
		entrada.close();
		
		
		
		
		
		
		
		
		
		

	}

}