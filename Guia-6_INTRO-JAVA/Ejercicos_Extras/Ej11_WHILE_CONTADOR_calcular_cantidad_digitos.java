package Ejercicos_Extras;

import java.util.Scanner;

public class Ej11_WHILE_CONTADOR_calcular_cantidad_digitos {

/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que 
componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador 
de división. Nota: recordar que las variables de tipo entero truncan los números o 
resultados.
*/
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");    
     
        System.out.println("Ingrese un número:");
        int num = leer.nextInt();
        
        int digitos = 0;
               
        while (num > 0){
            
            num = num / 10;   // num /= 10  Se divide en 10 para separar todos los dígitos
            
            digitos++; // cada vuelta, va a equivaler a un dígito
        }
        
        System.out.println("La cantidad de dígitos es = " + digitos);  //imprimo las vueltas o dígitos
        System.out.println("");
    }
}