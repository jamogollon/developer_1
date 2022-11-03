package tema2.actividad1;

import java.util.Scanner;

public class Actividad1Tema2Ejercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.print("Introduce un número del 0 al 10 en su forma escrita: ");
		String numero = entrada.nextLine();
		
			switch (numero) {
				case "cero":
				System.out.println("0");
				break;
				case "uno": 
				System.out.println("1");
				break;
				case "dos": 
				System.out.println("2");
				break;
				case "tres": 
				System.out.println("3");
				break;
				case "cuatro": 
				System.out.println("4");
				break;
				case "cinco": 
				System.out.println("5");
				break;
				case "seis": 
				System.out.println("6");
				break;
				case "siete": 
				System.out.println("7");
				break;
				case "ocho": 
				System.out.println("8");
				break;
				case "nueve": 
				System.out.println("9");
				break;
				case "diez": 
				System.out.println("10");
				break;
				default:
					System.out.println("El número introducido no está entre cero y diez");
		}
		entrada.close();
	}

}
