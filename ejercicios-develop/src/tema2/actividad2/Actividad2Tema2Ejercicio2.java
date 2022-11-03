package tema2.actividad2;

import java.util.Scanner;

//Pedir números hasta que se introduzca uno negativo, y calcular la media.
public class Actividad2Tema2Ejercicio2 {

	public static void main(String[] args) {
		float n, contador = 0, acumulador = 0, media = 0;
		Scanner entrada = new Scanner(System.in);

		//System.out.print("Introduzca un número positivo: ");
		//n = entrada.nextInt();

			do {
				
				System.out.print("Introduzca un número positivo: ");
				n = entrada.nextFloat();
				if (n>=0) {
					acumulador += n;
					contador++;
				}
			} while (n >= 0);
			if (contador>0) {
				media = acumulador/contador;
				System.out.println("La media de los números positivos introducidos es: " + media);
			}
		entrada.close();	}

}
