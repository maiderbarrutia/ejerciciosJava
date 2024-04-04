package appGestionGastosPersonales;

public class Usuario {
	private String nombre;
	private int edad;
	private String DNI;
	
	public Usuario() {
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDNI() {
		return DNI;
	}
	public boolean setDNI(String DNI) {
        String regex = "^\\d{8}-?[a-z]?$";
        
        if (DNI.matches(regex)) {
            this.DNI = DNI;
            return true;
        } else {
        	System.out.println("El DNI no tiene un formato válido.");
            return false; 
        }
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + "]";
	}
	
	
	
	
}
