package tema2.actividad1;

import java.util.Scanner;

public class Actividad1Tema2Ejercicio5 {

	public static void main(String[] args) {
		int eva1,eva2,eva3;
		float media;
		Scanner entrada=new Scanner(System.in);
		
		
		System.out.println("Introduce nota de la 1� evaluaci�n:");
		eva1=entrada.nextInt();

		System.out.println("Introduce nota de la 2� evaluaci�n:");
		eva2=entrada.nextInt();
		
		System.out.println("Introduce nota de la 3� evaluaci�n:");
		eva3=entrada.nextInt();

		if(eva1>=5 && eva2>=5 && eva3>=5) {
			media= (eva1+eva2+eva3)/3;
			System.out.println("La media es:"+ media);
		}
		else{
			if (eva1<5) {
				System.out.println("Debes recuperar la 1� eva");
			}
			if (eva2<5) {
				System.out.println("Debes recuperar la 2� eva");				
			}
			if (eva3<5) {
				System.out.println("Debes recuperar la 3� eva");				
			}
		}
		
		entrada.close();
	}

}
