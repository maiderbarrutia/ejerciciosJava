package lecturaEscrituraBorradoMultiplesArchivos;

import java.io.*;

public class GestorArchivos {
	public void crearCarpeta(String ruta) {
        File carpeta = new File(ruta);
        if (!carpeta.exists()) {
            if (carpeta.mkdirs()) {
                System.out.println("Carpeta creada correctamente en: " + carpeta.getAbsolutePath());
            } else {
                System.err.println("Error al crear la carpeta en: " + carpeta.getAbsolutePath());
            }
        } else {
            System.out.println("La carpeta ya existe en: " + carpeta.getAbsolutePath());
        }
    }

    public void crearArchivo(String ruta, String nombreArchivo) {
        File archivo = new File(ruta + "\\" + nombreArchivo);
        if (!archivo.exists()) {
            try {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado correctamente en: " + archivo.getAbsolutePath());
                } else {
                    System.err.println("Error al crear el archivo en: " + archivo.getAbsolutePath());
                }
            } catch (IOException e) {
                System.err.println("Error al crear el archivo en: " + archivo.getAbsolutePath());
                e.printStackTrace();
            }
        } else {
            System.out.println("El archivo ya existe en: " + archivo.getAbsolutePath());
        }
    }

    public void escribirEnArchivo(String ruta, String nombreArchivo, String texto) {
        try {
            FileWriter archivoEscritura = new FileWriter(ruta + "\\" + nombreArchivo, true);
            archivoEscritura.write(texto);
            archivoEscritura.close();
            System.out.println("Texto escrito correctamente en: " + ruta + "\\" + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo en: " + ruta + "\\" + nombreArchivo);
            e.printStackTrace();
        }
    }

    public void leerArchivo(String ruta, String nombreArchivo) {
        try {
            FileReader archivoLectura = new FileReader(ruta + "\\" + nombreArchivo);
            BufferedReader lectorArchivo = new BufferedReader(archivoLectura);

            String linea;
            while ((linea = lectorArchivo.readLine()) != null) {
                System.out.println(linea);
            }

            lectorArchivo.close();
        } catch (IOException e) {
            System.err.println("No se pudo leer el archivo en: " + ruta + "\\" + nombreArchivo);
            e.printStackTrace();
        }
    }

    public void borrarArchivo(String ruta, String nombreArchivo) {
        File archivo = new File(ruta + "\\" + nombreArchivo);
        if (archivo.exists()) {
            if (archivo.delete()) {
                System.out.println("Archivo borrado correctamente en: " + archivo.getAbsolutePath());
            } else {
                System.err.println("Error al borrar el archivo en: " + archivo.getAbsolutePath());
            }
        } else {
            System.out.println("El archivo no existe en: " + archivo.getAbsolutePath());
        }
    }

    public void borrarCarpeta(String ruta) {
        File carpeta = new File(ruta);
        if (carpeta.exists()) {
            File[] archivos = carpeta.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    if (archivo.isDirectory()) {
                        borrarCarpeta(archivo.getAbsolutePath());
                    } else {
                        if (archivo.delete()) {
                            System.out.println("Archivo borrado correctamente en: " + archivo.getAbsolutePath());
                        } else {
                            System.err.println("Error al borrar el archivo en: " + archivo.getAbsolutePath());
                        }
                    }
                }
            }
            if (carpeta.delete()) {
                System.out.println("Carpeta borrada correctamente en: " + carpeta.getAbsolutePath());
            } else {
                System.err.println("Error al borrar la carpeta en: " + carpeta.getAbsolutePath());
            }
        } else {
            System.out.println("La carpeta no existe en: " + carpeta.getAbsolutePath());
        }
    }
    
}
