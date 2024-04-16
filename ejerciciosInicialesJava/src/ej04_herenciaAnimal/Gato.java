package ej04_herenciaAnimal;

public class Gato extends Animal{

	public Gato() {
		
	}
	
	public Gato(String color, String nombre, int edad) {
		super(color, nombre, edad);
	}

	
	@Override
	public void emitirSonido() {
		System.out.println("Miau!");
	}

	@Override
	public void comer() {
		System.out.println("Comiendo pescado");
	}
	
	
	

	
}
