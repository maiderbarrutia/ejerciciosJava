package ej6_interfazAnimal;

import ej4_herenciaAnimal.Gato;
import ej4_herenciaAnimal.Perro;

public class MainIAnimal {

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
