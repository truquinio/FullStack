package Ejercicos_Extras;

import java.util.Scanner;

/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos en el main.
 */

public class Ej15_DO_WHILE_SWITCH_FUNCIONx4_suma_resta_mult_div_num1_num2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese 2 n°:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        System.out.println("");
        
        int opcion;
       
        do {
        System.out.println("¿Qué desea hacer?:");
        System.out.println("1. Sumar los n°.");
        System.out.println("2. Restar los n°.");
        System.out.println("3. Multiplicar los n°.");
        System.out.println("4. Dividir los n°.");
        
        System.out.println("");
        opcion = leer.nextInt();
        System.out.println("");
        
        switch (opcion) {
            case 1:
                Suma(num1,num2);
                break;
            case 2:
                Resta(num1,num2);
                break;
            case 3:
                Multiplicacion(num1,num2);
                break;
            case 4:
                Division(num1,num2);
                break;
            default:
                System.out.println("Opción no valida.");
                opcion = 0;
                System.out.println("");
                break;
        }
        } while (opcion != 5);
    }
    
/// FUNCIÓN SUMA ///////////////////////////////////////////////////////////////

    public static void Suma(int num1, int num2) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");      
       
       System.out.println(num1+ " + " +num2+ " = " + (num1 + num2));
       System.out.println("");
   }

/// FUNCIÓN RESTA //////////////////////////////////////////////////////////////

    public static void Resta(int num1, int num2) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");      
       
       System.out.println(num1+ " - " +num2+ " = " + (num1 - num2));
       System.out.println("");
   }    

/// FUNCIÓN MULTIPLICACIÓN /////////////////////////////////////////////////////

    public static void Multiplicacion(int num1, int num2) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");      
       
       System.out.println(num1+ " x " +num2+ " = " + (num1 * num2));
       System.out.println("");
   }
    
/// FUNCIÓN DIVISIÓN ///////////////////////////////////////////////////////////

    public static void Division(int num1, int num2) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");      
       
       System.out.println(num1+ " / " +num2+ " = " + (num1 / num2));
       System.out.println("");
   }
}    