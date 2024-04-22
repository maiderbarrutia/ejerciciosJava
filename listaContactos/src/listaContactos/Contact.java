package listaContactos;

public class Contact {
	private static int nextId = 1;
	private int id;
	private String name;
	private String phone;
	

	public Contact(String name, String phone) {
		this.id = nextId++;
		this.name = name;
		this.phone = phone;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Id: " + id + ", Nombre: " + name + ", Teléfono: " + phone;
	}

}
