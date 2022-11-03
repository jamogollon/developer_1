package tema2.actividad2;

import java.util.Scanner;

//Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
public class Actividad2Tema2Ejercicio7 {

	public static void main(String[] args) {
		int n, i = 0;
		float sueldo = 0, sueldoMax = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.print("¿Cuántos sueldos quiere introducir? ");
		n = entrada.nextInt();

		while (i < n) {
			System.out.print("Introduzca un sueldo: ");
			sueldo = entrada.nextFloat();
			if (sueldo > sueldoMax) {
				sueldoMax = sueldo;
			}
			i++;
		}
		if (i > 0) {
			System.out.println("El mayor sueldo es: " + sueldoMax);
		}
		else {
			System.out.println("No ha introducido ningún sueldo.");
		}
		entrada.close();

	}

}
