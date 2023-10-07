package ar.edu.unlu.poo.trabajoPractico_2.ejercicio10;

import java.time.LocalDate;
import java.time.Month;

public class Empleado_PorComision_SalarioBase extends Empleado_PorComision{
    private double salarioBase;

    public Empleado_PorComision_SalarioBase(String nombre, String apellido, String numero_celular, String cuit, int mes_nacimiento, int cantidadVentas, double importeTotalVendido, double porcentaje, double salarioBase) {
        super(nombre, apellido, numero_celular, cuit, mes_nacimiento, cantidadVentas, importeTotalVendido, porcentaje);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcular_sueldo() {
        double sueldo = 0;
        sueldo += salarioBase + (getImporteTotalVendido()*getPorcentaje_bruto()/100);
        Month mesActual = LocalDate.now().getMonth();
        if (mesActual.ordinal() == getMes_nacimiento()-1){
            sueldo += getBono_cumpleanios() + 1000;
            sueldo += (getImporteTotalVendido() * getPorcentaje_bruto())/100;
        }
        return sueldo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
