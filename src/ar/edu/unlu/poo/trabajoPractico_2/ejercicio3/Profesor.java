package ar.edu.unlu.poo.trabajoPractico_2.ejercicio3;

public class Profesor {
    private String nombre;
    private double sueldo;

    public Profesor(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    void cobrarSueldo(double monto) {
        sueldo += monto;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
