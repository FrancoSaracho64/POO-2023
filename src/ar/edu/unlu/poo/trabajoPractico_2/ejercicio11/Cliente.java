package ar.edu.unlu.poo.trabajoPractico_2.ejercicio11;

import java.util.ArrayList;

public class Cliente {
    private ArrayList<Alquiler> alquileres = new ArrayList<>();
    private final String nombre;
    private Vehiculo vehiculo;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void realizarAlquiler(Vehiculo vehiculo, String f_ini, String f_fin){
        if (this.vehiculo != null) {
            return;
        }
        // Realizamos el alquiler
        this.vehiculo = vehiculo;
        Alquiler alquiler = new Alquiler(this, f_ini, f_fin);
        alquileres.add(alquiler);
    }

    public void devolverVehiculo(){
        vehiculo = null;
    }

    public String getNombre() {
        return nombre;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public ArrayList<Alquiler> getAlquileres() {
        return alquileres;
    }
}
