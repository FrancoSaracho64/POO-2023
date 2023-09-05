package unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios;

import java.util.concurrent.ThreadLocalRandom;

public class Contrasena {
    private String password;
    private Integer longitud = 8;

    public Contrasena(){
        generar(this.longitud);
    }

    public Contrasena(Integer longitud) {
        generar(longitud);
    }

    public void generar(Integer longitud){
        String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        //creo la contrasena
        this.password = "";
        for (int i = 0; i < longitud; i++){
            int i_aleatorio = numeroAleatorioEnRango(banco.length() - 1);
            char caracter = banco.charAt(i_aleatorio);
            password += caracter;
        }
    }

    public void regenerar(){
        generar(longitud);
        //verifico que la contrasena sea fuerte
        boolean fuerte = esFuerte();
        if (!fuerte) {
            generar(longitud);
        }
    }

    public boolean esFuerte(){
        boolean fuerte = false;
        //Fuerte: +2 mayus, +1 min, al menos +2 num
        char[] contrasena = password.toCharArray();
        String numeros = "";
        String mayusculas = "";
        String minusculas = "";

        for (int i = 0; i < contrasena.length; i++){
            if (Character.isDigit(contrasena[i])){
                numeros += contrasena[i];
            }
            if (Character.isLetter(contrasena[i])){
                if (Character.isUpperCase(contrasena[i])){
                    mayusculas += contrasena[i];
                }
                if (Character.isUpperCase(contrasena[i])){
                    minusculas += contrasena[i];
                }
            }
        }
        if((numeros.length() >= 2 && mayusculas.length() >= 3 && minusculas.length() >= 2)){
           fuerte = true;
        }
        return fuerte;
    }

    public String getPassword() {
        return password;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
        regenerar();
    }


    private static int numeroAleatorioEnRango(int maximo) {
        // nextInt regresa en rango pero con límite superior exclusivo, por eso sumamos 1
        return ThreadLocalRandom.current().nextInt(0, maximo + 1);
    }
}
