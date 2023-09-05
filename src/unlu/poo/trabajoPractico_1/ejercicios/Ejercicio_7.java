package unlu.poo.trabajoPractico_1.ejercicios;

import unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.Ecuacion;

import java.util.List;

public class Ejercicio_7 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("-------------------------------------------------\n");
        Ecuacion primerEcuacion = new Ecuacion(1, -2, -35);
        List<Double> raices = primerEcuacion.hallarRaices();
        if (raices.isEmpty()){
            System.out.println("La ecuacion NO tiene solucion en los numeros REALES.");
        } else if (raices.size() == 1) {
            System.out.println("La unica raiz de la ecuacion es:    " + raices.get(0));
        } else {
            System.out.println("Las raices de la ecuacion son:    " + raices.get(0) + "     |     " + raices.get(1));
        }
        System.out.println();
        System.out.println("-------------------------------------------------\n");
        raices.clear();
        Ecuacion segundaEcuacion = new Ecuacion(-4, 12, -9);
        raices = segundaEcuacion.hallarRaices();
        if (raices.isEmpty()){
            System.out.println("La ecuacion NO tiene solucion en los numeros REALES.");
        } else if (raices.size() == 1) {
            System.out.println("La unica raiz de la ecuacion es:    " + raices.get(0));
        } else {
            System.out.println("Las raices de la ecuacion son:    " + raices.get(0) + "     |     " + raices.get(1));
        }
        System.out.println();
        System.out.println("-------------------------------------------------\n");
        raices.clear();
        Ecuacion tercerEcuacion = new Ecuacion(1, 1, 1);
        raices = tercerEcuacion.hallarRaices();
        if (raices.isEmpty()){
            System.out.println("La ecuacion NO tiene solucion en los numeros REALES.");
        } else if (raices.size() == 1) {
            System.out.println("La unica raiz de la ecuacion es:    " + raices.get(0));
        } else {
            System.out.println("Las raices de la ecuacion son:    " + raices.get(0) + "     |     " + raices.get(1));
        }
        System.out.println();
        System.out.println("-------------------------------------------------");
    }
}
