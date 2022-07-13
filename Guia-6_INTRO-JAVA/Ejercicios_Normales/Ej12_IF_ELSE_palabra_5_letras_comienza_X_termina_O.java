package Ejercicios_Normales;

import java.util.Scanner;

/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser 
X y el último tiene que ser una O.

Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta 
de FDE, que no respete el formato se considera incorrecta.

Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java Substring(), Length(), equals().
 */
public class Ej12_IF_ELSE_palabra_5_letras_comienza_X_termina_O {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase;
        
        int correcto = 0;
        int incorrecto = -1;
        
        do {
        
        System.out.println("");
        System.out.println("Ingrese una frase:");
        frase = leer.nextLine().toUpperCase();
        System.out.println("");
        
    //  if (frase.substring(0,1).equals("X") && frase.substring(3,4).equals("O")){        
        if (frase.length() == 5 && frase.startsWith("X") && frase.endsWith("O")){
        
        System.out.println("La palabra/frase es CORRECTA");
        
        correcto = correcto +1;
    
        } else {
        
        if (!frase.equals("&&&&&"))    
            System.out.println("La palabra/frase es INCORRECTA");
                System.out.println(""); 
        
        incorrecto = incorrecto +1; }
            
        } while (!frase.equals("&&&&&"));
        
        System.out.println("Correctos = " + correcto);
        System.out.println("Incorrectos = " + incorrecto);
        System.out.println("");
    }}