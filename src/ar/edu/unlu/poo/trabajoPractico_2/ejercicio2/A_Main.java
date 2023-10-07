package ar.edu.unlu.poo.trabajoPractico_2.ejercicio2;

public class A_Main {
    public static void main(String[] args) {
        // Creo proveedores y guias
        Proveedor prov_1 = new Proveedor("Jaime");
        Proveedor prov_2 = new Proveedor("Lucas");

        prov_1.setProveedorTransporte("terrestres");
        prov_2.setProveedorTransporte("maritimas");

        GestorAgencia.agregarProveedores(prov_1);
        GestorAgencia.agregarProveedores(prov_2);
        GestorAgencia.mostrarProveedores();

        Guia guia_1 = new Guia("Marco");
        Guia guia_2 = new Guia("Polo");

        System.out.println("Guia 1: " + guia_1.getNombre());
        System.out.println("Guia 2: " + guia_2.getNombre());

        System.out.println();

        //  Cargo las excursiones
        System.out.println("Excursiones del guia 1: ");
        guia_1.agregarExcursion("Paseo por las sierras");
        guia_1.agregarExcursion("Ir al lago");
        guia_1.agregarExcursion("Paseo por la costa");
        guia_1.mostrarExcursiones();
        System.out.println();

        System.out.println("Excursiones del guia 2: ");
        guia_2.agregarExcursion("Hacer una fogata en el rio");
        guia_2.agregarExcursion("Pescar en el rio");
        guia_2.agregarExcursion("Andar en bote sobre el rio");
        guia_2.mostrarExcursiones();
        System.out.println();

        // Genero los paquetes de excursiones.
        Paquete paquete1 = new Paquete("bajo-costo", "Buenos Aires", guia_1);
        Paquete paquete2 = new Paquete("promo-rio", "Entre Rios", guia_2);

        // Agrego excursiones para gestionarlas.
        GestorAgencia.agregarPaquete(paquete1);
        GestorAgencia.agregarPaquete(paquete2);
        GestorAgencia.mostrarTodosLosPaquetes();

        // Creo el cliente y elijo los paquetes.

        Cliente cliente_1 = new Cliente("Mateo");
        cliente_1.setDestinoFavorito("San Luis");
        GestorAgencia.agregarClientes(cliente_1);

        Cliente cliente = new Cliente("Juan");
        cliente.setDestinoFavorito("Uruguay");
        GestorAgencia.agregarClientes(cliente);

        System.out.println("\nPara el cliente 1: ");
        cliente_1.seleccionarPaquete();

        System.out.println("\nPara el cliente 2:");
        cliente.seleccionarPaquete();

        GestorAgencia.mostrarClientes();
        System.out.println();

        // Muestro todas las ventas realizadas.
        GestorAgencia.informeVentas();

        // Lugares favoritos
        GestorAgencia.clientesDestinosFavoritos();
    }
}
