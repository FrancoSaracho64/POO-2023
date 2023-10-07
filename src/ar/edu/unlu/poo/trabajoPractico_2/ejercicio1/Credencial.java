package ar.edu.unlu.poo.trabajoPractico_2.ejercicio1;

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
