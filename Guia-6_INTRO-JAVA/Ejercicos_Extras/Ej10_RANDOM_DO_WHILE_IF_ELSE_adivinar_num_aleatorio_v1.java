package Ejercicos_Extras;

import java.util.Scanner;

public class Ej10_RANDOM_DO_WHILE_IF_ELSE_adivinar_num_aleatorio_v1 {

/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre 
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario 
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir 
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como 
utilizar la función Math.random() de Java.
*/
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
          
     int num = (int)(Math.random() *10) * (int)(Math.random() *10);
     int num1 = -1;
     
        System.out.println("Multip num aleat = " + num);
        System.out.println("");
     
        do {

         System.out.println("Ingrese un número:");
         num1 = leer.nextInt();
         
         if (num == num1){
             
            System.out.println("");
             System.out.println("¡¡FELICIDADES, ADIVINASTE!!"); 
             System.out.println("");
             
         } else {
             
            System.out.println("");
             System.out.println("Seguí participando... :( ");
             System.out.println(""); }

        } while (num != num1);

    }
}