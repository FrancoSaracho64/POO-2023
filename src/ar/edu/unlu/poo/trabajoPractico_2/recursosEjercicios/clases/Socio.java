package ar.edu.unlu.poo.trabajoPractico_2.recursosEjercicios.clases;

import ar.edu.unlu.poo.trabajoPractico_2.recursosEjercicios.enumerados.Suscripcion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Socio {
    private String nombre_completo;
    private String domicilio;
    private String pais;
    private String correo_electronico;
    private String numero_celular;
    private LocalDate fecha_alta;
    private Credencial credencial;

    public Socio(String nombre_completo, String domicilio, String pais, String correo_electronico, String numero_celular) {
        this.nombre_completo = nombre_completo;
        this.domicilio = domicilio;
        this.pais = pais;
        this.correo_electronico = correo_electronico;
        this.numero_celular = numero_celular;
        fecha_alta = null;
        credencial = null;
    }

    public Socio(String nombre_completo, String domicilio, String pais, String correo_electronico, String numero_celular, String fecha_alta) {
        this.nombre_completo = nombre_completo;
        this.domicilio = domicilio;
        this.pais = pais;
        this.correo_electronico = correo_electronico;
        this.numero_celular = numero_celular;
        this.fecha_alta = formatearFecha(fecha_alta);
        credencial = null;
    }

    public void abonar_cuota() {
        double valor_cuota = 0;
        if (credencial.getSuscripcion() == Suscripcion.BASICA){
            valor_cuota = 1500;
        } else if (credencial.getSuscripcion() == Suscripcion.INTERMEDIA) {
            valor_cuota = 3000;
        } else if (credencial.getSuscripcion() == Suscripcion.DESTACADA) {
            valor_cuota = 5000;
        }


    }

    public LocalDate getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(LocalDate fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getNumero_celular() {
        return numero_celular;
    }

    public void setNumero_celular(String numero_celular) {
        this.numero_celular = numero_celular;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    private LocalDate formatearFecha(String fecha){
        DateTimeFormatter formateador = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .append(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
                .toFormatter();
        return LocalDate.parse(fecha, formateador);
    }
}
