package ar.edu.unlu.poo.trabajoPractico_2.ejercicio14;

public class A_Main {
    public static void main (String[] args){
        Cliente cliente1 = new Cliente("Franco");
        Cliente cliente2 = new Cliente("Mateo");
        Cliente cliente3 = new Cliente("Juan");

        Transporte transporte1 = new Transporte("Avion", 900.0);
        Transporte transporte3 = new Transporte("Taxi", 250.0);
        Transporte transporte2 = new Transporte("Colectivo", 110.0);

        Hospedaje hospedaje1 = new Hospedaje("Hotel", 300.0, 70);
        Hospedaje hospedaje2 = new Hospedaje("Depto", 150.0, 45);
        Hospedaje hospedaje3 = new Hospedaje("Carpa", 75.0, 15);

        Guia guia1 = new Guia("Pedro", 200);
        Guia guia2 = new Guia("Magali", 300);
        Guia guia3 = new Guia("Manolo", 250);

        Admin administrador = new Admin();

        PaqueteTurismo paquete1 = administrador.nuevo_viaje(transporte1, hospedaje3, guia1);
        PaqueteTurismo paquete2 = administrador.nuevo_viaje(transporte2, hospedaje2, guia2);
        PaqueteTurismo paquete3 = administrador.nuevo_viaje(transporte3, hospedaje1, guia3);

        administrador.mostrar_viajes();

        administrador.ventaViaje(cliente1, paquete1);
        administrador.ventaViaje(cliente1, paquete3);
        administrador.ventaViaje(cliente1, paquete2);
        administrador.ventaViaje(cliente2, paquete2);
        administrador.ventaViaje(cliente3, paquete2);
        administrador.ventaViaje(cliente2, paquete2);

        System.out.println("\n----------------------");
        administrador.ventasTotales();
        System.out.println("----------------------");
        administrador.viajeMasVendido();
        System.out.println();
        System.out.println("----------------------");
        administrador.viajeMasVendido();
        System.out.println("----------------------");
        cliente1.mostrarViajesComprados();
    }
}