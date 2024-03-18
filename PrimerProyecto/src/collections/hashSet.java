package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashSet {

	public static void main(String[] args) {
		// Declarar un HashSet
        Set<String> hashSet = new HashSet<>();

        // add(): Añadir elementos al HashSet
        hashSet.add("Elemento1");
        hashSet.add("Elemento2");
        hashSet.add("Elemento3");
        hashSet.add("Elemento4");
        hashSet.add("Elemento5");

        // contains(): Verificar si el HashSet contiene un elemento específico
        boolean contieneElemento = hashSet.contains("Elemento2");
        System.out.println("¿El HashSet contiene 'Elemento2'? " + contieneElemento);

        // size(): Obtener el tamaño del HashSet
        int tamanoHashSet = hashSet.size();
        System.out.println("Tamaño del HashSet: " + tamanoHashSet);

        // isEmpty(): Verificar si el HashSet está vacío
        boolean estaVacio = hashSet.isEmpty();
        System.out.println("¿El HashSet está vacío? " + estaVacio);

        // isEmpty() después de clear()
        estaVacio = hashSet.isEmpty();
        System.out.println("¿El HashSet está vacío después de clear()? " + estaVacio);

        //iterator(): Utilizar un Iterator para recorrer y mostrar los elementos del HashSet
        System.out.println("Elementos en el HashSet:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            System.out.println(elemento);
        }
        
        // remove(): Eliminar un elemento del HashSet
        hashSet.remove("Elemento2");

        // clear(): Vaciar el HashSet
        hashSet.clear();
        System.out.println("El HashSet ha sido vaciado");

	}

}
