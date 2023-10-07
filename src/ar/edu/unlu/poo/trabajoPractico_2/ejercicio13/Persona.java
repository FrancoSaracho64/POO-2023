package ar.edu.unlu.poo.trabajoPractico_2.ejercicio13;

import java.util.ArrayList;

public class Persona {
    private int ID;
    private static int contadorIDP = 0;
    private String nombre;
    private String numTelefono;
    private String direccion;
    private ArrayList <Rol> roles;

    public Persona(String nombre, String numTelefono, String direccion) {
        this.ID = contadorIDP;
        this.nombre = nombre;
        this.numTelefono = numTelefono;
        this.direccion = direccion;
        contadorIDP++;
        this.roles = new ArrayList<Rol>();
    }

    public ArrayList<Rol> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<Rol> roles) {
        this.roles = roles;
    }

    public void agregarRol (Rol r) {
        roles.add(r);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void verRolesPersona () {
        int i = 1;
        System.out.println(nombre + ":");
        for (Rol r : roles) {
            if (r instanceof Tripulante) {
                System.out.println("\tRol N°" + i + "(id:" + r.getIdRol() + "): [Tripulante - Cargo: " + r.getCargo() + "]");
                i++;
            }
            else if (r instanceof Pasajero) {
                System.out.println("\tRol N°" + i + "(id:" + r.getIdRol() + "): [Pasajero N°" + r.getNumeroPasajero() + " del vuelo N°" + ((Pasajero) r).getTicketPasajero().getVueloT().getNumeroVuelo() + "]");
                i++;
            }
        }
    }
}
