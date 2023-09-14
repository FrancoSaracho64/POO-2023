package ar.edu.unlu.poo.trabajoPractico_1.recursosEjercicios.tads;

import ar.edu.unlu.poo.trabajoPractico_1.recursosEjercicios.tiposNodos.NodoSimple;

public class Cola {
    private NodoSimple frente;
    private NodoSimple finalCola;

    public Cola (){
        frente = null;
        finalCola = null;
    }

    public Boolean esVacia(){
        return (frente == null && finalCola == null);
    }

    public void encolar(Object dato){
        NodoSimple nodo = new NodoSimple();
        nodo.setDato(dato);
        if(esVacia()){
            frente = nodo;
        }else{
            finalCola.setSiguiente(nodo);
        }
        finalCola = nodo;
    }

    public Object desencolar(){
        if(esVacia()){
            return null;
        } else {
            NodoSimple temporal = frente;
            frente = frente.getSiguiente();
            if(frente == null){
                finalCola = null;
            }
            return temporal.getDato();
        }
    }
}