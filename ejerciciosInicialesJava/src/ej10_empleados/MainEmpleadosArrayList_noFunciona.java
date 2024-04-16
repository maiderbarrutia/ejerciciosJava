package ej10_empleados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainEmpleadosArrayList_noFunciona {

	public static void main(String[] args) {
		Scanner miScan = new Scanner(System.in);

		// Definir el número de empleados
//		System.out.print("Introduce el número de empleados: ");
//		int numeroEmpleados = miScan.nextInt();
//		miScan.nextLine(); // Consumir el salto de línea

		// Crear una lista de empleados con el tamaño especificado
//		List<Empleado> empleados = new ArrayList<>(numeroEmpleados);
		
		// Crear una lista de empleados con el tamaño dado por aquí
		List<Empleado> empleados = new ArrayList<>(5);

		// Solicitar al usuario que ingrese el nombre y el sueldo de cada empleado
		System.out.println("\n----------- EMPLEADOS -----------");
		for (int i = 0; i < empleados.size(); i++) {
		    System.out.println("\n--------- Empleado " + (i + 1) + ": --------");
		    
		    System.out.print("Introduce el nombre del empleado " + (i + 1) + ": ");
		    String nombreEmpleado = miScan.nextLine();
		    
		    System.out.print("Introduce el sueldo del empleado " + (i + 1) + ": ");
		    double sueldoEmpleado = Double.parseDouble(miScan.nextLine());
		    
		    empleados.add(new Empleado(nombreEmpleado, sueldoEmpleado));
		}
		
		//Mostrar todos los empleados introducidos
		System.out.println("\nLista de empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre() + ", " + empleado.getSueldo());
        }

     // Encontrar el empleado con el sueldo máximo
        
        


	}

}
