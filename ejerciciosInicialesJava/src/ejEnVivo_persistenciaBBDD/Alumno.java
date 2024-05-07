package ejEnVivo_persistenciaBBDD;

import java.io.Serializable;

public class Alumno implements Serializable { //Indica que esa clase viene mapeada de una base de datos
	private Long id_alumno;
	private String name;
	
	public Alumno(Long id_alumno, String name) {
		this.setId_alumno(id_alumno);
		this.setName(name);
	}
	
	public Alumno(String name) {
		this.setName(name);
	}
	
	public Long getId_alumno() {
		return id_alumno;
	}
	
	public void setId_alumno(Long id_alumno) {
		this.id_alumno = id_alumno;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Alumno [id_alumno=" + id_alumno + ", name=" + name + "]";
	}
}
