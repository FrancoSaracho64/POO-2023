package ar.edu.unlu.poo.trabajoPractico_1.ejercicios;

import ar.edu.unlu.poo.trabajoPractico_1.recursosEjercicios.AdministradorDeTareas;
import ar.edu.unlu.poo.trabajoPractico_1.recursosEjercicios.Tarea;
import ar.edu.unlu.poo.trabajoPractico_1.recursosEjercicios.enumeradores.Prioridad;

import java.util.ArrayList;

public class Ejercicio_12 {
    public static void main(String[] args) {
        AdministradorDeTareas mi_administrador = new AdministradorDeTareas();
        System.out.println("------ Creo las tareas solicitadas y las agrego al administrador.");
        mi_administrador.agregar_tarea("Supermercado", "Ir al supermercado mañana", Prioridad.BAJA, "03-09-2023","04-09-2023");
        mi_administrador.agregar_tarea("Marvel", "Ir al cine a ver la nueva película de Marvel", Prioridad.BAJA, "10-11-2024", "15-12-2096");
        mi_administrador.agregar_tarea("Repuesto","Consultar repuesto del auto", Prioridad.BAJA, "06-09-2023", "17-10-2023");
        mi_administrador.agregar_tarea("Moto", "Comprar una moto para mi amigo Juan Lopez", Prioridad.BAJA, "17-05-2025", "25-07-2026");

        System.out.println();
        System.out.println("------ Muestro las tareas cargadas...");
        mostrar_tareas(mi_administrador.getTareas());

        System.out.println();
        System.out.println();
        System.out.println("Ordeno las listas, mostrando las vigentes.");
        ArrayList<Tarea> ordenadas = mi_administrador.ordenar();
        mostrar_tareas(ordenadas);

        System.out.println();
        System.out.println();
        System.out.println("Muestro la tarea 'Repuesto:'");
        Tarea buscada = mi_administrador.buscarTareaPorTitulo("Repuesto");
        buscada.mostrar_tarea();
    }
    public static void mostrar_tareas(ArrayList<Tarea> tareas){
        System.out.println("\n*******************************************");
        System.out.println("Tareas registradas:");
        for (int i = 0; i < tareas.size(); i++) {
            tareas.get(i).mostrar_tarea();
        }
        System.out.println("*******************************************\n\n");
    }
}