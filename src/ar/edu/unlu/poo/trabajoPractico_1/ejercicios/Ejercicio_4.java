package ar.edu.unlu.poo.trabajoPractico_1.ejercicios;

import ar.edu.unlu.poo.trabajoPractico_1.recursosEjercicios.tads.Cola;

public class Ejercicio_4 {
    public static void main(String[] args) {
        System.out.println("******** Creo la cola y encolo numeros del 1 al 5.");
        Cola colaPrueba = new Cola();
        colaPrueba.encolar(1);
        colaPrueba.encolar(2);
        colaPrueba.encolar(3);
        colaPrueba.encolar(4);
        colaPrueba.encolar(5);

        mostrar_cola(colaPrueba);
        System.out.println("******** Encolo el nombre 'Franco'");
        colaPrueba.encolar("Franco");
        mostrar_cola(colaPrueba);
        System.out.println("******** Cantidad de elementos: " + longitud(colaPrueba) + "\n");
        System.out.println("******** Desencolo 4 veces.");
        colaPrueba.desencolar();
        colaPrueba.desencolar();
        colaPrueba.desencolar();
        colaPrueba.desencolar();
        mostrar_cola(colaPrueba);
    }

    public static void mostrar_cola(Cola cola){
        Cola colaAux = new Cola();
        System.out.println("\n**************************************************");
        System.out.println("Elementos cargados en la cola:");
        int contador = 1;
        while (!cola.esVacia()){
            Object elemento = cola.desencolar();
            colaAux.encolar(elemento);
            System.out.println("POSICION " + contador + ":  " + elemento);
            contador++;
        }
        System.out.println("**************************************************\n");
        intercambiar(cola, colaAux);
    }
    public static void intercambiar(Cola colaOri, Cola colaAux){
        while (!colaAux.esVacia()){
            colaOri.encolar(colaAux.desencolar());
        }
    }

    public static int longitud (Cola cola){
        Cola colaAux = new Cola();
        int contador = 0;
        while (!cola.esVacia()){
            Object elemento = cola.desencolar();
            colaAux.encolar(elemento);
            contador++;
        }
        intercambiar(cola, colaAux);
        return contador;
    }
}
