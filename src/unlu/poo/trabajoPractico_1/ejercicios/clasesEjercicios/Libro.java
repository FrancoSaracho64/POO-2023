package unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private Integer paginas;
    private Integer cantEjemplares;
    private Integer cantEjemplaresPrestados;
    private Integer anio;

    public Libro() {
    }

    //La sobrecarga mas habitual, son los distintos tipos de constructores.
    public Libro(String titulo, String autor, String isbn, Integer paginas, Integer anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
        this.anio = anio;
    }

    public void verLibro(){


    }
    public Boolean prestar(){
        return true;
    }

    public void devolver(){

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

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", paginas=" + paginas +
                ", anio=" + anio +
                '}';
    }
}
