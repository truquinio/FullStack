/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la 
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene 
cambiando sus filas por columnas (o viceversa).
 */

package Ejercicios_Normales;

import java.util.Random;
import java.util.Scanner;

public class Ej18_Matriz_transpuesta_FORx2_FORx2_1 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int [][] matrixA = new int[4][4];
        int [][] matrixB = new int [4][4];

        System.out.println("Matriz Original:");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                matrixA[i][j] = new Random().nextInt(10);
                matrixB[j][i]= matrixA [i][j] ;
                
                System.out.print("[" + matrixA [i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        System.out.println("Matriz Traspuesta:");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                System.out.print("[" + matrixB [i][j] + "] ");
            }
            System.out.println("");            
        }
         System.out.println("");
    }
}