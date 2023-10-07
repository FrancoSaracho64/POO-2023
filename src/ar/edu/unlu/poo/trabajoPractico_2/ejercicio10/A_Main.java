package ar.edu.unlu.poo.trabajoPractico_2.ejercicio10;

import java.util.ArrayList;

public class A_Main {
    public static void main(String[] args) {
        //Genero los empleados
        Empleado_Asalariado empleadoAsalariado = new Empleado_Asalariado("Franco",
                "Saracho", "+54 9 1156879865", "30-15856151-9",
                10, 15000);

        Empleado_PorComision empleadoPorComision = new Empleado_PorComision("Mateo", "Saracho",
                "1156958746", "16-654851851-8", 10, 50,
                50000, 50);

        Empleado_PorComision_SalarioBase empleadoPorComisionSalarioBase = new Empleado_PorComision_SalarioBase(
          "Marcos", "Gonzalez", "+54 9 1135648496", "84-54155151-8", 5,
          512, 100000, 75, 20000);

        Empleado_PorHora empleadoPorHora = new Empleado_PorHora("Matias",
                "Morales", "+5185151541", "51-516515541-5", 5,
                875.5, 40);

        Empleado_Pasante pasante = new Empleado_Pasante("Rodrigo", "Lazarte",
                "115654649", "51-451541651-8", 10);

        //Cargo los empleados a un ArrayList
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(empleadoAsalariado);
        empleados.add(empleadoPorComision);
        empleados.add(empleadoPorComisionSalarioBase);
        empleados.add(empleadoPorHora);
        empleados.add(pasante);

        for (Empleado empleado : empleados) {
            double sueldo = empleado.calcular_sueldo();
            System.out.println("Sueldo del empleado -" + empleado.getApellido() + ", " + empleado.getNombre() + "- :  $" + sueldo);
        }
    }
}
