package Ejercicios_Normales;

import java.util.Scanner;

/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
muestre por pantalla en orden descendente.
 */

public class Ej15_FOR_rellenar_vector_100_numeros_decreciente {
    
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        int[] vector = new int [100];           //Acá defino hasta q n° va a llegar el contenido del vector.
					
	for (int i = 100; i > 0; i--) {         //Recorro el vector desde 100 hasta 0 y resto 1 en cada vuelta.
            vector[i-1] = i;                    //Asignamos un valor en la posición i del vector
           System.out.println(vector[i-1]);    //Imprimimos el vector
        }
        System.out.println ("");
    }
}