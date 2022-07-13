/*
 Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú:

MENÚ:
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir 

Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla 
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que 
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del 
programa, caso contrario se vuelve a mostrar el menú
 */

package Ejercicios_Normales;

import java.util.Scanner;

public class Ej11_DO_SWITCH_WHILE_menu_suma_resta_mult_div_salir {

    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in).useDelimiter("\n")) {
            System.out.println("Ingrese 2 numeros enteros positivos:");
            int num1 = leer.nextInt();
            int num2 = leer.nextInt();
            int opcion;
            
            System.out.println("");
            
            do {
                System.out.println("MENÚ:");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                
                System.out.println("");
                System.out.println("Elija una opción:");
                opcion = leer.nextInt();
                
                System.out.println("");
                
                switch (opcion) {
                    case 1:
                        System.out.println(num1+ " + " +num2+ " = " + (num1 + num2));
                        System.out.println("");
                        break;
                        
                    case 2:
                        System.out.println(num1+ " - " +num2+ " = " +  + (num1 - num2));
                        System.out.println("");
                        break;
                        
                    case 3:
                        System.out.println(num1+ " x " +num2+ " = " +  + (num1 * num2));
                        System.out.println("");
                        break;
                        
                    case 4:
                        System.out.println(num1+ " / " +num2+ " = " +  + (num1 / num2));
                        System.out.println("");
                        break;
                        
                    case 5:
                        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                        String SiNo = leer.next();
                        System.out.println("");
                        
                        if (SiNo.toUpperCase().equals("S")) {
                            System.out.println("Fin del programa.");
                            System.out.println("");
                            break;
                            
                        } else {
                            System.out.println("Vuelva a intentarlo...");
                            System.out.println("");
                        }
                    default:
                        System.out.println("Opción no valida.");
                        opcion = 0;
                        System.out.println("");
                        break;
                }
            } while (opcion != 5);
        } 
    }
}