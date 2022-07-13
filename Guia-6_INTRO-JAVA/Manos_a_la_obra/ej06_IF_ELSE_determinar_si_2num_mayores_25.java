/*
Implementar un programa que le pida dos números enteros al usuario y determine si ambos o 
alguno de ellos es mayor a 25.
 */
package Manos_a_la_obra;

import java.util.Scanner;

public class ej06_IF_ELSE_determinar_si_2num_mayores_25 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingresa dos números enteros:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
      
        if (num1 > 25 && num2 > 25){
            System.out.println("Ambos n° son mayores a 25");}
        
        else if (num1 > 25){
            System.out.println(num1 + " es mayor a 25");}
        
        else if (num2 > 25){
            System.out.println(num2 + " es mayor a 25");}
         
        System.out.println("");
        }
    }
    
