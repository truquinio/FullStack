package mascotapp.entidades;

public class Mascota {

    /*
    public String nombre;
    public String apodo;
    //conejo, perro, gato, loro, carpincho
    public String tipo;
    public String raza;
    public String color;
    public int edad;
    public boolean cola;
     */
    private String nombre;
    private String apodo;
    //conejo, perro, gato, loro, carpincho
    private String tipo;
    private String raza;
    private String color;
    private int edad;
    private int vueltas;

    private boolean cola;
    private int energia;

////    CONSTRUCTORES     //////////////////////////////////////////////////////    
    public Mascota() {
        energia = 1000;

    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo, String raza, String color, int edad, boolean cola) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        energia = 1000;

    }

////    SETTERS     ////////////////////////////////////////////////////////////    
    public void setNombre(String nombre) {

        if (nombre.length() > 3) {
            this.nombre = nombre;
        }
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

////    GETTERS     ////////////////////////////////////////////////////////////    
    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public int getEnergia() {
        return energia;
    }

////    MÉTODOS     ////////////////////////////////////////////////////////////
    /**
     * FUNCIÓN DESTINADA A PASEAR
     *
     * @param energiaRestar
     * @return energia
     */
    public int pasear(int energiaRestar) {

        energia -= energiaRestar;

        return energia;
    }

    /**
     * FUNCIÓN DESTINADA A PASEAR POR VUELTAS
     *
     * @param energiaRestar
     * @param vueltas
     * @return energiaRestar
     */
    public int pasear(int energiaRestar, int vueltas) {

        for (int i = 0; i < vueltas; i++) {

            energia -= energiaRestar;
        }
        return energia;
    }

    /**
     * FUNCIÓN DESTINADA A CONTAR LAS VUELTAS y RESTAR ENERGÍA:
     *
     * @param energiaRestar
     * @param vueltas
     * @return vueltas
     */
    public int contarVueltas(int energiaRestar, int vueltas) {

        for (int i = 0; i < vueltas; i++) {

            energia -= energiaRestar;

            vueltas++;
        }
        return vueltas;
    }

////    TO STRING     //////////////////////////////////////////////////////////    
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", raza=" + raza + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", energia=" + energia + '}';
    }
}