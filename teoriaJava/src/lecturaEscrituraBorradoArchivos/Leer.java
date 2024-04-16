package lecturaEscrituraBorradoArchivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leer {
	public void leer() {
		try {
            // Abrir el archivo para lectura
            FileReader archivoLectura = new FileReader("C:\\prueba\\Prueba.txt");
            BufferedReader lectorArchivo = new BufferedReader(archivoLectura);

            String linea;
            // Leer cada línea del archivo e imprimir en la consola
            while ((linea = lectorArchivo.readLine()) != null) {
                System.out.println(linea);
            }

            // Cerrar el BufferedReader después de usarlo
            lectorArchivo.close();
        } catch (IOException e) {
            System.out.println("No se ha encontrado el fichero");
            e.printStackTrace();
        }
    }
}
