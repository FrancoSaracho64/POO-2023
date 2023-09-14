package ar.edu.unlu.poo.trabajoPractico_1.recursosEjercicios.tads;

import ar.edu.unlu.poo.trabajoPractico_1.recursosEjercicios.tiposNodos.NodoSimple;

public class Pila {
    private NodoSimple tope;

    public Pila(){
        this.tope = null;
    }

    public boolean esVacia(){
        return (tope == null);
    }
    public void apilar(Object dato){
        NodoSimple nuevo_nodo = new NodoSimple();
        nuevo_nodo.setDato(dato);
        nuevo_nodo.setSiguiente(tope);
        tope = nuevo_nodo;
    }

    public Object desapilar(){
        NodoSimple topeActual = tope;
        Object dato = topeActual.getDato();
        tope = topeActual.getSiguiente();
        return dato;
    }

    public NodoSimple getTope() {
        return tope;
    }
}