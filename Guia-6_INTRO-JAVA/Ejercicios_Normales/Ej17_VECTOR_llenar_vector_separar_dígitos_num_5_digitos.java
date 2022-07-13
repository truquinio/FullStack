package Ejercicios_Normales;

import java.util.Random;
import java.util.Scanner;

/**
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
de 2 dígitos, etcétera (hasta 5 dígitos).
 */

public class Ej17_VECTOR_llenar_vector_separar_dígitos_num_5_digitos {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
        System.out.println("Ingrese el tamaño del vector");
        int tamanio = leer.nextInt();
        
        int digitos = 5;
        int[] vector = new int[tamanio];
        
        for (int i = 0; i < tamanio; i++) {
            //vector[i] = (int) (Math.random() * Math.pow(10, digitos));
            vector[i] = new Random().nextInt(99999);
        }

        for (int i = 0; i < tamanio; i++) {
            System.out.println(vector[i]);
        }

        int[] cantidad = new int[digitos];
        for (int i = 0; i < digitos; i++) {
            cantidad[i] = 0;
        }

        double numero;
        int digito;
        
        for (int i = 0; i < tamanio; i++) {
            
            numero = vector[i];
            digito = 0;
            
            while (numero >= 1) {
                numero = numero / 10;
                digito++;
            }
            cantidad[digito-1] ++;
        }

        for (int i = 0; i < digitos; i++) {
            System.out.println("Cantidad de numeros de " + (i+1) + " digitos: " +cantidad[i]);
        }
    }
}