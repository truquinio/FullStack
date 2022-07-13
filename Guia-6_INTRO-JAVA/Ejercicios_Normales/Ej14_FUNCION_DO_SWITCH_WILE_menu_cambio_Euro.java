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

public class Ej14_FUNCION_DO_SWITCH_WILE_menu_cambio_Euro {
    
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
    
    int opcion;
        
    do {
        
    System.out.println("Elija una opción:");
    System.out.println("1. € a £");
    System.out.println("2. € a US$");
    System.out.println("3. € a ¥");
    System.out.println("4. Mostrar todas las cotizaciones.");
    
    double libra = 0.86 * euro;
    double dolar = 1.28611 * euro;
    double yen = 129.852 * euro;
    
    System.out.println("");
    opcion = leer.nextInt();
    System.out.println("");
    
    switch (opcion) {
        
        case 1:
            System.out.println(euro + " € = " + libra + " £");
            System.out.println("");
            break;
            
        case 2:
            System.out.println(euro + " € = " + dolar + " US$");
             System.out.println("");
            break;
            
        case 3:
            System.out.println(euro + " € = " + yen + " ¥"); 
             System.out.println("");
             break;
             
        case 4:
            System.out.println("El cambio de divisas es:");
            System.out.println(euro + " € = " + libra + " £");
            System.out.println(euro + " € = " + dolar + " US$");
            System.out.println(euro + " € = " + yen + " ¥"); 
             System.out.println("");
             break;
        
        default:
            System.out.println("No es un valor válido.");
            System.out.println("");}
                
     //return cambio;  esto no va porque la función no retorna nada (x eso es VOID)
     
            } while (opcion != 4);
    }
}

/*
    System.out.println("");
    
    System.out.println("Elija una opción:");
    System.out.println("1. € a £");
    System.out.println("2. € a US$");
    System.out.println("3. € a ¥");
    System.out.println("4. Mostrar todas las cotizaciones.");
    
    System.out.println("");
    int opcion = leer.nextInt();
    

    double libra = 0.86 * euro;
    double dolar = 1.28611 * euro;
    double yen = 129.852 * euro;
    
    System.out.println(libra + " £");
    System.out.println(dolar + " US$");
    System.out.println(yen + " ¥"); 
    */    