package ar.edu.unlu.poo.trabajoPractico_2.ejercicio13;

public abstract class Rol {
    private int idRol;
    private static int idGen = 0;

    public Rol() {
        this.idRol = idGen;
        idGen++;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public void nuevoRecibo(ReciboSueldo rc) {
    }
    public String getCargo() {
        return "PERSONA SIN CARGO";
    }
    public void setCargo(String cargo) {
    }

    public String getNumeroPasajero() {
        return "PERSONA SIN NUMERO DE PASAJERO";
    }

    public void setNumeroPasajero(String numeroPasajero) {
    }

}
