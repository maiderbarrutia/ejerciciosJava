package persona;

public class Main {
	
	public static void main(String[] args) {
		Persona profe = new Persona("Fernando", "Méndez", "Castellar", 'H', 43);
		//profe.nombre = ""; //Si nombre está en public con esto podría cambiar el nombre facilmente, lo cual no interesa
		profe.mostrarDatos();
		profe.mayorEdad();
	}
	
}