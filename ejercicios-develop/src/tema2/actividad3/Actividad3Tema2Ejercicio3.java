package tema2.actividad3;
/**
 * Rota los elementos de un array.
 * @author MiPc
 *
 */
public class Actividad3Tema2Ejercicio3 {

	public static void main(String[] args) {
		int numeros[] = {1, 2, 3, 4, 5};
		int numerosInv[] = new int[5];
		int c = 0;
		
		//imprimo por pantalla
		System.out.println("El array inicial es: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(numeros[i] + " ");
		}
		//creo array invertido
		for (int i = 4; i >= 0; i--) {
			numerosInv[c] = numeros[i];
			c++;
		}
		//imprimo por pantalla
		System.out.println("El array invertido es: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(numerosInv[i] + " ");
		}
	}

}
