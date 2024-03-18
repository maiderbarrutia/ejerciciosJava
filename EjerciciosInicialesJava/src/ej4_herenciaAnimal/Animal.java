package ej4_herenciaAnimal;

public class Animal {
	private String color; //Con private solo puede acceder la clase Animal y no las demás clases aunque estén en el mismo package
	String nombre; //No poniendo nada coge por defecto "package" que significa que pueden acceder todas las clases que están dentro del package, no las subclases
	private int edad;
	
	public Animal() {
		
	}

	public Animal(String color, String nombre, int edad) {
//		this.color = color;
//		this.nombre = nombre;
//		this.edad = edad;
		this.setColor(color);
		this.setNombre(nombre);
		this.setEdad(edad);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void comer() {
		System.out.println("Comiendo...");
	}
	
	public void dormir() {
		System.out.println("ZzZzZz");
	}
	
	public void emitirSonido() {
		System.out.println("Sonido!");
	}
	
}
