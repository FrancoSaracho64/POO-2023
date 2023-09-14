package ar.edu.unlu.poo.trabajoPractico_1.recursosEjercicios;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Ecuacion {
    private final double coheficiente_A;
    private final double coheficiente_B;
    private final double coheficiente_C;

    public Ecuacion(double coheficiente_A, double coheficiente_B, double coheficiente_C) {
        this.coheficiente_A = coheficiente_A;
        this.coheficiente_B = coheficiente_B;
        this.coheficiente_C = coheficiente_C;
    }

    public List<Double> hallarRaices(){
        List<Double> listaRaices = new ArrayList<Double>();
        double dentroRaiz = pow(coheficiente_B ,2) - (4 * coheficiente_A * coheficiente_C);
        if(dentroRaiz > 0){
            double primerSolucion = (-coheficiente_B + sqrt(dentroRaiz)) / (2 * coheficiente_A);
            double segundaSolucion = (-coheficiente_B - sqrt(dentroRaiz)) / (2 * coheficiente_A);

            listaRaices.add(primerSolucion);
            listaRaices.add(segundaSolucion);
        } else if (dentroRaiz == 0) {
            double primerSolucion = (-coheficiente_B + sqrt(dentroRaiz)) / (2 * coheficiente_A);
            listaRaices.add(primerSolucion);
        } else {
            //No tiene raices REALES.
            //System.out.println("\nIMPORTANTE... La ecuacion NO posee solucion en los numeros REALES.\n");
        }
        return listaRaices;
    }

    public double calcularY (double X){
        return ( coheficiente_A * pow(X,2) + (coheficiente_B * X) + coheficiente_C);
    }
}