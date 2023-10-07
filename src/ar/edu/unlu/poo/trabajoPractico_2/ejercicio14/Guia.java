package ar.edu.unlu.poo.trabajoPractico_2.ejercicio14;

public class Guia extends Proveedor{
    private String tipo;
    private int cant_personas;
    private double importeFinal;
    public Guia(String nombre, double importeBase) {
        super(nombre, importeBase);
        this.tipo = "Guia";
        importeFinal = importeBase;
    }

    @Override
    public void calcularAdicional(PaqueteTurismo paquete){
        cant_personas = paquete.getCantidad_ventas();
        if(cant_personas > 200){
            importeFinal += 90;
        }
    }

    public double getImporteFinal() {
        return importeFinal;
    }
}
