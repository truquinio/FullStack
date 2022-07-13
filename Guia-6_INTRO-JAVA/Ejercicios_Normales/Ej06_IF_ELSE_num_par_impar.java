/*
Crear un programa que dado un numero determine si es par o impar.
 */
package Ejercicios_Normales;

import java.util.Scanner;

public class Ej06_IF_ELSE_num_par_impar {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un n° entero:");
        int num = leer.nextInt();
        
    if (num % 2 == 0){
            System.out.println("Es par");} 
    
    else {
        System.out.println("Es impar");}   
        
    }}