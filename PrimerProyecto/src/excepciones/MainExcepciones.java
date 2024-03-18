package excepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class MainExcepciones {
    public static void main(String[] args) {
    	
    	//CONSTRUCCIÓN PARA CAPTURAR Y DELEGAR LAS EXCEPCIONES:
    	try{
		//Código que puede lanzar una excepción. 
    	/*Fragmento de código que se va a intentar ejecutar, esperando que no se produzca ningún error. 
    	 * En caso de que se produzca un error no continúa con su ejecución */
		}catch(Exception error){
		//Código que se ejecutará en caso de error en el bloque try
		}
		finally{
		//Código que se ejecutará siempre tanto si se produce como si no se produce la excepción.
		}
    	
    	
    	//EJEMPLOS:
        // 1- NullPointerException: Se produce cuando se intenta acceder a un objeto que es null.
        String str = null;
        try {
            // Intentar imprimir la longitud de una cadena nula
            System.out.println("Longitud de la cadena: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("¡Se ha producido una NullPointerException: " + e.getMessage());
        }
        
        // 2- ArithmeticException: Se produce cuando ocurre una operación aritmética ilegal, como la división por cero.
        int numerador = 10;
        int denominador = 0;
        try {
            // Intentar dividir por cero
            int resultado = numerador / denominador;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("¡Se ha producido una ArithmeticException: " + e.getMessage());
        }
        
        // 3- ArrayIndexOutOfBoundsException: Se produce cuando se intenta acceder a un índice de matriz que está fuera del rango válido.
        int[] arreglo = {1, 2, 3};
        try {
            // Intentar acceder a un índice fuera del rango del arreglo
            int valor = arreglo[3];
            System.out.println("El valor en el índice 3 es: " + valor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("¡Se ha producido una ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        
        // 4- IllegalArgumentException: Se produce cuando se pasa un argumento ilegal a un método.
        int edad = -5;
        try {
            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("¡Se ha producido una IllegalArgumentException: " + e.getMessage());
        }
        
        // 5- NumberFormatException: Se produce cuando se intenta convertir una cadena a un número, pero la cadena no tiene el formato correcto.
        String numeroStr = "abc";
        try {
            int numero = Integer.parseInt(numeroStr);
            System.out.println("Número: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("¡Se ha producido una NumberFormatException: " + e.getMessage());
        }
        
        // 6- IOException: Se produce cuando ocurre un error durante la operación de entrada/salida, como la lectura o escritura de archivos.
        try {
            FileInputStream archivo = new FileInputStream("archivo.txt");
            // Operaciones de lectura/escritura en el archivo
            archivo.close();
        } catch (IOException e) {
            System.out.println("¡Se ha producido una IOException: " + e.getMessage());
        }
        
        // 7- FileNotFoundException: Una subclase de IOException, se produce cuando se intenta acceder a un archivo que no existe.
        try {
            FileInputStream archivo = new FileInputStream("archivo_inexistente.txt");
            // Operaciones de lectura/escritura en el archivo
            archivo.close();
        } catch (FileNotFoundException e) {
            System.out.println("¡No se encontró el archivo: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("¡Se ha producido una IOException: " + e.getMessage());
        }
        
        // 8- ClassNotFoundException: Se produce cuando se intenta cargar una clase mediante su nombre, pero la clase no se encuentra en el classpath.
        try {
            // Intentar cargar una clase que no existe
            Class.forName("ClaseInexistente");
        } catch (ClassNotFoundException e) {
            System.out.println("¡Se ha producido una ClassNotFoundException: " + e.getMessage());
        }
        
        // 9- InterruptedException: Se produce cuando un hilo es interrumpido mientras espera, duerme o realiza una operación de bloqueo.
        try {
            // Intentar dormir un hilo, que podría ser interrumpido por otro hilo
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("¡Se ha producido una InterruptedException: " + e.getMessage());
        }
        
        // 10- OutOfMemoryError: Se produce cuando no hay suficiente memoria disponible para asignar un objeto nuevo.
        try {
            // Crear un gran número de objetos para forzar un error de falta de memoria
            while (true) {
                Object obj = new Object();
            }
        } catch (OutOfMemoryError e) {
            System.out.println("¡Se ha producido un OutOfMemoryError: " + e.getMessage());
        }
        
        // 11- StackOverflowError: Se produce cuando la pila de llamadas de un programa alcanza su límite debido a un exceso de recursión.
        try {
            // Llamada recursiva infinita para forzar un StackOverflowError
            metodoRecursivo();
        } catch (StackOverflowError e) {
            System.out.println("¡Se ha producido un StackOverflowError: " + e.getMessage());
        }
        
        // 12- RuntimeException: Se produce cuando ocurre un error durante la ejecución del programa y no es verificada en tiempo de compilación.
        try {
            // Intentar realizar una división por cero de forma intencional
            int resultado = dividir(10, 0);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (RuntimeException e) {
            System.out.println("¡Se ha producido una RuntimeException: " + e.getMessage());
        }
    }

    public static void metodoRecursivo() {
        metodoRecursivo();
    }
    public static int dividir(int numerador, int denominador) {
        if (denominador == 0) {
            throw new RuntimeException("División por cero no permitida");
        }
        return numerador / denominador;
    }
}


