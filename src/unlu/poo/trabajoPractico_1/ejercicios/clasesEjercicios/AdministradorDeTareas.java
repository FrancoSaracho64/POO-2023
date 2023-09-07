package unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios;

import unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.enumeradores.Estado;
import unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.enumeradores.Prioridad;
import unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.tads.Cola;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AdministradorDeTareas {
    private ArrayList<Tarea> tareas;
    private ArrayList<Colaborador> colaboradores;

    public AdministradorDeTareas() {
        this.tareas = new ArrayList<>();
        this.colaboradores = new ArrayList<>();
    }

    public Tarea buscarTareaPorTitulo(String titulo) {
        Tarea tareaEncontrada = null;
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                tareaEncontrada = tareas.get(i);
            }
        }
        return tareaEncontrada;
    }

    public void completarTarea(String titulo, Colaborador colaborador) {
        Colaborador finalizador = null;
        boolean encontrado = false;
        for (int i = 0; i < colaboradores.size(); i++) {
            if (colaboradores.get(i).equals(colaborador)){
                finalizador = colaborador;
                encontrado = true;
            }
        }
        if (encontrado) {
            for (int i = 0; i < tareas.size(); i++) {
                if (tareas.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                    tareas.get(i).setEstado(Estado.FINALIZADA);
                    tareas.get(i).setFecha_finalizacion(LocalDate.now());
                    tareas.get(i).setFinalizador(finalizador);
                    return;
                }
            }
        }
    }

    public ArrayList<Tarea> tareaFinalizadasPor (Colaborador colaborador){
        ArrayList<Tarea> tareasFin = new ArrayList<>();
        for (int i = 0; i < tareas.size(); i++) {
            if(tareas.get(i).getFinalizador() == colaborador) {
                tareasFin.add(tareas.get(i));
            }
        }
        return  tareasFin;
    }

    public ArrayList<Tarea> ordenar() {
        ArrayList<Tarea> listaOrdenada;
        ArrayList<Tarea> aux = new ArrayList<>();

        if (!tareas.isEmpty()) {
            LocalDate fechaActual = LocalDate.now();

            // Filtrar tareas que están en el presente o en el futuro
            for (Tarea tarea : tareas) {
                if (tarea.getFecha_limite().isEqual(fechaActual) || tarea.getFecha_limite().isAfter(fechaActual)) {
                    aux.add(tarea);
                }
            }
            // Ordenar primero por prioridad (alta antes que baja) y luego por fecha de vencimiento
            Collections.sort(aux, new Comparator<Tarea>() {
                @Override
                public int compare(Tarea tarea1, Tarea tarea2) {
                    int prioridadComparison = tarea2.getPrioridad().compareTo(tarea1.getPrioridad()); // Ordenar alta antes que baja

                    if (prioridadComparison == 0) {
                        return tarea1.getFecha_limite().compareTo(tarea2.getFecha_limite());
                    }

                    return prioridadComparison;
                }
            });

            listaOrdenada = new ArrayList<>(aux);
        } else {
            return null;
        }
        return listaOrdenada;
    }

    public void agregar_tarea(String titulo, String descripcion, Prioridad prioridad, String fecha_recordatorio, String fecha_limite) {
        Tarea nueva_tarea = new Tarea(titulo, descripcion, prioridad, fecha_recordatorio, fecha_limite);
        tareas.add(nueva_tarea);
    }

    public void agregar_colaborador(Colaborador colaborador) {
        colaboradores.add(colaborador);
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }
}
