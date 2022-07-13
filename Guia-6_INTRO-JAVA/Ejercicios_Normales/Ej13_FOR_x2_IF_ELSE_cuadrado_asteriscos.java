package Ejercicios_Normales;

import java.util.Scanner;

/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el 
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:

* * * * 
*     * 
*     * 
* * * *

 */

public class Ej13_FOR_x2_IF_ELSE_cuadrado_asteriscos {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    int a;
    int b;
    int numerolados;
    
    do {
    System.out.println("Ingrese un número entero positivo:");
    numerolados = leer.nextInt();
    } while (numerolados < 0);
    
    System.out.println("");
        
    for (a = 1; a <= numerolados; a++) {
        
        for (b = 1; b <= numerolados; b++) {
            
            if (a == 1 || a == numerolados || b == 1 || b == numerolados) {
                System.out.print("* ");
                
            } else {
                
                System.out.print("  ");
            }
        }
        System.out.println("");
        System.out.println("");
    }
  }
}