package ar.edu.unlu.poo.trabajoPractico_1.ejercicios;

import ar.edu.unlu.poo.trabajoPractico_1.recursosEjercicios.Tarea;
import ar.edu.unlu.poo.trabajoPractico_1.recursosEjercicios.enumeradores.Estado;
import ar.edu.unlu.poo.trabajoPractico_1.recursosEjercicios.enumeradores.Prioridad;

import java.util.ArrayList;

public class Ejercicio_10 {
    public static void main(String[] args) {
        System.out.println("------ Creo las tareas solicitadas y las agrego a un ArrayList.");
        Tarea primerTarea = new Tarea("Ir al supermercado mañana", Prioridad.BAJA, "03-09-2023","10-09-2023");
        Tarea segundaTarea = new Tarea("Consultar repuesto del auto", Prioridad.BAJA, "06-09-2023", "17-10-2023");
        Tarea tercerTarea = new Tarea("Ir al cine a ver la nueva película de Marvel", Prioridad.BAJA, "10-11-2031");
        ArrayList<Tarea> agenda = new ArrayList<>();
        agenda.add(primerTarea);
        agenda.add(segundaTarea);
        agenda.add(tercerTarea);

        System.out.println();
        System.out.println("------ Muestro las tareas cargadas...");
        mostrar_tareas(agenda);

        System.out.println("\n------ Finalizo la primer tarea y muestro el nuevo estado de la tarea.");
        agenda.get(1).cambiar_estado(Estado.FINALIZADA);
        agenda.get(1).mostrar_tarea();

        System.out.println("\n------ Modifico la descripcion de la segunda tarea 'Ir a ver la Formula 1 en Brasil' y coloco ALTA prioridad.");
        agenda.get(2).modificar_descripcion("Ir a ver la Formula 1 en Brasil");
        agenda.get(2).cambiar_prioridad(Prioridad.ALTA);
        agenda.get(2).mostrar_tarea();
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
