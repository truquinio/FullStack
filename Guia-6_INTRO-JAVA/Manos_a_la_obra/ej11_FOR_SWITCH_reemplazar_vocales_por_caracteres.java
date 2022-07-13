/*
EJERCICIO 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada 
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se 
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las 
vocales acentuadas) se mantienen sin cambios.

a   e   i   o   u
@   #   $   %   *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación 
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa:    Ayer, lunes, salimos a las once y 10. 
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */

package Manos_a_la_obra;

import java.util.Scanner;

public class ej11_FOR_SWITCH_reemplazar_vocales_por_caracteres {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase;
                 
       do {
           
           System.out.println("Ingrese una frase, terminada en punto.");
           frase = leer.nextLine();
           
       } while(!frase.endsWith("."));
       //(frase.substring(frase.length(),frase.length()+1)!=".");
        
        String fraseCambiada = cambiarFrase(frase);
        System.out.println(fraseCambiada);
    
    }
      
public static String cambiarFrase(String frase) {
        String nuevaFrase = "";
        
        for (int i = 0; i < frase.length(); i++) {
            
            String letra = frase.substring(i, i+1);//subcadena(frase,i,i)
            
            switch(letra) {
                
                case "a": case "A":
                    nuevaFrase = nuevaFrase.concat("@");
                    break;
                    
                case "e": case "E":
                    nuevaFrase = nuevaFrase.concat("#");
                    break;
                
                case "i": case "I":
                    nuevaFrase = nuevaFrase.concat("$");
                    break;
                    
                case "o": case "O":
                    nuevaFrase = nuevaFrase.concat("%");
                    break;
                    
                case "u": case "U":
                    nuevaFrase = nuevaFrase.concat("+");
                    break;
                    
                default:
                    nuevaFrase = nuevaFrase.concat(letra);
                    break;

            }}
            return nuevaFrase;
        }
}