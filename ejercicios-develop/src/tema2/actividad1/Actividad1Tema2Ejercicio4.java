package tema2.actividad1;

import java.util.Scanner;

public class Actividad1Tema2Ejercicio4 {

	public static void main(String[] args) {
		int mes;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce un mes:");
		mes=entrada.nextInt();
		
		switch(mes){
			case 1: System.out.println("Es enero y tiene 31 días");
				break;
			case 2: System.out.println("Es febrero y tiene 28 días");
			break;
			case 3: System.out.println("Es marzo y tiene 31 días");
			break;
			case 4: System.out.println("Es abril y tiene 30 días");
			break;
			case 5: System.out.println("Es enero y tiene 31 días");
			break;
			case 6: System.out.println("Es enero y tiene 31 días");
			break;
			case 7: System.out.println("Es enero y tiene 31 días");
			break;
			case 8: System.out.println("Es enero y tiene 31 días");
			break;
			case 9: System.out.println("Es enero y tiene 31 días");
			break;
			case 10: System.out.println("Es enero y tiene 31 días");
			break;
			case 11: System.out.println("Es enero y tiene 31 días");
			break;
			case 12: System.out.println("Es enero y tiene 31 días");
			break;
			default: System.out.println("Número incorrecto");
		}
		if (mes==1 || mes==3 || mes==5 || mes==7 || mes== 8 || mes==10 || mes==12) {
			System.out.println("Este mes tiene 31");
		}
		else if (mes==2) {
			System.out.println("Este mes tiene 28");			
		}
		else {
			System.out.println("Este mes tiene 30");
		}
		
		entrada.close();
	}

}
