package ar.edu.unlu.poo.trabajoPractico_2.ejercicio11;

public class Flete extends Vehiculo{
    private final double peso;

    public Flete(Patente patente, double peso) {
        super(patente);
        this.peso = peso;
    }

    @Override
    public double getPrecioBase_PorDia() {
        double precio = getPrecioBase();
        precio += peso * 600;
        return precio;
    }

    public double getPeso() {
        return peso;
    }
}
