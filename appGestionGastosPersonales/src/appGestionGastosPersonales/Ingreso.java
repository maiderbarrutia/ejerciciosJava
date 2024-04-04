package appGestionGastosPersonales;

public class Ingreso extends Dinero {

//	public Ingreso(double ingreso, String description) {
//        System.out.println("Se ha registrado un ingreso de " + ingreso + " con la descripción: " + description);
//    }
//
//	@Override
//	public String toString() {
//		return "Ingreso [getDinero()=" + getDinero() + ", getDescription()=" + getDescription() + ", getClass()="
//				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//	}

	
	
//  @Override
//  public String toString() {
//      return "Ingreso";
//  }
	
	
	public Ingreso(double ingreso, String descripcion) {
        System.out.println("Se ha registrado un ingreso de " + ingreso + " con la descripción: " + descripcion);
    }

    @Override
    public String toString() {
        return "Ingreso: " + super.toString();
    }
	
	
	
}
