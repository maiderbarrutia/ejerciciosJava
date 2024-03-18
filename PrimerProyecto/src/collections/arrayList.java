package collections;

import java.util.ArrayList;
import java.util.List;

public class arrayList {

	public static void main(String[] args) {
		// Crear una instancia de ArrayList de tipo Persona
        ArrayList<Persona> listaPersonas = new ArrayList<>();

        // Crear algunas instancias de Persona 
        Persona persona1 = new Persona(1, "Juan", 30);
        Persona persona2 = new Persona(2, "María", 25);
        Persona persona3 = new Persona(3, "Pedro", 35);
        
        

        //add(persona): Agregar las instancias de las personas a la listaPersonas
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);

        //foreach: Mostrar la lista de personas
        System.out.println("Lista de personas:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona.getNum() + ": " + persona.getNombre() + " - Edad: " + persona.getEdad());
        }
        
      //MÉTODOS:
        
        //indexOf(): Obtener el índice de una persona en la lista
        int indice = listaPersonas.indexOf(persona2);
        System.out.println("\nÍndice de María en la lista: " + indice);
        
        //set(): Modificar los datos de una persona en la lista
        Persona nuevaPersona = new Persona(2, "María Fernanda", 27);
        listaPersonas.set(indice, nuevaPersona);
        System.out.println("\nLista de personas después de modificar a María:");

        for (Persona persona : listaPersonas) {
            System.out.println(persona.getNum() + ": " + persona.getNombre() + " - Edad: " + persona.getEdad());
        }
        
        //get(): Acceder a un elemento específico de la lista de personas
        Persona personaObtenida = listaPersonas.get(1);
        System.out.println("\nPersona en la posición 1: " + personaObtenida.getNombre());

        //size(): Obtener el tamaño de la lista
        int tamaño = listaPersonas.size();
        System.out.println("\nTamaño de la lista: " + tamaño);

        //isEmpty(): Verificar si la lista está vacía
        boolean estaVacia = listaPersonas.isEmpty();
        System.out.println("La lista de personas está vacía: " + estaVacia);

        //add(posicion, persona): Agregar una nueva persona a la lista en la posición indicada (Empieza en 0)
        Persona persona4 = new Persona(4, "Ana", 28);
        listaPersonas.add(2, persona4);
        System.out.println("\nLista de personas después de agregar a Ana:");

        for (Persona persona : listaPersonas) {
            System.out.println(persona.getNum() + ": " + persona.getNombre() + " - Edad: " + persona.getEdad());
        }
        
        //toArray() Convertir la lista de personas a un array de personas (No es un buen ejemplo)
        Persona[] arrayPersonas = listaPersonas.toArray(new Persona[0]);
        System.out.println("\nArray de personas:");

        for (Persona persona : arrayPersonas) {
            System.out.println(persona.getNum() + ": " + persona.getNombre() + " - Edad: " + persona.getEdad());
        }

        //remove(); Eliminar una persona de la lista
        listaPersonas.remove(persona2);
        System.out.println("\nLista de personas después de eliminar a María:");

        for (Persona persona : listaPersonas) {
            System.out.println(persona.getNum() + ": " + persona.getNombre() + " - Edad: " + persona.getEdad());
        }
        
        
        
        
	}

}
