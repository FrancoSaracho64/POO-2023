package ar.edu.unlu.poo.trabajoPractico_2.ejercicio10;

import java.time.LocalDate;
import java.time.Month;

public class Empleado_Asalariado extends Empleado{
    private double sumaFijaMensual;

    public Empleado_Asalariado(String nombre, String apellido, String numero_celular, String cuit, int mes_nacimiento, double sumaFijaMensual) {
        super(nombre, apellido, numero_celular, cuit, mes_nacimiento);
        this.sumaFijaMensual = sumaFijaMensual;
    }

    @Override
    public double calcular_sueldo() {
        double sueldo = 0;
        sueldo += sumaFijaMensual;
        Month mesActual = LocalDate.now().getMonth();
        if (mesActual.ordinal() == getMes_nacimiento()-1){
            sueldo += (double) getBono_cumpleanios() + 1000;
        }
        return sueldo;
    }

    public double getSumaFijaMensual() {
        return sumaFijaMensual;
    }

    public void setSumaFijaMensual(double sumaFijaMensual) {
        this.sumaFijaMensual = sumaFijaMensual;
    }
}
