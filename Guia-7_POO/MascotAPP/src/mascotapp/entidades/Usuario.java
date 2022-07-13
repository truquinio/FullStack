package mascotapp.entidades;

import java.util.Date;

public class Usuario {

    public String nombre;
    public String apellido;
    public String pais;
    public Date nacimiento;
    public int dni;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String pais, Date nacimiento, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.nacimiento = nacimiento;
        this.dni = dni;
    }
}