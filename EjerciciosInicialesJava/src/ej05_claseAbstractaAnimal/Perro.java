package ej05_claseAbstractaAnimal;

public class Perro extends Animal {
	private String raza;
	

	public Perro(String color, String nombre, int edad) {
		super(color, nombre, edad);
	}
	
	public Perro(String color, String nombre, int edad, String raza) {
		super(color, nombre, edad);
		this.raza = raza;
	}
	

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	@Override
	public void emitirSonido() {
		System.out.println("Guau!");
	}
	
	
	
}
