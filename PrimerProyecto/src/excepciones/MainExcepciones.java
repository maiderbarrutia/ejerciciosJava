package excepciones;

public class MainExcepciones {

	public static void main(String[] args) {
		
		//EJEMPLO 1:
		try {
			int resultado = 3/0;
		}
		catch (Exception e) { //Forma genérica de hacer referencia a las excepciones
			
			//En caso de que se produzca una excepción hace esto:
			System.out.println("No se puede dividir por cero!");
			
		}
		
		//EJEMPLO 2:
		int edades [] = {15, 12, 23, 30};
		try {
			System.out.println("La edad de la posición 3 es: " + edades[2]);
			System.out.println("La edad de la posición 4 es: " + edades[4]);
		}
		catch (Exception e) { //Forma genérica de hacer referencia a las excepciones
			
			//En caso de que se produzca una excepción hace esto:
			System.out.println("Intentaste acceder a un índice que no existe");
			
		}

	}

}
