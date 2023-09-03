package unlu.poo.trabajoPractico_1.ejercicios;

import unlu.poo.trabajoPractico_1.tads.Pila;
import unlu.poo.trabajoPractico_1.tiposNodos.NodoSimple;

public class Ejercicio_3 {
    public static void main(String[] args) {

        /*
        Ejercicio 3: Pila
Implemente el TAD Pila. Defina cuál debe ser la interfaz a implementar; cuantos objetos están
involucrados en la solución; responsabilidades de cada objeto involucrado y ejemplifique el uso.
         */

        //Creo la pila
        Pila pilaPrueba = new Pila();

        //Apilo valores del 1 al 5
        pilaPrueba.apilar(1);
        pilaPrueba.apilar(2);
        pilaPrueba.apilar(3);
        pilaPrueba.apilar(4);
        pilaPrueba.apilar(5);

        mostrar(pilaPrueba);
    }
    public static void mostrar(Pila pila){
        Pila pilaAux = new Pila();
        while (pila.getTope() != null) {
            System.out.println(pila.getTope());
            Object dato = pila.desapilar();
            pilaAux.apilar(dato);
        }
        intercambiar(pila, pilaAux);
    }

    public static void intercambiar(Pila pilaOriginal, Pila pilaAux){
        while (pilaAux.getTope() != null){
            Object dato = pilaAux.desapilar();
            pilaOriginal.apilar(dato);
        }
    }
}
