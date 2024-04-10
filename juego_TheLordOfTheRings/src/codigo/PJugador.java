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
	public void atacar(Personaje atacado) {
        int lesion = this.getAtaque() * this.getNivel();
        if (lesion >= atacado.getSalud()) {
        	atacado.setSalud(0);
        } else {
        	atacado.setSalud(atacado.getSalud() - lesion);
        }
    }

	@Override
	public void defender(Personaje atacante) {
        int lesion = atacante.getNivel() - this.getDefensa();
        if (lesion > 0) {
            if (lesion >= this.getSalud()) {
                this.setSalud(0);
            } else {
                this.setSalud(this.getSalud() - lesion);
            }
        }
    }
	
	
	
	
}
