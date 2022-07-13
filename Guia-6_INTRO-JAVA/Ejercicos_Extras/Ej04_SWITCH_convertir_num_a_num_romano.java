package Ejercicos_Extras;

import java.util.Scanner;

/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su 
equivalente en romano.
 */

public class Ej04_SWITCH_convertir_num_a_num_romano {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese un número entre 1 y 10:");
        int num = leer.nextInt();
        
        switch (num){
        case 1:
            System.out.println("I");
            System.out.println("");
            break;
        case 2:
            System.out.println("II");
             System.out.println("");
            break;
        case 3:
            System.out.println("III");
             System.out.println("");
             break;
        case 4:
            System.out.println("IV");
             System.out.println("");
             break;
        case 5:
            System.out.println("V");
             System.out.println("");
             break;     
        case 6:
            System.out.println("VI");
             System.out.println("");
             break;     
        case 7:
            System.out.println("VII");
             System.out.println("");
             break;     
        case 8:
            System.out.println("VIII");
             System.out.println("");
             break;     
        case 9:
            System.out.println("IX");
             System.out.println("");
             break;     
        case 10:
            System.out.println("X");
             System.out.println("");
             break;     
        
        default:
            System.out.println("No es un número entre 1 y 10");
            System.out.println("");
        
        }
    }
}
