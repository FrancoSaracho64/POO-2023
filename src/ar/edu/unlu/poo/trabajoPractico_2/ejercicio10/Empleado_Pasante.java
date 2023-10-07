package ar.edu.unlu.poo.trabajoPractico_2.ejercicio10;

public class Empleado_Pasante extends Empleado{


    public Empleado_Pasante(String nombre, String apellido, String numero_celular, String cuit, int mes_nacimiento) {
        super(nombre, apellido, numero_celular, cuit, mes_nacimiento);
    }

    @Override
    public double calcular_sueldo() {
        //El sueldo NO depende de la organizacion, por lo que se retorna 0.
        return 0;
    }
}
