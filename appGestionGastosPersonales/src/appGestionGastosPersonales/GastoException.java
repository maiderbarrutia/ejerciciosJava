package appGestionGastosPersonales;

public class GastoException extends Exception {

	GastoException(){
		super("Saldo insuficiente para realizar el gasto");
	}
}
