package tema2.actividad1;

import java.util.Scanner;

public class Actividad1Tema2Ejercicio6 {

	public static void main(String[] args) {
		int numHoras, sueldo;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce el número de horas trabajadas:");
		numHoras=entrada.nextInt();
		
		if (numHoras <=150) {
			sueldo=numHoras*10;
			System.out.println("El sueldo es:"+ sueldo);
		}
		else {
			sueldo = (numHoras -150)*20+150*10;
			System.out.println("El sueldo es:"+ sueldo);
		}
		
		entrada.close();
	}

}
