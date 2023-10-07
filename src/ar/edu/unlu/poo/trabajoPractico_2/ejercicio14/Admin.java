package ar.edu.unlu.poo.trabajoPractico_2.ejercicio14;

import java.util.ArrayList;

public class Admin {
    private static ArrayList<Ventas> totalVentas = new ArrayList<>();
    private PaqueteTurismo viaje;
    private Cliente cliente;
    private ArrayList<PaqueteTurismo> viajes = new ArrayList<>();

    public PaqueteTurismo nuevo_viaje(Transporte t, Hospedaje h, Guia g){
        viaje = new PaqueteTurismo(t, h, g);
        viajes.add(viaje);
        return viaje;
    }

    public void mostrar_viajes(){
        System.out.println("\t               **** Viajes ****");
        System.out.println("    Datos registrados...");
        System.out.println("\tID     GUIA       TRANSPORTE     HOSPEDAJE     PRECIO");
        for (PaqueteTurismo paqueteTurismo : viajes) {
            viaje = paqueteTurismo;
            System.out.printf("\t* %d    %s    %s    %s     %.2f\n",
                    viaje.getId_paquete(),
                    viaje.getGuia(),
                    viaje.getTransporte(),
                    viaje.getHospedaje(),
                    viaje.precioPaquete());
        }
    }

    public void ventaViaje(Cliente cliente, PaqueteTurismo paquete){
        for (PaqueteTurismo paqueteTurismo : viajes) {
            viaje = paqueteTurismo;
            if (viaje.equals(paquete)) {
                viaje.sumar_venta();
                Ventas nueva_venta = new Ventas(cliente, viaje);
                totalVentas.add(nueva_venta);
                cliente.comproPaquete(viaje);
            }
        }
    }

    public void viajeMasVendido(){
        int n=0, id=0;
        String guia = "";
        for (PaqueteTurismo paqueteTurismo : viajes) {
            viaje = paqueteTurismo;
            if (viaje.getCantidad_ventas() > n) {
                n = viaje.getCantidad_ventas();
                id = viaje.getId_paquete();
                guia = viaje.getGuia();
            }
        }
        System.out.printf("\nEl viaje mas vendido es (id): '%s', guiado por %s. Con %d ventas.", id, guia, n);
    }

    public void ventasTotales(){
        System.out.println("TOTAL VENTAS\n");
        System.out.println("ID \t NOMBRE\t ID VIAJE \t GUIA \t HOTEL \t  TRANSPORTE");
        for (Ventas ventas : totalVentas) {
            viaje = ventas.getPaqueteTurismo();
            cliente = ventas.getCliente();
            System.out.printf("-%d\t %s \t  %d \t  %s  \t %s \t   %s\n", cliente.getId_cliente(), cliente.getNombre(), viaje.getId_paquete(), viaje.getGuia(), viaje.getHospedaje(), viaje.getTransporte());
        }
    }
}
