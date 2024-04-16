package appGestionGastosPersonales;

public class Ingreso extends Dinero {
	
	public Ingreso(double ingreso, String descripcion) {
        System.out.println("Se ha realizado un " + descripcion + " de " + ingreso + "€");
    }

	
	//ESTÁ MAL EL TOSTRING
    @Override
    public String toString() {
//        return "Ingreso: " + getDinero();
    	return " " + getDinero();
    }
	
	
	
}
