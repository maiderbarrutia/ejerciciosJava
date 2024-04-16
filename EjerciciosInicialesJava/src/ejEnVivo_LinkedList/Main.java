package ejEnVivo_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		LinkedList<Character> listaCaracteres = new LinkedList<>();
		
		//Insertar tres carácteres
		listaCaracteres.add('c');
		listaCaracteres.add('d');
        listaCaracteres.add('f');
        
        System.out.println("Lista de carácteres:");
        for (char caracter : listaCaracteres) {
            System.out.println(caracter);
        }
        
        
        //Añadir los caracteres a y b al principio de la lista
        
        	//Opción 1:
//	        listaCaracteres.addFirst('b');
//	        listaCaracteres.addFirst('a');
	        
	        //Opción 2:
	        listaCaracteres.addAll(0, List.of('a', 'b')); //List.of : Es un método que permite crear listas inmutables de manera conveniente
	        
	        System.out.println("Lista de carácteres añadiendo a y b al principio:");
	        for (char caracter : listaCaracteres) {
	            System.out.println(caracter);
	        }

        //Añadir un carácter g al final de la lista
        listaCaracteres.addLast('g');
        
        System.out.println("Lista de carácteres añadiendo g al final:");
        for (char caracter : listaCaracteres) {
            System.out.println(caracter);
        }
        
        //añadir un carácter e entre los caracteres d y f
        listaCaracteres.add(4, 'e'); 
        
        System.out.println("Lista de carácteres añadiendo e entre d y f:");
        for (char caracter : listaCaracteres) {
            System.out.println(caracter);
        }
        
      //Añadir los carácteres x, z al final de la lista
        listaCaracteres.addAll(List.of('x', 'z')); //List.of : Es un método que permite crear listas inmutables de manera conveniente
        
        System.out.println("Lista de carácteres añadiendo x y z al final:");
        for (char caracter : listaCaracteres) {
            System.out.println(caracter);
        }
        
        //Eliminar el carácter de la tercera posición (indice 2)
        listaCaracteres.remove(2);
        
        System.out.println("Lista de carácteres eliminando el carácter de la tercera posición:");
        for (char caracter : listaCaracteres) {
            System.out.println(caracter);
        }
        
        
        //Recorrer el linkedList con un iterador
        Iterator<Character> iterator = listaCaracteres.iterator();
        System.out.println("Recorriendo el LinkedList con un Iterador:");
        while (iterator.hasNext()) {
            char caracter = iterator.next();
            System.out.println(caracter);
        }
        
	}

}
