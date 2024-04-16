package ej07_claseAbstractaEInterfazAnimal;

public class Gato extends Animal implements IComportamientoAnimal {

	private String color;
	private String nombre;
	private int edad;
	

	public Gato(String color, String nombre, int edad) {
		super(color, nombre, edad);
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
		System.out.println("Comiendo pescado");
		
	}

	@Override
	public void emitirSonido() {
		System.out.println("Miau!");
		
	}


	
}