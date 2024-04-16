package ej09_geometria;

import java.util.Scanner;

public class MainGeometria {

	public static void main(String[] args) {
		Scanner miScan = new Scanner(System.in);
		
		//CUADRADO

		Cuadrado cuadrados[] = new Cuadrado [10];
		
		// Solicitar al usuario los lados de los cuadrados y calcular sus áreas
       System.out.println("\n----------- CUADRADOS -----------");
        for (int i = 0; i < cuadrados.length; i++) {
		
		System.out.println("\n--------- Cuadrado " + (i+1) + ": --------");
            cuadrados[i] = new Cuadrado(); 
            
            System.out.print("Introduce el lado del cuadrado " + (i + 1) + ": ");
            int lado = miScan.nextInt();
            
            // Calcular el área del cuadrado con el lado proporcionado
            double areaCuadrado = cuadrados[i].areaCuadrado(lado); // Calcular el área
            System.out.println("El área del cuadrado mide " + (i + 1) + ": " + areaCuadrado);
        }
        
        //CIRCULO
        Circulo circulos[] = new Circulo [10];
        
        // Solicitar al usuario los lados de los circulos y calcular sus áreas
        System.out.println("\n--------- CIRCULOS --------");
        for (int i = 0; i < circulos.length; i++) {
        
        	System.out.println("\n--------- Circulo " + (i+1) + ": --------");
            circulos[i] = new Circulo(); 
            
            System.out.print("Introduce el radio del circulo " + (i + 1) + ": ");
            int radio = miScan.nextInt();
            
            // Calcular el área del circulo con el lado proporcionado
            double areaCirculo = circulos[i].areaCirculo(radio);
            System.out.println("El área del circulo mide " + (i + 1) + ": " + areaCirculo);
        }
        
        //TRIANGULO
        
        Triangulo triangulos[] = new Triangulo [10];
        
        // Solicitar al usuario las bases y altura, guardarlos en un array bidimensional y recorrerlo para calcular sus áreas
        System.out.println("\n--------- TRIANGULOS --------");
        for (int i = 0; i < triangulos.length; i++) {
        	
        	System.out.println("\n--------- Triangulo " + (i+1) + ": --------");
        	triangulos[i] = new Triangulo(); 
        	
            System.out.print("\nIntroduce la base del triangulo " + (i + 1) + ": ");
            int base = miScan.nextInt();
            
            System.out.print("\nIntroduce la altura del triangulo " + (i + 1) + ": ");
            int altura = miScan.nextInt();
            
            
            // Calcular el área del triangulo con la base y altura proporcionados
            double areaTriangulo = triangulos[i].areaTriangulo(base, altura);
            System.out.println("\nEl área del triángulo mide " + (i + 1) + ": " + areaTriangulo);
        }

	}

}
