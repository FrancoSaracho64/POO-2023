package unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios;

import unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.enumeradores.Estado;
import unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.enumeradores.Prioridad;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Tarea {
    private String descripcion;
    private Prioridad prioridad;
    private Estado estado;
    private LocalDate fecha_limite;

    public Tarea() {
        this.estado = Estado.PENDIENTE;
    }

    public Tarea(String descripcion, Prioridad prioridad, String fecha_limite) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = Estado.PENDIENTE;
        this.fecha_limite = formatearFecha(fecha_limite);
    }

    public void modificar_descripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void cambiar_prioridad(Prioridad prioridad){
        /*if (prioridad.equalsIgnoreCase("INDEFINIDA")){
            this.prioridad = Prioridad.INDEFINIDA;
        } else if (prioridad.equalsIgnoreCase("BAJA")) {
            this.prioridad = Prioridad.BAJA;
        } else if (prioridad.equalsIgnoreCase("MEDIA")) {
            this.prioridad = Prioridad.MEDIA;
        } else if (prioridad.equalsIgnoreCase("ALTA")) {
            this.prioridad = Prioridad.ALTA;
        }*/
        this.prioridad = prioridad;
    }

    public void cambiar_estado(Estado nuevo_estado){
        this.estado = nuevo_estado;
    }

    public void mostrar_tarea(){
        System.out.println("\n++++ TAREA ++++");
        System.out.println("-- Descripcion: " + this.descripcion);
        System.out.println("-- Estado: " + this.estado);
        System.out.println("-- Prioridad: " + this.prioridad);
        System.out.println("-- Fecha limite: " + this.fecha_limite.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        ver_estado_fecha();

    }

    public void ver_estado_fecha(){
        LocalDate ahora = LocalDate.now();
        if (fecha_limite.isBefore(ahora)){
            System.out.println("        La tarea se encuentra vencida.");
        } else if (fecha_limite.isAfter(ahora)) {
            System.out.println("        La tarea se encuentra vigente.");
        } else if (fecha_limite.isEqual(ahora)) {
            System.out.println("        La tarea vence HOY.");
        }
    }

    public Estado ver_estado() {
        if (estado == Estado.FINALIZADA) {
            //System.out.println("La tarea ya ha sido COMPLETADA.");
        } else if (estado == Estado.PENDIENTE) {
            //System.out.println("La tarea sigue PENDIENTE.");
        } else {
            //System.out.println("La tarea está VENCIDA");
        }
        return estado;
    }

    private LocalDate formatearFecha(String fecha){
        DateTimeFormatter formateador = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .append(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
                .toFormatter();
        return LocalDate.parse(fecha, formateador);
    }
}