package ar.edu.unlu.poo.trabajoPractico_2.ejercicio13;

import java.util.ArrayList;

public class Vuelo {
    private int idVuelo;
    private static int contadorIDV = 0;
    private int numeroVuelo;
    private ArrayList<Persona> miembrosVuelo;

    public Vuelo(int numeroVuelo) {
        this.idVuelo = contadorIDV;
        this.numeroVuelo = numeroVuelo;
        this.miembrosVuelo = new ArrayList<Persona>();
        contadorIDV++;
    }

    public void agergarPersona (Persona p) {
        miembrosVuelo.add(p);
    }
    
    public ArrayList<Persona> devolverPersonasPasajeros () {
        ArrayList<Persona> pasajerosVueloActual = new ArrayList<Persona>();
        for (Persona p : miembrosVuelo) {
            for (Rol r : p.getRoles()) {
                if (r instanceof Pasajero) {
                    if (((Pasajero) r).getTicketPasajero().getVueloT().idVuelo == this.idVuelo) {
                        pasajerosVueloActual.add(p);
                    }
                }
            }
        }
        return pasajerosVueloActual;
    }
    public ArrayList<Persona> devolverPersonasTripulantes () {
        ArrayList<Persona> tripulantesVueloActual = new ArrayList<Persona>();
        for (Persona p : miembrosVuelo) {
            for (Rol r : p.getRoles()) {
                if (r instanceof Tripulante) {
                    tripulantesVueloActual.add(p);
                }
            }
        }
        return tripulantesVueloActual;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public void verVuelo () {
        int i = 1;
        Tripulante TActual = null;
        Pasajero PActual = null;

        System.out.println("Vuelo N°" + numeroVuelo);
        System.out.println("Tripulación del vuelo:");
        ArrayList<Persona> tripulantesVueloActual = devolverPersonasTripulantes();
        for (Persona p : tripulantesVueloActual) {
            for (Rol r: p.getRoles()) {
                if (r instanceof Tripulante) {
                    for (ReciboSueldo rec : ((Tripulante) r).getRecibos()) {
                        for (Vuelo vue : rec.getVuelosTrabajados()) {
                            if (vue.idVuelo == this.idVuelo) {
                                TActual = ((Tripulante) r);
                                System.out.println("\t" + i + " - " + p.getNombre() + ": " + TActual.getCargo() + " (id:" + TActual.getIdRol() + ").");
                                i++;
                            }
                        }
                    }
                }
            }
        }
        i = 1;
        System.out.println("Pasajeros del vuelo:");
        ArrayList<Persona> pasajerosVueloActual = devolverPersonasPasajeros();
        for (Persona p : pasajerosVueloActual) {
            for (Rol r: p.getRoles()) {
                if (r instanceof Pasajero){
                    if (((Pasajero) r).getTicketPasajero().getVueloT().idVuelo == this.idVuelo) {
                        PActual = ((Pasajero) r);
                        System.out.println("\t" + i + " - " + p.getNombre() + ": N°" + PActual.getNumeroPasajero() + " (id:" + PActual.getIdRol() + ").");
                        i++;
                    }
                }
            }
        }
    }
}
