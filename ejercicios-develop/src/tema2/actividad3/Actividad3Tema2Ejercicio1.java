package tema2.actividad3;

import java.util.Scanner;

public class Actividad3Tema2Ejercicio1 {

	public static void main(String[] args) {
		double numerosIntr[] = new double [5];
		double numerosAl[] = new double [5];
		double numerosComp[] = new double[10];
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Introduzca número: ");
			numerosIntr[i] = entrada.nextDouble();
			numerosAl[i] = 100*Math.random();
		}
		for (int i = 0; i < 10; i++) {
			if (i < 5) {
				numerosComp[i] = numerosIntr[i];
			}
			else {
				numerosComp[i] = numerosAl[i-5];
			}
		}
		
		System.out.println("Los números de ambos arrays son: ");
		for (int i = 0; i < 10; i++) {
			System.out.println(numerosComp[i]);
		}
				
		entrada.close();	

	}

}
