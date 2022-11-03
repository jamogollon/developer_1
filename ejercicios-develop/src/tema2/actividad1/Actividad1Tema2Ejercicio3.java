package tema2.actividad1;

import java.util.Scanner;

public class Actividad1Tema2Ejercicio3 {

	public static void main(String[] args) {
		int H,M,S;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		H=entrada.nextInt();

		System.out.println("Introduce un número:");
		M=entrada.nextInt();
		
		System.out.println("Introduce un número:");
		S=entrada.nextInt();
		
		if(H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60) {
			System.out.println("Hora correcta");				
	
		}
		else { 
			System.out.println("Hora incorrecta");				
		}
		
		entrada.close();


	}

}
