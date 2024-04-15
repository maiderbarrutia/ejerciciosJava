package codigo;

public class PJugador extends Personaje implements Guerrero {
	private int edad;
	private int ataque;
	private int defensa;
	
	public PJugador(String nombre, int salud, int nivel, int edad, int ataque, int defensa) {
		super(nombre, salud, nivel);
		this.setEdad(edad);
		this.setAtaque(ataque);
		this.setDefensa(defensa);
	}
	
	public PJugador(String nombre, int salud, int nivel, int ataque, int defensa) {
		super(nombre, salud, nivel);
		this.setAtaque(ataque);
		this.setDefensa(defensa);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	
	@Override
	public void atacar(Personaje enemigo) {
	    int lesionCausada = this.getAtaque() * this.getNivel();
	    int saludActualEnemigo = enemigo.getSalud();

	    
	    if (lesionCausada >= saludActualEnemigo) {
	    	enemigo.setSalud(0);
	    } else {
	    	enemigo.setSalud(saludActualEnemigo - lesionCausada);
	    }
	    
	}

	@Override
	public void defender(Personaje enemigo) {
	    int ataqueEnemigo = enemigo.getNivel();
	    int defensaJugador = this.getDefensa();
	    int saludActualJugador = this.getSalud();

	    if (ataqueEnemigo > defensaJugador) {
	        if (ataqueEnemigo >= saludActualJugador) {
	            this.setSalud(0);
	        } else {
	            this.setSalud(saludActualJugador - (ataqueEnemigo - defensaJugador));
	        }
	    }
	}
	
}
