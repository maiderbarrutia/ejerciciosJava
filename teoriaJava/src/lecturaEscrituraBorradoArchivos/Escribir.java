package lecturaEscrituraBorradoArchivos;

import java.io.FileWriter;
import java.io.IOException;

public class Escribir {
	public void escribir() {
		
		// Texto a escribir en el archivo
        String texto = "\n¡Se escribe en el fichero!";

        try {
            // Abrir el archivo para escritura (con el modo 'append' activado para añadir al final)
            FileWriter archivoEscritura = new FileWriter("C:\\prueba\\Prueba.txt", true);

            // Escribir el texto en el archivo
            archivoEscritura.write(texto);

            // Cerrar el FileWriter después de usarlo
            archivoEscritura.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
}
