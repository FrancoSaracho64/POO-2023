package ar.edu.unlu.poo.trabajoPractico_2.recursosEjercicios.enumerados;

public enum Suscripcion {
    BASICA, INTERMEDIA, DESTACADA;

    @Override
    public String toString() {
        switch (this) {
            case BASICA:
                return "Basica";
            case INTERMEDIA:
                return "Intermedia";
            case DESTACADA:
                return "Destacada";
            default:
                return null;
        }
    }
}

