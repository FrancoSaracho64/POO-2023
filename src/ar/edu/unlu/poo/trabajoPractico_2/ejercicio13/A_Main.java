package ar.edu.unlu.poo.trabajoPractico_2.ejercicio13;

public class A_Main {
    public static void main(String[] args) {

        Persona persona_1 = new Persona("Franco", "5651352185", "Los Cafres 321");

        Persona persona_2 = new Persona("Mateo", "5126515154", "Perales 6215");

        Persona persona_3 = new Persona("Bruno", "54651351554", "Pedernal 8881");

        Rol tripulanteJuan = new Tripulante("Copiloto");
        Rol tripulanteRamiro = new Tripulante("Piloto");

        persona_1.agregarRol(tripulanteJuan);
        persona_3.agregarRol(tripulanteRamiro);

        Vuelo vuelo = new Vuelo(651);
        Vuelo vuelo1 = new Vuelo(64);

        Ticket ticket = new Ticket(vuelo);
        Ticket ticket1 = new Ticket(vuelo1);
        Ticket ticket2 = new Ticket(vuelo1);

        ReciboSueldo rcJuan = new ReciboSueldo(15690);
        rcJuan.agregarVuelo(vuelo);

        ReciboSueldo rcRamiro = new ReciboSueldo(35219);
        rcRamiro.agregarVuelo(vuelo);
        rcRamiro.agregarVuelo(vuelo1);

        tripulanteJuan.nuevoRecibo(rcJuan);
        tripulanteRamiro.nuevoRecibo(rcRamiro);

        Rol pasajeroJuan = new Pasajero("62", ticket1);
        persona_1.agregarRol(pasajeroJuan);

        Rol pasajeroPedro = new Pasajero("25", ticket);
        persona_2.agregarRol(pasajeroPedro);
        Rol pasajeroPedro1 = new Pasajero("90", ticket2);
        persona_2.agregarRol(pasajeroPedro1);

        vuelo.agergarPersona(persona_1);
        vuelo1.agergarPersona(persona_1);
        vuelo.agergarPersona(persona_2);
        vuelo1.agergarPersona(persona_2);
        vuelo.agergarPersona(persona_3);
        vuelo1.agergarPersona(persona_3);

        persona_1.verRolesPersona();
        persona_2.verRolesPersona();
        persona_3.verRolesPersona();
        System.out.println();
        System.out.println("---------------------");
        vuelo.verVuelo();
        System.out.println("\n");
        vuelo1.verVuelo();
    }
}
