/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Intro_Java;

import java.util.Scanner;

/**
 *
 * @author FT
 */
public class SumatoriaConSalto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num;
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese un n° entero positivo");
            num = leer.nextInt();
            if (num > 1000) {
                System.out.println("Este programa podría tardar, ¿Está seguro? (S/N)");
                String confirma = leer.next();
                if (confirma.equals("s")) {
                    break;                      //break: detiene el bucle y continúa con el próximo bloque
                }
            }
        } while (num <= 0 || num > 1000);
  
        /*
        for (<inicialización>; <expresión_terminación>; <paso/incremento/decremento>){
        <sentencias>
        }
        */
       
        int j, suma;
        for(int i=1 ; i <=num ; i++){
            
            if( i%2 != 0 )
                continue;  //continue: detiene la iteración actual y salta a la siguiente
            
            suma = 0;
            j = 1;
            while(j<=i){
                suma += j;
                j++;
            }
            System.out.println("La suma de los " + i + " números naturales es: " + suma);
            
        }
    }
    
}

    