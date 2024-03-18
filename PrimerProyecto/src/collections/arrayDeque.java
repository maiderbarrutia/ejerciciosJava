package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class arrayDeque {
    public static void main(String[] args) {
        // Declarar un ArrayDeque
        Deque<String> arrayDeque = new ArrayDeque<>();

        // add(): Añadir elementos al ArrayDeque
        arrayDeque.add("Elemento1");
        arrayDeque.add("Elemento2");
        arrayDeque.add("Elemento3");

        // offer(): Añadir un elemento al final del ArrayDeque
        arrayDeque.offer("Elemento4");

        // push(): Añadir un elemento al principio del ArrayDeque
        arrayDeque.push("Elemento5");

        // poll(): Obtener y eliminar el primer elemento del ArrayDeque
        String primerElementoEliminado = arrayDeque.poll();
        System.out.println("Primer elemento eliminado del ArrayDeque: " + primerElementoEliminado);

        // pollFirst(): Obtener y eliminar el primer elemento del ArrayDeque (LIFO)
        String primerElementoPop = arrayDeque.pollFirst();
        System.out.println("Primer elemento eliminado del ArrayDeque (pollFirst): " + primerElementoPop);

        // pollLast(): Obtener y eliminar el último elemento del ArrayDeque
        String ultimoElementoEliminado = arrayDeque.pollLast();
        System.out.println("Último elemento eliminado del ArrayDeque (pollLast): " + ultimoElementoEliminado);

        // contains(): Verificar si el ArrayDeque contiene un elemento específico
        boolean contieneElemento = arrayDeque.contains("Elemento2");
        System.out.println("¿El ArrayDeque contiene 'Elemento2'? " + contieneElemento);

        // peek(): Obtener el primer elemento del ArrayDeque sin eliminarlo
        String primerElemento = arrayDeque.peek();
        System.out.println("Primer elemento del ArrayDeque: " + primerElemento);

        // size(): Obtener el tamaño del ArrayDeque
        int tamanoArrayDeque = arrayDeque.size();
        System.out.println("Tamaño del ArrayDeque: " + tamanoArrayDeque);

        // isEmpty(): Verificar si el ArrayDeque está vacío
        boolean estaVacio = arrayDeque.isEmpty();
        System.out.println("¿El ArrayDeque está vacío? " + estaVacio);

        // toArray(): Convertir el ArrayDeque a un array
        Object[] array = arrayDeque.toArray();
        System.out.println("Array generado a partir del ArrayDeque: " + java.util.Arrays.toString(array));
    }
}
