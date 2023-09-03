package unlu.poo.trabajoPractico_1.tads;

import unlu.poo.trabajoPractico_1.tiposNodos.NodoSimple;

public class Pila {
    private NodoSimple tope = null;

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

    public Integer longitud(){
        Integer cantidad_elementos = 0;


        return cantidad_elementos;
    }

    public NodoSimple getTope() {
        return tope;
    }

    public void setTope(NodoSimple tope) {
        this.tope = tope;
    }
}
