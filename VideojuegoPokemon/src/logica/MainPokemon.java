package logica;

public class MainPokemon {

	public static void main(String[] args) {
		Squirtle squirtle = new Squirtle();
		Charmander charmander = new Charmander();
		Bulbasaur bulbasaur = new Bulbasaur();
		Pikachu pikachu = new Pikachu();
		
		squirtle.atacarAraniazo();
		squirtle.atacarHidrobomba();
		charmander.atacarAraniazo();
		charmander.atacarLanzallamas();
		bulbasaur.atacarAraniazo();
		bulbasaur.atacarDrenaje();
		pikachu.atacarAraniazo();
		pikachu.atacarPunioTrueno();

	}

}
