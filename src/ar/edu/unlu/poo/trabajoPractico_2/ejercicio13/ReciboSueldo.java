package ar.edu.unlu.poo.trabajoPractico_2.ejercicio13;

import java.util.ArrayList;

public class ReciboSueldo {
    private int idRecibo;
    private static int contadorIDR = 0;
    private double montoTotal;
    private ArrayList<Vuelo> vuelosTrabajados;
    private boolean terminado;

    public ReciboSueldo(double montoTotal) {
        this.idRecibo = contadorIDR;
        this.montoTotal = montoTotal;
        this.vuelosTrabajados = new ArrayList<Vuelo>();
        contadorIDR++;
        this.terminado = false;
    }

    public ArrayList<Vuelo> getVuelosTrabajados() {
        return vuelosTrabajados;
    }

    public void setVuelosTrabajados(ArrayList<Vuelo> vuelosTrabajados) {
        this.vuelosTrabajados = vuelosTrabajados;
    }

    public void agregarVuelo (Vuelo v) {
        if (!terminado) {
            vuelosTrabajados.add(v);
        }
        else {
            System.out.println("Este recibo ya fue cerrado. Cree otro para facturar este vuelo");
        }
    }

    public void cerrarVuelo () {
        this.terminado = true;
    }
}
