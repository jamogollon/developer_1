package tema2.actividad2;

import java.util.Scanner;

/*Escribe un programa que pida un número N y comprueba si es un número primo. 
 * Recuerda un número primo es aquel que solo se puede dividir entre el mismo y la unidad,
 *  en cualquier otro caso la división tiene decimales.
 */
public class Actividad2Tema2Ejercicio9 {

	public static void main(String[] args) {
		int n;
		boolean primo = true;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduzca el número que desea comprobar si es primo: ");
		n = entrada.nextInt();
		
		for (int i=2; i<n; i++) {
			if(n%i==0) {
				primo=false;
				break;
			}
		}

		if (primo) {
			System.out.println("El número introducido es primo.");
		} 
		else {
			System.out.println("El número introducido no es primo.");
		}

		entrada.close();		

	}

}
