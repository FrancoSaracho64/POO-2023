package ar.edu.unlu.poo.trabajoPractico_2.ejercicio2;

import java.util.ArrayList;
import java.util.Comparator;

public class GestorAgencia {
    private static ArrayList<Paquete> paqueteTurismos = new ArrayList<Paquete>();
    private static ArrayList<Paquete> ventasRealizadas = new ArrayList<Paquete>();
    private static ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
    private static ArrayList<Cliente> clientes = new ArrayList<>();

    public static void agregarPaquete(Paquete paquete) {
        paqueteTurismos.add(paquete);
        System.out.println("Paquete agregado con exito.");
    }

    public static void mostrarTodosLosPaquetes() {
        System.out.println("\n Paquetes disponibles:  ");
        for (Paquete p : paqueteTurismos) {
            p.mostrarPaquete();
            System.out.println();
        }
    }
    public static ArrayList<Paquete> getPaquetes() {
        return paqueteTurismos;
    }

    public static void agregarProveedores(Proveedor p) {
        proveedores.add(p);
    }
    public static void mostrarProveedores() {
        System.out.println("\nProveedores registrados: \n");
        for (Proveedor p: proveedores) {
            System.out.println(p.getProveedor());
        }
    }

    public static void agregarClientes(Cliente c) {
        clientes.add(c);
    }
    public static void mostrarClientes() {
        System.out.println("\nClientes registrados:");
        int con = 1;
        for (Cliente c: clientes) {
            System.out.print("Cliente " + con + ": ");
            System.out.println(c.getNombre());
            c.mostrarComprasCliente();
            System.out.println("---------------");
            con++;
        }
    }
    public static void informeVentas() {
        System.out.println("Informe de ventas realizadas...");
        for (Cliente c : clientes) {
            ventasRealizadas.addAll(c.getCompras());
        }
        if (ventasRealizadas.isEmpty()) {
            System.out.println("No se han realizaron ventas");
        }

        ventasRealizadas.sort(new Comparator<Paquete>() {
            @Override
            public int compare(Paquete paqueteT1, Paquete paqueteT2) {
                return paqueteT1.getDestino().compareTo(paqueteT2.getDestino());
            }
        });
        System.out.println("Paquetes vendidos.");
        for (Paquete p : ventasRealizadas) {
            p.mostrarPaquete();
            System.out.println();
        }
    }

    public static void clientesDestinosFavoritos() {
        System.out.println("\nDestino favorito de los clientes");
        for (Cliente c : clientes) {
            System.out.println(c.getDestinoFavorito());
        }
    }
}
