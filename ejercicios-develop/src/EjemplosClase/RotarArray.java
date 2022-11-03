package EjemplosClase;

import java.util.Scanner;
//Rotar valores de un array

public class RotarArray {
	static int[] arrayEntrada = new int[10];
	static int[] arraySalida = new int[10];
	static Scanner entrada = new Scanner(System.in);

	public static void main (String[] args) {		
		rellenaArray();		
		trasponerArray();		
		mostrarArray(arrayEntrada);
		mostrarArray(arraySalida);	
	}

	public static void rellenaArray() {	
		for(int i=0; i<arrayEntrada.length;i++) {
			System.out.println("Introduce un número:");
			arrayEntrada[i]= entrada.nextInt();
		}	
	}
	
	public static void trasponerArray() {
		for(int i= 0; i<arraySalida.length; i++) {
			  arraySalida[arraySalida.length-1-i] = arrayEntrada[i];	
		}	
	}
	
	public static void mostrarArray(int[] miArray) {
		for(int i=0; i<miArray.length;i++) {
			System.out.print(miArray[i]);
		}
		System.out.println();
	}
}
