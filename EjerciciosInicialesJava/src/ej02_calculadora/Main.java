package ej02_calculadora;

import java.util.Scanner;

import ej01_calculadora.Calculadora;

public class Main {

	public static void main(String[] args) {
		try {
            Scanner scanner = new Scanner(System.in);
            
            Calculadora multiplicacion = new Calculadora();

            do {
	            // Pedir que se introduzca un número A
	            System.out.println("Introduce un primer número");
	            int num1 = scanner.nextInt();
	
	            // Muestra el número A introducido
	            System.out.println("El primer número introducido es: " + num1);
	
	            // Pedir que se introduzca un número B
	            System.out.println("Introduce un segundo número");
	            int num2 = scanner.nextInt();
	
	            System.out.println("El segundo número introducido es: " + num2);
	            
	            scanner.nextLine(); //Hay que limpiar el bufer, si no pongo esto se salta lo siguiente
	            
	         // Pedir que se introduzca una operación a realizar
	            System.out.println("Introduce la operación ´sumar´ o ´restar´");
	            String op = scanner.nextLine();
	
	            // Muestra la operación introducida
	            System.out.println("La operación introducida es: " + op);
	            
	            
	            
	    		//multiplicacion.operacion(num1, num2);
	    		multiplicacion.operacion(num1, num2, op);
	            multiplicacion.numOp();
	    		
            } while(true);

            
            

        } catch (Exception ex) {
            System.err.print("Exception Message: " + ex.getMessage());
        }

	}

}
