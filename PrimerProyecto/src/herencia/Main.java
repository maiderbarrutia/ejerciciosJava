package herencia;

public class Main {

	public static void main(String[] args) {
		
		
	
Consultor consul = new Consultor();
		
		consul.getNum_consultor();
		consul.getNombre();
		
		Empleado emple = new Empleado();
		Empleado emple2 = new Empleado("Maquetadora", 1500.50);
		System.out.print("Sueldo: " + emple2.getSueldo());
		Empleado emple3= new Empleado(10, "7893456812", "Maider", "Barrutia", "Torrijos", "645792134", "Maquetadora", 1500.50);
		System.out.print("\n DNI: " + emple3.getDni());
		
		//POLIMORFISMO
		Persona vector[] = new Persona [5];
		vector[0] = new Persona();
		vector[1] = new Empleado();
		vector[2] = new Consultor();
		
		Persona pers = new Persona();
		Consultor cons =  new Consultor();
		pers = cons;
	}

}
