package Ejercicos_Extras;

import java.util.Scanner;

/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */

public class Ej03_IF_letra_vocal_no_vocal {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        String letra;
        
        System.out.println("Ingrese una letra cualquiera:");
        letra = leer.next().toLowerCase();
        
        System.out.println("");
        
        if (letra.equals("a") || letra.equals("e") || letra.equals("i")
                || letra.equals("o") || letra.equals("u")){
            
            System.out.println("Es una vocal.");
            System.out.println("");     }
        
        else {
            System.out.println("No es una vocal.");
            System.out.println("");
        }
    }
}
