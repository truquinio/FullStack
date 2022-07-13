package Ejercicos_Extras;

import java.util.Scanner;

/*
Realizar un programa que complete un vector con los N primeros números de la sucesión 
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes 
números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...

Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo: 
La sucesión del número 2 se calcula sumando (1+1)

Análogamente, la sucesión del número 3 es (1+2), y la del 5 es (2+3),

Y así sucesivamente…

La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula: 
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba 
como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
 */

public class Ej24_VECTOR_FUNCION_FOR_DIGx3_Definir_FIBONACCI {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el tamaño del vector:");
        int tamanio = leer.nextInt();
        
        System.out.println("");
        
        System.out.println("Fibonacci:");
        fibonacci(tamanio);
        
    }
    
    public static void fibonacci(int tamanio) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
//      int [] fibonacci = new int [num];
        
        int digito1 = 0;
        int digito2 = 1;
        
        for (int i = 0; i < tamanio; i++) {
            
            System.out.print("[" + digito1 + "]");
            
            int digito3 = digito1 + digito2;
            
            digito1 = digito2;
            digito2 = digito3;    
        }
        System.out.println("");
        System.out.println("");
    }
}