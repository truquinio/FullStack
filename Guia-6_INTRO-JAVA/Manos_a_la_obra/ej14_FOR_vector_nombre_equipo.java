/*
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
 */
package Manos_a_la_obra;

import java.util.Scanner;

public class ej14_FOR_vector_nombre_equipo {

     public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    String[] Equipo = new String[5];
    
    for (int i = 0; i < 5; i++) {
    System.out.println ("Ingrese el nombre del participante: " +i);
    Equipo[i] = leer.next();
    
    }}}
