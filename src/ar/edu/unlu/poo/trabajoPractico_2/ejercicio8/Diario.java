package ar.edu.unlu.poo.trabajoPractico_2.ejercicio8;

public class Diario extends Publicacion {
    private int mes;
    private int dia;

    public Diario(String nombre, String editor, String telContacto, int cantPaginas, int ANIOPUBLICACION, String titulo, int mes, int dia) {
        super(nombre, editor, telContacto, cantPaginas, ANIOPUBLICACION);
        this.mes = mes;
        this.dia = dia;
    }
}
