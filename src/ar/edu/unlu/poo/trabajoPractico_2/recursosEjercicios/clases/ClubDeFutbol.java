package ar.edu.unlu.poo.trabajoPractico_2.recursosEjercicios.clases;

import ar.edu.unlu.poo.trabajoPractico_2.recursosEjercicios.enumerados.Suscripcion;

import java.time.LocalDate;
import java.util.ArrayList;

public class ClubDeFutbol {
    private final String nombre;
    private ArrayList<Socio> socios;
    private ArrayList<Actividad> actividades;

    public ClubDeFutbol(String nombre) {
        this.nombre = nombre;
        socios = new ArrayList<>();
        actividades = new ArrayList<>();
    }

    public void registrar_socio(Socio socio, Suscripcion nivel_suscripcion){
        Credencial credencial = new Credencial(socio, nivel_suscripcion);
        socio.setCredencial(credencial);
        if (socio.getFecha_alta() == null) {
            socio.setFecha_alta(LocalDate.now());
        }
        socios.add(socio);
    }

    public ArrayList<Socio> nuevos_socios_inscriptos(){
        ArrayList<Socio> socios_nuevos = new ArrayList<>();
        LocalDate fechaActual = LocalDate.now();
        LocalDate primerDiaDelMes = fechaActual.withDayOfMonth(1);

        for (Socio socio : socios) {
            LocalDate fechaInscripcion = socio.getFecha_alta();
            if (!fechaInscripcion.isBefore(primerDiaDelMes) && !fechaInscripcion.isAfter(fechaActual)) {
                socios_nuevos.add(socio);
            }
        }
        return socios_nuevos;
    }

    public ArrayList<Actividad> buscar_actividades_por_suscripcion(Suscripcion suscripcion){
        ArrayList<Actividad> actividades = new ArrayList<>();
        for (int i = 0; i < this.actividades.size(); i ++){
            if (this.actividades.get(i).getSuscripcion() == suscripcion) {
                actividades.add(this.actividades.get(i));
            }
        }
        return actividades;
    }

    public ArrayList<Socio> buscar_socios_por_suscripcion(Suscripcion suscripcion){
        ArrayList<Socio> socios = new ArrayList<>();
        for (Socio socio : this.socios) {
            if (socio.getCredencial().getSuscripcion() == suscripcion) {
                socios.add(socio);
            }
        }
        return socios;
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }

    public void agregar_actividad(Actividad actividad){
        actividades.add(actividad);
    }

    public ArrayList<Actividad> getActividades() {
        return actividades;
    }

    public String getNombre() {
        return nombre;
    }
}
