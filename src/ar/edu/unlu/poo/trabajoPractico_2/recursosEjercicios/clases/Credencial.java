package ar.edu.unlu.poo.trabajoPractico_2.recursosEjercicios.clases;

import ar.edu.unlu.poo.trabajoPractico_2.recursosEjercicios.enumerados.Suscripcion;

public class Credencial {
    private final Socio socio;
    private Suscripcion suscripcion;

    public Credencial(Socio socio, Suscripcion suscripcion) {
        this.socio = socio;
        this.suscripcion = suscripcion;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }

    public Socio getSocio() {
        return socio;
    }

}
