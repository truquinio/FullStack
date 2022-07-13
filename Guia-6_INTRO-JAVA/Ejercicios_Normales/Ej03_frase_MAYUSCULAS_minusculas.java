/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
*/

package Ejercicios_Normales;

import java.util.Scanner;

public class Ej03_frase_MAYUSCULAS_minusculas {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
       System.out.println("Ingresa una frase:");
       String frase = leer.nextLine();
       
       System.out.println(frase.toUpperCase()); //to.Upper.Case = MAYÚSCULAS
       System.out.println(frase.toLowerCase()); //to.Lower.Case = minúsculas
      
}}