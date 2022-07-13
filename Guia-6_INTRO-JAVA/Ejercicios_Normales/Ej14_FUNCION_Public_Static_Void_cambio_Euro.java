package Ejercicios_Normales;

import java.util.Scanner;
/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).

El cambio de divisas es:

* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */

public class Ej14_FUNCION_Public_Static_Void_cambio_Euro {
    
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    System.out.println("Ingresa la cantidad de €:");
    double euro = leer.nextDouble();
    
    cambio(euro);
    
    }

//////   FUNCIÓN PÚBLICA, ESTÁTICA y NO ARROJA RESULTADO (VOID) con parámetro EURO como DECIMAL (DOUBLE)
    
    public static void cambio(double euro) {
        
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    System.out.println("");
        
    double libra = 0.86 * euro;
    double dolar = 1.28611 * euro;
    double yen = 129.852 * euro;

    System.out.println("El cambio de divisas es:");
      System.out.println("");
      
    System.out.println(euro + " € = " + libra + " £");
    System.out.println(euro + " € = " + dolar + " US$");
    System.out.println(euro + " € = " + yen + " ¥"); 
    System.out.println("");
       
    }
}