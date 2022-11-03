package tema2.actividad1;

import java.util.Scanner;

public class Actividad1Tema2Ejercicio7 {

	public static void main(String[] args) {
		String strmes;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce un mes:");
		
		strmes=entrada.next();
		
		strmes = strmes.toLowerCase();
		
		switch(strmes) {
		case "enero": 
		System.out.println("Enero tiene 31 dias");
		break;
		case "febrero":
		System.out.println("Febrero tiene 28 dias");
		break;
		case "marzo":
		System.out.println("Marzo tiene 31 dias");
		break;
		case "abril":
		System.out.println("Abril tiene 30 dias");
		break;
		case "mayo":
		System.out.println("Mayo tiene 31 dias");
		break;
		case "junio":
		System.out.println("Junio tiene 30 dias");
		break;
		case "julio":
		System.out.println("Julio tiene 31 dias");
		break;
		case "agosto": 
		System.out.println("Agosto tiene 31 dias");
		break;
		case "septiembre": 
		System.out.println("Septiembre tiene 30 dias");
		break;
		case "octubre": 
		System.out.println("Octubre tiene 31 dias");
		break;
		case "noviembre": 
		System.out.println("Noviembre tiene 30 dias");
		break;
		case "diciembre":
		System.out.println("Diciembre tiene 31 dias");
		break;
		default:
			System.out.println("No es un mes válido");
}
		
		
		
		
		entrada.close();


	}

}
