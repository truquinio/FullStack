package Ejercicos_Extras;

import java.util.Scanner;

/*
Una obra social tiene tres clases de socios:

• Los socios tipo "A" abonan una cuota mayor, pero tienen un 50% de descuento en 
todos los tipos de tratamientos. 
• Los socios tipo "B" abonan una cuota moderada y tienen un 35% de descuento para 
los mismos tratamientos que los socios del tipo A. 
• Los socios que menos aportan, los de tipo "C", no reciben descuentos sobre dichos 
tratamientos.

Solicite una letra (carácter) que representa la clase de un socio, y luego un valor 
real que represente el costo del tratamiento (previo al descuento) y determine el 
importe en efectivo a pagar por dicho socio.
*/

public class Ej05_SWITCH_socios_descuento_obra_social {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el tipo de socio: (A, B, C)");
        String letra = leer.next().toUpperCase();
        System.out.println("");
        
        System.out.println("Ingrese el monto del tratamiento:");
        Double num = leer.nextDouble();
        System.out.println("");
        
        switch (letra){
        case "A":
            System.out.println("Monto a abonar por tratamiento (50% Dcto.) = $" + num / 2);
        break;
        
        case "B":
            System.out.println("Monto a abonar por tratamiento (35% Dcto.) = $" + num / 0.65);
        break;
        
        case "C":
            System.out.println("Monto a abonar por tratamiento = $" + num);
        break;
        
        default:
            System.out.println("No ingresó un tipo de socio válido.");
        }
    }
}