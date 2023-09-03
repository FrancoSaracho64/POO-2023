package unlu.poo.trabajoPractico_1.ejercicios;

import unlu.poo.trabajoPractico_1.tads.listas.listaSimple.Lista;

public class Ejercicio_1 {
    public static void main(String[] args) {
        //Creamos la lista
        Lista listaEjemplo = new Lista();

        System.out.println("Creamos la lista y agregamos 5 numeros del 1 al 5.");
        //Insertamos el primer elemento
        listaEjemplo.agregar(1);
        //Insertamos 2do elemento
        listaEjemplo.agregar(2);
        //Insertamos 3er elemento
        listaEjemplo.agregar(3);
        //Insertamos 4to elemento
        listaEjemplo.agregar(4);
        //Insertamos 5to elemento
        listaEjemplo.agregar(5);
        mostrar_lista(listaEjemplo);
        System.out.println();
        System.out.println("Eliminamos la posicion 5.");
        //Eliminamos el 5to elemento y luego mostramos.
        listaEjemplo.eliminar(5);
        mostrar_lista(listaEjemplo);
        System.out.println();
        System.out.println("Insertamos la palabra 'Celular' en la posicion 1.");
        listaEjemplo.insertar("Celular", 1);
        mostrar_lista(listaEjemplo);
        System.out.println();
        System.out.println("Insertamos la palabra 'Mate' en la posicion 4");
        listaEjemplo.insertar("Mate", 4);
        mostrar_lista(listaEjemplo);
        System.out.println();
    }

    //Creamos la funcion fuera del TAD para mostrar la lista por pantalla.
    public static void mostrar_lista(Lista lista){
        int elementos = lista.longitud();
        System.out.println("Elementos cargados en la lista...");
        for (int i = 1; i <= elementos; i++){
            System.out.printf("Posicion %d: %s\n", i, lista.recuperar(i).toString());
        }
    }
}
