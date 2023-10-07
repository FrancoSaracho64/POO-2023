package ar.edu.unlu.poo.trabajoPractico_2.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private String nombre;
    private String destinoFavorito;
    private ArrayList<Paquete> compras = new ArrayList<>();
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    public void seleccionarPaquete() {
        ArrayList<Paquete> paquetes = GestorAgencia.getPaquetes();
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        int opcion;
        Paquete paquete;
        System.out.println("Paquetes disponibles--- \n");
        while (i < paquetes.size()) {
            paquete = paquetes.get(i);
            paquete.mostrarPaquete();
            System.out.print("¿Desea comprar el paquete? \n(1) Si   ///  (2) Siguiente -----> OPCION: ");
            opcion = teclado.nextInt();
            if (opcion == 1) {
                i = paquetes.size();
                compras.add(paquete);
            }
            i++;
        }
    }

    public ArrayList<Paquete> getCompras() {
        return compras;
    }
    public void mostrarComprasCliente() {
        if (compras.isEmpty()) {
            System.out.println("El cliente no ha realizado compras.");
            return;
        }
        System.out.println("\nPaquetes que compro el cliente: ");
        for (Paquete p : compras) {
            p.mostrarPaquete();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setDestinoFavorito(String destinoFavorito) {
        this.destinoFavorito = destinoFavorito;
    }

    public String getDestinoFavorito() {
        return destinoFavorito;
    }
}
