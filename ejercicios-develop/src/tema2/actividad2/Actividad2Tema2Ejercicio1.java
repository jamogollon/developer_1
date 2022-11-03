package tema2.actividad2;

import java.util.Scanner;

//Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
public class Actividad2Tema2Ejercicio1 {

	public static void main(String[] args) {
		int n;
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.print("Introduzca un número positivo para calcular su cuadrado o negativo para salir: ");
			n = entrada.nextInt();
			if(n>0) {
				System.out.println("El cuadrado de " + n + " es " + Math.pow(n, 2));
			}
		} while (n >= 0);

		System.out.println("Ha introducido un número negativo.");
		entrada.close();

	}

}
