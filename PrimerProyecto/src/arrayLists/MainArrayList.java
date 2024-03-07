package arrayLists;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {

	public static void main(String[] args) {
		//1- DECLARAR UNA LISTA DE ARRAY
		ArrayList<Persona> lista = new ArrayList<Persona> ();

		//2- AÑADIR ELEMENTOS A LA LISTA DE ARRAY (AL FINAL DE LA LISTA)

		//Crear objetos (personas)

		//Opción 1:
		//lista.add(new Persona(1, "Maider", 37));
		
		//Opción 2:
		Persona perso1 = new Persona(1, "Maider", 36);
		Persona perso2 = new Persona(2, "Maider2", 37);
		Persona perso3 = new Persona(3, "Maider3", 38);
		Persona perso4 = new Persona(4, "Maider4", 39);
		
		lista.add(perso1);
		lista.add(perso2);
		lista.add(perso3);
		lista.add(perso4);
		
		//3- ELIMINAR ELEMENTO DE LA LISTA DE ARRAY
		lista.remove(1);

		//4- RECORRER TODAS LAS PERSONAS DE LA LISTA
		
		//Recorrer por índice
		System.out.println("\n----------------FOR-----------------");		
		for(int i = 0; i<lista.size(); i++) {
			System.out.println("prueba" + lista.get(i).getNombre());
		}
		
		//Recorrido foreach
		System.out.println("\n----------------FOREACH-----------------");
		for (Persona perso:lista) {
			System.out.println("prueba" + perso.getNombre());
		}
		
		//5- TAMAÑO LISTA
		System.out.println("Tamaño lista: " + lista.size());
		
		//6- BORRAR TODA LA LISTA
		lista.clear();
		
		//7- COMPROBAR SI LA LISTA ESTÁ VACIA
		System.out.println("¿Está vacía la lista?: " + lista.isEmpty());
	}

}
