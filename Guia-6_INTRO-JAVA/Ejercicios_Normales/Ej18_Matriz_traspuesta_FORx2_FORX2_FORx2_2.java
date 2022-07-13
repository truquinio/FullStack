package Ejercicios_Normales;

import java.util.Random;
import java.util.Scanner;

/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la 
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene 
cambiando sus filas por columnas (o viceversa).
 */

public class Ej18_Matriz_traspuesta_FORx2_FORX2_FORx2_2 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
       int [][] matrizA = new int[4][4];
       int [][] matrizB = new int[4][4];

       
//////////////////////  MATRIZ A    //////////////////////

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                matrizA[i][j] = new Random().nextInt(10);
            }
        }
        mostrar(matrizA);

        System.out.println("");
        
        
//////////////////////  MATRIZ B    //////////////////////

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                matrizB[j][i] = matrizA[i][j];
            }
        }
        mostrar(matrizB);
    }

    public static void mostrar(int[][] matriz) {
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
         }
    }
}