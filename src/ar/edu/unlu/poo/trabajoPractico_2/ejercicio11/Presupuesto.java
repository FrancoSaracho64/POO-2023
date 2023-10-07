package ar.edu.unlu.poo.trabajoPractico_2.ejercicio11;

public class Presupuesto {
    private int dias_alquiler;
    private Vehiculo vehiculo;

    public Presupuesto(int dias_alquiler, Vehiculo vehiculo) {
        this.dias_alquiler = dias_alquiler;
        this.vehiculo = vehiculo;
    }

    public double calcularPresupuesto(){
        double presupuesto = 0;
        presupuesto = vehiculo.getPrecioBase_PorDia() * dias_alquiler;
        return presupuesto;
    }
}
