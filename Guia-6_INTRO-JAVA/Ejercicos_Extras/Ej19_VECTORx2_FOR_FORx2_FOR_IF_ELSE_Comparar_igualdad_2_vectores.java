package Ejercicos_Extras;

import java.util.Random;
import java.util.Scanner;

/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
elementos)
 */

public class Ej19_VECTORx2_FOR_FORx2_FOR_IF_ELSE_Comparar_igualdad_2_vectores {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el tamaño de los vectores:");
        int tamanio = leer.nextInt();
        
        int[] vector1 = new int[tamanio];
        int[] vector2 = new int[tamanio];
        int i;
        int j;
 
            for (i = 0; i < tamanio; i++) {
            vector1[i] = new Random().nextInt(2);
            vector2[i] = new Random().nextInt(2);
            }
            
/// FOR para IMPRIMIR los vectores  ////////////////////////////////////////////            
            
            for (i = 0; i < tamanio; i++) {
                System.out.print("[" + vector1[i] + "]");
            }
              System.out.println("");
            
            for (i = 0; i < tamanio; i++) {
                System.out.print("[" + vector2[i] + "]"); 
            }
                System.out.println("");
                
/// FOR para FRENAR el bucle si no hay igualdad ////////////////////////////////

            for (i = 0; i < tamanio; i++) {
                
                if (vector1[i] != vector2[i] ) {
                    
                    break;
                    
                } else {
                    
                    System.out.println("");
                    System.out.println(vector1[i] + " = " + vector2[i]);
                }
            }
        System.out.println("");
    }
}