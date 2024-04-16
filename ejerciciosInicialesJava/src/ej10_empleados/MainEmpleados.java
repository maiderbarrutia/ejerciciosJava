package ej10_empleados;

import java.util.Arrays;
import java.util.Scanner;

public class MainEmpleados {

	public static void main(String[] args) {
		Scanner miScan = new Scanner(System.in);
		
		//CUADRADO

		Empleado empleados[] = new Empleado [2];
		
		// Solicitar al usuario los lados de los cuadrados y calcular sus áreas
		System.out.println("\n----------- EMPLEADOS -----------");
		
    	for (int i = 0; i < empleados.length; i++) {
	
    		System.out.println("\n--------- Empleado " + (i+1) + ": --------");
    		
        
            System.out.print("Introduce el nombre del empleado " + (i + 1) + ": ");
            String nombreEmpleado = miScan.nextLine();
            
            System.out.print("Introduce el sueldo del empleado " + (i + 1) + ": ");
            double sueldoEmpleado = Double.parseDouble(miScan.nextLine());
            
            empleados[i] = new Empleado(nombreEmpleado, sueldoEmpleado); 
       
            System.out.println("Empleado " + (i + 1) + ": " + empleados[i].toString());
            
            
        }
    	
    	//Mostrar todos los empleados introducidos
    	System.out.println("toString(): " + Arrays.toString(empleados));
    	
    	
    	//Mostrar el empleado con mayor sueldo
    	Empleado empleadoConSueldoMaximo = empleados[0];
        for (int i = 1; i < empleados.length; i++) {
        	empleadoConSueldoMaximo = empleados[i].buscarMayorSueldo(empleados);
        }
        System.out.println("\nEmpleado con mayor sueldo: " + empleadoConSueldoMaximo);
        
     // Imprimir el empleado con el sueldo máximo
        System.out.println("\nEmpleado con el sueldo máximo:");
        System.out.println("Nombre: " + empleadoConSueldoMaximo.getNombre());
        System.out.println("Sueldo: " + empleadoConSueldoMaximo.getSueldo());
    	
    	
    	

	}

}
