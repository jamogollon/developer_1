package tema2.actividad1;

import java.util.Scanner;

public class Actividad1Tema2Ejercicio2 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		a=entrada.nextInt();

		System.out.println("Introduce un número:");
		b=entrada.nextInt();
		
		System.out.println("Introduce un número:");
		c=entrada.nextInt();
		
		if(a>b && a>c) {
			System.out.println("El mayor es: " +a);
		}
		else if(b>a && b >c){
			System.out.println("El mayor es: " +b);			
		}
		else {
			System.out.println("El mayor es: " +c);

		}
		
		entrada.close();


	}

}
