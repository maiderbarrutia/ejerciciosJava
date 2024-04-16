package lecturaEscrituraBorradoMultiplesArchivos;

public class Main {

	public static void main(String[] args) {
		GestorArchivos gestor = new GestorArchivos();

        // Crear carpeta y archivos
        gestor.crearCarpeta("C:\\prueba");
        gestor.crearArchivo("C:\\prueba", "Prueba1.txt");
        gestor.crearArchivo("C:\\prueba", "Prueba2.txt");

        // Escribir en archivo
        gestor.escribirEnArchivo("C:\\prueba", "Prueba1.txt", "¡Se escribe en el fichero!");
        gestor.escribirEnArchivo("C:\\prueba", "Prueba2.txt", "¡2!");

        // Leer archivo
        gestor.leerArchivo("C:\\prueba", "Prueba1.txt");

        // Borrar archivos y carpeta
        gestor.borrarArchivo("C:\\prueba", "Prueba1.txt");
        gestor.borrarArchivo("C:\\prueba", "Prueba2.txt");
        gestor.borrarCarpeta("C:\\prueba");

	}

}
