package ar.edu.unlu.poo.trabajoPractico_2.ejercicio13;

import java.util.ArrayList;

public class Tripulante extends Rol {
    private String cargo;
    private ArrayList<ReciboSueldo> recibos;

    public Tripulante (String cargo) {
        super();
        this.cargo = cargo;
        this.recibos = new ArrayList<ReciboSueldo>();
    }

    public ArrayList<ReciboSueldo> getRecibos() {
        return recibos;
    }

    public void setRecibos(ArrayList<ReciboSueldo> recibos) {
        this.recibos = recibos;
    }

    @Override
    public void nuevoRecibo (ReciboSueldo rc) {
        rc.cerrarVuelo();
        recibos.add(rc);
    }

    @Override
    public String getCargo() {
        return cargo;
    }

    @Override
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
