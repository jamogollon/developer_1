package tema2.actividad3;

import java.util.Scanner;
/**
 * Leer 10 números enteros (guardarlos en una tabla). Debemos mostrarlos en el siguiente orden: 
 * el primero, el último, el segundo, el penúltimo, el tercero, etc.
 * @author Alejandro Beltrán
 *
 */
public class Actividad3Tema2Ejercicio2 {

	public static void main(String[] args) {
		int numeros[] = new int[10];
		int b = 0, c = 0;
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Introduzca número: ");
			numeros[i] = entrada.nextInt();
		}
		
		System.out.println("Los números introducidos son: ");		
		for(int i = 0; i < 10; i++) {
			if (i % 2 == 0) {//si i es par (0,2,4,6...) imprime el que esta en la posición b(0,1,2,3...) 
				System.out.println(numeros[b]);
				b++;
			}
			else {//si i es impar empezando por el ultimo imprime el que está en la posición c(9-0,9-1,9-2,...)
				System.out.println(numeros[9-c]);
				c++;
			}
		}
				
		entrada.close();
		

	}

}
