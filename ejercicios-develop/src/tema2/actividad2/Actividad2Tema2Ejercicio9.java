package tema2.actividad2;

import java.util.Scanner;

/*Escribe un programa que pida un n�mero N y comprueba si es un n�mero primo. 
 * Recuerda un n�mero primo es aquel que solo se puede dividir entre el mismo y la unidad,
 *  en cualquier otro caso la divisi�n tiene decimales.
 */
public class Actividad2Tema2Ejercicio9 {

	public static void main(String[] args) {
		int n;
		boolean primo = true;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduzca el n�mero que desea comprobar si es primo: ");
		n = entrada.nextInt();
		
		for (int i=2; i<n; i++) {
			if(n%i==0) {
				primo=false;
				break;
			}
		}

		if (primo) {
			System.out.println("El n�mero introducido es primo.");
		} 
		else {
			System.out.println("El n�mero introducido no es primo.");
		}

		entrada.close();		

	}

}
