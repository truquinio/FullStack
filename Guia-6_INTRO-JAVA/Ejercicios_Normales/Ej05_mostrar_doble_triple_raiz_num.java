/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package Ejercicios_Normales;

import java.util.Scanner;

public class Ej05_mostrar_doble_triple_raiz_num {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un n° entero:");
        int num = leer.nextInt();
               
        System.out.println("El doble es: " + (num * 2));
        System.out.println("El triple es: " + (num * 3));
        System.out.println("La raíz es: " + Math.sqrt(num));
          
    }
}