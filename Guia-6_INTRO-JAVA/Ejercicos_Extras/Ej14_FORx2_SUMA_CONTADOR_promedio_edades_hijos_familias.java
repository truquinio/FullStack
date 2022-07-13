package Ejercicos_Extras;

import java.util.Random;
import java.util.Scanner;

/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de 
hijos.
Escriba un programa que pida la cantidad de familias y para cada familia la cantidad 
de hijos para averiguar la media de edad de los hijos de todas las familias.

 */
public class Ej14_FORx2_SUMA_CONTADOR_promedio_edades_hijos_familias {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int familias;
        int hijos;
        int edad;
        int i;
        int j;
        float suma = 0;
        int contador = 0;
        
        System.out.println("Ingrese la cantidad de familias:");
        familias = leer.nextInt();
        
        System.out.println("");
        
        for (i = 1; i < familias +1; i++) {   // (i = 1; i < familias +1) para que arranque desde familia n°1 y no 0
            
            System.out.println("Ingrese la cantidad de hijos para familia: " + i);
            hijos = leer.nextInt();
        
            System.out.println("");
            
        for (j = 1; j < hijos +1; j++) {
            edad = new Random().nextInt(40);
            
            System.out.println("Edad: " + edad);
            
            suma += edad;
            contador++;
        }
        
        System.out.println("");
        }
        
        System.out.println("Cantidad de hijos total = " + contador);
        System.out.println("Suma total de edades = " + suma);
              
        System.out.println("");
        System.out.println("La media de las edades es = " + suma / contador);
        System.out.println("");
    }
}