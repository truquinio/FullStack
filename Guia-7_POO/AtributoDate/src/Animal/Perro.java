package Animal;

import java.util.Date;

public class Perro {
    
// Atributo tipo Date    
    private Date fechaDeNacimiento;

/// CONSTRUCTOR ////////////////////////////////////////////////////////////////
    public Perro(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

// Esto es para que no se cree la fecha en null     
    public Perro() {
        fechaDeNacimiento = new Date(); 
    }
    
/// GETTERS ////////////////////////////////////////////////////////////////////    
    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

/// SETTERS ////////////////////////////////////////////////////////////////////    
    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

// Lo guardamos en el atributo    
    public void llenarFecha(Date fechaNacimiento) {
        this.fechaDeNacimiento = fechaNacimiento; 
    }

    public void mostrarFecha() {
        System.out.println("Dia:" + fechaDeNacimiento.getDate() // Mostramos el dia con getDate, no con getDay
                + " Mes:" + fechaDeNacimiento.getMonth()        // Mostramos el mes 
                + " Año:" + fechaDeNacimiento.getYear());       // Mostramos el año
    }

// Mostramos el dia con getDate, no con getDay
    @Override
    public String toString() {
        return "Perro{" + "fechaDeNacimiento:" + "Dia:" + fechaDeNacimiento.getDate()
                + " Mes:" + fechaDeNacimiento.getMonth()        // Mostramos el mes 
                + " Año:" + fechaDeNacimiento.getYear();
    }
}