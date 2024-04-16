package lecturaEscrituraBorradoArchivos;

public class Main {

	public static void main(String[] args) {
		
		CrearArchivo crearArchivo = new CrearArchivo();
        crearArchivo.crearArchivo();

        Leer leerArchivo = new Leer();
        leerArchivo.leer(); // Llama al método leer() para leer lo que hay en el archivo

        Escribir escribirEnArchivo = new Escribir();
        escribirEnArchivo.escribir(); // Llama al método escribir() para escribir algo en el archivo

        Borrar borrarArchivos = new Borrar();
        borrarArchivos.borrarCarpeta();

	}

}
