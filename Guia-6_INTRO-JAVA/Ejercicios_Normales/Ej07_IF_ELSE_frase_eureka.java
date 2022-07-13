/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar 
la función equals() en Java.
 */
package Ejercicios_Normales;

import java.util.Scanner;

public class Ej07_IF_ELSE_frase_eureka {
    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una frase:");
        String frase = leer.next().toLowerCase();  //Declaro la frase, la leo y la convierto en minúsculas.
        System.out.println("");
        
        //frase = frase.toLowerCase();
        
    if (frase.equals("eureka")){
        System.out.println("CORRECTO, la palabra/frase es igual a eureka");
        System.out.println("");}
    
    else {
        System.out.println("INCORRECTO, la palabra/frase NO es igual a eureka");
        System.out.println("");}
    }
}