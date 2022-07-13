/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
dos. El programa deberá después mostrar el resultado de la suma
 */
package Ejercicios_Normales;

import java.util.Scanner;

public class Ej01_Suma_num1_num2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese 2 n° enteros:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
       
        System.out.println("La suma es: " + (num1 + num2));
                
    }
    
}
