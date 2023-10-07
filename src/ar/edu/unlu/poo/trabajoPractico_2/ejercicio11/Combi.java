package ar.edu.unlu.poo.trabajoPractico_2.ejercicio11;

public class Combi extends Vehiculo{
    private double precioBaseCombi = 4500;

    public Combi(Patente patente) {
        super(patente);
        this.setPrecioBase(precioBaseCombi);
    }

    @Override
    public double getPrecioBase_PorDia() {
        return getPrecioBase();
    }
}
