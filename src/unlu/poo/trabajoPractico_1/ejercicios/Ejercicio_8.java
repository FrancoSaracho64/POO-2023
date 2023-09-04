package unlu.poo.trabajoPractico_1.ejercicios;

import unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.Contrasena;

import java.util.ArrayList;

public class Ejercicio_8 {
    public static void main(String[] args) {
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

        for (int i = 0; i < respaldo.size(); i++){
            boolean fuerte = respaldo.get(i).ver_fuerte();
            if (fuerte){
                System.out.println("Contraseña " + (i+1) + ":   " + respaldo.get(i).getPassword() + "  --->> FUERTE");
            } else {
                System.out.println("Contraseña " + (i+1) + ":   " + respaldo.get(i).getPassword() + "  --->> DEBIL");
            }
        }
    }
}
