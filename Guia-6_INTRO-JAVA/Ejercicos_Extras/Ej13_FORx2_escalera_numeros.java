package Ejercicos_Extras;

import java.util.Scanner;

public class Ej13_FORx2_escalera_numeros {

/*
Crear un programa que dibuje una escalera de números, donde cada línea de números 
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al 
usuario al comenzar. Ejemplo: si se ingresa el número 3: 
1
12
123
*/
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int altura, i, j;
        
        System.out.println("Ingrese la altura de la escalera:");
        altura = leer.nextInt();
        
        
        for (i = 1; i <= altura; i++) {
            for (j = 1; j <= i; j++) {
                
                System.out.print(j);
            }
            System.out.println("");       
    }
        System.out.println("");
    }
}