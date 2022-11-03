package EjemplosClase;
import java.util.Scanner;
//este método 1, está un poco más optimizado. Si está ordenado
//acaba, aunque no haya recorrido todas las veces.
public class MetodoBurbuja1 {

	public static void main(String[] args) {
		int dimension, aux, ordenacion;
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
		do {
			ordenacion=0;
			for(int j=0; j<dimension-1;j++) {
				if(numeros[j]>numeros[j+1]) {
					aux=numeros[j];
					numeros[j]=numeros[j+1];
					numeros[j+1]=aux;
					ordenacion++;//solo se incrementa si hay cambio
				}
			}
		}while(ordenacion>0);//si no hay cambios ya esta ordenador y acaba
		
		entrada.close();
	}

}
