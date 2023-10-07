package ar.edu.unlu.poo.trabajoPractico_2.ejercicio6_7;

public class A_Main {
    public static void main(String[] args) {
        //Clientes
        Cliente cliente1 = new Cliente("Marco", "HFG 133");
        Cliente cliente2 = new Cliente("Juana ", "JHD 183");
        Cliente cliente3 = new Cliente("Sofia", "OOI 153");
        Cliente cliente4 = new Cliente("Belinda", "IUE 123");
        Cliente cliente5 = new Cliente("Ale", "OIE 123");
        Cliente cliente6 = new Cliente("Franco", "TRW 352");
        Cliente cliente7 = new Cliente("Mateo", "NHG 183");
        Cliente cliente8 = new Cliente("Juan", "NTV 165");
        Cliente cliente9 = new Cliente("Marco", "HTW 123");
        Cliente cliente10 = new Cliente("Maria", "NMU 123");

        Combustible gasoil = new Combustible("Gasoil", 50);
        Combustible nafta = new Combustible("Nafta", 203);
        Combustible kerosene = new Combustible("Kerosene", 150);
        Expendedor expendedorNafta = new Expendedor(nafta, 300);
        Expendedor expendedorKerosene = new Expendedor(kerosene, 300);
        Expendedor expendedorGasoil = new Expendedor(gasoil, 300);

        Playero playero1 = new Playero("Franco", "Saracho");
        Playero playero2 = new Playero("Maria", "Gonzalez");

        InformeVentas.agregarPlayeros(playero1);
        InformeVentas.agregarPlayeros(playero2);

        // REALIZANDO VENTAS.
        playero1.atenderCliente(cliente1, 100, expendedorNafta, false);
        playero1.atenderCliente(cliente2, 100, expendedorNafta, false);
        playero1.atenderCliente(cliente3, 150, expendedorNafta, false);
        playero1.atenderCliente(cliente4, 120, expendedorNafta, false);
        playero1.atenderCliente(cliente5, 140, expendedorNafta, false);
        playero1.atenderCliente(cliente6, 30, expendedorNafta, false);
        playero1.atenderCliente(cliente8, 10, expendedorNafta, false);
        playero1.atenderCliente(cliente8, 14, expendedorNafta, false);
        playero1.atenderCliente(cliente8, 105, expendedorNafta, false);
        playero1.atenderCliente(cliente9, 102, expendedorNafta, false);
        playero1.atenderCliente(cliente10, 100, expendedorNafta, false);

        playero2.atenderCliente(cliente7, 14, expendedorNafta, false);
        playero2.atenderCliente(cliente7, 454, expendedorGasoil, false);
        playero2.atenderCliente(cliente7, 450, expendedorKerosene, false);
        playero2.atenderCliente(cliente7, 450, expendedorKerosene,false);
        playero2.atenderCliente(cliente8, 450, expendedorKerosene, false);

        InformeVentas.expendedoresPorLitrosExpendidos();
        InformeVentas.empleadosPorMontoTotalDeVentas();
        InformeVentas.clienteSegunMontoTotal();

        InformeVentas.surtidoresPorMontoTotalVenta();
        System.out.println();
        InformeVentas.realizarDescuento(playero1,300, expendedorGasoil);
    }
}
