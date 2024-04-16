package ejEnVivo_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Character> listaCaracteres = new ArrayList<>();
		
		//Insertar caracteres
		listaCaracteres.add('c');
        listaCaracteres.add('d');
        listaCaracteres.add('f');
        
        System.out.println("Lista de carácteres inicial:");
        for (char caracter : listaCaracteres) {
            System.out.println(caracter);
        }
        
        //Añadir caracteres a y b al principio de la lista
        listaCaracteres.add(0, 'a');
        listaCaracteres.add(1, 'b');
        
        System.out.println("Lista de carácteres añadidos al principio de la lista:");
        for (char caracter : listaCaracteres) {
            System.out.println(caracter);
        }
        
        //Añadir un carácter g al final de la lista
        listaCaracteres.add('g');
        
        System.out.println("Lista de carácteres añadidos al final de la lista:");
        for (char caracter : listaCaracteres) {
            System.out.println(caracter);
        }
        
        //Añade un carácter e entre los carácteres de y f
        listaCaracteres.add(4, 'e');
        
        System.out.println("Lista de carácteres al añadir un carácter en una posición concreta de la lista:");
        for (char caracter : listaCaracteres) {
            System.out.println(caracter);
        }
        
        //Elimina el carácter de la tercera posición (índice 2)
        listaCaracteres.remove(2);
        
        System.out.println("Lista de carácteres después de eliminar el carácter en la tercera posición::");
        for (char caracter : listaCaracteres) {
            System.out.println(caracter);
        }
        
        //Recorrer el arrayList con un iterator
        Iterator<Character> iterator = listaCaracteres.iterator();
        System.out.println("Recorriendo el ArrayList con un Iterador:");
        while (iterator.hasNext()) {
            char caracter = iterator.next();
            System.out.println(caracter);
        }

	}

}
