/*
DETECCIÓN DE ERRORES 5
Arreglar la siguiente porción de codigo.

public static void main(String[] args) { 

Scanner leer = new Scanner(); 
System.out.println("Ingresa tu edad"); 
String nombre = leer.nextInt();
System.out.println("Ingresa tu nombre"); 
int edad = leer.next();
} 
}
 */
package Manos_a_la_obra;

import java.util.Scanner;

/**
 *
 * @author FT
 */
public class deteccionErrores3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingresa tu nombre:");
        String nombre = leer.next();
        
        System.out.println("Ingresa tu edad:");
        int edad = leer.nextInt();
        
        System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad + " años.");
        System.out.println("");
    }
    
}