package tema2.actividad2;

import java.util.Scanner;

/*Realizar un juego para adivinar un n�mero. Para ello pedir un n�mero N,
y luego ir pidiendo n�meros indicando �mayor� o �menor� seg�n sea mayor o menor con respecto a N.
El proceso termina cuando el usuario acierta.*/
public class Actividad2Tema2Ejercicio8 {

	public static void main(String[] args) {
		int n, numAdivinar;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un n�mero secreto:");
		numAdivinar=entrada.nextInt();

		do {
			System.out.print("Introduzca un n�mero: ");
			n = entrada.nextInt();
			if (n > numAdivinar) {
				System.out.println("El n�mero introducido es mayor al n�mero que debe adivinar.");
			}
			else {
				System.out.println("El n�mero introducido es menor al n�mero que debe adivinar.");
			}

		}while(n != numAdivinar);
		
		System.out.println("Ha acertado, el n�mero era " + numAdivinar + ".");
		entrada.close();		

	}

}
