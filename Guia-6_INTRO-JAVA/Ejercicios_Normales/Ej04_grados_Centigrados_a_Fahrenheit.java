/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/

package Ejercicios_Normales;

import java.util.Scanner;

public class Ej04_grados_Centigrados_a_Fahrenheit {
    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    System.out.println("Ingresa los °C:");
    double Centigrados = leer.nextDouble();
       
    System.out.println((32 + (9 * Centigrados / 5)) + " ° Fahrenheit");
    
    //F = 32 + (9 * C / 5)

    }
    
}
