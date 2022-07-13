package Ejercicos_Extras;

import java.util.Scanner;

/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el 
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
public class Ej01_MOD_minutos_equivalente_dias_horas {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese la cantidad de minutos: ");
        int minutos = leer.nextInt();
        
        int horas = minutos / 60;
        int dias = horas / 24;
        horas = horas % 24;   // Se saca el MOD lo que sobran de las horas, para poder llevarlas a minutos.
        
        System.out.println("");
        System.out.println("Equivalente: " + dias + " días, " + horas + " horas.");
        System.out.println("");
    }
}