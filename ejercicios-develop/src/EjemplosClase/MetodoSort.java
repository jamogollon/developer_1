package EjemplosClase;

import java.util.Arrays;
public class MetodoSort {
	 
    public static void main(String[] args) {
 
        final int TAMANIO=10;
        int lista[]=new int [TAMANIO];
        rellenarArray(lista);
 
        String lista_String[]={"americano", "Zagal", "pedro", "Tocado", "coz"};
 
        System.out.println("Array de números sin ordenar:");
        imprimirArray(lista);
 
        //ordenamos el array
        Arrays.sort(lista);
 
        System.out.println("Array de números ordenado:");
        imprimirArray(lista);
 
        System.out.println("Array de String sin ordenar:");
        imprimirArray(lista_String);
 
        //ordenamos el array, ordenara primero las mayusculas y luego las minusculas
        Arrays.sort(lista_String);
 
        System.out.println("Array de String ordenado:");
        imprimirArray(lista_String);
    }
 
    public static void imprimirArray (int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }
 
    public static void imprimirArray (String lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }
 
    public static void rellenarArray (int lista[]){
        for(int i=0;i<lista.length;i++){
            lista[i]=numeroAleatorio();
        }
    }
 
    private static int numeroAleatorio (){
        return ((int)Math.floor(Math.random()*1000));
    }
	
}
