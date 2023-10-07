package ar.edu.unlu.poo.trabajoPractico_2.ejercicio13;

public class Ticket {
    private int idTicket;
    private static int contadorIDT = 0;
    private Vuelo vueloT;

    public Ticket(Vuelo vueloT) {
        this.idTicket = contadorIDT;
        this.vueloT = vueloT;
        contadorIDT++;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public static int getContadorIDT() {
        return contadorIDT;
    }

    public static void setContadorIDT(int contadorIDT) {
        Ticket.contadorIDT = contadorIDT;
    }

    public Vuelo getVueloT() {
        return vueloT;
    }

    public void setVueloT(Vuelo vueloT) {
        this.vueloT = vueloT;
    }
}
