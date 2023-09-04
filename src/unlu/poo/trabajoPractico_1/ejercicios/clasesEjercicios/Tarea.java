package unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;


public class Tarea {
    private String descripcion;
    private Prioridad prioridad;
    private Boolean estado;
    private LocalDate fecha_limite;

    public Tarea() {
        this.estado = false;
    }

    public Tarea(String descripcion, Prioridad prioridad, String fecha_limite) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = false;
        this.fecha_limite = formatearFecha(fecha_limite);
    }

    public void modificar_descripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void cambiar_prioridad(String prioridad){
        if (prioridad.equalsIgnoreCase("INDEFINIDA")){
            this.prioridad = Prioridad.INDEFINIDA;
        } else if (prioridad.equalsIgnoreCase("BAJA")) {
            this.prioridad = Prioridad.BAJA;
        } else if (prioridad.equalsIgnoreCase("MEDIA")) {
            this.prioridad = Prioridad.MEDIA;
        } else if (prioridad.equalsIgnoreCase("ALTA")) {
            this.prioridad = Prioridad.ALTA;
        }
    }

    public void cambiar_estado(){
        estado = !estado;
    }

    public void mostrar_tarea(){
        System.out.println("\n++++ TAREA ++++\n");
        System.out.println("-- Descripcion: " + this.descripcion);
        if (estado){
            System.out.println("-- La tarea ya ha sido COMPLETADA.");
        }
    }

    public void ver_estado_fecha(){
        LocalDate ahora = LocalDate.now();
        if (fecha_limite.isAfter(ahora)){
            System.out.println("La tarea se encuentra vencida.");
        } else if (fecha_limite.isBefore(ahora)) {
            System.out.println("La tarea se encuentra vigente.");
        } else if (fecha_limite.isEqual(ahora)) {
            System.out.println("La tarea vence HOY.");
        }
    }

    public void ver_estado(){
        if (estado){
            System.out.println("La tarea ya ha sido COMPLETADA.");
        } else {
            System.out.println("La tarea sigue PENDIENTE.");
        }
    }

    private LocalDate formatearFecha(String fecha){
        DateTimeFormatter formateador = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .append(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
                .toFormatter();
        return LocalDate.parse(fecha, formateador);
    }
}
