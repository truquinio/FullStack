package Ejercicos_Extras;

import java.util.Random;
import java.util.Scanner;

public class Ej20_VECTOR_FUNCIONx2_FORx2_Llenar_imprimir_vector {

/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por 
parámetro. Después haremos otra función o procedimiento que imprima el vector.
*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el tamaño del vector:");
        int tamanio = leer.nextInt();
        
        int[] vector = new int[tamanio];
                
        leerVector(tamanio,vector);
        
        System.out.println("");
        
        mostrarVector(tamanio, vector);
    
    }
  
/// FUNCIÓN para LLENAR el VECTOR   ////////////////////////////////////////////
    
    public static void leerVector(int tamanio, int [] vector) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int i;
              
            for (i = 0; i < tamanio; i++) {
            vector[i] = new Random().nextInt(10);
    }
}

/// FUNCIÓN para IMPRIMIR el VECTOR   //////////////////////////////////////////
            
    public static void mostrarVector (int tamanio, int [] vector){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");        
    
        for (int i = 0; i < tamanio; i++) {
        System.out.print("[" + vector[i] + "]");
        }
        
        System.out.println("");
        System.out.println("");
    }
}