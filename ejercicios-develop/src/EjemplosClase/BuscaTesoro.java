package EjemplosClase;
/**
 * Minijuego "Busca el tesoro"
 * 
 * Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de
 * cuatro filas por cinco columnas. El usuario intentará averiguar dónde
 * está el tesoro.
 * 
 * @author Luis José Sánchez
 */
import java.util.*;

public class BuscaTesoro {
	// se definen constantes para representar el
	// contenido de las celdas
	static final int VACIO = 0;
	static final int MINA = 1;
	static final int TESORO = 2;
	static final int INTENTO = 3;
	static int minaX;
	static int minaY;
	static int tesoroX;
	static int tesoroY;

	public static void main(String[] args) {
		
		Scanner ent= new Scanner(System.in);

		int x; //filas
		int y; //columnas
		int[][] cuadrante = new int[5][4];

		// inicializa el array
		inicializaArray(cuadrante);
		
		// coloca la mina
		colocaMina(cuadrante);

		// coloca el tesoro
		colocaTesoro(cuadrante);

		// juego
		System.out.println("¡BUSCA EL TESORO!");
		boolean salir = false;
		do {
			// pinta el cuadrante
			pintaCuadranteOculto(cuadrante);
			// pide las coordenadas  
			System.out.print("Coordenada x: ");
			//x = Integer.parseInt(System.console().readLine());
			x= ent.nextInt();
			System.out.print("Coordenada y: ");
			//y = Integer.parseInt(System.console().readLine());
			y=ent.nextInt();
			// mira lo que hay en las coordenadas indicadas por el usuario
			switch(cuadrante[x][y]) {
			case VACIO:
				cuadrante[x][y] = INTENTO;
				break;
			case MINA:
				System.out.println("Lo siento, has perdido.");
				salir = true;
				break;
			case TESORO:
				System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!"); 
				salir = true;
				break;
			default:
			}
		} while (!salir);

		// pinta el cuadrante real
		pintaCuadranteReal(cuadrante);
		
		ent.close();
	}
	
	/**
	 * Rellena el cuadrante con VACIO que son ceros
	 * @param cuadrante
	 */
	public static void inicializaArray(int[][] cuadrante) {
		for(int x = 0; x < 4; x++) {
			for(int y = 0; y < 3; y++) {
				cuadrante[x][y] = VACIO;
			}
		}
	
	}
	public static void colocaMina(int[][] cuadrante) {
		
		minaX = (int)(Math.random() * 5);
		minaY = (int)(Math.random() * 4);
		cuadrante[minaX][minaY] = MINA;

	}
	public static void colocaTesoro(int[][] cuadrante) {
		
		do {
			tesoroX = (int)(Math.random() * 5);
			tesoroY = (int)(Math.random() * 4);
		} while ((minaX == tesoroX) && (minaY == tesoroY));
		cuadrante[tesoroX][tesoroY] = TESORO;

	}
	public static void pintaCuadranteOculto(int[][] cuadrante) {
		
		for(int y = 3; y >= 0; y--) {
			System.out.print(y + "|");  
			for(int x = 0; x < 5; x++) {
				if (cuadrante[x][y] == INTENTO) {
					System.out.print("X ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("  ----------\n  0 1 2 3 4\n");

	}
	public static void pintaCuadranteReal(int[][]cuadrante) {
		String c;
		
		for(int y = 3; y >= 0; y--) {
			System.out.print(y + " ");
			for(int x = 0; x < 5; x++) {
				switch(cuadrante[x][y]) {
				case VACIO:
					c = "  ";
					break;
				case MINA:
					c = "* ";
					break;
				case TESORO: 
					c = "€ ";
					break;
				case INTENTO:
					c = "X ";
					break;
				default:
					c=" ";
				}
				System.out.print(c);
			}
			System.out.println();    
		}
		System.out.println("  ----------\n  0 1 2 3 4\n");
	}

}


