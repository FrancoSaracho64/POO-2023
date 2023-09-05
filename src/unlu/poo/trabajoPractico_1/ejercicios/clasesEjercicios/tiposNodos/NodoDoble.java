package unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.tiposNodos;

public class NodoDoble {
    private Object dato;
    private NodoDoble anterior = null;
    private NodoDoble siguiente = null;


    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "" + dato;
    }
}