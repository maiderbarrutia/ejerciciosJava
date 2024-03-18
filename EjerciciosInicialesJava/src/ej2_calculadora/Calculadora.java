package ej2_calculadora;

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
}
