package ar.edu.unlu.poo.trabajoPractico_2.ejercicio9;

public class Cuadrado extends Figura2D {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }
}
