package ar.edu.unlu.poo.trabajoPractico_2.ejercicio14;

public class Transporte extends Proveedor{
    private String tipo;
    private double importeFinal;
    public Transporte(String nombre, double importeBase) {
        super(nombre, importeBase);
        tipo = "Transporte";
        importeFinal = importeBase * 1.3;
    }

    public double getImporteFinal() {
        return importeFinal;
    }
}
