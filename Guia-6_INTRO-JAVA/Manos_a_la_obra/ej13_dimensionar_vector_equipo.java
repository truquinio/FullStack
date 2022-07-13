/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y 
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante. 
 */

package Manos_a_la_obra;

import java.util.Scanner;

public class ej13_dimensionar_vector_equipo {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    String[] Equipo = new String[5];
        
    //System.out.println(Equipo[0]);
    
  for (int i = 0; i < 5; i++) {
  System.out.println ("Ingrese el nombre del participante: " +i);
  Equipo[i] = leer.next();}
  
    }}

/*
  
*/