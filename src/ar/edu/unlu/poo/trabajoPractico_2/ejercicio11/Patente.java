package ar.edu.unlu.poo.trabajoPractico_2.ejercicio11;

import java.util.HashSet;
import java.util.Set;

public class Patente {
    private static Set<String> dominios = new HashSet<>();
    private final String dominio;
    private final int anio;

    public Patente(String dominio, int anio) {
        if (dominios.contains(dominio)) {
            throw new IllegalArgumentException("La patente ya existe.");
        }
        this.dominio = dominio;
        this.anio = anio;
        dominios.add(dominio);
    }

    public String getDominio() {
        return dominio;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return "Patente con dominio: " + dominio;
    }
}
