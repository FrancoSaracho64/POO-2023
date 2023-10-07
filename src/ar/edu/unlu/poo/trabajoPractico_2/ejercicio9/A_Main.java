package ar.edu.unlu.poo.trabajoPractico_2.ejercicio9;

import java.util.Scanner;

public class A_Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Calcular el AREA de una figura");
            System.out.println("2. Calcular el VOLUMEN de una figura");
            System.out.println();
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción:  ");
            opcion = teclado.nextInt();
            System.out.println();
            System.out.println();
            switch (opcion) {
                case 1:
                    ListaAreas();
                    break;
                case 2:
                    ListaVolumenes();
                    break;
                case 0:
                    System.out.println("Saliendo del ejercicio...");
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción correcta");
                    break;
            }
        } while (opcion != 0);
        teclado.close();
    }

    public static void ListaAreas () {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Cálculo de Área:");
            System.out.println("1. Calcular Área de un Círculo");
            System.out.println("2. Calcular Área de un Rectángulo");
            System.out.println("3. Calcular Área de un Cuadrado");
            System.out.println("4. Calcular Área de un Triángulo");
            System.out.println("5. Calcular Área de un Cubo");
            System.out.println("6. Calcular Área de una Esfera");
            System.out.println("7. Calcular Área de un Paralelepipedo");
            System.out.println("8. Calcular Área de un Tetraedro");
            System.out.println("9. Volver al menú principal");
            System.out.println();
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            System.out.println();
            System.out.println();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radioCirculo = scanner.nextDouble();
                    Circulo circulo = new Circulo(radioCirculo);
                    double areaCirculo = circulo.getArea();
                    System.out.println("El área del círculo es: " + areaCirculo);
                    break;
                case 2:
                    System.out.print("Ingrese la base del rectangulo: ");
                    double baseRectangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectangulo: ");
                    double alturaRectangulo = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
                    double areaRectangulo = rectangulo.getArea();
                    System.out.println("El área del rectangulo es: " + areaRectangulo);
                    break;
                case 3:
                    System.out.print("Ingrese la longitud de lado del cuadrado: ");
                    double ladoCuadrado = scanner.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
                    double areaCuadrado = cuadrado.getArea();
                    System.out.println("El área del cuadrado es: " + areaCuadrado);
                    break;
                case 4:
                    System.out.print("Ingrese la base del triangulo: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triangulo: ");
                    double alturaTriangulo = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
                    double areaTriangulo = triangulo.getArea();
                    System.out.println("El área del triangulo es: " + areaTriangulo);
                    break;
                case 5:
                    System.out.print("Ingrese la arista del cubo: ");
                    double aristaCubo = scanner.nextDouble();
                    Cubo cubo = new Cubo(aristaCubo);
                    double areaCubo = cubo.getArea();
                    System.out.println("El área del cubo es: " + areaCubo);
                    break;
                case 6:
                    System.out.print("Ingrese el radio de la esfera: ");
                    double radioEsfera = scanner.nextDouble();
                    Esfera esfera = new Esfera(radioEsfera);
                    double areaEsfera = esfera.getArea();
                    System.out.println("El área de la esfera es: " + areaEsfera);
                    break;
                case 7:
                    System.out.print("Ingrese la arista N°1 del paralelepipedo: ");
                    double arista1 = scanner.nextDouble();
                    System.out.print("Ingrese la arista N°2 del paralelepipedo: ");
                    double arista2 = scanner.nextDouble();
                    System.out.print("Ingrese la arista N°3 del paralelepipedo: ");
                    double arista3 = scanner.nextDouble();
                    Paralelepipedo paralelepipedo = new Paralelepipedo(arista1, arista2, arista3);
                    double areaParalelepipedo = paralelepipedo.getArea();
                    System.out.println("El área del paralelepipedo es: " + areaParalelepipedo);
                    break;
                case 8:
                    System.out.print("Ingrese la arista del tetraedro: ");
                    double aristaTetraedro = scanner.nextDouble();
                    Tetraedro tetraedro = new Tetraedro(aristaTetraedro);
                    double areaTetraedro = tetraedro.getArea();
                    System.out.println("El área del tetraedro es: " + areaTetraedro);
                    break;
                case 9:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción correcta");
                    break;
            }
        } while (opcion != 9);
        scanner.close();
        System.out.println();
    }

    public static void ListaVolumenes () {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Cálculo de Volumen:");
            System.out.println("1. Calcular Área de un Cubo");
            System.out.println("2. Calcular Área de una Esfera");
            System.out.println("3. Calcular Área de un Paralelepipedo");
            System.out.println("4. Calcular Área de un Tetraedro");
            System.out.println("5. Volver al menú principal");
            System.out.println();
            System.out.print("Seleccione una figura: ");
            opcion = scanner.nextInt();
            System.out.println();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la arista del cubo: ");
                    double aristaCubo = scanner.nextDouble();
                    Cubo cubo = new Cubo(aristaCubo);
                    double volumenCubo = cubo.getVolumen();
                    System.out.println("El volumen del cubo es: " + volumenCubo);
                    break;
                case 2:
                    System.out.print("Ingrese el radio de la esfera: ");
                    double radioEsfera = scanner.nextDouble();
                    Esfera esfera = new Esfera(radioEsfera);
                    double volumenEsfera = esfera.getVolumen();
                    System.out.println("El volumen de la esfera es: " + volumenEsfera);
                    break;
                case 3:
                    System.out.print("Ingrese la arista N°1 del paralelepipedo: ");
                    double arista1 = scanner.nextDouble();
                    System.out.print("Ingrese la arista N°2 del paralelepipedo: ");
                    double arista2 = scanner.nextDouble();
                    System.out.print("Ingrese la arista N°3 del paralelepipedo: ");
                    double arista3 = scanner.nextDouble();
                    Paralelepipedo paralelepipedo = new Paralelepipedo(arista1, arista2, arista3);
                    double volumenParalelepipedo = paralelepipedo.getVolumen();
                    System.out.println("El volumen del paralelepipedo es: " + volumenParalelepipedo);
                    break;
                case 4:
                    System.out.print("Ingrese la arista del tetraedro: ");
                    double aristaTetraedro = scanner.nextDouble();
                    Tetraedro tetraedro = new Tetraedro(aristaTetraedro);
                    double volumenTetraedro = tetraedro.getVolumen();
                    System.out.println("El volumen del tetraedro es: " + volumenTetraedro);
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción correcta");
                    break;
            }
        } while (opcion != 5);
        scanner.close();
        System.out.println();
    }
}
