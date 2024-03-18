package string;

import java.util.Arrays;

public class MainString {

	public static void main(String[] args) {

		String cadena = "Hola, mundo!";
		
		//charAt(): Devuelve el carácter que se encuentra en la posición de índice
		char caracter = cadena.charAt(0);
        System.out.println("El primer carácter de la cadena es: " + caracter);
		
		//equals(): Devuelve true si el objeto que se pasa por parámetro y el string son iguales. Sino devuelve false
        String otraCadena = "Hola, mundo!";
        boolean sonIguales = cadena.equals(otraCadena);
        System.out.println("¿Las cadenas son iguales?: " + sonIguales);
		
		//isEmpty(): Si la cadena está vacía o su longitud es cero devuelve true
        boolean estaVacia = cadena.isEmpty();
        System.out.println("¿La cadena está vacía?: " + estaVacia);
		
		//length(): Devuelve el número de carácteres de la cadena
        int longitud = cadena.length();
        System.out.println("La longitud de la cadena es: " + longitud);
		
		//Split(): Devuelve un array de string con los elementos de la cadena ()
	        String[] palabras = cadena.split(" ");
	        System.out.println("Cadena dividida en palabras:");
	        System.out.println(Arrays.toString(palabras));
	
	        // Ejemplo con un delimitador diferente (coma)
	        String datos = "Juan,Perez,25";
	        String[] partes = datos.split(",");
	        System.out.println("\nDatos separados:");
	        System.out.println("Nombre: " + partes[0]);
	        System.out.println("Apellido: " + partes[1]);
	        System.out.println("Edad: " + partes[2]);
	
	        // Si el delimitador es un carácter especial en expresiones regulares, debes escaparlo con doble barra invertida
	        String frase = "Hola-mundo-qué-pasa";
	        String[] fragmentos = frase.split("-");
	        System.out.println("\nFragmentos de la frase:");
	        System.out.println(Arrays.toString(fragmentos));
		
		//toLowerCase(): Devuelve un array en el que aparecen los carácteres de la cadena que hace la llamada al método en minúsculas
        String enMinusculas = cadena.toLowerCase();
        System.out.println("Cadena en minúsculas: " + enMinusculas);
		
		//toUpperCase(): Devuelve un array en el que aparecen los carácteres de la cadena que hace la llamada al método en mayúsculas
        String enMayusculas = cadena.toUpperCase();
        System.out.println("Cadena en mayúsculas: " + enMayusculas);
		
		//trim(): Devuelve una copia de la cadena, pero sin los posibles espacios en blanco al principio y al final de la cadena
        String cadenaConEspacios = "   Hola, mundo!   ";
        String sinEspacios = cadenaConEspacios.trim();
        System.out.println("Cadena sin espacios al principio y al final: '" + sinEspacios + "'");
		
		//valueOf(): Devuelve la cadena de carácteres que resulta al convertir la variable del tipo que se pasa por parámetro
        int numero = 42;
        String cadenaNumero = String.valueOf(numero);
        System.out.println("Cadena generada a partir de un número: " + cadenaNumero);

	}

}
