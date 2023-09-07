package unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios;

import unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.enumeradores.Estado;
import unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.enumeradores.Prioridad;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Tarea {
    private String titulo;
    private String descripcion;
    private Prioridad prioridad;
    private Estado estado;
    private LocalDate fecha_recordatorio;
    private LocalDate fecha_limite;
    private LocalDate fecha_finalizacion;
    private Colaborador finalizador;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Tarea(String descripcion, Prioridad prioridad, String fecha_limite) {
        this.titulo = null;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = Estado.PENDIENTE;
        this.fecha_recordatorio = null;
        this.fecha_limite = formatearFecha(fecha_limite);
        this.fecha_finalizacion = null;
        this.finalizador = null;
    }

    public Tarea(String descripcion, Prioridad prioridad, String fecha_recordatorio, String fecha_limite) {
        this.titulo = null;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = Estado.PENDIENTE;
        this.fecha_recordatorio = formatearFecha(fecha_recordatorio);
        this.fecha_limite = formatearFecha(fecha_limite);
        this.fecha_finalizacion = null;
        this.finalizador = null;
    }

    public Tarea(String titulo, String descripcion, Prioridad prioridad, String fecha_recordatorio, String fecha_limite) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = Estado.PENDIENTE;
        this.prioridad = prioridad;
        this.fecha_recordatorio = formatearFecha(fecha_recordatorio);
        this.fecha_limite = formatearFecha(fecha_limite);
        this.fecha_finalizacion = null;
        this.finalizador = null;
    }

    public void modificar_descripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void cambiar_prioridad(Prioridad prioridad){
        this.prioridad = prioridad;
    }

    public void cambiar_estado(Estado nuevo_estado){
        this.estado = nuevo_estado;
    }

    public void mostrar_tarea(){
        System.out.println("\n++++ TAREA ++++");
        if (!titulo.isEmpty()) {
            System.out.println("-- Titulo: " + this.titulo);
        }
        System.out.println("-- Descripcion: " + this.descripcion);
        if(LocalDate.now().isAfter(fecha_limite)){
            this.estado = Estado.VENCIDA;
        }
        System.out.println("-- Estado: " + this.estado);
        if (fecha_recordatorio != null) {
            if (LocalDate.now().isEqual(fecha_recordatorio) || LocalDate.now().isAfter(fecha_recordatorio)){
                this.prioridad = Prioridad.ALTA;
            }
            System.out.println("-- Fecha de recordatorio: " + this.fecha_recordatorio.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
            ver_fecha_recordatorio();
        }
        System.out.println("-- Prioridad: " + this.prioridad);
        System.out.println("-- Fecha limite: " + this.fecha_limite.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        if (fecha_finalizacion !=null && estado.equals(Estado.FINALIZADA)) {
            System.out.println("-- La tarea fue FINALIZADA el " + this.fecha_finalizacion.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + " por el colaborador: " + finalizador.getNombre() );
        }
        ver_estado_fecha();
    }

    private void ver_fecha_recordatorio(){
        LocalDate ahora = LocalDate.now();
         if (fecha_recordatorio.isEqual(ahora)) {
            System.out.println("           ( ** Por vencer ** )");
        }
    }

    private void ver_estado_fecha(){
        LocalDate ahora = LocalDate.now();
        if (fecha_limite.isBefore(ahora)){
            System.out.println("        La tarea se encuentra vencida.");
        } else if (fecha_limite.isAfter(ahora)) {
            System.out.println("        La tarea se encuentra vigente.");
        } else {
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

    public void setFecha_finalizacion(LocalDate fecha_finalizacion) {
        this.fecha_finalizacion = fecha_finalizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFinalizador(Colaborador finalizador) {
        this.finalizador = finalizador;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public LocalDate getFecha_recordatorio() {
        return fecha_recordatorio;
    }

    public LocalDate getFecha_limite() {
        return fecha_limite;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setFecha_recordatorio(LocalDate fecha_recordatorio) {
        this.fecha_recordatorio = fecha_recordatorio;
    }
}