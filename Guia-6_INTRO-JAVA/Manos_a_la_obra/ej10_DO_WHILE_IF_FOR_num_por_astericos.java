/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número 
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 ***** 
3 ***
11 *********** 
2 **
 */

package Manos_a_la_obra;

import java.util.Scanner;

public class ej10_DO_WHILE_IF_FOR_num_por_astericos {

public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int contador = 0;
        
        System.out.println("Ingrese un n°:");
               
        do {
        int num = leer.nextInt();
        
        if (num >= 1 || num <= 20){
        
        contador ++;
        
            for (int i = 1; i <= num; i++){
            System.out.print(" *");}
            
            System.out.println("");
            System.out.println("");}
        
        } while (contador < 4);       
    }
}