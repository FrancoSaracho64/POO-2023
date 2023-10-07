package ar.edu.unlu.poo.trabajoPractico_2.ejercicio2;

import java.util.ArrayList;

public class Guia {
    private String nombre;
    private ArrayList<String> excursiones = new ArrayList<String>();
    public Guia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void agregarExcursion(String excursion) {
        excursiones.add(excursion);
    }
    public void mostrarExcursiones() {
        for (String s : excursiones) {
            System.out.println("Excursion: " + s);
        }
    }
    public ArrayList<String> getExcursiones() {
        return excursiones;
    }
}
