package ej08;

public class OperacionesCaracteres {
	private String cadena;

	public OperacionesCaracteres() {
	}

	public OperacionesCaracteres(String cadena) {
		this.cadena = cadena;
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	
	//Para mostrar cuantas vocales tiene:
	private boolean esVocal(char caracter) {
	    char[] vocales = {'a', 'e', 'i', 'o', 'u'};
	    for (char vocal : vocales) {
	        if (caracter == vocal) {
	            return true;
	        }
	    }
	    return false;
	}
	
	protected int numeroVocales() {
	    int count = 0;
	    for (int i = 0; i < cadena.length(); i++) {
	        char c = cadena.toLowerCase().charAt(i);
	        if (esVocal(c)) {
	            count++;
	        }
	    }
	    return count;
	}
	
	//Mostrar por consola la cadena de forma invertida
	//Modo 1:
//	protected String invertirCadena() {
//		StringBuilder builder = new StringBuilder(cadena);
//        return builder.reverse().toString();
//	}
	
	//Modo 2:
	
	protected String invertirCadena() {
		String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.toLowerCase().charAt(i);
        }
        return cadenaInvertida;
	}
	
	protected int contarCaracter(char caracter) {
		int numeroRepeticiones = 0;
		caracter = Character.toLowerCase(caracter);
	    for (int i = 0; i < cadena.length(); i++) {
	        char c = cadena.toLowerCase().charAt(i);
	        if (c == caracter) {
	        	numeroRepeticiones++;
	        }
	    }
	    return numeroRepeticiones;
	}
	
	public void mostrarInfo(char caracter) {
		System.out.println("Mostrar cadena: " + this.getCadena());
		System.out.println("Mostrar número de vocales que tiene la cadena: " + this.numeroVocales());
		System.out.println("Mostrar cadena invertida: " + this.invertirCadena());
		System.out.println("Mostrar número de veces caracter en la cadena: " + this.contarCaracter(caracter));
	}
	
}
