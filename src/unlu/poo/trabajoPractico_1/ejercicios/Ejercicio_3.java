package unlu.poo.trabajoPractico_1.ejercicios;

import unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.tads.Pila;

public class Ejercicio_3 {
    public static void main(String[] args) {
        //Creo la pila
        System.out.println("******** Creo la pila y apilo numeros del 1 al 5.");
        Pila pilaPrueba = new Pila();

        //Apilo valores del 1 al 5
        pilaPrueba.apilar(1);
        pilaPrueba.apilar(2);
        pilaPrueba.apilar(3);
        pilaPrueba.apilar(4);
        pilaPrueba.apilar(5);
        mostrar(pilaPrueba);

        System.out.println("******** Apilo el apellido 'Saracho'");
        pilaPrueba.apilar("Saracho");
        mostrar(pilaPrueba);
        System.out.println("******** Desapilo 3 veces");
        pilaPrueba.desapilar();
        pilaPrueba.desapilar();
        pilaPrueba.desapilar();
        mostrar(pilaPrueba);
        System.out.println("******** Cantidad de elementos de la pila: " + longitud(pilaPrueba));
    }
    public static void mostrar(Pila pila){
        Pila pilaAux = new Pila();
        int contador = 1;
        System.out.println("\n*********************************************");
        System.out.println("Contenido de la Pila:");
        while (!pila.esVacia()) {
            System.out.println("Posicion " + contador + ":  " + pila.getTope());
            Object dato = pila.desapilar();
            pilaAux.apilar(dato);
            contador ++;
        }
        System.out.println("*********************************************\n");
        intercambiar(pila, pilaAux);
    }

    public static void intercambiar(Pila pilaOriginal, Pila pilaAux){
        while (!pilaAux.esVacia()){
            Object dato = pilaAux.desapilar();
            pilaOriginal.apilar(dato);
        }
    }

    public static int longitud(Pila pila){
        int cantidad_elementos = 0;
        Pila pilaAux = new Pila();
        while (!pila.esVacia()) {
            Object dato = pila.desapilar();
            pilaAux.apilar(dato);
            cantidad_elementos ++;
        }
        intercambiar(pila, pilaAux);
        return cantidad_elementos;
    }
}
