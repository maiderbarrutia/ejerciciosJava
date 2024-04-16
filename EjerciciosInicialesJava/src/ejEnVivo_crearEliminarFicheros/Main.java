package ejEnVivo_crearEliminarFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		//ESTE CÓDIGO HACE QUE SE CREE UNA CARPETA M03B EN EL DIRECTORIO C: DE MI ORDENADOR CON TODO LO AÑADIDO EN SU INTERIOR
        File dirInicial = new File("C:\\M03B");
        File dirEjercicios = new File("C:\\M03B\\EjerciciosUF5");
        File fichero = new File("C:\\M03B\\EjerciciosUF5\\miFichero.txt");

        if (!dirInicial.exists() && !dirInicial.isDirectory()) {
            if (dirInicial.mkdir())
                System.out.println("Directorio M03B creado correctamente");
            else
                System.err.println("Error al crear el directorio M03B");
        }
        if (!dirEjercicios.exists() && !dirEjercicios.isDirectory()) {
            if (dirEjercicios.mkdir())
                System.out.println("Directorio EjerciciosUF5 creado correctamente");
            else
                System.err.println("Error al crear el directorio EjerciciosUF5");
        }
        try {
            if (!fichero.exists() && !fichero.isFile()) {
                if (fichero.createNewFile())
                    System.out.println("Fichero creado correctamente");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        
        
     // Escribir en el archivo
        try {
            FileWriter escritor = new FileWriter(fichero);
            escritor.write("¡Esta es una prueba para escribir en el archivo txt!\n¡Hola soy una prueba!");
            escritor.flush(); // Vuelca el buffer al fichero destino
            escritor.close();
            System.out.println("Contenido escrito en el archivo correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer y mostrar el contenido del archivo
        try {

            FileReader reader = new FileReader(fichero);
            int c; //Almacena el valor de lo leido en el archivo
            
            System.out.println("\nContenido del archivo:");
            
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
            reader.close();
            
        } catch (IOException e) {
            System.err.println("Error leyendo archivo: " + e.getMessage());
        }

        // Leer y mostrar el contenido de un archivo de texto línea por línea
        try {
        	File ruta = new File("C:\\Users\\Hp\\Desktop\\FP-DAW\\programacion-b\\desarrollo\\src\\PJugador.java");
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            
            System.out.println("\nContenido del archivo línea por línea:");
            
            String linea;
            
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            
            br.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
        
        
        
        
     // BORRAR DIRECTORIOS Y FICHEROS CREADOS
//        if (dirInicial.exists() && dirInicial.isDirectory()) {
//            if (dirEjercicios.exists() && dirEjercicios.isDirectory()) {
//                if (fichero.exists() && fichero.isFile()) {
//                    if (fichero.delete())
//                        System.out.println("Fichero borrado correctamente");
//                    else
//                        System.err.println("Error al borrar el fichero");
//                }
//                if (dirEjercicios.delete())
//                    System.out.println("Directorio EjerciciosUF5 borrado correctamente");
//                else
//                    System.err.println("Error al borrar el directorio EjerciciosUF5");
//            }
//            if (dirInicial.delete())
//                System.out.println("Directorio M03B borrado correctamente");
//            else
//                System.err.println("Error al borrar el directorio M03B");
//        }
        
        
        
    }

}
