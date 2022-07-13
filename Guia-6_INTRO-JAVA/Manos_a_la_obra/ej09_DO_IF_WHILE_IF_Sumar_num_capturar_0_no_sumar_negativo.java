/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del 
bucle y mostrar el mensaje "Se capturó el numero cero".  El programa deberá calcular y mostrar el 
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.
 */
package Manos_a_la_obra;

import java.util.Scanner;

public class ej09_DO_IF_WHILE_IF_Sumar_num_capturar_0_no_sumar_negativo {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    int num;
    int contador = 0;
    int suma = 0;
        
    do {
    System.out.println("Ingrese un n°:");
    num = leer.nextInt();
        
    suma = suma + num;   // tmb se puede escribir:  suma += num
    contador ++;
    
    if (num < 0){
    suma = suma - num;}
    
    } while (num != 0 && contador < 20);
    
    
    System.out.println("");
    
    if (num == 0){
    System.out.println("Se capturó el numero cero.");}
                   
    System.out.println("La suma de los n° es: " + suma);
    
    System.out.println("");
    
    }}