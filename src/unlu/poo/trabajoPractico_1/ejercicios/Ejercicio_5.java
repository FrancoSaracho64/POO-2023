package unlu.poo.trabajoPractico_1.ejercicios;

import unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.Prioridad;
import unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.Tarea;

import java.util.ArrayList;

public class Ejercicio_5 {
    public static void main(String[] args) {
        /*
        Se pide:
---Generar un diagrama de clase simple de la clase Tarea.
---Generar el código en Java que represente la tarea. Debe incluir todos los métodos derivados de
la descripción.
---Generar un programa en Java que haga uso de la clase Tarea, y cree las siguientes tareas:
    "Ir al supermercado mañana". Debe tener la fecha límite establecida y estar incompleta.
    "Consultar repuesto del auto". Debe tener la fecha límite para ayer y estar completa.
    "Ir al cine a ver la nueva película de Marvel". Debe tener fecha límite de ayer y estar incompleta.

Este último programa debe configurar el estado especificado en cada objeto,
y mostrar sus mensajes respectivos.
Tip: Es posible que deba revisar el funcionamiento de la clase java.time.LocalDate de Java.
         */
        Tarea primerTarea = new Tarea("Ir al supermercado mañana", Prioridad.INDEFINIDA, "17-10-2002");
        Tarea segundaTarea = new Tarea("Consultar repuesto del auto", Prioridad.ALTA, "03-09-2023");
        Tarea tercerTarea = new Tarea("Ir al cine a ver la nueva película de Marvel", Prioridad.MEDIA, "10-11-2031");

        ArrayList<Tarea> agenda = new ArrayList<>();
        agenda.add(primerTarea);
        agenda.add(segundaTarea);
        agenda.add(tercerTarea);

        for (int i = 0; i < agenda.size(); i++) {
            agenda.get(i).mostrar_tarea();
        }

        agenda.get(1).cambiar_estado();
        agenda.get(1).mostrar_tarea();
    }
}
