/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por 
pantalla.
 */
package Ejercicios_Normales;

import java.util.Scanner;

public class Ej02_ingresar_guardar_mostrar_nombre {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    System.out.println("Ingresa tu nombre:");
    String nombre = leer.nextLine();
       
    System.out.println("El nombre es: " + nombre);    
        
        
    }
    
}
