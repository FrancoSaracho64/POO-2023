package ar.edu.unlu.poo.trabajoPractico_2.ejercicios;

import ar.edu.unlu.poo.trabajoPractico_2.recursosEjercicios.clases.Actividad;
import ar.edu.unlu.poo.trabajoPractico_2.recursosEjercicios.clases.ClubDeFutbol;
import ar.edu.unlu.poo.trabajoPractico_2.recursosEjercicios.clases.Socio;
import ar.edu.unlu.poo.trabajoPractico_2.recursosEjercicios.enumerados.Suscripcion;

import java.util.ArrayList;

public class Ejercicio_1 {
    public static void main(String[] args) {
        ClubDeFutbol mi_club = new ClubDeFutbol("POO_UNLu");

        Socio socio1 = new Socio("Franco", "Peru 1544", "Argentina", "unlu@gmail.com", "+5491157986532");
        Socio socio2 = new Socio("Mateo", "Iturbide 1894", "Chile", "unlupoo@gmail.com", "+5491152186531");
        Socio socio3 = new Socio("Manuel", "Palmar 1817", "Bolivia", "asduh@gmail.com", "+5498518125185", "17-09-2008");
        Socio socio4 = new Socio("Hector", "Pilar 1520", "Argentina", "unlu2002@gmail.com", "+3514561", "30-12-2014");
        Socio socio5 = new Socio("Angie", "Pacheco 4501", "Chile", "unlupoo798@gmail.com", "+549115651586531", "20-01-2007");
        Actividad actividad1 = new Actividad("Comedor", Suscripcion.BASICA);
        Actividad actividad2 = new Actividad("Baños", Suscripcion.BASICA);
        Actividad actividad3 = new Actividad("Platea una vez al mes", Suscripcion.DESTACADA);
        Actividad actividad4 = new Actividad("Visita a los vestuarios", Suscripcion.DESTACADA);
        Actividad actividad5 = new Actividad("Prestamo de botines", Suscripcion.INTERMEDIA);
        Actividad actividad6 = new Actividad("Cancha Premium", Suscripcion.DESTACADA);

        mi_club.registrar_socio(socio1, Suscripcion.DESTACADA);
        mi_club.registrar_socio(socio2, Suscripcion.BASICA);
        mi_club.registrar_socio(socio3, Suscripcion.INTERMEDIA);
        mi_club.registrar_socio(socio4, Suscripcion.BASICA);
        mi_club.registrar_socio(socio5, Suscripcion.INTERMEDIA);
        mi_club.agregar_actividad(actividad1);
        mi_club.agregar_actividad(actividad2);
        mi_club.agregar_actividad(actividad3);
        mi_club.agregar_actividad(actividad4);
        mi_club.agregar_actividad(actividad5);
        mi_club.agregar_actividad(actividad6);

        ArrayList<Actividad> act_por_subs = mi_club.buscar_actividades_por_suscripcion(Suscripcion.BASICA);
        ArrayList<Socio> soc_por_subs = mi_club.buscar_socios_por_suscripcion(Suscripcion.INTERMEDIA);
        ArrayList<Socio> soc_nuevos_ultimo_mes = mi_club.nuevos_socios_inscriptos();

        System.out.println();
        System.out.println();
        System.out.println("Actividades por suscripcion");
        mostrar_actividades(act_por_subs);
        System.out.println();
        System.out.println();
        System.out.println("Socios por suscripcion");
        mostrar_socios(soc_por_subs);
        System.out.println();
        System.out.println();
        System.out.println("Socios nuevos del ultimo mes");
        mostrar_socios(soc_nuevos_ultimo_mes);
    }

    private static void mostrar_socios(ArrayList<Socio> socios){
        int contador = 1;
        for (Socio socio : socios) {
            System.out.println("-----------------------------------------");
            System.out.println("---------- Contador  --->  " + contador);
            System.out.println("Nombre: " + socio.getNombre_completo());
            System.out.println("Correo: " + socio.getCorreo_electronico());
            System.out.println("Celular: " + socio.getNumero_celular());
            System.out.println("Suscripcion: " + socio.getCredencial().getSuscripcion());
            System.out.println();
            contador++;
        }
        System.out.println("*****************************************************");
        System.out.println();
        System.out.println();
    }

    private static void mostrar_actividades(ArrayList<Actividad> actividades){
        int contador = 1;
        for (Actividad actividad : actividades) {
            System.out.println("-----------------------------------------");
            System.out.println("---------- Contador  --->  " + contador);
            System.out.println("Detalle: " + actividad.getDetalle());
            System.out.println("Nivel de suscripcion: " + actividad.getSuscripcion());
            System.out.println();
            contador++;
        }
        System.out.println("*****************************************************");
        System.out.println();
        System.out.println();
    }
}
