package ar.edu.unlu.poo.trabajoPractico_2.ejercicio11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;

public class Alquiler {
    private final Cliente cliente;
    private final Presupuesto presupuesto;
    private final LocalDate fecha_inicio;
    private LocalDate fecha_fin;

    public Alquiler(Cliente cliente, String fecha_inicio, String fecha_fin) {
        this.cliente = cliente;
        this.fecha_inicio = formatearFecha(fecha_inicio);
        this.fecha_fin = formatearFecha(fecha_fin);
        long diferenciaDias = ChronoUnit.DAYS.between(this.fecha_inicio, this.fecha_fin);
        this.presupuesto = new Presupuesto((int)diferenciaDias, cliente.getVehiculo());
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValorAlquiler() {
        return presupuesto.calcularPresupuesto();
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    private LocalDate formatearFecha(String fecha){
        DateTimeFormatter formateador = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .append(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
                .toFormatter();
        return LocalDate.parse(fecha, formateador);
    }
}
