package ar.edu.unlu.poo.trabajoPractico_2.ejercicio10;

public abstract class Empleado {
    static private final int bono_cumpleanios = 2000;
    private String nombre;
    private String apellido;
    private String numero_celular;
    private String cuit;
    private final int mes_nacimiento;

    public Empleado(String nombre, String apellido, String numero_celular, String cuit, int mes_nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_celular = numero_celular;
        this.cuit = cuit;
        this.mes_nacimiento = mes_nacimiento;
    }

    public abstract double calcular_sueldo();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumero_celular() {
        return numero_celular;
    }

    public void setNumero_celular(String numero_celular) {
        this.numero_celular = numero_celular;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public int getBono_cumpleanios() {
        return bono_cumpleanios;
    }

    public int getMes_nacimiento() {
        return mes_nacimiento;
    }
}
