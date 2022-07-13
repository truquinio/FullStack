/*
Realizar un programa que solo permita introducir frases o palabras de 8 de largo. Si el 
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.
*/

package Ejercicios_Normales;

import java.util.Scanner;

public class Ej08_IF_ELSE_frase_8_longitud {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine().toLowerCase();   //Declaro la frase, la leo y la convierto en minúsculas.
        
        System.out.println("");
        
    if (frase.length() == 8){
        System.out.println("CORRECTO, la palabra tiene 8 caracteres");
        System.out.println("");}
    
    else {
        System.out.println("INCORRECTO, la palabra no tiene 8 caracteres");
        System.out.println("");} 
    }    
}