package ar.edu.unlu.poo.trabajoPractico_2.ejercicio14;
public class PaqueteTurismo{
    private int id_paquete;
    private static int id_generico;
    private Transporte transporte;
    private Guia guia;
    private Hospedaje hospedaje;
    private int cantidad_ventas;
    private double precio;

    public PaqueteTurismo(Transporte transporte, Hospedaje hospedaje, Guia guia) {
        this.id_paquete = id_generico++ ;
        this.transporte = transporte;
        this.guia = guia;
        this.hospedaje = hospedaje;
        cantidad_ventas = 0;
        precio = transporte.getImporteFinal() + hospedaje.getImporteFinal() + guia.getImporteFinal();
    }
    public void sumar_venta(){
        cantidad_ventas++;
    }

    public int getId_paquete() {
        return id_paquete;
    }

    public String getTransporte() {
        return transporte.getNombre();
    }

    public String getGuia() {
        return guia.getNombre();
    }

    public String getHospedaje() {
        return hospedaje.getNombre();
    }

    public int getCantidad_ventas() {
        return cantidad_ventas;
    }

    public double precioPaquete(){
        precio = transporte.getImporteFinal() + hospedaje.getImporteFinal() + guia.getImporteFinal();
        return precio;
    }


}
