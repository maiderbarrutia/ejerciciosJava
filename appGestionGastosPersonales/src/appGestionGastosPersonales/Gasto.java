package appGestionGastosPersonales;

public class Gasto extends Dinero {

//	public Gasto(double gasto, String description) {
//        System.out.println("Se ha registrado un gasto de " + gasto + " con la descripción: " + description);
//    }
//
//    
////    @Override
////    public String toString() {
////        return "Gasto";
////    }
//	
//	@Override
//	public String toString() {
//		return "Gasto [getDinero()=" + getDinero() + ", getDescription()=" + getDescription() + ", getClass()="
//				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//	}
	
	public Gasto(double gasto, String descripcion) {
        System.out.println("Se ha registrado un gasto de " + gasto + " con la descripción: " + descripcion);
    }

    @Override
    public String toString() {
        return "Gasto: " + super.toString();
    }
	
	
	
	
	
}
