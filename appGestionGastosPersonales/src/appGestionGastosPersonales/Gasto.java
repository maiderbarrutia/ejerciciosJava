package appGestionGastosPersonales;


public class Gasto extends Dinero {
	
	public Gasto(double gasto, String descripcion) {
		System.out.println("Se ha realizado un " + descripcion + " de " + gasto + "€");
	
	}

	//ESTÁ MAL EL TOSTRING
    @Override
    public String toString() {
        return "Gasto: " + getDinero();
        
    }	
	
}
