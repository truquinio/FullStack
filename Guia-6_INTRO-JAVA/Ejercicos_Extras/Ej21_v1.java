package Ejercicos_Extras;

import java.util.Random;

/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y 
desaprobados. 

Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos 
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:

Primer trabajo práctico evaluativo 10% 
Segundo trabajo práctico evaluativo 15% 
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del 
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y 
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o 
igual al 7 de sus notas del curso.
 */

public class Ej21_v1 {

    public static void main(String[] args) {
        
        float[] listaPromedios = new float[10];
        
        float promedio = 0;
        int aprobados = 0;
        int desaprobados = 0;
        
        for (int alumno = 0; alumno < 10; alumno++) { //alumno = i
            
            System.out.println("Nota, alumno: " + (alumno+1));
            
            
            for (int notas = 0; notas < 4; notas++) {  // notas = j
                
                int valorNota = new Random().nextInt((10+1));  //10 + 1 para que escriba los números del 0 al 10 inclusive
                //nota = (int)((Math.random()*10)+1);
                
                         
                switch(notas){
                    case 0: 
                        promedio += valorNota * 0.10;
                        System.out.println("nota " + (notas+1) + ": " + valorNota + " x  0.10 = " + (valorNota * 0.10));
                        break;
                        
                    case 1:
                        promedio += valorNota * 0.15;
                        break;
                        
                    case 2:
                        promedio += valorNota * 0.25;
                        break;
                        
                    case 3:
                         promedio += valorNota * 0.50;
                        break;
                }
            }
            listaPromedios[alumno] = promedio;
            
            System.out.println("");
            System.out.println("El promedio del alumno " + (alumno+1) + " es: [" + promedio + "]");
            System.out.println("");
            System.out.println("________________________________");
            System.out.println("");
            
            promedio = 0;
        }
        
        System.out.println("");
        
        System.out.println("Listado promedios:");
        
        for (int alumno = 0; alumno < 10; alumno++) {
            
            System.out.print("[" + listaPromedios[alumno] + "]");

            if (listaPromedios[alumno] >= 7){
                
                aprobados++;
                
            }else{
                
                desaprobados++;
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("La cantidad de alumnos aprobados es: " + aprobados + " y la cantidad de alumnos desaprobados es : " + desaprobados);
        System.out.println("");
    }
}