package ar.edu.unlu.poo.trabajoPractico_2.ejercicio10;

import java.time.LocalDate;
import java.time.Month;

public class Empleado_PorHora extends Empleado{
    private double valorHora;
    private int horasTrabajadas;

    public Empleado_PorHora(String nombre, String apellido, String numero_celular, String cuit,
                            int mes_nacimiento, double valorHora, int horas) {
        super(nombre, apellido, numero_celular, cuit, mes_nacimiento);
        this.valorHora = valorHora;
        this.horasTrabajadas = horas;
    }

    @Override
    public double calcular_sueldo() {
        double sueldo = 0;
        //40 horas minimo
        if (horasTrabajadas <= 40) {
            sueldo += valorHora * horasTrabajadas;
        } else {
            sueldo += valorHora * horasTrabajadas;
            sueldo += (sueldo * 20) / 100;
        }

        Month mesActual = LocalDate.now().getMonth();
        if (mesActual.ordinal() == getMes_nacimiento()-1){
            sueldo += getBono_cumpleanios();
        }
        return sueldo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
