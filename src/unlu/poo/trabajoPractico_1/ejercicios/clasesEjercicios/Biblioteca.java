package unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private int anioFundacion;
    private int cantidadPrestamos;
    private List<Libro> libros;

    public Biblioteca(String nombre, String direccion, int anioFundacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.anioFundacion = anioFundacion;
        this.cantidadPrestamos = 0;
        this.libros = new ArrayList<Libro>();
    }

    public Libro buscarPorTitulo(String titulo) {
        for (int i = 0; i<libros.size(); i++){
            if (libros.get(i).getTitulo().equalsIgnoreCase(titulo)){
                return libros.get(i);
            }
        }
        return null;
    }

    public Libro buscarPorAutor(String autor) {
        for (int i = 0; i<libros.size(); i++){
            if (libros.get(i).getAutor().equalsIgnoreCase(autor)){
                return libros.get(i);
            }
        }
        return null;
    }

    public Libro buscarPorTituloYAutor(String titulo, String autor) {
        for (int i = 0; i<libros.size(); i++){
            if (libros.get(i).getTitulo().equalsIgnoreCase(titulo) &&
                    libros.get(i).getAutor().equalsIgnoreCase(autor)){
                return libros.get(i);
            }
        }
        return null;
    }

    public Boolean prestar(int indice) {
        if (libros.get(indice-1).prestar()){
            cantidadPrestamos++;
            return true;
        }
        else return false;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarEjemplares(int indice, int nuevosEjemplares) {
        libros.get(indice-1).setCantEjemplares(libros.get(indice-1).getCantEjemplares() + nuevosEjemplares);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadPrestamos() {
        return cantidadPrestamos;
    }
}