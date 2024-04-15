package codigo;

public class Personaje {
	private String nombre;
	private int salud;
	private int nivel;

	public Personaje(String nombre, int salud, int nivel) {
		this.setNombre(nombre);
		this.setSalud(salud);
		this.setNivel(nivel);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
}
