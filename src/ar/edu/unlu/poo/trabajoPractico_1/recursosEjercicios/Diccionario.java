package ar.edu.unlu.poo.trabajoPractico_1.recursosEjercicios;

import java.util.ArrayList;

public class Diccionario {
    private ArrayList<String> palabras;

    public Diccionario() {
        this.palabras = new ArrayList<>();
    }

    public void agregar_palabra(String palabra){
        palabras.add(palabra.toUpperCase());
    }

    public boolean esPalabraValida(String palabra){
        return palabras.contains(palabra.toUpperCase());
    }

    public ArrayList<String> getPalabras() {
        return palabras;
    }
}
