package unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.tiposNodos;

public class NodoSimple {
    private Object dato;
    private NodoSimple siguiente = null;

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "" + dato;
    }
}