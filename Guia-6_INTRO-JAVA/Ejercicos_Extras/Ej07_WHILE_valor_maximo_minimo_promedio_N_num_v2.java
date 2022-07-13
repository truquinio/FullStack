package Ejercicos_Extras;

import java.util.Scanner;

/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio 
de n números (n>0). El valor de n se solicitará al principio del programa y los números 
serán introducidos por el usuario. Realice dos versiones del programa, una usando el 
bucle “while” y otra con el bucle “do - while”.
 */

public class Ej07_WHILE_valor_maximo_minimo_promedio_N_num_v2 {
    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         
System.out.println("Ingrese la cantidad de n°: (1 a 10)");
    int num = leer.nextInt();
    System.out.println(""); 

int contador = 0;
int contador2 = 0;
int maximo = 0;
int minimo = 0;
float suma = 0;
 
while (contador < num){

System.out.println("Ingrese un valor:");
int valor = leer.nextInt();
      
contador++;

if (valor >= 0){

contador2++;
    
    if (valor > maximo){
    
    maximo = valor;}

    if (valor < minimo || minimo == 0){
        
      minimo = valor;}
    
    suma += valor;   // suma = suma + valor
    
    }
}    
        System.out.println("");
        System.out.println("Maximo = " + maximo);
        System.out.println("Mínimo = " + minimo);
        System.out.println("Promedio = " + (suma / contador2));
        System.out.println("");
    }
}