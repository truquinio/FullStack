package Ejercicos_Extras;

import java.util.Scanner;

/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño 
N, con los valores ingresados por el usuario.
 */

public class Ej18_VECTOR_FOR_SUMA_Calcular_suma_valores_vector {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int suma = 0;
        
        System.out.println("Ingrese el tamaño del vector:");
        int tamanio = leer.nextInt();
        
        System.out.println("");
        
        int[] vector = new int[tamanio];
        
        for (int i = 0; i < tamanio; i++) {
            
            System.out.println("Ingrese un valor para: " + i);
            int valor = leer.nextInt();
            
            System.out.println("");
            
            suma += valor;
        }
             
        System.out.println("La suma de todos los valores es: " + suma);
        System.out.println("");
    }
}
