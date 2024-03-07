package enums;

public class MainEnums {
	
	enum Color{
		rojo, azul, verde, amarillo, naranja, negro, blanco
	}

	public static void main(String[] args) {
		
		//Generar solo el color seleccionado
		System.out.println("\n-------- USO 1: ------------");
		Color color = Color.azul;
		System.out.println("El color es: " + color);
		
		
		//MÉTODOS
		
		//name(): Muestra el nombre del enum seleccionado
		System.out.println("\n-------- Método name(): ------------");
		System.out.println(color.name());
		
		//ordinal(): Indica la posición donde se encuentra el azul (Empieza de 0)
		System.out.println("\n-------- Método ordinal(): ------------");
		System.out.println(color.ordinal());
		
		//values()
		//Uso 2: Genera una lista con todos los colores
		System.out.println("\n-------- Método values(): ------------");
		for(Color c: Color.values()) {
			System.out.println("El color es: " + c);
		}
		
		//valuesOf()
		System.out.println("\n-------- Método valuesOf(): ------------");
		try {
			color = Color.valueOf("azul2");
			System.out.println(color);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Ocurrion una excepción. El valor no es correcto");
		}

	}

}
