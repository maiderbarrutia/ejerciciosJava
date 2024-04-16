package herencia;

public class Jefe extends Persona {
	private int id_jefe;
	private String departamento_jefe;
	
	public Jefe() {
		super();
	}
	public Jefe(int id, String dni, String nombre, String apellido, String direccion, String telefono) {
		super(id, dni, nombre, apellido, direccion, telefono);
		// TODO Auto-generated constructor stub
	}
	public int getId_jefe() {
		return id_jefe;
	}
	public void setId_jefe(int id_jefe) {
		this.id_jefe = id_jefe;
	}
	public String getDepartamento_jefe() {
		return departamento_jefe;
	}
	public void setDepartamento_jefe(String departamento_jefe) {
		this.departamento_jefe = departamento_jefe;
	}
	
	
	

}
