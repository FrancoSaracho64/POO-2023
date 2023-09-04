package unlu.poo.trabajoPractico_1.ejercicios;

import unlu.poo.trabajoPractico_1.tads.Cola;

public class Ejercicio_4 {
    public static void main(String[] args) {
    /*
    Ejercicio 4:
    Implemente el TAD Cola. Defina cuál debe ser la interfaz a implementar;
    cuantos objetos están involucrados en la solución; responsabilidades de
    cada objeto involucrado y ejemplifique el uso.
     */

        Cola cola1 = new Cola();
        cola1.encolar(1);
        cola1.encolar(2);
        cola1.encolar(3);
        cola1.encolar(4);
        cola1.encolar(5);

        mostrar_cola(cola1);
        System.out.println();
        mostrar_cola(cola1);
    }

    public static void mostrar_cola(Cola cola){
        Cola colaAux = new Cola();
        System.out.println("Elementos cargados en la cola:");
        int contador = 1;
        while (!cola.esVacia()){
            Object elemento = cola.desencolar();
            colaAux.encolar(elemento);
            System.out.println("POS: " + contador + "  " + elemento);
            contador++;
        }
        intercambiar(cola, colaAux);
    }
    public static void intercambiar(Cola colaOri, Cola colaAux){
        while (!colaAux.esVacia()){
            colaOri.encolar(colaAux.desencolar());
        }
    }
}
