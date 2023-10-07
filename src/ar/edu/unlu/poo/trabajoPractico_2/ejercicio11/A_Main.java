package ar.edu.unlu.poo.trabajoPractico_2.ejercicio11;

import java.util.ArrayList;

public class A_Main {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();

        //Genero las patentes
        Patente pat_fms = new Patente("FMS 064", 2002);
        Patente pat_abc = new Patente("ABC 123", 1234);
        Patente pat_man = new Patente("MAN 010", 2010);
        Patente pat_min = new Patente("MIN 321", 2013);
        Patente pat_fdq = new Patente("FDQ 341", 2020);

        //Genero los vehiculos
        AutoPasajero auto = new AutoPasajero(pat_fms, 5);
        AutoVIP autoVIP = new AutoVIP(pat_abc);
        CamionDeCarga camionDeCarga = new CamionDeCarga(pat_man, 78);
        Combi combi = new Combi(pat_min);
        Flete flete = new Flete(pat_fdq, 1543);

        //Genero los clientes con su vehiculo
        Cliente cliente_uno = new Cliente("Franco");
        Cliente cliente_dos = new Cliente("Mateo");

        clientes.add(cliente_uno);
        clientes.add(cliente_dos);

        //Genero los alquileres
        cliente_uno.realizarAlquiler(auto, "03-10-2023", "05-10-2023");
        cliente_uno.devolverVehiculo();
        cliente_uno.realizarAlquiler(autoVIP, "01-10-2023", "05-10-2023");
        cliente_uno.devolverVehiculo();
        cliente_uno.realizarAlquiler(camionDeCarga, "01-10-2023", "10-10-2023");
        cliente_uno.devolverVehiculo();
        //
        cliente_dos.realizarAlquiler(combi, "01-10-2023", "10-10-2023");
        cliente_dos.devolverVehiculo();
        cliente_dos.realizarAlquiler(flete, "01-10-2023", "10-10-2023");
        cliente_dos.devolverVehiculo();

        //TOTAL POR LOS ALQUILERES REALIZADOS POR EL CLIENTE 1
        long total_cliente1 = 0;
        for(int i = 0; i < cliente_uno.getAlquileres().size(); i++){
            total_cliente1 += (long) cliente_uno.getAlquileres().get(i).getValorAlquiler();
        }

        System.out.println("El total de los alquileres del cliente 1 es: $" + total_cliente1);
        System.out.println();
        System.out.println();
        //TOTAL POR TODOS LOS ALQUILERES REALIZADOS

        long total_alquileres = 0;
        for (int i = 0; i < clientes.size(); i++){
            Cliente actual = clientes.get(i);
            for (int j = 0; j < actual.getAlquileres().size(); j++){
                total_alquileres += (long) actual.getAlquileres().get(i).getValorAlquiler();
            }
        }

        System.out.println("El total por todos los alquileres es de: $" + total_alquileres);
    }
}
