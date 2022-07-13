package Ejercicios_Normales;

import java.util.Random;
import java.util.Scanner;

/**
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la 
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
El programa deberá comprobar que los números introducidos son correctos, es decir, 
están entre el 1 y el 9.
 */

public class Ej20_matriz_magica_v3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int max = 9;
        int min = 1;
        int[][] matriz = null;
        boolean magica = true;
    
         do {
            matriz = crearMatriz(3, min, max);
            matriz[0][0] = 2;
            matriz[0][1] = 7;
            matriz[0][2] = 6;
            matriz[1][0] = 9;
            matriz[1][1] = 5;
            matriz[1][2] = 1;
            matriz[2][0] = 4;
            matriz[2][1] = 3;
            matriz[2][2] = 8;
            mostrar(matriz);
            magica = comprobar(matriz);
            
        } while (magica == false);   
    }

////////////////////////////////////////////////////////////////////////////////    
    
    public static int[][] crearMatriz(int n, int min, int max) {
        Random random = new Random();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return matriz;
    }
    
////////////////////////////////////////////////////////////////////////////////    

    public static void mostrar(int[][] matriz){
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }

////////////////////////////////////////////////////////////////////////////////
    
    public static boolean comprobar(int[][] matriz){
        
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[] sumaFila = new int[filas];
        int[] sumaColumna = new int[columnas];
        int sumaDiagonalA = 0;
        int sumaDiagonalB = 0;

        for (int i = 0; i < filas; i++){
            sumaFila[i] = 0;
        }
        for (int i = 0; i < columnas; i++){
            sumaColumna[i] = 0;
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaFila[i] += matriz[i][j];
                
                System.out.print(sumaFila[i] + " ");
                
                sumaColumna[j] += matriz[i][j];
                if (i == j) {
                    sumaDiagonalA += matriz[i][j];
                }
                if (i + j == 2) {
                    sumaDiagonalB += matriz[i][j];
                }
            }
        }

        boolean igualdadFila = true;
        boolean igualdadColumna = true;
        boolean igualdadDiagonal = (sumaDiagonalA == sumaDiagonalB);
        boolean igualdad = (sumaFila[0] == sumaColumna[0] && sumaColumna[0] == sumaDiagonalA);

        for (int i = 1; i < filas; i++){
            if (sumaFila[0] != sumaFila[i]){
                igualdadFila = false;
                break;
            }
        }
        for (int i = 1; i < columnas; i++){
            if (sumaColumna[0] != sumaColumna[i]){
                igualdadColumna = false;
                break;
            }
        }

        if (igualdad && igualdadDiagonal && igualdadFila && igualdadColumna) {
            
            System.out.println("");
            System.out.println("*** La matriz es mágica ***");
            System.out.println("");
            
        } else {
            
            System.out.println("");
            System.out.println("*** La matriz  no es mágica ***");
            System.out.println("");
        }
        return igualdad && igualdadDiagonal && igualdadFila && igualdadColumna;
    }
}