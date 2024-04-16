/*package ej3_proyectoJavaLibro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Crear los dos primeros libros con datos fijos mediante constructor
		Libro lib1 = new Libro("9783161484100", "Ken Follet", "La armadura de la luz", 2023, "Plaza Janés", 832);
		Libro lib2 = new Libro("8796161413152", "John Boyne", "El niño con el pijama de rayas", 2023, "Salamandra Bolsillo", 224);
		
		//Inicializar el objeto scanner
		Scanner scanner = new Scanner(System.in);
		
		// Crear el tercer libro solicitando datos al usuario
        System.out.println("Introduce los datos del tercer libro:");
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();

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

        // Crear el tercer libro (tercer objeto) con los datos introducidos por el usuario
        Libro lib3 = new Libro(isbn, autor, titulo, añoPublicacion, editorial, numPaginas);
        
		
        System.out.println("------------------------------");
        
        System.out.println("\n-------- LIBRO 1: ------------");
		lib1.mostrarDatos();
		
		
		System.out.println("\n-------- LIBRO 2: ------------");
		lib2.mostrarDatos();
		
		
		System.out.println("\n-------- LIBRO 3: ------------");
		lib3.mostrarDatos();
		
		// Cerrar el scanner
        scanner.close();

	}

}
*/
package ej03_proyectoJavaLibro;

