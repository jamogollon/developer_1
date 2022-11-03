package EjemplosClase;

import java.util.Scanner;
 
/**
 * Juego del ahorcado 
 * @author Antonio Moreno
 */
public class Ahorcado {
 
	static char[] desletrea;
	static char[] tusRespuestas;
    public static void main(String[] args) {
        final int INTENTOS_TOTALES = 6; // Constante con el limite de fallos
        int fallos = 0;
        int aciertos = 0;
        // Objeto scanner para leer por teclado
        Scanner teclado = new Scanner(System.in);
        char resp;
        // Creamos unas palabras y le asignamos una aleatoria a una varibale
        String arrayPalabras[] = new String[5];
        arrayPalabras[0] = "hola";
        arrayPalabras[1] = "adios";
        arrayPalabras[2] = "murcielago";
        arrayPalabras[3] = "rinoceronte";
        arrayPalabras[4] = "septiembre";
 
        do {
        	int alea =(int)(5*Math.random());

        	// Dividimos la palabra en letras y la guardamos en un array de caracteres
        	desletrea = deletrear(arrayPalabras[alea]);
        	//char[] copia = desletrea.clone();// deletrear(arrayPalabras[alea]); // Algo auxiliar para mas tarde
        	// Array para pintar  en pantalla(Guiones o letras vamos)
        	tusRespuestas = new char[desletrea.length];

        	// Rellenamos palabras con guiones
        	rellenaGuiones();
        	// Empezamos a escribir  en pantalla
        	System.out.println("Adivina la palabra!");

        	// Mientras que no nos pasemos con los fallos y no la acertemos...
        	while(fallos < INTENTOS_TOTALES && aciertos != tusRespuestas.length){
        		imprimeOculta(tusRespuestas);
        		// Preguntamos y tratamiento respuesta por teclado
        		switch(preguntaTrata(teclado)){
        			case 1://acierto palabra
        				aciertos=tusRespuestas.length;
        				break;
        			case 2://acierto una letra
        				aciertos++;
        				break;
        			case 3://fallo
        				fallos++;
        				pintaAhorcado(fallos);
        		}		

        	}
        	// Si hemos acertado todas imprimimos un mensaje
        	if(aciertos == tusRespuestas.length){
        		System.out.print("\nFelicidades!! has acertado la palabra: ");
        		imprimeOculta(desletrea);
        	}
        	// Si no otro
        	else{
        		System.out.print("\nLo siento has fallado! la palabra era: ");
        		for(int i = 0; i < desletrea.length; i++){
        			System.out.print(desletrea[i] + " ");
        		}
        	}
        	// Reseteamos contadores
        	fallos = 0;
        	aciertos = 0;
        	// Volvemos a preguntarle al usuario si quiere volver a juagar
        	resp = pregunta("\n\nQuieres volver a jugar?",teclado);
        }while(resp != 'n');
 
    }
        
        
    /**
     * rellena el array de las respuestas con guiones bajos
     */
    public static void rellenaGuiones() {
    	
    	for(int i = 0; i < tusRespuestas.length; i++){
    		tusRespuestas[i] = '_';
    	}
    	
    }
     /**
     * Esto separa  el String en un array de caracteres
     * @return array de letras.
     */
    private static char[] deletrear(String palAzar){
        char[] letras;
        letras = new char[palAzar.length()];
        for(int i = 0; i < palAzar.length(); i++){
            letras[i] = palAzar.charAt(i);
        }
        return letras;
    }
 
    /**
     * Esto imprime la palabra con espacios
     * @param tusRespuestas el array de caracteres
     */
    private static void imprimeOculta(char[] tusRespuestas){
 
        for(int i = 0; i < tusRespuestas.length; i++){
            System.out.print(tusRespuestas[i] + " ");
        }
    }
    /**
     * Prengunta por palabra o letra y realiza el tratamiento
     * @param objeto Scanner
     * @return entero-> 1=palabra acertada, 2=letra acertada, 3=fallo
     * 
     */
    public static int preguntaTrata(Scanner teclado) {
    	char letra;
    	String respuesta;
    	
        System.out.println("\nIntroduce una letra: ");
        respuesta=teclado.next().toLowerCase();
        if (respuesta.length()>1) {
        	if(comparaPalabra(respuesta))
        		return 1;
        }
        else {
        	letra=respuesta.charAt(0);
        	if(comparaLetra(letra))
        		return 2;
        }
    	return 3;
    }
    /**
     * compara palabra enviada con la solución si conincide envia true.
     * @param palabra
     * @return boolean
     */
    public static boolean comparaPalabra(String palabra) {
    	
    	if(palabra.length()!=desletrea.length)
    		return false;
    	for (int i=0; i<palabra.length();i++) {
    		if(desletrea[i]!=palabra.charAt(i))
    			return false;
    	}
    	return true;
    }
    /**
     * 
     * @param resp letra que se le pasa
     * @return true si acierta y false si no
     */
    public static boolean comparaLetra(char resp) {
    	boolean hayAcierto=false;
        for(int i = 0; i < desletrea.length; i++){
            if(desletrea[i]==resp){
                tusRespuestas[i] = desletrea[i];
                //desletrea[i] = ' ';
                hayAcierto= true;
            }
         }
        return hayAcierto;
    }
    /**
     * Esto nos pregunta si queremos volver a jugar y comprueba los caracteres
     * introducidos
     * @param men texto para mostrar al usuario
     * @return caracter de respuesta (s/n)
     */
    public static char pregunta(String men, Scanner teclado) {
        char resp;
        System.out.println(men + " (s/n)");
        resp = teclado.next().toLowerCase().charAt(0);
        while (resp != 's' && resp != 'n') {
            System.out.println("Error! solo se admite S o N");
            resp = teclado.next().toLowerCase().charAt(0);
        }
        return resp;
    }

    /**
     * método que pinta partes de la horca
     * @param numero que indica que horca pinta
     */
	public static void pintaAhorcado(int pos)
	{
		switch (pos) {
		case 0://horca
			System.out.println("  ___________ ");
			System.out.println("  |         | ");
			System.out.println("  |         | ");
			System.out.println("  |           ");
			System.out.println("  |           ");
			System.out.println("  |           ");
			System.out.println("  |           ");
			System.out.println("__|__         ");
			break;
		case 1://cabeza
			System.out.println("  ___________ ");
			System.out.println("  |         | ");
			System.out.println("  |         | ");
			System.out.println("  |         O ");
			System.out.println("  |           ");
			System.out.println("  |           ");
			System.out.println("  |           ");
			System.out.println("__|__         ");
			break;
		case 2://cabeza y cuerpo
			System.out.println("  ___________ ");
			System.out.println("  |         | ");
			System.out.println("  |         | ");
			System.out.println("  |         O ");
			System.out.println("  |         | ");
			System.out.println("  |           ");
			System.out.println("  |           ");
			System.out.println("__|__         ");
			break;
		case 3://cabeza, cuerpo y brazo
			System.out.println("  ___________ ");
			System.out.println("  |         | ");
			System.out.println("  |         | ");
			System.out.println("  |         O ");
			System.out.println("  |        /| ");
			System.out.println("  |           ");
			System.out.println("  |           ");
			System.out.println("__|__         ");
			break;
		case 4://cabeza, cuerpo y dos brazos
			System.out.println("  ___________ ");
			System.out.println("  |         | ");
			System.out.println("  |         | ");
			System.out.println("  |         O ");
			System.out.println("  |        /|\\");
			System.out.println("  |           ");
			System.out.println("  |           ");
			System.out.println("__|__         ");

			break;
		case 5://cabeza, cuerpo, dos brazos y una pierna
			System.out.println("  ___________ ");
			System.out.println("  |         | ");
			System.out.println("  |         | ");
			System.out.println("  |         O ");
			System.out.println("  |        /|\\");
			System.out.println("  |        /  ");
			System.out.println("  |           ");
			System.out.println("__|__         ");

			break;
		case 6://todo
			System.out.println("  ___________ ");
			System.out.println("  |         | ");
			System.out.println("  |         | ");
			System.out.println("  |         O ");
			System.out.println("  |        /|\\");
			System.out.println("  |        / \\");
			System.out.println("  |           ");
			System.out.println("__|__         ");

			
		}
	}
}
