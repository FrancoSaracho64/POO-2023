package ar.edu.unlu.poo.trabajoPractico_2.ejercicio3;

import java.util.ArrayList;

public class Disciplina {
    private String nombre;
    private ArrayList<Comision> comisiones = new ArrayList<>();
    public Disciplina(String nombre) {
        this.nombre = nombre;
    }
    public void agregarComision(Comision comision) {
        comisiones.add(comision);
    }
    public void mostrarComisiones() {
        for (Comision c : comisiones) {
            System.out.println(
                    "Nombre: " + c.getNombre() +
                    "\n --- Profesor: " + c.getProfesor().getNombre() +
                    "\n --- Dia: " + c.getDia() +
                    "\n --- Hora: " + c.getHorario() +
                    "\n --- Disciplina: " + c.getDisciplina().getNombre() +
                    "\n --- Nivel de dificultad: " + c.getNivel() + "\n");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
