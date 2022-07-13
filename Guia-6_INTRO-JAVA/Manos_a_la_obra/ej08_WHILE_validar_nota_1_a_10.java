/*
 Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se 
pedirá de nuevo hasta que la nota sea correcta. 
 */
package Manos_a_la_obra;

import java.util.Scanner;

public class ej08_WHILE_validar_nota_1_a_10 {
    
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    
    System.out.println("Ingrese su nota:");
    int nota = leer.nextInt();
    
    while (nota < 0 || nota > 10){
        System.out.println("Ingrese su nota:");
        nota = leer.nextInt(); }
    
    }}