package ar.edu.unlu.poo.trabajoPractico_1.ejercicios;

import ar.edu.unlu.poo.trabajoPractico_1.recursosEjercicios.Ecuacion;

import java.util.List;

public class Ejercicio_7 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("-------------------------------------------------\n");
        Ecuacion primerEcuacion = new Ecuacion(1, -5, 6);
        List<Double> raices1 = primerEcuacion.hallarRaices();
        if (raices1.isEmpty()){
            System.out.println("La ecuacion NO tiene solucion en los numeros REALES.");
        } else if (raices1.size() == 1) {
            System.out.println("La unica raiz de la ecuacion es:    " + raices1.get(0));
        } else {
            System.out.println("Las raices de la ecuacion son:    " + raices1.get(0) + "     |     " + raices1.get(1));
        }
        System.out.println();
        System.out.println("Calculo el valor de Y de la ecuacion utilizando las raices encontradas.");
        double resultado1 = primerEcuacion.calcularY(raices1.get(0));
        double resultado2 = primerEcuacion.calcularY(raices1.get(1));
        double resultado3 = primerEcuacion.calcularY(10);
        System.out.println("El valor 1 de Y para la ecuacion es: " + resultado1);
        System.out.println("El valor 2 de Y para la ecuacion es: " + resultado2);
        System.out.println("Pruebo otro valor de X ----> 10\nEl valor de Y para la ecuacion es: " + resultado3);
        System.out.println();
        System.out.println("-------------------------------------------------\n");

        Ecuacion segundaEcuacion = new Ecuacion(-4, 12, -9);
        List<Double> raices2 = segundaEcuacion.hallarRaices();
        if (raices2.isEmpty()){
            System.out.println("La ecuacion NO tiene solucion en los numeros REALES.");
        } else if (raices2.size() == 1) {
            System.out.println("La unica raiz de la ecuacion es:    " + raices2.get(0));
        } else {
            System.out.println("Las raices de la ecuacion son:    " + raices2.get(0) + "     |     " + raices2.get(1));
        }
        System.out.println();
        System.out.println("-------------------------------------------------\n");

        Ecuacion tercerEcuacion = new Ecuacion(1, 1, 1);
        List<Double>raices3 = tercerEcuacion.hallarRaices();
        if (raices3.isEmpty()){
            System.out.println("La ecuacion NO tiene solucion en los numeros REALES.");
        } else if (raices3.size() == 1) {
            System.out.println("La unica raiz de la ecuacion es:    " + raices3.get(0));
        } else {
            System.out.println("Las raices de la ecuacion son:    " + raices3.get(0) + "     |     " + raices3.get(1));
        }
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println("Calcular ecuacion en funcion de varios valores de X dados.");
        Ecuacion cuartaEcuacion = new Ecuacion(-7, 9, 65);
        System.out.println("Primer resultado: " + cuartaEcuacion.calcularY(1));
        System.out.println("Segundo resultado: " + cuartaEcuacion.calcularY(4));
        System.out.println("Tercer resultado: " + cuartaEcuacion.calcularY(6));
    }
}