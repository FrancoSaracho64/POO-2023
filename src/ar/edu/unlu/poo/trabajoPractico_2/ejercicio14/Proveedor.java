package ar.edu.unlu.poo.trabajoPractico_2.ejercicio14;

public class Proveedor {
    private String nombre;
    private double importeBase;
    private double importeFinal;

    public Proveedor(String nombre, double importeBase) {
        this.nombre = nombre;
        this.importeBase = importeBase;
        importeFinal = importeBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getImporteBase() {
        return importeBase;
    }

    public void setImporteBase(double importeBase) {
        this.importeBase = importeBase;
    }

    public void calcularAdicional(PaqueteTurismo paquete) {
    }
}
