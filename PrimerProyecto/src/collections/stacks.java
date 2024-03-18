package collections;

import java.util.Stack;

public class stacks {

	public static void main(String[] args) {
		
		
		// Declarar una pila de personas
        Stack<Persona> pilaPersonas = new Stack<>();

        // Crear instancias de Persona
        Persona persona1 = new Persona(1, "Juan", 30);
        Persona persona2 = new Persona(2, "María", 25);
        Persona persona3 = new Persona(3, "Pedro", 35);

        // push(): Añadir personas a la pila
        pilaPersonas.push(persona1);
        pilaPersonas.push(persona2);
        pilaPersonas.push(persona3);

        // size(): Obtener el tamaño de la pila
        int tamanoPila = pilaPersonas.size();
        System.out.println("Tamaño de la pila de personas: " + tamanoPila);

        // isEmpty(): Verificar si la pila está vacía
        boolean estaVacia = pilaPersonas.isEmpty();
        System.out.println("¿La pila de personas está vacía? " + estaVacia);

        // peek(): Obtener el elemento en la cima de la pila sin eliminarlo
        Persona ultimaPersona = pilaPersonas.peek();
        System.out.println("Última persona en la pila (sin eliminarla): " + ultimaPersona.getNombre());
        
        // search(): Buscar una persona en la pila
        int posicion = pilaPersonas.search(persona2);
        System.out.println("Posición de María en la pila: " + posicion);

        // pop(): Eliminar y devolver el elemento en la cima de la pila
        Persona personaEliminada = pilaPersonas.pop();
        System.out.println("Persona eliminada de la cima de la pila: " + personaEliminada.getNombre());

        // Mostrar todas las personas en la pila
        System.out.println("Mostrando todas las personas en la pila:");
        while (!pilaPersonas.isEmpty()) {
            Persona persona = pilaPersonas.pop();
            System.out.println("ID: " + persona.getNum() + ", Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
        }
        
		
		

		
	
	}

}
