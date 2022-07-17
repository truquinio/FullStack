package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class MascotAPP {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Mascota m1 = new Mascota("Fernando Chiquito", "Chiquito", "Perro", "Beagle", "Tricolor", 15, true);
        
        /* 
        m1.apodo  = "Chiquito";
        m1.nombre = "Fernando Chiquito";
        m1.tipo = "Perro";
        m1.edad = 14;
        m1.raza = "Beagle";
        m1.cola = true;
        m1.color = "Tricolor";
        */
        
    //  System.out.println("Apodo: " + m1.apodo + ", edad: " + m1.edad + ", tipo: " + m1.tipo);

        System.out.println("");
        
        m1.setNombre("Lalo Landa");
        
        System.out.println(m1.toString());
        
        m1.pasear(100);   //LLAMAMOS EL MÉTODO O FUNCIÓN PASEAR
        
        System.out.println(m1.toString());
        
        System.out.println("");
              
//      m1.pasear(100, vueltas);

        System.out.println(m1);
        
        System.out.println("");
        
        
        Mascota m2 = new Mascota("BBB", "AAAA", "CCCC", "conejo", "blanco", 10, true);
        
        System.out.println(m2);
        
        Mascota m3 = new Mascota("A", "B", "C", "D", "E", 150, true);
        System.out.println(m3);
        
        System.out.println("Ingrese la cantidad de vueltas:");
        int vueltas = leer.nextInt();
        
        m3.contarVueltas(m3.getEnergia(),vueltas);
        
        Mascota m4 = new Mascota("D", "F", "G", "E", "T", 10, true);
        System.out.println(m4);
        
        /*
         this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        energia = 1000;
        */
    }
}