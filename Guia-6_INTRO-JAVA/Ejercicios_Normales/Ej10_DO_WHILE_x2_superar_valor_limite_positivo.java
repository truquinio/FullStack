/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
números al usuario hasta que la suma de los números introducidos supere el límite inicial. 
*/

package Ejercicios_Normales;

import java.util.Scanner;

public class Ej10_DO_WHILE_x2_superar_valor_limite_positivo {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
     int limite;
     
    do {
            
    System.out.println("Ingrese un límite positivo:");
    limite = leer.nextInt();
    
      System.out.println("");
     
    } while (limite < 0);
    
    int total = 0;
    
    System.out.println("Escribir números hasta que supere el límite inicial."); 
         
    do {
       
    System.out.println("Ingrese un n°:");    
    int num = leer.nextInt();
    
      System.out.println("");
    
    total = (total + num);  }
   
    while (limite > total);
      
    System.out.println("Llegó al límite, el resultado es: " + total);
    System.out.println("");
   
    }
}