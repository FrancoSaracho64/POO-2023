package unlu.poo.trabajoPractico_1.ejercicios;

import unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.Diccionario;
import unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.Jugador;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Diccionario misPalabras = new Diccionario();

        misPalabras.agregar_palabra("chau");
        misPalabras.agregar_palabra("hola");
        misPalabras.agregar_palabra("auto");
        misPalabras.agregar_palabra("casa");
        misPalabras.agregar_palabra("koala");
        misPalabras.agregar_palabra("zapato");
        misPalabras.agregar_palabra("yoyo");
        misPalabras.agregar_palabra("banana");
        misPalabras.agregar_palabra("xilofon");
        misPalabras.agregar_palabra("cascara");
        misPalabras.agregar_palabra("celular");
        misPalabras.agregar_palabra("computadora");
        misPalabras.agregar_palabra("lapiz");
        misPalabras.agregar_palabra("lapicera");
        misPalabras.agregar_palabra("goma");
        misPalabras.agregar_palabra("maximo");
        misPalabras.agregar_palabra("queso");
        misPalabras.agregar_palabra("queseria");
        misPalabras.agregar_palabra("rotiseria");
        misPalabras.agregar_palabra("fiambre");
        misPalabras.agregar_palabra("carne");
        misPalabras.agregar_palabra("cafe");
        misPalabras.agregar_palabra("te");
        misPalabras.agregar_palabra("mate");
        misPalabras.agregar_palabra("cuchara");
        misPalabras.agregar_palabra("taza");
        misPalabras.agregar_palabra("anteojos");
        misPalabras.agregar_palabra("llaves");
        misPalabras.agregar_palabra("monitor");

        //        k, z, x, y, w, q

        Jugador jugador_1 = new Jugador("Franco");
        Jugador jugador_2 = new Jugador("Mateo");

        jugador_1.agregar_palabra("cucHaRa");
        jugador_1.agregar_palabra("taza");
        jugador_1.agregar_palabra("anteojos");
        jugador_1.agregar_palabra("motosierra");
        jugador_1.agregar_palabra("Walter");
        jugador_1.agregar_palabra("pantalones");
        jugador_1.agregar_palabra("asjdasdads");

        jugador_2.agregar_palabra("carne");
        jugador_2.agregar_palabra("cascada");
        jugador_2.agregar_palabra("te");
        jugador_2.agregar_palabra("queso");
        jugador_2.agregar_palabra("lapiz");


        for (int i = 0; i < jugador_1.getPalabras().size(); i++){
            if (misPalabras.esPalabraValida(jugador_1.getPalabras().get(i))){
                jugador_1.actualizar_puntaje(jugador_1.getPalabras().get(i).length());
                if (jugador_1.getPalabras().get(i).contains("k"))
                    jugador_1.actualizar_puntaje(1);
                if (jugador_1.getPalabras().get(i).contains("z"))
                    jugador_1.actualizar_puntaje(1);
                if (jugador_1.getPalabras().get(i).contains("x"))
                    jugador_1.actualizar_puntaje(1);
                if (jugador_1.getPalabras().get(i).contains("y"))
                    jugador_1.actualizar_puntaje(1);
                if (jugador_1.getPalabras().get(i).contains("w"))
                    jugador_1.actualizar_puntaje(1);
                if (jugador_1.getPalabras().get(i).contains("q"))
                    jugador_1.actualizar_puntaje(1);
            }
        }

        for (int i = 0; i < jugador_2.getPalabras().size(); i++){
            if (misPalabras.esPalabraValida(jugador_2.getPalabras().get(i))){
                jugador_2.actualizar_puntaje(jugador_2.getPalabras().get(i).length());
                if (jugador_2.getPalabras().get(i).contains("k"))
                    jugador_2.actualizar_puntaje(1);
                if (jugador_2.getPalabras().get(i).contains("z"))
                    jugador_2.actualizar_puntaje(1);
                if (jugador_2.getPalabras().get(i).contains("x"))
                    jugador_2.actualizar_puntaje(1);
                if (jugador_2.getPalabras().get(i).contains("y"))
                    jugador_2.actualizar_puntaje(1);
                if (jugador_2.getPalabras().get(i).contains("w"))
                    jugador_2.actualizar_puntaje(1);
                if (jugador_2.getPalabras().get(i).contains("q"))
                    jugador_2.actualizar_puntaje(1);
            }
        }

        for (int i = 0; i < misPalabras.getPalabras().size(); i++){
            if (i == 0){
                System.out.println("**********  Palabras cargadas en el Diccionacio  ************");
            }
            System.out.println("Palabra " + (i+1) + " :   " + misPalabras.getPalabras().get(i));
        }

        System.out.println();
        System.out.println("---RESULTADO FINAL DE LA PARTIDA---");

        if (jugador_1.getPuntaje() > jugador_2.getPuntaje()){
            System.out.println("El jugador " + jugador_1.getNombre() + " ha ganado la partida con " + jugador_1.getPuntaje() +" puntos.");
        } else if (jugador_1.getPuntaje() == jugador_2.getPuntaje()){
            System.out.println("El juego ha terminado en empate.");
        } else {
            System.out.println("El jugador " + jugador_2.getNombre() + " ha ganado la partida " + jugador_2.getPuntaje() +" puntos.");
        }
    }
}
