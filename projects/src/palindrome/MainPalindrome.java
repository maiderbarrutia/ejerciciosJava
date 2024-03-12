package palindrome;

import java.util.Scanner;

public class MainPalindrome {

	public static void main(String[] args) {
		
		
		do {
		
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("\n------- INTRODUCCIÓN DATOS --------");
			System.out.println("Introduce una palabra: ");
	    
			String word = scanner.nextLine();
			
			word = word.toLowerCase().replace(" ", "");
			
			System.out.println("Palabra introducida: " + word);
			
			esPalindromo(word);
		
		} while(true);
		
	}
	
	public static void esPalindromo(String word) {
		
		//Invertir string modo 1: con StringBuilder
		//String invertedWord = new StringBuilder(word).reverse().toString();
		
		//Invertir string modo 2: con llamada a un método donde se utiliza un for
		String invertedWord = revertWord(word);
		
		
		System.out.println("Palabra invertida: " + invertedWord);
		
		System.out.println("\n---------------- RESULTADO: -----------------");
		if(word.equals(invertedWord)) {
			System.out.println("Es un palíndromo!");
		}else {
			System.out.println("No es un palíndromo!");
		}
		
	}
	
	public static String revertWord(String word) {
		
        String cadenaInvertida = "";
        
        for (int i = word.length() - 1; i >= 0; i--) {
        	cadenaInvertida += word.charAt(i); //Es igual a esto: cadenaInvertida = cadenaInvertida + word.charAt(i);
        }
        return cadenaInvertida;
        
        
    }

}
