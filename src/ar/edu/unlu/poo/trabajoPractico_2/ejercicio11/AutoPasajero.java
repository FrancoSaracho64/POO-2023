package ar.edu.unlu.poo.trabajoPractico_2.ejercicio11;

public class AutoPasajero extends Auto{
    private final int cantidad_asientos;

    public AutoPasajero(Patente patente, int cantidad_asientos) {
        super(patente);
        this.cantidad_asientos = cantidad_asientos;
    }

    @Override
    public double getPrecioBase_PorDia() {
        double precio = getPrecioBase();
        precio += cantidad_asientos * 300;
        return precio;
    }

    public int getCantidad_asientos() {
        return cantidad_asientos;
    }
}
