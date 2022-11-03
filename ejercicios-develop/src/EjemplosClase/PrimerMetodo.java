package EjemplosClase;

import java.util.Scanner;

public class PrimerMetodo {

	public static void main(String[] args) {
		int num1, num2, resultado;
		float resultDivision;
		//boolean otravuelta=true; //bandera
		String seleccion; 
		Scanner entrada= new Scanner(System.in);
		
		do{
		//while(otravuelta) {
			System.out.println("Introduce dos números:");
			num1=entrada.nextInt();
			num2=entrada.nextInt();
			
			System.out.println("Elige una opción:");
			System.out.println("S suma:");
			System.out.println("M multiplica:");
			System.out.println("R resta:");
			System.out.println("D divide:");
			System.out.println("E salir:");
			
			seleccion=entrada.next();
			switch(seleccion) {
				case "S":resultado=sumaNumeros(num1, num2);
						System.out.println("La suma es:" +resultado);
					break;
				case "M":resultado=multiNumeros(num1, num2);
						System.out.println("El producto es:"+resultado);
					break;
				case "R":resultado =restaNumeros(num1, num2);
						System.out.println("La resta es:"+resultado);
					break;
				case "D":resultDivision=diviNumeros(num1, num2);
						System.out.println("La division es:"+resultDivision);			
					break;
				case "E"://otravuelta=false;
					break;
				default: System.out.println("Selecciona una letra del menú:");
			}
		}while(!seleccion.equals("E"));
		entrada.close();

	}
	public static int sumaNumeros(int a, int b) {
		int suma;
		
		suma =a+b;
		return suma;
	}
	public static int multiNumeros(int a, int b) {
		int multiplica;
		
		multiplica = a * b;
		return multiplica;
	}
	public static int restaNumeros(int a, int b) {
		int resta;
		
		resta = a-b;
		return resta;
	}
	public static float diviNumeros(int a, int b) {
		float division;
		
		if (b!=0) {
			division= a/b;
		}
		else {
			division=0;
		}
		return division;
	}
	
	
	
	
	
	
	
	
	
}
