package ej1_calculadora;

import java.util.Scanner;

public class Calculadora {
	//Atributos
	private int numOperaciones;
	
	//Constructor inicial
	public Calculadora() {
		
	}
	
	
	public void operacion(int n1, int n2) {
		numOperaciones ++;
		System.out.println("La multiplicación de los dos números es: " + (n1 * n2));
		
	}
	public void operacion(int n1, int n2, String operacion) {
		numOperaciones ++;
		if (operacion.equals("sumar")) {
	        System.out.println("La suma de los dos números es: " + (n1 + n2));
	    } else if (operacion.equals("restar")) {
	        System.out.println("La resta de los dos números es: " + (n1 - n2));
	    } else {
	        System.out.println("Operación no válida");
	    }
	}


	public int getNumOperaciones() {
		return numOperaciones;
	}
	public void numOp() {
		System.out.println("El número de operaciones es: " + getNumOperaciones());
	}
	
	
	public static void main(String[] args) {
    	
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

            
           
    }

}