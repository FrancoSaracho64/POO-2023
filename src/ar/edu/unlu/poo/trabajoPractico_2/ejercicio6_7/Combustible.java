package ar.edu.unlu.poo.trabajoPractico_2.ejercicio6_7;

public class Combustible {
    private enum Tipo{GASOIL, NAFTA, KEROSENE};
    private Tipo tipoCombustible;
    private double precioVenta;

    public Combustible(String tipoCombustible, double precioVenta) {
        tipoCombustible = tipoCombustible.toLowerCase();
        switch (tipoCombustible) {
            case "nafta":
                this.tipoCombustible = Tipo.NAFTA;
                break;
            case "kerosene":
                this.tipoCombustible = Tipo.KEROSENE;
                break;
            case "gasoil":
                this.tipoCombustible = Tipo.GASOIL;
                break;
        }
        this.precioVenta = precioVenta;
    }

    public String getTipoCombustible() {
        switch (tipoCombustible) {
            case NAFTA:
                return "nafta";
            case GASOIL:
                return "gasoil";
            case KEROSENE:
                return "kerosene";
        }
        return null;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
}
