package ej03_proyectoJavaLibro;

import java.util.ArrayList;
import java.util.Scanner;

public class MainListaInfinitaLibros {

    public static void main(String[] args) {
        // Crear los dos primeros libros con datos fijos mediante constructor
        Libro lib1 = new Libro("9783161484100", "Ken Follet", "La armadura de la luz", 2023, "Plaza Janés", 832);
        Libro lib2 = new Libro("8796161413152", "John Boyne", "El niño con el pijama de rayas", 2023, "Salamandra Bolsillo", 224);

        // Inicializar el objeto scanner
        Scanner scanner = new Scanner(System.in);

        // Crear una lista para almacenar los libros
        ArrayList<Libro> listaLibros = new ArrayList<>();

        int contadorLibros = 3; // Comenzar desde el tercer libro

        while (true) {
            System.out.println("Introduce los datos del libro " + contadorLibros + " (o 'fin' para salir):");

            // Pedir al usuario que ingrese los datos del libro
            System.out.print("ISBN: ");
            String isbn = scanner.nextLine();

            if (isbn.equalsIgnoreCase("fin")) {
                break; // Salir del bucle si se ingresa 'fin'
            }

            System.out.print("Autor: ");
            String autor = scanner.nextLine();

            System.out.print("Título: ");
            String titulo = scanner.nextLine();

            System.out.print("Año de publicación: ");
            int añoPublicacion = scanner.nextInt();
            scanner.nextLine(); // Consumir el carácter de nueva línea pendiente

            System.out.print("Editorial: ");
            String editorial = scanner.nextLine();

            System.out.print("Número de páginas: ");
            int numPaginas = scanner.nextInt();
            scanner.nextLine(); // Consumir el carácter de nueva línea pendiente

            // Crear el libro con los datos introducidos por el usuario
            Libro nuevoLibro = new Libro(isbn, autor, titulo, añoPublicacion, editorial, numPaginas);

            // Agregar el libro a la lista
            listaLibros.add(nuevoLibro);

            System.out.println("------------------------------");

            // Incrementar el contador de libros
            contadorLibros++;
        }

        // Mostrar los datos de todos los libros en la lista
        for (int i = 0; i < listaLibros.size(); i++) {
            Libro libro = listaLibros.get(i);
            System.out.println("\n-------- LIBRO " + (i + 1) + ": ------------");
            libro.mostrarDatos();
        }

        // Cerrar el scanner
        scanner.close();
    }
}

