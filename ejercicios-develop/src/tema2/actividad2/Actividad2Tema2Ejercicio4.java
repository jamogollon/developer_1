package tema2.actividad2;
//Diseñar un programa que muestre el producto de los 10 primeros números impares.
public class Actividad2Tema2Ejercicio4 {

	public static void main(String[] args) {
		int contador=0, contImpares=0, result=1, impar=1;
		//Primera forma
		while(contImpares<10) {
			contador++;
			if(contador%2!=0) {
				result *=contador;
				contImpares++;
			}
		}
		//Otra forma
		for (int i=0; i<10; i++) {
			impar +=2;
			result *=impar;
		}
		System.out.println("El resultado es:"+result);

	}

}
