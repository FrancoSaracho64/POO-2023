package unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int paginas;
    private int cantEjemplares;
    private int cantEjemplaresPrestados;
    private int anio;

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.isbn = "";
        this.paginas = 0;
        this.anio = 0;
        this.cantEjemplares = 10;
        this.cantEjemplaresPrestados = 0;
    }

    //La sobrecarga más habitual, son los distintos tipos de constructores.
    public Libro(String titulo, String autor, String isbn, Integer paginas, Integer anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
        this.anio = anio;
        this.cantEjemplares = 10;
        this.cantEjemplaresPrestados = 0;
    }

    public Libro(String titulo, String autor, String isbn, Integer paginas, Integer anio, int cantEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
        this.anio = anio;
        this.cantEjemplares = cantEjemplares;
        this.cantEjemplaresPrestados = 0;
    }
    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = "";
        this.paginas = -1;
        this.anio = -1;
        this.cantEjemplares = 10;
        this.cantEjemplaresPrestados = 0;
    }

    public void verLibro(){
        System.out.println(" --- LIBRO ---");
        System.out.println("+ Titulo: " + titulo);
        System.out.println("+ Autor: " + autor);
        System.out.println("+ ISBN: " + isbn);
        System.out.println("+ Cantidad de paginas: " + paginas);
        System.out.println("+ Año de publicación: " + anio);
        System.out.println("+ Cantidad total de ejemplares: " + (cantEjemplares + cantEjemplaresPrestados));
        System.out.println("     ** Disponibles para pedir: " + cantEjemplares);
        System.out.println("     ** Prestados: " + cantEjemplaresPrestados);
    }
    public boolean prestar(){
        if((cantEjemplares - 1) >= 0) {
            cantEjemplares--;
            cantEjemplaresPrestados++;
            return true;
        }else
            return false;
    }

    public void devolver(){
        cantEjemplares++;
        cantEjemplaresPrestados--;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public int getCantEjemplares() {
        return cantEjemplares;
    }

    public void setCantEjemplares(int cantEjemplares) {
        this.cantEjemplares = cantEjemplares;
    }
}
