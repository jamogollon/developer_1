package tema2.actividad2;

import java.util.Scanner;

/*Realizar un juego para adivinar un número. Para ello pedir un número N,
y luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto a N.
El proceso termina cuando el usuario acierta.*/
public class Actividad2Tema2Ejercicio8 {

	public static void main(String[] args) {
		int n, numAdivinar;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número secreto:");
		numAdivinar=entrada.nextInt();

		do {
			System.out.print("Introduzca un número: ");
			n = entrada.nextInt();
			if (n > numAdivinar) {
				System.out.println("El número introducido es mayor al número que debe adivinar.");
			}
			else {
				System.out.println("El número introducido es menor al número que debe adivinar.");
			}

		}while(n != numAdivinar);
		
		System.out.println("Ha acertado, el número era " + numAdivinar + ".");
		entrada.close();		

	}

}
