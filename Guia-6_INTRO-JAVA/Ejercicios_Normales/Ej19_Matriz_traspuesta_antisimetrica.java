package Ejercicios_Normales;

import java.util.Scanner;

/**
 Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una 
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de 
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se 
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */

public class Ej19_Matriz_traspuesta_antisimetrica {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        boolean antiSimetrica = true;
        
        int [][] matrixA = new int[3][3];
        int [][] matrixB = new int [3][3];
        
        System.out.println("Matriz Original:");
        
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                //matrixA[i][j] = new Random().nextInt(10);
                System.out.println("Ingrese los valores para [" + i + "," + j + "]");
                matrixA [i][j] = leer.nextInt();
                
                matrixB[j][i]= matrixA [i][j];   // INVERTIMOS LA MATRIZ 
                           
                //System.out.print("[" + matrixA [i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("");
        
////////////////////////////////////////////////////////////////////////
        
         System.out.println("Matriz Original:");
        
        for (int i = 0; i < 3; i++) {            // IMPRIMIMOS MATRIZ A
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrixA [i][j] + "] ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
 ////////////////////////////////////////////////////////////////////////
        
        System.out.println("Matriz Traspuesta:");
 
        for (int i = 0; i < 3; i++) {            // IMPRIMIMOS MATRIZ B
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrixB [i][j] + "] ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
 ////////////////////////////////////////////////////////////////////////
 
        for (int i = 0; i < 3; i++) {               // COMPARAMOS LOS VALORES DE LAS MATRICES
            for (int j = 0; j < 3; j++) {
                
                if (matrixA [i][j] != matrixB [i][j] * -1){   // COMPARAMOS SI LAS MATRICES SON ANTISIMÉTRICAS
                    antiSimetrica = false;  
                }  
            }
        }
        
        if (antiSimetrica == true){
            System.out.println("La matriz es antisimétrica.");
        }    
        else
            System.out.println("La matriz no es antisimétrica.");
        
        System.out.println("");
        
        }
    }