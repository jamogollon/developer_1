package tema2.actividad2;

import java.util.Scanner;

//Pide un n�mero (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho n�mero.
public class Actividad2Tema2Ejercicio6 {

	public static void main(String[] args) {
		int n;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduzca un n�mero entre 0 y 10: ");
		n = entrada.nextInt();

		for (int i = 0; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}

		entrada.close();

	}

}
