package lecturaEscrituraBorradoArchivos;

import java.io.File;

public class Borrar {
	public void borrarCarpeta() {

        File carpeta = new File("C:\\prueba");
        File archivo = new File("C:\\prueba\\prueba.txt");
        
	      if (carpeta.exists() && carpeta.isDirectory()) {
	          if (archivo.exists() && archivo.isFile()) {
	              if (archivo.delete())
	                  System.out.println("Fichero borrado correctamente: " + archivo.getPath());
	              else
	                  System.err.println("Error al borrar el fichero: " + archivo.getPath());
	          }
	          if (carpeta.delete())
	              System.out.println("Directorio borrado correctamente: " + carpeta.getPath());
	          else
	              System.err.println("Error al borrar el directorio:"  + carpeta.getPath());
	      }
       
	}
}
