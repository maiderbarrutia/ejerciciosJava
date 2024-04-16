package ej07_claseAbstractaEInterfazAnimal;


public class Perro extends Animal implements IComportamientoAnimal, IComportamientoPerro {
	private String color;
	private String nombre;
	private int edad;
	
	private String raza;
	
	public Perro(String color, String nombre, int edad) {
		super(color, nombre, edad);
	}
	

	public Perro(String color, String nombre, int edad, String raza) {
		super(color, nombre, edad);
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
	public void emitirSonido() {
		System.out.println("Guau!");
		
	}
	
	@Override
	public void pasear() {
		System.out.println("Paseando perro!");
		
	}
	
	

}