package lecturaEscrituraBorradoArchivos;

import java.io.File;
import java.io.IOException;

public class CrearArchivo {
	public void crearArchivo() {
		try {
            // Crear la carpeta "prueba" en la raíz del disco C:
            File carpeta = new File("C:\\prueba");
            if (!carpeta.exists()) {
                if (carpeta.mkdir()) {
                    System.out.println("Carpeta prueba creada correctamente.");
                } else {
                    System.err.println("Error al crear la carpeta prueba: ya existe.");
                }
            }

            // Crear el archivo "Prueba.txt" dentro de la carpeta "prueba"
            File archivo = new File("C:\\prueba\\Prueba.txt");
            if (!archivo.exists()) {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo Prueba.txt creado correctamente.");
                } else {
                    System.err.println("Error al crear el archivo Prueba.txt: ya existe.");
                }
            }
        } catch (IOException e) {
            System.err.println("Error al crear el archivo o la carpeta: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
