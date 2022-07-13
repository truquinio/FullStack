package Ejercicos_Extras;

import java.util.Scanner;

/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */

public class Ej16_FUNCION_FORx2_IF_ELSE_pedir_nombre_edad_N_personas {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
         
        System.out.println("Ingrese la cantidad de personas:");
        int personas = leer.nextInt();
        
        System.out.println("");
             
        nombreEdad (personas);
        
    }
    
/// FUNCIÓN para pedir NOMBRE y EDAD ///////////////////////////////////////////
    
        public static void nombreEdad (int personas){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
        String nombre;
        int edad;
        int i = 1;
        int j = 0;
        String respuesta = "SI";

        do {
                     
            System.out.println("Ingrese el nombre de persona: " + i);
            nombre = leer.next();
            
            i++;
        
            System.out.println("");
                        
            System.out.println("Ingrese la edad de: " + nombre);
            edad = leer.nextInt();
            
            System.out.println("");
            
            System.out.println(nombre + " tiene " + edad + " años de edad.");
          
        if (edad >= 21){
            
            System.out.println("Es mayor de edad."); }
            
        else {
            
            System.out.println("Es menor de edad."); }
         
        personas--;
        
            System.out.println("");
           
        if (personas > 0){  
            
            System.out.println("¿Desea continuar? Si/No");
            respuesta = leer.next().toUpperCase();
            
            System.out.println("");
            
        } else {
            
            System.out.println("Ya no quedan personas.");
            System.out.println("");
        }

        } while (personas > 0 && respuesta.equals("SI"));
        
        System.out.println("");
    }
}