package logica;

public class Pikachu extends Pokemon implements IElectrico {
	
	

	public Pikachu() {
		
	}

	@Override
	protected void atacarPlacaje() {
		System.out.println("Soy Pikachu y este es mi ataque placaje");
		
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Soy Pikachu y este es mi ataque arañazo");
		
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Soy Pikachu y este es mi ataque mordisco");
		
	}

	@Override
	public void atacarImpactrueno() {
		System.out.println("Soy Pikachu y este es mi ataque impacto de trueno");
		
	}

	@Override
	public void atacarPunioTrueno() {
		System.out.println("Soy Pikachu y este es mi ataque puño de trueno");
		
	}

}
