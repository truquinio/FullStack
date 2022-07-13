/*
Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por 
pantalla.
 */
package Manos_a_la_obra;

import java.util.Scanner;

public class ej04_definir_nombre_y_edad {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
    // se crea una variable cadena(String)que se utiliza para leer datos del usuario
        String nombre;
        
    // muestra un mensaje por pantalla
        System.out.println("Ingresa tu nombre");
        
    // Leemos el nombre de la persona en la variable nombre
        nombre = leer.next();
    
    // se crea una variable entero (int) que se utiliza para leer datos del usuario
        int edad;
        
    // muestra un mensaje por pantalla
        System.out.println("Ingresa tu edad");
        
    // Leemos la edad de la persona en la variable edad
        edad = leer.nextInt();
}
}