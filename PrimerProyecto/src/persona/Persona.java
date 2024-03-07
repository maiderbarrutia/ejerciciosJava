package persona;

public class Persona {
	//1- DEFINICIÓN DE CLASE Y ATRIBUTOS
	private String nombre; // Pongo el modificador private porque no quiero que sea accesible o modificable por nadie que no sea la propia clase.
	private String apellido1; //String es una clase, no un atributo en este caso
	private String apellido2;
	private char sexo;
	private int edad;

	//2- DEFINICIÓN DE LOS MÉTODOS CONSTRUCTORES
	// Constructor con 1 parámetro de tipo String
	public Persona(String n) {
		this.nombre = n; // this es el objeto instanciado de la clase actual Persona. El nuevo objeto que vas a instanciar tiene un atributo que se llama nombre y le vas a poner el valor de n
	}

	// Constructor con 3 parámetros de tipo String
	public Persona(String n, String a1, String a2) {
		this.nombre = n;
		this.apellido1 = a1;
		this.apellido2 = a2;
	}
	// Constructor con 5 parámetros
	public Persona(String n, String a1, String a2, char s, int e) {
		this.nombre = n;
		this.apellido1 = a1;
		this.apellido2 = a2;
		this.setSexo(s);
		this.setEdad(e);
	}

	// Getters y Setters que nos interesan
	public String getNombre() {		return nombre;	}
	public String getApellido1() {		return apellido1;	}
	public String getApellido2() {		return apellido2;	}
	public char getSexo() {		return sexo;	}
	public void setSexo(char sexo) {		this.sexo = sexo;	}
	public int getEdad() {		return edad;	}
	public void setEdad(int edad) {		this.edad = edad;	}

	//Resto de métodos
	public void mayorEdad() {
		if (this.getEdad() >= 18) {
			System.out.println("Es mayor de edad");
		}
		else {
			System.out.println("Es menor de edad");
		}
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: "+this.getNombre());
		System.out.println("Apellidos: "+this.getApellido1()+ " "+ this.getApellido2());
		System.out.println("Sexo: "+this.getSexo());
		System.out.println("Edad: "+this.getEdad());
	}

	
}