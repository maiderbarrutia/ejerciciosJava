package linkedLists;

import java.util.LinkedList;
import java.util.List;

public class MainLinkedLists {

	public static void main(String[] args) {
		//1- DECLARAR UNA LISTA VINCULADA
		LinkedList<Persona> lista = new LinkedList<Persona>();
		
		//2- AÑADIR ELEMENTOS A LA LISTA VINCULADA
		//Crear objetos (personas)
		Persona perso1 = new Persona(1, "Maider", 36);
		Persona perso2 = new Persona(2, "Maider2", 37);
		Persona perso3 = new Persona(3, "Maider3", 38);
		Persona perso4 = new Persona(4, "Maider4", 39);
		
		Persona persoPrincipio1 = new Persona(4, "MaiderPrincipio1", 39);
		Persona persoAleatorio1 = new Persona(4, "MaiderAleatorio1", 39);
		
		//Agregar personas al final de la lista
		lista.add(perso1);
		lista.add(perso2);
		lista.add(perso3);
		lista.add(perso4);
		
		//Agregar personas al principio de la lista
		lista.add(0, persoPrincipio1);
		
		//Agregar personas en la posición elegida de la lista
		lista.add(2, persoAleatorio1);
		
		//3- ELIMINAR ELEMENTO DE LA LISTA VINCULADA
		String nombreBorrar = "Maider2";
		for(Persona perso:lista) {
			if(perso.getNombre().equals(nombreBorrar)) {
				lista.remove(perso);
				break; //Hago que deje de recorrer
			}
		}
		
		//4- RECORRER TODAS LAS PERSONAS DE LA LISTA (no usar for con un índice)
		
		//Recorrido foreach
		System.out.println("\n----------------FOREACH-----------------");
		for (Persona perso:lista) {
			System.out.println("prueba" + perso.getNombre());
		}
		
		//5- TAMAÑO LISTA
		System.out.println("Tamaño lista: " + lista.size());
		
		//6- OBTENER PRIMER OBJETO
		System.out.println("Primer objeto de la lista: " + lista.getFirst().toString());
		
		//7- OBTENER EL ÚLTIMO ELEMENTO
		System.out.println("Último objeto de la lista: " + lista.getLast().toString());
		
		//8- BORRAR TODA LA LISTA
		lista.clear();
		
		//9- COMPROBAR SI LA LISTA ESTÁ VACIA
		System.out.println("¿Está vacía la lista?: " + lista.isEmpty());

	}

}
