package Ejercicios_Normales;

import java.util.Random;
import java.util.Scanner;

public class Ej16_FOR_x3_vector_tamanio_random_contador {

    //static int size = 10; // Acá defino el tamaño real del vector
    
/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
numero y si se encuentra repetido
*/
    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
       System.out.println("Ingrese el tamaño del vector:");
        int tamanio = leer.nextInt();

        System.out.println("");
        System.out.println("Ingrese el numero a buscar:");
        int num = leer.nextInt();

        int[] vector = new int[tamanio];
        
        for (int i = 0; i < tamanio; i++) {
            vector[i] = new Random().nextInt(10);  // Acá lleno el vector con n° aleatorios hasta 10, x ej
        }
        
        int contador = 0;
        
        for (int i = 0; i < tamanio; i++) {
            if (vector[i] == num) {     //Le doy a i el valor de num.
                contador++;             //En cada vuelta le sumo 1 al contador.
            }
        }
        System.out.println("");
        
        for (int i = 0; i < tamanio; i++) {
            System.out.print("[" +vector[i]+ "] ");  //Imprimo el vector para corroborarlo.
        }
        System.out.println("");
        System.out.println("");
        System.out.println("El numero " + num + " se encuentra en el vector "+ contador +" veces");
        System.out.println("");
    }
}