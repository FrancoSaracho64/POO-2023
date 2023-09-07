package unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios;

import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private int puntaje;
    private ArrayList<String> palabras;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntaje = 0;
        this.palabras = new ArrayList<>();
    }

    public void agregar_palabra(String palabra){
        palabras.add(palabra.toUpperCase());
    }

    public void actualizar_puntaje(int puntos){
        puntaje += puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public ArrayList<String> getPalabras() {
        return palabras;
    }
}
