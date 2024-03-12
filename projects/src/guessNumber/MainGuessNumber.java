package guessNumber;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainGuessNumber {

	public static void main(String[] args) {
		
		Scanner miScan = new Scanner(System.in);
		
		//Calcular un número aleatorio) y convertirlo entera
		int numeroAleatorio = (int)(Math.random() * 10 + 1);
		//int numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 10);
		System.out.println("Número aleatorio: " + numeroAleatorio);
		
		 int selectedNum;
		 int numeroIntentos = 0;

	        try {
	            do {
	                // Solicitar un número entero
	                System.out.println("Escribe un número del 1 al 10: ");
	                selectedNum = miScan.nextInt();
	                miScan.nextLine();

	                System.out.println("Número seleccionado: " + selectedNum);
	                numeroIntentos ++;

	                // Determinar si el valor introducido es menor o mayor al número a adivinar, si es igual termina el programa.
	                if (selectedNum > numeroAleatorio) {
	                    System.out.println("El número introducido es mayor al número a adivinar");
	                } else if (selectedNum < numeroAleatorio) {
	                    System.out.println("El número introducido es menor al número a adivinar");
	                } else {
	                    System.out.println("Has adivinado el número!");
	                    System.out.println("Número de intentos: " + numeroIntentos);
	                    break;
	                }
	            } while (numeroAleatorio != selectedNum);
	        } catch (InputMismatchException e) {
	            System.out.println("Número introducido no válido");
	         
	        }
	        
	        
		
		
		
		

	}

}
