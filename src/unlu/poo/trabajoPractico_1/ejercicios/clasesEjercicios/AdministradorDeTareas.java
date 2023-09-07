package unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios;

import unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.enumeradores.Prioridad;

import java.time.LocalDate;
import java.util.ArrayList;

public class AdministradorDeTareas {
    private ArrayList<Tarea> tareas;

    public AdministradorDeTareas() {
        this.tareas = new ArrayList<>();
    }

    /*
    Se necesita que retorne la lista de tareas no vencidas ordenadas primero según la prioridad y luego según la fecha de vencimiento.
    Debe permitir la búsqueda de tareas por título, y dada una tarea poder marcarla como realizada.


     */

    public ArrayList<Tarea> ordenar(){
        ArrayList<Tarea> listaOrdenada = new ArrayList<>();
        ArrayList<Tarea> aux = new ArrayList<>();
        Tarea nueva_tarea;
        if (!tareas.isEmpty()) {
            for (int i = 0; i < tareas.size(); i++) {
                if (tareas.get(i).getFecha_limite().isEqual(LocalDate.now()) || tareas.get(i).getFecha_limite().isAfter(LocalDate.now())){
                    aux.add(tareas.get(i));
                }
            }
            // Ordenamos por PRIORIDAD
            for(int i=0; i<aux.size(); i++){
                nueva_tarea = aux.get(i);
                if(nueva_tarea.getPrioridad().equals(Prioridad.BAJA)){
                    listaOrdenada.add(nueva_tarea);
                }
                if(nueva_tarea.getPrioridad().equals(Prioridad.ALTA)){
                    listaOrdenada.add(0, nueva_tarea);
                }
            }

            // Mantenemos la prioridad y ordenamos por FECHA DE VENCIMIENTO.
            for (int i = 0; i < listaOrdenada.size(); i++){


            }


        }  else return null;

        return listaOrdenada;
    }

    public void agregar_tarea(String titulo, String descripcion, Prioridad prioridad, String fecha_recordatorio, String fecha_limite){
        Tarea nueva_tarea = new Tarea(titulo, descripcion, prioridad, fecha_recordatorio, fecha_limite);
        tareas.add(nueva_tarea);
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }
}
