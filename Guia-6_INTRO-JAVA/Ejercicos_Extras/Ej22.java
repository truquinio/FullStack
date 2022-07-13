package Ejercicos_Extras;

import java.util.Random;
import java.util.Scanner;

/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y 
muestre la suma de sus elementos.
 */

public class Ej22 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int i;
        int j;
        int suma = 0;
        
        System.out.println("Ingrese el tamaño de la matriz:");
        int tamanio1 = leer.nextInt();
        int tamanio2 = leer.nextInt();
        
        System.out.println("");
        
        int[][] matriz = new int[tamanio1][tamanio2];
        
//// FOR para LLENAR la MATRIZ:

        for (i = 0; i < tamanio1; i++) {
            for (j = 0; j < tamanio2; j++) {
                          
            int aleatorio = new Random().nextInt(10);   //  System.out.println("Ingrese un valor para: [" + i + "][" + j + "]");
            
            matriz[i][j] = aleatorio;
            
            suma += aleatorio;
            }
        }

//// FOR para ESCRIBIR la MATRIZ:

        for (i = 0; i < tamanio1; i++) {
            for (j = 0; j < tamanio2; j++) {
        
            System.out.print("[" + matriz[i][j] + "]"); }
            
            System.out.println("");
            
        }
        
         System.out.println("");
        System.out.println("La suma de todos los valores es: " + suma);
        System.out.println("");
    }
}