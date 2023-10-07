package ar.edu.unlu.poo.trabajoPractico_2.ejercicio14;

import java.util.ArrayList;

public class Cliente {
    private int id_cliente;
    private static int id_generico;
    private String nombre;
    private ArrayList<PaqueteTurismo> viajes_comprados = new ArrayList<>();

    public Cliente(String nombre) {
        this.nombre = nombre;
        id_cliente = id_generico++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void comproPaquete(PaqueteTurismo paquete){
        viajes_comprados.add(paquete);
    }

    public void mostrarViajesComprados(){
        System.out.println("\n\t VIAJES COMPRADOS POR " + nombre + "\n");
        for (PaqueteTurismo viajesComprado : viajes_comprados) {
            System.out.printf("\t* %d %s %s\t %s\n", viajesComprado.getId_paquete(), viajesComprado.getGuia(), viajesComprado.getTransporte(), viajesComprado.getHospedaje());
        }
    }
}
