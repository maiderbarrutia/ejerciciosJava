package ej4_herenciaAnimal;

public class MainAnimal {

	public static void main(String[] args) {
		
		

		Perro perro = new Perro("negro", "Toy", 3);
		System.out.println("\n-------------- Mi perro llamado " + perro.nombre + " de color " + perro.getColor() + "  ----------------");
		/*En este caso me deja coger el nombre del perro sin el getter porque le he puesto un modificador "package" o por defecto 
		 * con el que puedo coger el nombre desde cualquier clase que esté dentro de ese package*/
		/*El color solo me deja coger mediante un getter porque el modificador puesto es private, lo que significa que solo puede acceder a ella
		 * la misma clase o mediante los getters*/
		perro.comer();
		perro.dormir();
		perro.emitirSonido();
		
		System.out.println("\n-------------- GATO ----------------");
		Gato gato = new Gato("gris", "Misi", 5);
		System.out.println("\n-------------- Mi gato llamado " + gato.nombre + " de color " + gato.getColor() + "  ----------------");
		gato.comer();
		gato.dormir();
		gato.emitirSonido();

	}

}
