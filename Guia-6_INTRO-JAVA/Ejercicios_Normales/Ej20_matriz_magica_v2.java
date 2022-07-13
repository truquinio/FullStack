 /*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la 
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
El programa deberá comprobar que los números introducidos son correctos, es decir, 
están entre el 1 y el 9.
 */
package Ejercicios_Normales;

import java.util.Scanner;

public class Ej20_matriz_magica_v2 {

    public static void main(String[] args) {

           Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean magico = true;
        int primerFila, sumaColumnas, sumaFila, sumaDiag1, sumaDiag2; //definir variables
        
        primerFila = sumaColumnas = sumaFila = sumaDiag1 = sumaDiag2 = 0; //inicializarlas en 0
       
        int[][] matriz = new int[3][3]; //definir matriz y su tamaño
        
        for (int i = 0; i < 3; i++) { //rellenar los valores de la matriz
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese valores para la posicion [" + i + "," + j + "]");
                    matriz[i][j] = leer.nextInt();
                } while (matriz[i][j] < 0 && matriz[i][j] > 10);
            }
        }
        System.out.println("");

        for (int i = 0; i < 3; i++) { //imprimir los valores de la matriz
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");

        primerFila += matriz[0][0] + matriz[0][1] + matriz[0][2]; //suma de la primer fila para guardar valor a comparar

        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) {
                sumaColumnas += matriz[j][i]; //suma los valores de las columnas
                sumaFila += matriz[i][j]; //suma los valores de las filas
            }
            if (sumaColumnas != primerFila || sumaFila != primerFila) { //compara si las sumas son iguales al valor guardado de la suma de la primer fila
                magico = false; 
            }
            sumaColumnas = 0; //resetear el valor de la suma de columnas al cambiar de fila para que haga la suma de la siguiente hilera de columnas
            sumaFila = 0; //resetea la suma de filas " " "
        }
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) {
                if (i == j) { 
                    sumaDiag1 += matriz[i][j]; //suma los valores en los que i y j sean iguales para la suma de la primer diagonal
                }
                if (i + j == 2) {
                    sumaDiag2 += matriz[i][j]; //suma los valores en que i y j sumen el tamaño de la matriz-1 para hacer la suma de la segunda diagonal
                }
            }
        }
        if (sumaDiag1 != primerFila || sumaDiag2 != primerFila) { //compara si la suma de las diagonales es igual al valor guardado de la suma de la primer fila
            magico = false;
        }
        if (magico == true) {
            
            System.out.println("*** La matriz es magica ***");
            System.out.println("");
        } else {
            
            System.out.println("*** La matriz no es mágica ***");
            System.out.println("");
        }
    }
}