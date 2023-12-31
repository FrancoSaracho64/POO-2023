package ar.edu.unlu.poo.trabajoPractico_2.ejercicio9;

public class Circulo extends Figura2D {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
