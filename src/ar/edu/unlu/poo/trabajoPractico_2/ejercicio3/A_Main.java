package ar.edu.unlu.poo.trabajoPractico_2.ejercicio3;

public class A_Main {
    public static void main(String[] args) {

        /*
        --- Tango ---
         */
        Disciplina disc1 = new Disciplina("Tango");
        // genero los prof
        Profesor prof1 = new Profesor("Franco");
        Profesor prof2 = new Profesor("Manuel");
        Profesor prof3 = new Profesor("Martin");
        // genero los alu
        Alumno alu1 = new Alumno("Pablo");
        Alumno alu2 = new Alumno("Juan");
        Alumno alu3 = new Alumno("Manolo");
        Alumno alu4 = new Alumno("Ignacio");
        Alumno alu5 = new Alumno("Manuel");
        Alumno alu6 = new Alumno("Fran");
        // genero las com
        Comision com1 = new Comision("Comision 1", "Lunes", "09:30am", "INICIAL", disc1, prof1);
        Comision com2 = new Comision("Comision 2", "Miercoles", "03:30pm", "INTERMEDIO", disc1, prof2);
        Comision com3 = new Comision("Comision 3", "Viernes", "07:30pm", "AVANZADO", disc1, prof3);

        // muestro las com
        disc1.mostrarComisiones();
        System.out.println();

        GestorAcademia.agregarComisiones(com1);
        GestorAcademia.agregarComisiones(com2);
        GestorAcademia.agregarComisiones(com3);

        disc1.agregarComision(com1);
        disc1.agregarComision(com2);
        disc1.agregarComision(com3);

        // agrego los alumnos a las comisiones
        GestorAcademia.inscribirALumno(alu1, com1);
        GestorAcademia.inscribirALumno(alu2, com1);
        GestorAcademia.inscribirALumno(alu3, com1);
        GestorAcademia.inscribirALumno(alu4, com2);
        GestorAcademia.inscribirALumno(alu5, com2);
        GestorAcademia.inscribirALumno(alu6, com3);

        System.out.println("------- Alumnos COM 1 - TANGO -------");
        com1.mostrarAlumnos();
        System.out.println();
        System.out.println("------- Alumnos COM 2 - TANGO -------");
        com2.mostrarAlumnos();
        System.out.println();
        System.out.println("------- Alumnos COM 3 - TANGO -------");
        com3.mostrarAlumnos();
        System.out.println();

        System.out.println("Comisiones de --Tango--");
        disc1.mostrarComisiones();

        // Toma de asistencia
        for (int i = 0; i < 10; i++) {
            if (i <= 2)
                GestorAcademia.tomarAsistencia(alu1);
            else if (i == 3)
                GestorAcademia.tomarAsistencia(alu2);
            else if (i > 4 && i <= 6)
                GestorAcademia.tomarAsistencia(alu3);
            else {
                GestorAcademia.tomarAsistencia(alu4);
                GestorAcademia.tomarAsistencia(alu5);
                GestorAcademia.tomarAsistencia(alu6);
            }
        }

        /*
        ###################
        --- Folklore ---
         */
        Disciplina disc2 = new Disciplina("Folklore");

        Profesor proff1 = new Profesor("Franco");
        Profesor proff2 = new Profesor("Javier");
        Profesor proff3 = new Profesor("Mario");

        Alumno al1 = new Alumno("Matias");
        Alumno al2 = new Alumno("Mijael");
        Alumno al3 = new Alumno("Nehemias");
        Alumno al4 = new Alumno("Valen");
        Alumno al5 = new Alumno("Mijail");
        Alumno al6 = new Alumno("Juan");

        Comision comUno = new Comision("Comision 1", "Sabado", "06:45am", "AVANZADO", disc2, proff1);
        Comision comDos = new Comision("Comision 2", "Miercoles", "05:00pm", "INTERMEDIO", disc2, proff2);
        Comision comTres = new Comision("Comision 3", "Jueves", "9:00am", "INICIAL", disc2, proff3);

        GestorAcademia.agregarComisiones(comUno);
        GestorAcademia.agregarComisiones(comDos);
        GestorAcademia.agregarComisiones(comTres);
        disc2.agregarComision(comUno);
        disc2.agregarComision(comDos);
        disc2.agregarComision(comTres);

        GestorAcademia.inscribirALumno(al1, comUno);
        GestorAcademia.inscribirALumno(al2, comUno);
        GestorAcademia.inscribirALumno(al3, comUno);
        GestorAcademia.inscribirALumno(al4, comDos);
        GestorAcademia.inscribirALumno(al5, comDos);
        GestorAcademia.inscribirALumno(al6, comTres);

        System.out.println("------- Alumnos COM 1 - Folklore -------");
        comUno.mostrarAlumnos();
        System.out.println();
        System.out.println("------- Alumnos COM 2 - Folklore -------");
        comDos.mostrarAlumnos();
        System.out.println();
        System.out.println("------- Alumnos COM 3 - Folklore -------");
        comTres.mostrarAlumnos();
        System.out.println();

        //coms
        disc2.mostrarComisiones();
        System.out.println();

        //toma de asistencia
        GestorAcademia.tomarAsistencia(al1);
        GestorAcademia.tomarAsistencia(al2);
        GestorAcademia.tomarAsistencia(al3);
        GestorAcademia.tomarAsistencia(al4);
        GestorAcademia.tomarAsistencia(al5);
        GestorAcademia.tomarAsistencia(al6);
        GestorAcademia.tomarAsistencia(al6);
        for (int i = 0; i < 20; i++) GestorAcademia.tomarAsistencia(al1);

        System.out.println("Calculo de lo sueldos...");
        GestorAcademia.calcularSueldo();
        // SE MUESTRA LA DISCIPLINA CON MAYOR REMUNERACION
        GestorAcademia.calcularDisciplinaMayorRemuneracion();
    }
}