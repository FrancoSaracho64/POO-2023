package ar.edu.unlu.poo.trabajoPractico_2.recursosEjercicios.clases;

import ar.edu.unlu.poo.trabajoPractico_2.recursosEjercicios.enumerados.Suscripcion;

public class Actividad {
    private String detalle;
    private Suscripcion suscripcion;

    public Actividad(String detalle, Suscripcion suscripcion) {
        this.detalle = detalle;
        this.suscripcion = suscripcion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }
}
