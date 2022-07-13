/* Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que 
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una 
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de 
la matriz M en la cual empieza el primer elemento de la submatriz P.

Ejemplo
Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices: 
4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6
*/
package Ejercicios_Normales;

import java.util.Random;
import java.util.Scanner;

public class Ej21_X {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
    int [][] matrizChica = new int [3][3];
    int [][] matrizGrande = new int [10][10];
    
    int i;
    int j;
    int k;
    int l;
    int contador = 0;
    
/// LEER y ESCIBIR MATRIZ CHICA:

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                
                int valor1 = new Random().nextInt(5);   // LLENO MATRIZ
                
                matrizChica[i][j] = valor1;
                
                System.out.print("[" + matrizChica[i][j] + "]");  //Imprimo Matriz
            }
            System.out.println("");
        }
         System.out.println("");
         
/// LEER y ESCIBIR MATRIZ GRANDE:      

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                
                int valor2 = new Random().nextInt(5);
                
                matrizGrande[i][j] = valor2;
                
                System.out.print("[" + matrizGrande[i][j] + "]");
                
            }
            System.out.println("");
        }
        System.out.println("");
               
/// RECORRER MATRIZ GRANDE CON LA CHICA:

        for (i = 0; i < (10 - 3); i++) {      //
            for (j = 0; j < (10 - 3); j++) {
                
                if (matrizGrande[i][j] == matrizChica[0][0]){
                    
                    for (k = i; k < i+3; k++) {
                        for (l = j; l < j+3; l++) {

                            if (matrizGrande[i][j] == matrizChica[k-i][l-j]){
                                
                                 contador++;     
                                }
                            } 
                        }
                    if (contador == 9){
                        
                        System.out.println("La matriz empieza en: [" + i + "][" + j + "]");
                        System.out.println("");        
                        }
                    }
                }
            }
        }
    }