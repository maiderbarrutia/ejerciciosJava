package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class linkedLists {

	public static void main(String[] args) {
		// Declarar una LinkedList de Personas
        LinkedList<Persona> listaPersonas = new LinkedList<>();

        // Crear instancias de Persona
        Persona persona1 = new Persona(1, "Juan", 30);
        Persona persona2 = new Persona(2, "María", 25);
        Persona persona3 = new Persona(3, "Pedro", 35);

        // add(): Añadir personas a la LinkedList
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        
      

        // size(): Obtener el tamaño de la LinkedList
        int tamanoLista = listaPersonas.size();
        System.out.println("Tamaño de la lista de personas: " + tamanoLista);

        // isEmpty(): Verificar si la LinkedList está vacía
        boolean estaVacia = listaPersonas.isEmpty();
        System.out.println("¿La lista de personas está vacía? " + estaVacia);

        //MOSTRAR LA LISTA DE PERSONAS
        //con foreach
        System.out.println("Mostrando toda la lista de personas:");
        for (Persona persona : listaPersonas) {
            System.out.println("ID: " + persona.getNum() + ", Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
        }
        // Utilizar un iterador para recorrer la LinkedList de Personas
        System.out.println("Recorriendo la lista de personas con un iterador:");
        Iterator<Persona> iterador = listaPersonas.iterator();
        while (iterador.hasNext()) {
            Persona persona = iterador.next();
            System.out.println("ID: " + persona.getNum() + ", Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
        }

        // getFirst(): Obtener el primer elemento de la LinkedList
        Persona primeraPersona = listaPersonas.getFirst();
        System.out.println("Primera persona en la lista: " + primeraPersona.getNombre());

        // getLast(): Obtener el último elemento de la LinkedList
        Persona ultimaPersona = listaPersonas.getLast();
        System.out.println("Última persona en la lista: " + ultimaPersona.getNombre());

        // addFirst(): Añadir una persona al principio de la LinkedList
        Persona nuevaPersonaInicio = new Persona(4, "Ana", 28);
        listaPersonas.addFirst(nuevaPersonaInicio);
        System.out.println("Persona añadida al principio de la lista: " + nuevaPersonaInicio.getNombre());

        // addLast(): Añadir una persona al final de la LinkedList
        Persona nuevaPersonaFinal = new Persona(5, "Carlos", 40);
        listaPersonas.addLast(nuevaPersonaFinal);
        System.out.println("Persona añadida al final de la lista: " + nuevaPersonaFinal.getNombre());

        // removeFirst(): Eliminar el primer elemento de la LinkedList
        Persona personaEliminada = listaPersonas.removeFirst();
        System.out.println("Persona eliminada del principio de la lista: " + personaEliminada.getNombre());

        // clear(): Vaciar la LinkedList
        listaPersonas.clear();
        System.out.println("La lista de personas ha sido vaciada");
        
        

	}

}
