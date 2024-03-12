package unitConversion;

import java.util.Scanner;

public class MainUnitConvert {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String option1 = "Metro a Centímetro";
		String option2 = "Centimetro a metro";
		String option3 = "Kilometro a metro";
		
		
		do {
			System.out.println("\n------- INTRODUCCIÓN DATOS --------");
			
			System.out.println("Selecciona una operación (1, 2, 3): ");
			System.out.println("1- " + option1);
			System.out.println("2- " + option2);
			System.out.println("3- " + option3);
	        int option = scanner.nextInt();
	        
	        
	        if(option == 1) {
	        	System.out.println("Has elegido la opción de conversión: " + option + "- " + option1);
	        } else if(option == 2) {
	        	System.out.println("Has elegido la opción de conversión: " + option + "- " + option2);
	        } else if(option == 3) {
	        	System.out.println("Has elegido la opción de conversión: " + option + "- " + option3);
	        }
	        
	        System.out.println("\nIntroduce el número a convertir: ");
			double num = scanner.nextInt();
			
	        operationResult(option, num);
	        
		} while(true);
		

	}
	
	public static void operationResult(int option, double num) {
		System.out.println("\n------- RESULTADO --------");
		switch (option) {
        case 1:
        	num = num * 100;
            System.out.println("El resultado de la operación es: " + num + " centímetros" );
            break;
        case 2:
        	num = num / 100;
            System.out.println("El resultado de la operación es: " + num + " metros" );
            break;
        case 3:
        	num = num * 1000;
            System.out.println("El resultado de la operación es: " + num + " metros" );
            break;
        default:
            System.out.println("Opción no válida.");
            break;
    }
	}

}
