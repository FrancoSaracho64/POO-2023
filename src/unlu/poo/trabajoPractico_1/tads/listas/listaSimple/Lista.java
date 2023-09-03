package unlu.poo.trabajoPractico_1.tads.listas.listaSimple;

import unlu.poo.trabajoPractico_1.tiposNodos.NodoSimple;

public class Lista {

    private NodoSimple primerElemento = null;

    public boolean esVacia(){
        return (primerElemento == null);
    }

    public int longitud(){
        int cantidad = 0;
        if (!esVacia()) {
            NodoSimple aux = primerElemento;
            while (aux != null) {
                cantidad++;
                aux = aux.getSiguiente();
            }
        }
        return cantidad;
    }

    public void insertar(Object dato, int posicion){
        NodoSimple nuevo_nodo = new NodoSimple();
        nuevo_nodo.setDato(dato);
        if (posicion == 1) {
            nuevo_nodo.setSiguiente(primerElemento);
            primerElemento = nuevo_nodo;
        } else {
            NodoSimple nodoAux = primerElemento;
            int posicionActual = 1;
            while ((posicionActual + 1 != posicion)){
                nodoAux = nodoAux.getSiguiente();
                posicionActual++;
            }
            nuevo_nodo.setSiguiente(nodoAux.getSiguiente());
            nodoAux.setSiguiente(nuevo_nodo);
        }
    }

    public void agregar(Object dato){
        NodoSimple nuevo_nodoSimple = new NodoSimple();
        nuevo_nodoSimple.setDato(dato);
        if(esVacia()){
            primerElemento = nuevo_nodoSimple;
        } else {
            NodoSimple nodoSimple = primerElemento;
            while (nodoSimple.getSiguiente() != null){
                nodoSimple = nodoSimple.getSiguiente();
            }
            nodoSimple.setSiguiente(nuevo_nodoSimple);
        }
    }

    public NodoSimple recuperar(Integer posicion) {
        if (posicion > longitud() || posicion < 1){
            return null;
        } else {
            NodoSimple nodoSimpleRecuperado = primerElemento;
            int posActual = 1;
            while (posActual != posicion) {
                nodoSimpleRecuperado = nodoSimpleRecuperado.getSiguiente();
                posActual++;
            }
            return nodoSimpleRecuperado;
        }
    }

    public void eliminar(Integer posicion){
        if (posicion > longitud() || posicion < 1){
        } else {
            if (posicion == 1){
                primerElemento = primerElemento.getSiguiente();
            } else {
                NodoSimple nodoSimpleRecuperado = primerElemento;
                int posActual = 1;
                while (posActual != (posicion-1)) {
                    nodoSimpleRecuperado = nodoSimpleRecuperado.getSiguiente();
                    posActual++;
                }
                nodoSimpleRecuperado.setSiguiente(nodoSimpleRecuperado.getSiguiente().getSiguiente());
            }
        }
    }
    public void modificar(Integer posicion){

    }
}
