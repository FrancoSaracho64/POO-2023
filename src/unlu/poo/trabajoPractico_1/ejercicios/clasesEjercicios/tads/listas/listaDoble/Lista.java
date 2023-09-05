package unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.tads.listas.listaDoble;

import unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.tiposNodos.NodoDoble;

public class Lista {
    private NodoDoble primerElemento = null;

    public boolean esVacia(){
        return (primerElemento == null);
    }

    public int longitud(){
        int cantidad = 0;
        if (!esVacia()) {
            NodoDoble aux = primerElemento;
            while (aux != null) {
                cantidad++;
                aux = aux.getSiguiente();
            }
        }
        return cantidad;
    }

    public void insertar(Object dato, int posicion){
        NodoDoble nuevo_nodo = new NodoDoble();
        nuevo_nodo.setDato(dato);
        if (posicion == 1) {
            nuevo_nodo.setSiguiente(primerElemento);
            primerElemento.setAnterior(nuevo_nodo);
            primerElemento = nuevo_nodo;
        } else {
            NodoDoble nodoAux = primerElemento;
            int posicionActual = 1;
            while ((posicionActual + 1 != posicion)){
                nodoAux = nodoAux.getSiguiente();
                posicionActual++;
            }
            nuevo_nodo.setSiguiente(nodoAux.getSiguiente());
            nuevo_nodo.setAnterior(nodoAux);
            nodoAux.getSiguiente().setAnterior(nuevo_nodo);
            nodoAux.setSiguiente(nuevo_nodo);
        }
    }

    public void agregar(Object dato){
        NodoDoble nuevo_nodo = new NodoDoble();
        nuevo_nodo.setDato(dato);
        if(esVacia()){
            primerElemento = nuevo_nodo;
        } else {
            NodoDoble nodoAux = primerElemento;
            while (nodoAux.getSiguiente() != null){
                nodoAux = nodoAux.getSiguiente();
            }
            nodoAux.setSiguiente(nuevo_nodo);
            nuevo_nodo.setAnterior(nodoAux);
        }
    }

    public Object recuperar(Integer posicion) {
        if (posicion > longitud() || posicion < 1){
            return null;
        } else {
            NodoDoble nodoSimpleRecuperado = primerElemento;
            int posActual = 1;
            while (posActual != posicion) {
                nodoSimpleRecuperado = nodoSimpleRecuperado.getSiguiente();
                posActual++;
            }
            return nodoSimpleRecuperado.getDato();
        }
    }

    public void eliminar(Integer posicion){
        if (posicion <= longitud() && posicion >= 1) {
            if (posicion == 1){
                primerElemento = primerElemento.getSiguiente();
            } else {
                NodoDoble nodoRecuperado = primerElemento;
                int posActual = 1;
                while (posActual+1 != posicion) {
                    nodoRecuperado = nodoRecuperado.getSiguiente();
                    posActual++;
                }
                if (posActual+1 == longitud()){
                    nodoRecuperado.setSiguiente(null);
                } else {
                    (nodoRecuperado.getSiguiente().getSiguiente()).setAnterior(nodoRecuperado);
                    nodoRecuperado.setSiguiente(nodoRecuperado.getSiguiente().getSiguiente());
                }
            }
        }
    }
}