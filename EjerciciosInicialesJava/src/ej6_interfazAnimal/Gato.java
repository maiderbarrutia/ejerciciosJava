package ej6_interfazAnimal;

public class Gato implements IAnimal {
	
	private String color;
	private String nombre;
	private int edad;
	
	
	public Gato(String color, String nombre, int edad) {
		this.color = color;
		this.nombre = nombre;
		this.edad = edad;
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



	@Override
	public void comer() {
		System.out.println("Comiendo...");
		
	}

	@Override
	public void dormir() {
		System.out.println("ZzZzZz");
		
	}

	@Override
	public void emitirSonido() {
		System.out.println("Miau!");
		
	}
}
