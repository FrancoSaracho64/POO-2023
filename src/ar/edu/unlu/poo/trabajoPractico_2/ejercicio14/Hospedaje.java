package ar.edu.unlu.poo.trabajoPractico_2.ejercicio14;

public class Hospedaje extends Proveedor{
    private String tipo;
    private double importeFinal;
    private int cantidadMinima;
    private int cantidadMaxima;

    public Hospedaje(String nombre, double importeBase, int cantidadMinima) {
        super(nombre, importeBase);
        tipo = "Hospedaje";
        importeFinal = importeBase;
        this.cantidadMinima = cantidadMinima;
    }

    @Override
    public void calcularAdicional(PaqueteTurismo paquete){
        cantidadMaxima = paquete.getCantidad_ventas();
        if(cantidadMinima < cantidadMaxima){
            importeFinal -= getImporteBase() * 0.5;
        }
    }

    public double getImporteFinal() {
        return importeFinal;
    }
}
