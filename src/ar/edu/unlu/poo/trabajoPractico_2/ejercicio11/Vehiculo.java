package ar.edu.unlu.poo.trabajoPractico_2.ejercicio11;

import java.util.HashSet;
import java.util.Set;

public abstract class Vehiculo {
    static private Set<Patente> patentes = new HashSet<>();
    private double precioBase = 3000;
    private Patente patente;

    public Vehiculo(Patente patente){
        if (!existe_patente(patente)){
            this.patente = patente;
            patentes.add(patente);
        }
    }

    private boolean existe_patente(Patente patente){
        return patentes.contains(patente);
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public abstract double getPrecioBase_PorDia();

    public Patente getPatente() {
        return patente;
    }

    public void setPatente(Patente patente) {
        this.patente = patente;
    }
}
