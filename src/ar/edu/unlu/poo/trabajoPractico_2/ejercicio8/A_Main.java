package ar.edu.unlu.poo.trabajoPractico_2.ejercicio8;

public class A_Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Relampagos de Aire", "Fernando Ruizza", "165132158", 863, 2006, "Jorge Luis Borges", 203321, 30);
        Libro libro2 = new Libro("Manolo el de fuego", "Juan R. Z.", "516518185", 625, 2009, "Mariana Enriquez", 978045, 45);
        Revista revista1 = new Revista("AVON: perfumes", "ElDiario", "65165132168", 30, 2002, 156351, 2, 1100);
        Revista revista2 = new Revista("AVON: ropa", "ElDiarioPlaneta", "61651651", 15, 2005, 232185, 5, 630);

        Biblioteca biblioteca1 = new Biblioteca();
        biblioteca1.agregarLibro(libro1);
        biblioteca1.agregarLibro(libro2);
        biblioteca1.agregarRevista(revista1);
        biblioteca1.agregarRevista(revista2);

        libro1.descripcion();
        System.out.println();

        libro2.descripcion();
        System.out.println();

        revista1.descripcion();
        System.out.println();

        revista2.descripcion();
        System.out.println();

        A_Main obj = new A_Main();
        System.out.println("Comparacion entre libros");
        obj.cantidadPaginas(libro1, libro2);
        System.out.println("Comparacion entre revistas");
        obj.cantidadPaginasRevista(revista1, revista2);
        System.out.println();

        obj.prestar(libro1);
        System.out.println();

        obj.prestar(libro2);
        System.out.println();

        obj.prestarRevista(revista1);
        System.out.println();
        obj.prestarRevista(revista2);
        System.out.println();
        System.out.println("Cantidad total de prestamos: " + biblioteca1.cantidadPrestamos());
    }
    public void prestar(Libro l) {
        System.out.println("cantidad de ejemplares del libro :" + l.getNombre() + " " + l.getEjemplares());
        if (l.prestarLibro()) {
            System.out.println("El libro se ha prestado satisfactoriamente.");
            System.out.println("Cantidad de ejemplares luego del prestamo: " + l.getEjemplares());
        } else {
            System.out.println("Solo hay un ejemplar por lo tanto no se pudo realizar el prestamo.");
        }
    }
    public void prestarRevista(Revista r) {
        System.out.println("cantidad de ejemplares de la revista :" + r.getNombre() + " " + r.getEjemplares());
        if (r.prestarRevista()) {
            System.out.println("La revista se ha prestado satisfactoriamente.");
            System.out.println("Cantidad de ejemplares luego del prestamo: " + r.getEjemplares());
        } else {
            System.out.println("Solo hay un ejemplar por lo tanto no se pudo realizar el prestamo.");
        }
    }

    public void cantidadPaginas(Libro libro1, Libro libro2) {
        if (libro1.getCantPaginas() > libro2.getCantPaginas()) {
            System.out.println("'" +libro1.getNombre() + "' tiene mas paginas que '" + libro2.getNombre()+"'");
        } else if (libro1.getCantPaginas() < libro2.getCantPaginas()) {
            System.out.println(libro2.getNombre() + " tiene mas paginas que " + libro1.getNombre());
        } else {
            System.out.println(libro1.getNombre() + " tiene la misma cantidad de paginas que " + libro2.getNombre());
        }
    }
    public void cantidadPaginasRevista(Revista revista1, Revista revista2) {
        if (revista1.getCantPaginas() > revista2.getCantPaginas()) {
            System.out.println("'" + revista1.getNombre() + "' tiene mas paginas que '" + revista2.getNombre()+"'");
        } else if (revista1.getCantPaginas() < revista2.getCantPaginas()) {
            System.out.println(revista2.getNombre() + " tiene mas paginas que " + revista1.getNombre());
        } else {
            System.out.println(revista1.getNombre() + " tiene la misma cantidad de paginas que " + revista2.getNombre());
        }
    }
}
