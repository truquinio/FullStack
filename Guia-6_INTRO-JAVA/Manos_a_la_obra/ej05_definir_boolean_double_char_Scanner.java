/*
Define una variable de tipo boolean, double y char. Guarda información en ellas a través del 
Scanner. 
 */
package Manos_a_la_obra;

import java.util.Scanner;

public class ej05_definir_boolean_double_char_Scanner {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Define una variable de tipo boolean, double y char. Guarda información en ellas a través del \n" +
"Scanner:");
        
        boolean log = leer.nextBoolean();
        double num1 = leer.nextDouble();
        char x = leer.next().charAt(0);
                      
    }
    
}
