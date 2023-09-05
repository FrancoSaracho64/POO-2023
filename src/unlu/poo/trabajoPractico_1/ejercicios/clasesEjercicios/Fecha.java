package unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Fecha {
    private String fecha;
    private int formato;

    public Fecha(String fecha, int formato) {
        this.fecha = fecha;
        this.formato = formato;
    }

    public boolean entreFechas(LocalDate fecha1, LocalDate fecha2){
        LocalDate fecha_original = formatearFecha();
        return (fecha_original.isAfter(fecha1) && fecha_original.isBefore(fecha2));
    }

    public boolean mayorAOtraFecha(LocalDate fecha1){
        LocalDate fecha_original = formatearFecha();
        return fecha_original.isAfter(fecha1);
    }

    public boolean menorAOtraFecha(LocalDate fecha1){
        LocalDate fecha_original = formatearFecha();
        return fecha_original.isBefore(fecha1);
    }

    public LocalDate formatearFecha(){
        String patron = "";
        if (formato == 0){
            patron = "dd-MM-yyyy";
        } else if (formato == 1){
            patron = "MM-dd-yyyy";
        }
        DateTimeFormatter formateador = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .append(DateTimeFormatter.ofPattern(patron))
                .toFormatter();
        return LocalDate.parse(fecha, formateador);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getFormato() {
        return formato;
    }

    public void setFormato(int formato) {
        this.formato = formato;
    }
}