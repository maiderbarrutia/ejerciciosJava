package ej08;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner miScan = new Scanner(System.in);
		
		
		do {
			
			//Pedir al usuario una cadena de caracteres
			System.out.println("\nEscribe un texto: ");
			String texto = miScan.nextLine();
			OperacionesCaracteres operacionCadena = new OperacionesCaracteres(texto);
			
			//Pedir al usuario un carácter
			System.out.println("\nEscribe un carácter: ");
			String input = miScan.nextLine();
	        char caracter = input.charAt(0); 
			
			//Mostrar todo
//			operacionCadena.mostrarInfo(caracter);
	        
	        //Mostrar la cadena
	        System.out.println("\nMostrar cadena: " + operacionCadena.getCadena());
			
//			//Mostrar el número de vocales que tiene
			System.out.println("\nMostrar número de vocales que tiene la cadena: " + operacionCadena.numeroVocales());
			
			//Mostrar la cadena invertida
			System.out.println("\nMostrar cadena invertida: " + operacionCadena.invertirCadena());
			
			//Mostrar el número de apariciones en la cadena de un carácter dado
			System.out.println("\nMostrar número de veces caracter en la cadena: " + operacionCadena.contarCaracter(caracter));
		
		}
		while(true);


	}

}
