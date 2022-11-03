package tema2.actividad2;

import java.util.Scanner;

/*Realiza el control de acceso a una caja fuerte. La combinación será un número de cuatro cifras.
 *  El programa nos pide la combinación para abrirla. Si no acertamos,
 *   se nos mostrará el mensaje “Clave incorrecta le quedan x intentos”,
 *    si agota los intentos mostrará el mensaje “Lo siento has agotado las 4 oportunidades” y 
 *    si acertamos se nos dirá “Has abierto la caja fuerte”.
 */
public class Actividad2Tema2Ejercicio10 {

	public static void main(String[] args) {
		int combi= 4354, contrasena;
		int intentos=0;

		Scanner entrada=new Scanner(System.in);

		do {
			System.out.println("Introduce contraseña:");
			contrasena=entrada.nextInt();
			if (contrasena==combi) {
				intentos = 4;
				System.out.println("Enhorabuena has acertado");
			}
			intentos++;
			if (intentos>3) {
				System.out.println("Lo siento has agotado los intentos");
			}
			else {
				System.out.println("Lo siento no has acertado,"
						+ " te quedan" + (4-intentos) + " intentos");
			}
		}while (intentos<=3);
		
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();
	}

}
