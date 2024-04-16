package pruebas;

import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("Escribe el valor para linea");
			Scanner scan = new Scanner(System.in);
			String linea = scan.nextLine();
			System.out.println("Has escrito linea "+linea);
			
			System.out.println("Escribe el valor para numeroDouble");
			double numero1 = scan.nextDouble(); //Scanner lee los datos numéricos SIN el salto de línea, por lo que después de una función nextInt() o nextDouble() tendremos que añadir una linea nextLine() vacía
			scan.nextLine();
			System.out.println("Has escrito numero1 "+numero1);

	}

}
