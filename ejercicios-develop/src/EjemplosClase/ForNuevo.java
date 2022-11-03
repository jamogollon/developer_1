//Ejemplo clase 3/10/2020; utilización del "for para todo"
package EjemplosClase;

public class ForNuevo {

	public static void main(String[] args) {
		
		String[] diasemana= {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes",
				"Sabado", "Domingo"};
		int[] numeros= {5,8,9,4,3};
		
		for(String dia:diasemana) {//recorre todos los terminos del array, en "dia" se guarda el valor del array no el indice
			System.out.println(dia);
		}
		for (int num:numeros) {
			System.out.println(num);
		}

	}

}
