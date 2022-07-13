package Ejercicos_Extras;

import java.util.Scanner;

/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por 
debajo de 1.60 mts. y el promedio de estaturas en general.
*/

public class Ej06_FOR_IF_ELSE_calcular_promedio_alturas_personas {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    System.out.println("Ingrese la cantidad de personas:");
        int personas = leer.nextInt();
        System.out.println("");
        
        float sumaHEnanos = 0, sumaHTotal = 0, totalEnanos = 0;
    
        for (int i = 0; i < personas; i++) {
            
            System.out.println("Ingrese la altura (mt/cm) del sujero: " + i);
        float altura = leer.nextFloat();
        System.out.println("");
        
        if (altura < 1.60 ){
            
            sumaHEnanos += altura;
            
            totalEnanos++;  }
            
        else {
            
            sumaHTotal += altura; }        
        }
    
        System.out.println("Cantidad de enanos = " + totalEnanos);
        System.out.println("");
        System.out.println("Promedio de altura de enanos = " + (sumaHEnanos / totalEnanos));
        System.out.println("");
        System.out.println("Promedio de altura gral. = " + (sumaHTotal + sumaHEnanos) / personas);
        System.out.println("");
    }
}