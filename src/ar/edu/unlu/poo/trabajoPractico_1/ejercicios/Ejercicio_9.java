package ar.edu.unlu.poo.trabajoPractico_1.ejercicios;

import ar.edu.unlu.poo.trabajoPractico_1.recursosEjercicios.Fecha;

import java.time.LocalDate;

public class Ejercicio_9 {
    public static void main(String[] args) {
        System.out.println("NOTA:");
        System.out.println("Si el formato es 'dd-MM-yyyy', el formato debe ser 0. Si es 'MM-dd-yyyy', debe ser 1.");

        System.out.println("Creo las fechas para trabajar.");
        Fecha fecha1 = new Fecha("17-10-2002", 0);
        LocalDate fecha1_final = fecha1.formatearFecha();

        Fecha fecha2 = new Fecha("16-05-2008", 0);
        LocalDate fecha2_final = fecha2.formatearFecha();

        Fecha fecha3 = new Fecha("27-04-2013", 0);
        LocalDate fecha3_final = fecha3.formatearFecha();

        Fecha fecha4 = new Fecha("23-09-2005", 0);
        LocalDate fecha4_final = fecha4.formatearFecha();
        System.out.println();
        System.out.println();

        //1
        System.out.println(1);
        if(fecha2.entreFechas(fecha1_final, fecha3_final)){
            System.out.println("La fecha inicial se encuentra entre las fechas pasadas.");
        }   else {
            System.out.println("La fecha inicial se encuentra fuera del rango de las fechas pasadas.");
        }
        //2
        System.out.println(2);
        if(fecha2.mayorAOtraFecha(fecha1_final)){
            System.out.println("La fecha inicial es mayor a la fecha pasada por parametro.");
        } else {
            System.out.println("La fecha pasada por parametro es mayor a la fecha inicial.");
        }
        //3
        System.out.println(3);
        if(fecha2.menorAOtraFecha(fecha3_final)){
            System.out.println("La fecha inicial es menor a la fecha pasada por parametro.");
        } else {
            System.out.println("La fecha pasada por parametro es menor a la fecha inicial.");
        }
        System.out.println(4);
        if(fecha4.entreFechas(fecha2_final, fecha3_final)){
            System.out.println("La fecha inicial se encuentra entre las fechas pasadas.");
        }   else {
            System.out.println("La fecha inicial se encuentra fuera del rango de las fechas pasadas.");
        }
    }
}
