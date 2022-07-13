package Ejercicios_Normales;

import java.util.Scanner;

public class Ej20_matriz_magica_v1 {

 /*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la 
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
El programa deberá comprobar que los números introducidos son correctos, es decir, 
están entre el 1 y el 9.
 */

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
            
         int [][] matriz = new int[3][3];
        
        int i;
        int j;
        int sumaFilas = 0;
        int sumaColumnas = 0;
        int sumaDiagonalA = 0;
        int sumaDiagonalB = 0;
        
//// FOR para LLENAR la MATRIZ:

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                
        System.out.println("Ingrese un valor para [" + i + "," + j +"]");
        matriz[i][j] = leer.nextInt(); }
        }
         System.out.println("");
         
//// FOR para ESCRIBIR la MATRIZ:

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
        
            System.out.print("[" + matriz[i][j] + "]"); }
            
            System.out.println("");
            
        }
        
         System.out.println("");
        
//// FOR para SUMAR las FILAS:

System.out.print("Suma filas: ");

        for (i = 0; i < 3; i++) {
            
            sumaFilas = 0;     // Reseteo la variable, para que en cada fila empiece desde 0 y sume c/u por separada
            
            for (j = 0; j < 3; j++) {
                
                sumaFilas = sumaFilas + matriz[i][j];
                
            }              
        }
        
        System.out.print(sumaFilas + " ");  
        System.out.println("");
        
//// FOR para SUMAR las COLUMNAS: (Invierto los FOR i,j  por  j,i)

System.out.print("Suma columnas: ");

        for (j = 0; j < 3; j++) {
            
            sumaColumnas = 0;     // Reseteo la variable, para que en cada columna empiece desde 0 y sume c/u por separada
            
            for (i = 0; i < 3; i++) {
                
                sumaColumnas = sumaColumnas + matriz[i][j]; 
            }
        }
        
         System.out.print(sumaColumnas + " ");
        System.out.println("");    
       
//// FOR para SUMAR la DIAGONAL A:

System.out.print("Suma diagonal A: ");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
            
            if (i == j) {
            sumaDiagonalA = sumaDiagonalA + matriz[i][j]; 
            }
        }
    }        
        System.out.print(sumaDiagonalA + " "); 
        System.out.print("");
         System.out.println("");
        
//// FOR para SUMAR la DIAGONAL B:


System.out.print("Suma diagonal B: ");

// la suma de los valores de i y j dará 2

    for (i = 0; i < 3; i++) {
        for ( j = 0; j < 3; j++) {
            
            if (i + j == 2) {    // El cuadrado de arriba está en fila 0, columna 2 = 0 + 2 = 2
                                 // El cuadrado del medio está en la fila 1, columna 1 = 1 + 1 = 2
                                 // El último cuadrado (el de abajo) está en fila 2, columna 0 = 2 + 0 = 2
                                 
                   sumaDiagonalB = sumaDiagonalB + matriz[i][j];
            }
        }
    }
    
    System.out.print(sumaDiagonalB + " "); 
    System.out.print("");
     System.out.println("");

     
    if (sumaFilas == sumaColumnas && sumaFilas 
            == sumaDiagonalA && sumaFilas == sumaDiagonalB){
        
        System.out.println("");
        System.out.println("*** La matriz es mágica ***");
        System.out.println(""); }

    
    else {
    
        System.out.println("");
        System.out.println("*** La matriz no es mágica ***");
        System.out.println("");    
        }       
    } 
}