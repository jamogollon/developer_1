package tema2.actividad1;

import java.util.Scanner;

public class Actividad1Tema2Ejercicio1 {

	public static void main(String[] args) {
		int a;
		Scanner entrada=new Scanner(System.in);
		

		do{
			System.out.println("Introduce un n�mero:");
			a=entrada.nextInt();
			
			if(a % 3==0) {
				System.out.println("El n�mero "+a+" es multiplo de 3");
			}
			else {
				System.out.println("El n�mero "+a+" NO es multiplo de 3");
		
			}

		}while(a!=0);
		entrada.close();
	}

}
