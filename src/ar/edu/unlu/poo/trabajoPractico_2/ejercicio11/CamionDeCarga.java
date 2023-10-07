package ar.edu.unlu.poo.trabajoPractico_2.ejercicio11;

public class CamionDeCarga extends Vehiculo{
    private final double costoFijo;
    private int cantidad_dias;

    public CamionDeCarga(Patente patente, int dias) {
        super(patente);
        this.cantidad_dias = dias;
        this.setPrecioBase(0);
        if (cantidad_dias > 30){
            costoFijo = 75000;
        } else {
            costoFijo = 100000;
        }
    }

    public int getCantidad_dias() {
        return cantidad_dias;
    }

    public void setCantidad_dias(int cantidad_dias) {
        this.cantidad_dias = cantidad_dias;
    }

    @Override
    public double getPrecioBase_PorDia() {
        return costoFijo;
    }
}
