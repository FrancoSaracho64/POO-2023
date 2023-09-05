package unlu.poo.trabajoPractico_1.ejercicios;

import unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.Biblioteca;
import unlu.poo.trabajoPractico_1.ejercicios.clasesEjercicios.Libro;

public class Ejercicio_6 {
    public static void main(String[] args) {
        System.out.println("\n------ Creo los libros para trabajar. Por defecto cada libro tiene 10 ejemplares y ninguno prestado.\n");
        Libro libro1 = new Libro("Harry Potter", "J. K. Rowling", "1561864-ASDA84984", 651, 2002);
        Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry", "1654158a-56414asdw", 203, 1943);
        Libro libro3 = new Libro("Programacion Orientada a Objetos", "W. Panessi y T. Delvechio", "8753486ad-asdawy754", 86, 2023, 1);

        Biblioteca mi_biblioteca = new Biblioteca("Biblioteca Nacional", "Los esperantes 41861", 1876);
        mi_biblioteca.agregarLibro(libro1);
        mi_biblioteca.agregarLibro(libro2);
        mi_biblioteca.agregarLibro(libro3);

        System.out.println("Muestro 2 libros cargados...\n");
        System.out.println("Primer libro");
        libro1.verLibro();
        System.out.println();
        System.out.println("Segundo libro");
        libro2.verLibro();
        System.out.println();
        System.out.println();
        System.out.println("----- Comparo la cantidad de paginas de ambos libros.");
        if (libro1.getPaginas() > libro2.getPaginas()){
            System.out.println("El libro '" + libro1.getTitulo() + "' tiene más paginas.");
        } else if (libro2.getPaginas() > libro1.getPaginas()) {
            System.out.println("El libro '" + libro2.getTitulo() + "' tiene más paginas.");
        } else {
            System.out.println("Tienen la misma cantidad de paginas.");
        }

        System.out.println();
        System.out.println();
        System.out.println("------ Presto un libro que tiene 10 ejemplares.");
        boolean prestamo = mi_biblioteca.prestar(1);
        if(prestamo){
            System.out.println("El prestamo se ha realizado correctamente.");
            libro1.verLibro();
        } else {
            System.out.println("ERROR. No se ha concretado el prestamo.");
        }

        System.out.println();
        System.out.println();
        System.out.println("Presto un libro que tiene solo 1 ejemplar.");
        prestamo = mi_biblioteca.prestar(3);
        if(prestamo){
            System.out.println("El prestamo se ha realizado correctamente.");
            libro3.verLibro();
        } else {
            System.out.println("ERROR. No se ha concretado el prestamo.");
            libro3.verLibro();
        }

        System.out.println();
        System.out.println();
        System.out.println("Muestro la cantidad de prestamos realizados:");
        System.out.println("Al dia de la fecha se han realizado   '" + mi_biblioteca.getCantidadPrestamos() + "'   prestamos.");
    }
}
