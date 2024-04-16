package ej05_claseAbstractaAnimal;

import ej04_herenciaAnimal.Gato;
import ej04_herenciaAnimal.Perro;

public class MainAnimal {

	public static void main(String[] args) {
		System.out.println("\n-------------- PERRO ----------------");
		Perro perro = new Perro("negro", "Toy", 3);
		perro.comer();
		perro.dormir();
		perro.emitirSonido();
		
		System.out.println("\n-------------- GATO ----------------");
		Gato gato = new Gato("gris", "Misi", 5);
		gato.comer();
		gato.dormir();
		gato.emitirSonido();

	}

}
