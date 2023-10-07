package ar.edu.unlu.poo.trabajoPractico_2.ejercicio10;

import java.time.LocalDate;
import java.time.Month;

public class Empleado_PorComision extends Empleado{
    private final double porcentaje_bruto = 0.5;
    private int cantidadVentas;
    private double importeTotalVendido;
    private double porcentaje_totalVendido;


    public Empleado_PorComision(String nombre, String apellido, String numero_celular,
                                String cuit, int mes_nacimiento, int cantidadVentas,
                                double importeTotalVendido, double porcentaje) {
        super(nombre, apellido, numero_celular, cuit, mes_nacimiento);
        this.cantidadVentas = cantidadVentas;
        this.importeTotalVendido = importeTotalVendido;
        this.porcentaje_totalVendido = porcentaje;
    }

    @Override
    public double calcular_sueldo() {
        double sueldo = 0;
        sueldo += (importeTotalVendido*porcentaje_totalVendido/100);
        Month mesActual = LocalDate.now().getMonth();
        if (mesActual.ordinal() == getMes_nacimiento()-1){
            sueldo += getBono_cumpleanios();
            sueldo += (importeTotalVendido * porcentaje_bruto)/100;
        }
        return sueldo;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    public double getImporteTotalVendido() {
        return importeTotalVendido;
    }

    public void setImporteTotalVendido(double importeTotalVendido) {
        this.importeTotalVendido = importeTotalVendido;
    }

    public double getPorcentaje_totalVendido() {
        return porcentaje_totalVendido;
    }

    public void setPorcentaje_totalVendido(double porcentaje_totalVendido) {
        this.porcentaje_totalVendido = porcentaje_totalVendido;
    }

    public double getPorcentaje_bruto() {
        return porcentaje_bruto;
    }
}
