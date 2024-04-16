package lecturaEscrituraArchivos;

public class Main {

	public static void main(String[] args) {
		LecturaInformacion leer = new LecturaInformacion();
		EscrituraInformacion escribir = new EscrituraInformacion();
		escribir.escribir();
		leer.lee();

	}

}
