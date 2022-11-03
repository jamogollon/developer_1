package tema2.actividad1;

import java.util.Scanner;

public class Actividad1Tema2Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.print("Introduce una hora en formato 12 horas: ");
		String hora = entrada.nextLine();
		
			switch (hora) {
				case "01:00": 
				System.out.println("Es la una en punto");
				break;
				case "02:00": 
				System.out.println("Son las dos en punto");
				break;
				case "03:00": 
				System.out.println("Son las tres en punto");
				break;
				case "04:00": 
				System.out.println("Son las cuatro en punto");
				break;
				case "05:00": 
				System.out.println("Son las cinco en punto");
				break;
				case "06:00": 
				System.out.println("Son las seis en punto");
				break;
				case "07:00": 
				System.out.println("Son las siete en punto");
				break;
				case "08:00": 
				System.out.println("Son las ocho en punto");
				break;
				case "09:00": 
				System.out.println("Son las nueve en punto");
				break;
				case "10:00": 
				System.out.println("Son las diez en punto");
				break;
				case "11:00": 
				System.out.println("Son las once en punto");
				break;
				case "12:00": 
				System.out.println("Son las doce en punto");
				break;
				default:
					System.out.println("No es una hora válida (en punto)");
		}
		entrada.close();
	}

}
