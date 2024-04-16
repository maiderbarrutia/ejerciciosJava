package ej07_claseAbstractaEInterfazAnimal;

public class MainAnimal {

	public static void main(String[] args) {
		System.out.println("\n-------------- PERRO ----------------");
		Perro perro = new Perro("Marron", "Teddy", 5);
		perro.comer();
		perro.dormir();
		perro.emitirSonido();
		perro.pasear();
		
		
		
		
		System.out.println("\n-------------- GATO ----------------");
		Gato gato = new Gato("Gris", "Misi", 8);
		gato.comer();
		gato.dormir();
		gato.emitirSonido();

	}

}
