package ej02_calculadora_profe;

import java.util.Scanner;

public class MainCalculadora {

	public static void main(String[] args) {
		Calculadora miCalc = new Calculadora();
		Scanner miScan = new Scanner(System.in);
		boolean continuar = true;
		
		System.out.println("Se ha creado una nueva calculadora con " + miCalc.getNumOperaciones());
		
		do {
			
			System.out.println("Escribe el operando 1: ");
			int op1 = miScan.nextInt();
			miScan.nextLine();
			
			System.out.println("Escribe el operando 2: ");
			int op2 = miScan.nextInt();
			miScan.nextLine();
			
			System.out.println("Escribe la operación: ");
			String tipo = miScan.nextLine();
			
			switch(tipo) {
			case "sumar":
				miCalc.operacion(op1, op2, "sumar");
				break;
				
			case "restar":
				miCalc.operacion(op1, op2, "restar");
				break;
				
			case "multiplicar":
				miCalc.operacion(op1, op2);
				break;
				
			case "terminar":
				continuar = false;
				break;
			
			default:
				System.err.println("Operación no válida");
				break;
			}
		}
		while(continuar);

	}

}
