package tema2.actividad2;

import java.util.Scanner;

//Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.
public class Actividad2Tema2Ejercicio5 {

	public static void main(String[] args) {
		float contN = 0, contP = 0, contC = 0, acN = 0, acP = 0, mediaN = 0, mediaP = 0, n = 0;
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print("Introduzca un número: ");
			n = entrada.nextInt();

			if (n > 0) {
				acP = acP + n;
				contP++;
			} else if (n < 0) {
				acN = acN + n;
				contN++;
			} else {
				contC++;
			}
		}

		if (contP > 0) {
			mediaP = acP / contP;
			System.out.println("La media de los números positivos es: " + mediaP + ".");
		}

		else {
			System.out.println("No ha introducido números positivos.");
		}
		if (contN > 0) {
			mediaN = acN / contN;
			System.out.println("La media de los números negativos es: " + mediaN + ".");
		} 
		
		else {
			System.out.println("No ha introducido números negativos.");
		}

		System.out.println("Ha introducido " + contC + " ceros.");

		entrada.close();	

	}

}
