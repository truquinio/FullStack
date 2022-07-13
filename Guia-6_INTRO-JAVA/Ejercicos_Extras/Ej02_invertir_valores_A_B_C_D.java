package Ejercicos_Extras;

import java.util.Scanner;

/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada 
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C 
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores 
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */

public class Ej02_invertir_valores_A_B_C_D {
    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int A, B, C, D, Aux;
              
        A = 1;
        B = 2;
        C = 3;
        D = 4;
         
        System.out.println("Valores iniciales:");
        
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        System.out.println("");
        
        Aux = B;
        B = C;
        C = A;
        A = D;
        D = Aux;
        
        System.out.println("Valores cambiados:");
        
        System.out.println("A = " + D);
        System.out.println("B = " + C);
        System.out.println("C = " + A);
        System.out.println("D = " + B);
        System.out.println("");
    }
}

/*
System.out.println("Introduce el valor de A: ");
A = leer.nextInt();

System.out.println("Introduce el valor de B: ");
B = leer.nextInt();

System.out.println("Introduce el valor de C: ");
C = leer.nextInt();

System.out.println("Introduce el valor de D: ");
D = leer.nextInt();
*/

/*
System.out.println("A = " + D);
System.out.println("B = " + C);
System.out.println("C = " + A);
System.out.println("D = " + B);
System.out.println("");   
*/