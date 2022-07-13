package Ejercicos_Extras;

import java.util.Scanner;

public class Ej09_WHILE_CONTADOR_simular_division_con_restas_recursivas {

/*
    
Simular la división usando solamente restas. Dados dos números enteros mayores que 
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.

Método: 
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este 
resultado es el residuo, y el número de restas realizadas es el cociente. 
Por ejemplo: 50 / 13:
    
50 – 13 = 37      una resta realizada 
37 – 13 = 24      dos restas realizadas 
24 – 13 = 11       tres restas realizadas 
    
Dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.

*/
    
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");    
        
    int num1;
    int num2;
    int cociente = 0;
   
        System.out.println("Ingrese 2 números mayores a 1:");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
    while (num1 >= num2){
        
    cociente++;
    
    num1 -= num2; }  // num1 = num1 - num2
    
        System.out.println("");
        System.out.println("El cociente es: " + cociente);
        System.out.println("El resto es: " + num1);
        System.out.println("");
    }
}