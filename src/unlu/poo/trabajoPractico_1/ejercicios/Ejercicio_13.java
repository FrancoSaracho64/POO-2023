package unlu.poo.trabajoPractico_1.ejercicios;

import unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.AdministradorDeTareas;
import unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.Colaborador;
import unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.Tarea;
import unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.enumeradores.Prioridad;

import java.util.ArrayList;

public class Ejercicio_13 {
    /*
    Ejercicio 13
Seguimos extendiendo el ToDoList, se agregan nuevas funcionalidades.
Ahora las tareas pueden resolverlas varias personas, por lo cual una
lista de tareas puede tener varios colaboradores y una tarea, cuando
se marca finalizada, será realizada por un colaborador. Cuando la tarea
se marca finalizada debería registrar la fecha de finalización.

Se debe poder obtener un listado de las tareas realizadas por un colaborador.
     */
    public static void main(String[] args) {
        AdministradorDeTareas mi_administrador = new AdministradorDeTareas();

        mi_administrador.agregar_colaborador("Franco");
        mi_administrador.agregar_colaborador("Mateo");

        System.out.println("------ Creo las tareas solicitadas y las agrego al administrador.");
        mi_administrador.agregar_tarea("Supermercado", "Ir al supermercado mañana", Prioridad.BAJA, "03-09-2023", "04-09-2023");
        mi_administrador.agregar_tarea("Marvel", "Ir al cine a ver la nueva película de Marvel", Prioridad.BAJA, "10-11-2024", "15-12-2096");
        mi_administrador.agregar_tarea("Repuesto", "Consultar repuesto del auto", Prioridad.BAJA, "06-09-2023", "17-10-2023");
        mi_administrador.agregar_tarea("Moto", "Comprar una moto para mi amigo Juan Lopez", Prioridad.BAJA, "17-05-2025", "25-07-2026");

        System.out.println();
        System.out.println("------ Muestro las tareas cargadas...");
        mostrar_tareas(mi_administrador.getTareas());

        mi_administrador.completarTarea("supermercado", "Franco");
        mostrar_tareas(mi_administrador.getTareas());
    }

    public static void mostrar_tareas(ArrayList<Tarea> tareas) {
        System.out.println("\n*******************************************");
        System.out.println("Tareas registradas:");
        for (int i = 0; i < tareas.size(); i++) {
            tareas.get(i).mostrar_tarea();
        }
        System.out.println("*******************************************\n\n");
    }
}
