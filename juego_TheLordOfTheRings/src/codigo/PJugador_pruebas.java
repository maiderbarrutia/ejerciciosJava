package codigo;

public class PJugador_pruebas extends Personaje implements Guerrero {
	private int edad;
	private int ataque;
	private int defensa;
	
	public PJugador_pruebas(String nombre, int salud, int nivel, int edad, int ataque, int defensa) {
		super(nombre, salud, nivel);
		this.setEdad(edad);
		this.setAtaque(ataque);
		this.setDefensa(defensa);
	}
	
	public PJugador_pruebas(String nombre, int salud, int nivel, int ataque, int defensa) {
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
	
	//MODO 1: Con estructuras de control if-else
	/*Opcion 1: ELEGIDO*/
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
	
	/*Opcion 2: */
	/*
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
	    int lesionRecibida = enemigo.getNivel() - this.getDefensa();
	    int saludActualJugador = this.getSalud();

	   
        if (lesionRecibida >= saludActualJugador) {
            this.setSalud(0);
        } else {
            this.setSalud(saludActualJugador - lesionRecibida);
        }
	   
	}
	*/
	
	/*Opcion 3: */
	/*
	 @Override
	public void atacar(Personaje atacado) {
	    int lesion = this.getAtaque() * this.getNivel();
	    int saludActual = atacado.getSalud();
	    int nuevaSalud;
	    if (lesion >= saludActual) {
	        nuevaSalud = 0;
	    } else {
	        nuevaSalud = saludActual - lesion;
	    }
	    atacado.setSalud(nuevaSalud);
	}
	
	@Override
	public void defender(Personaje atacante) {
	    int lesion = atacante.getNivel() - this.getDefensa();
	    int saludActual = this.getSalud();
	    int nuevaSalud;
	    if (lesion <= 0) {
	        nuevaSalud = saludActual;
	    } else if (lesion >= saludActual) {
	        nuevaSalud = 0;
	    } else {
	        nuevaSalud = saludActual - lesion;
	    }
	    this.setSalud(nuevaSalud);
	}

	 */
	
	
	/*Opcion 4: */
	/*
 	@Override
	public void atacar(Personaje atacado) {
        int lesion = this.getAtaque() * this.getNivel();
        if (lesion >= atacado.getSalud()) {
        	atacado.setSalud(0);
        } else {
        	int saludRestante = atacado.getSalud() - lesion;
            atacado.setSalud(saludRestante);
        }
    }

	@Override
	public void defender(Personaje atacante) {
        int lesion = atacante.getNivel() - this.getDefensa();
        if (lesion > 0) {
            if (lesion >= this.getSalud()) {
                this.setSalud(0);
            } else {
            	int saludRestante = this.getSalud() - lesion;
                this.setSalud(saludRestante);
            }
        }
    }
    */
	
	/*Opcion 5: */
	/*
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
	*/
	
	//MODO 2: Usando operadores aritméticos
	/*Opcion 1: */
	/*
	@Override
	public void atacar(Personaje atacado) {
	    int lesion = this.getAtaque() * this.getNivel();
	    int saludRestante = atacado.getSalud() - lesion;
	    atacado.setSalud(Math.max(0, saludRestante));
	}
	
	@Override
	public void defender(Personaje atacante) {
	    int lesion = atacante.getNivel() - this.getDefensa();
	    int saludRestante = this.getSalud() - lesion;
	    this.setSalud(Math.max(0, saludRestante));
	}
	*/
	
	/*Opcion 2: */
	/*@Override
	public void atacar(Personaje atacado) {
	    int lesion = this.getAtaque() * this.getNivel();
	    int lesionReal = Math.min(lesion, atacado.getSalud());
	    atacado.setSalud(Math.max(0, atacado.getSalud() - lesionReal));
	}

	@Override
	public void defender(Personaje atacante) {
	    int lesion = Math.max(0, atacante.getNivel() - this.getDefensa());
	    int lesionReal = Math.min(lesion, this.getSalud());
	    this.setSalud(Math.max(0, this.getSalud() - lesionReal));
	}
	 */
	
	//MODO 3: Operador ternario
	/*Opcion 1: */
	/*
	@Override
	public void atacar(Personaje atacado) {
	    int lesion = this.getAtaque() * this.getNivel();
	    atacado.setSalud(lesion >= atacado.getSalud() ? 0 : atacado.getSalud() - lesion);
	}

	@Override
	public void defender(Personaje atacante) {
	    int lesion = atacante.getNivel() - this.getDefensa();
	    this.setSalud(lesion <= 0 ? this.getSalud() : lesion >= this.getSalud() ? 0 : this.getSalud() - lesion);
	}
	 */
	
	/*Opcion 2: */
	/*
	@Override
	public void atacar(Personaje atacado) {
	    int lesion = this.getAtaque() * this.getNivel();
	    int saludActual = atacado.getSalud();
	    int nuevaSalud = lesion >= saludActual ? 0 : saludActual - lesion;
	    atacado.setSalud(nuevaSalud);
	}


	@Override
	public void defender(Personaje atacante) {
	    int lesion = atacante.getNivel() - this.getDefensa();
	    int saludActual = this.getSalud();
	    int nuevaSalud = lesion <= 0 ? saludActual : lesion >= saludActual ? 0 : saludActual - lesion;
	    this.setSalud(nuevaSalud);
	}
	*/
	
	/*Opción 3: ELEGIDO */
	/*
	@Override
	public void atacar(Personaje enemigo) {
	    int lesionCausada = this.getAtaque() * this.getNivel();
	    int saludActualEnemigo = enemigo.getSalud();
	    
	    enemigo.setSalud(lesionCausada >= saludActualEnemigo ? 0 : saludActualEnemigo - lesionCausada);
	}
	
	@Override
	public void defender(Personaje enemigo) {
	    int lesionRecibida = enemigo.getNivel() - this.getDefensa();
	    int saludActualJugador = this.getSalud();
	
	    this.setSalud(lesionRecibida >= saludActualJugador ? 0 : saludActualJugador - lesionRecibida);
	}
	*/
	
	
	
	
	
	
}