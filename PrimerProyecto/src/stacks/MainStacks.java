package stacks;

import java.util.Stack;

public class MainStacks {

	public static void main(String[] args) {
		
		//1- DECLARAR UNA PILA(STACK)
		Stack<Integer> pila = new Stack<Integer>();
		
		//2- AÑADIR ELEMENTOS A LA PILA(STACK)
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.push(5);
		
		//3- RECORRER TODOS LOS OBJETOS DE LA PILA
		//Recorrido foreach
		for(Integer pilaStack: pila) {
			System.out.println(pilaStack);
		}
		
		//4- MOSTRAR LA PILA
		System.out.println("Pila vacía: " + pila);
		
		//5- COMPROBAR SI LA PILA ESTÁ VACIA
		System.out.println("¿Está vacía la lista? " + pila.isEmpty());
		
		//6- ELIMINAR EL ÚLTIMO REGISTRO QUE ENTRÓ
		pila.pop();
		
		//7- BUSCAR Y MOSTRAR UNA PILA CONCRETA (NO ENTIENDO MUY BIEN!)
		System.out.println("¿Está el 3? " + pila.search(3)); //Solo busca un valor, no funciona con objetos que tenga más de un atributo, solo busca elementos que coinciden exactamente
		
		//8- MOSTRAR CUAL ES EL ULTIMO OBJETO AGREGADO
		System.out.println("Último agregado: " + pila.peek());

	}

}
