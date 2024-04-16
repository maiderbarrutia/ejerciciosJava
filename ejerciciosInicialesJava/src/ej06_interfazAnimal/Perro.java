package ej06_interfazAnimal;

public class Perro implements IAnimal {

	private String color;
	private String nombre;
	private int edad;
	
	private String raza;

	public Perro(String color, String nombre, int edad, String raza) {
		this.color = color;
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
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



	public String getRaza() {
		return raza;
	}



	public void setRaza(String raza) {
		this.raza = raza;
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
		System.out.println("Guau!");
		
	}

}
