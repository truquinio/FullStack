/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando 
que el primer numero es múltiplo del segundo y e imprima si el primer numero es múltiplo del 
segundo, sino informe que no lo son.
 */

package Manos_a_la_obra;

import java.util.Scanner;

public class ej12_Funcion_IF_ELSE_num1_multiplo_num2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int num1;
	int num2;
        
    System.out.println("Ingrese dos numeros:");
    num1 = leer.nextInt();
    num2 = leer.nextInt();
    
    EsMultiplo(num1,num2);
    
    }
    
    public static void EsMultiplo(int num1, int num2) {
        
        if (num1 % num2 == 0){
            System.out.println("El primer numero es múltiplo del segundo");}
        
        else {
            System.out.println("El primer numero no es múltiplo del segundo");
            
        }}}