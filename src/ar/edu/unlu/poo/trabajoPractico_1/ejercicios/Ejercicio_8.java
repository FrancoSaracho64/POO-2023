package ar.edu.unlu.poo.trabajoPractico_1.ejercicios;

import ar.edu.unlu.poo.trabajoPractico_1.recursosEjercicios.Contrasena;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        System.out.println("\n-------  Creo 5 contraseñas.");
        Contrasena contra0 = new Contrasena();
        Contrasena contra1 = new Contrasena(15);
        Contrasena contra2 = new Contrasena(9);
        Contrasena contra3 = new Contrasena(10);
        Contrasena contra4 = new Contrasena(12);
        ArrayList<Contrasena> respaldo = new ArrayList<>();
        respaldo.add(contra0);
        respaldo.add(contra1);
        respaldo.add(contra2);
        respaldo.add(contra3);
        respaldo.add(contra4);

        System.out.println("\n------ Muestro las contraseñas generadas");
        ver_contrasenas(respaldo);

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Quiere regenerar alguna de las contraseñas?");
        System.out.println("1 --->  si       ||        0 --->  no");
        System.out.print("Opcion:   ");
        int opcion = teclado.nextInt();
        if (opcion == 1) {
            System.out.print("\n\nIngrese el indice de la contraseña a regenerar:   ");
            int indice = teclado.nextInt();
            System.out.println("\n¿Quiere solo regenerar     o     regenerar y cambiar longitud?");
            System.out.println("1 ---> Regenerar      ||       0 ---> Regenerar y cambiar longitud");
            System.out.print("Opcion:   ");
            int opcionRegen = teclado.nextInt();

            if (opcionRegen == 1) {
                respaldo.get(indice - 1).regenerar();
            } else if (opcionRegen == 0) {
                System.out.print("\nIngrese la nueva longitud: ");
                int longitud = teclado.nextInt();
                respaldo.get(indice - 1).setLongitud(longitud);
            }

            System.out.println();
            ver_contrasenas(respaldo);
        }
        System.out.println("\nFinalizando programa...");
    }
    public static void ver_contrasenas(ArrayList<Contrasena> contrasenas){
        System.out.println("Contraseñas almacenadas:");
        for (int i = 0; i < contrasenas.size(); i++){
            boolean fuerte = contrasenas.get(i).esFuerte();
            if (fuerte){
                System.out.println("Contraseña " + (i+1) + ":   <" + contrasenas.get(i).getPassword() + "> --->> FUERTE");
            } else {
                System.out.println("Contraseña " + (i+1) + ":   <" + contrasenas.get(i).getPassword() + ">  --->> DEBIL");
            }
        }
        System.out.println("--------------------------------------------\n");
    }
}