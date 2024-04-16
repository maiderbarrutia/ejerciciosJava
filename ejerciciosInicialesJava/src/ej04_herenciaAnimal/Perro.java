package ej04_herenciaAnimal;

public class Perro extends Animal {
	private String raza;
	

	public Perro(String color, String nombre, int edad) {
		super(color, nombre, edad);
	}

	public Perro(String color, String nombre, int edad, String raza) {
		super(color, nombre, edad);
		this.nombre = "Osito"; /*MEJOR NO HACER ESTO! Me deja trabajar directamente porque tengo en el base puesto que una clase del package pueda modificar. 
		En caso de haber puesto que sea private, solo hubiera podido acceder mediante getter y setter.*/
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
