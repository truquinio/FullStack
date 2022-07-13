package Ejercicos_Extras;

import java.util.Scanner;

/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe 
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y 
la cantidad de números impares. Al igual que en el ejercicio anterior los números 
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
*/

public class Ej08_DO_WHILE_MOD_cantidad_num_par_impar {
    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    int num = 0;
    int contador = 0;
    int contadorPares = 0;
    int contadorImpares = 0;
    
    do {
    
        System.out.println("Ingrese un número entero: ");
        num = leer.nextInt();
    
    if (num > 0) {
        
        contador++;
        
        if (num % 2 == 0){
            
        contadorPares++;
            
        }else
            
        contadorImpares++; }
        
    } while (num % 5 != 0);
              
        System.out.println("");
        System.out.println("Cantidad de números leídos = " + contador);
        System.out.println("Cantidad de números pares = " + contadorPares);
        System.out.println("Cantidad de números impares = " + contadorImpares);
        System.out.println("");
    }
}