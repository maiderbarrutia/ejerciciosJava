package relacionesEntreClases;

import java.util.List;

public class Auto {
	private Long id;
	private String marca;
	private String modelo;
	
	
	//UN AUTO SOLO PUEDE TENER UN PROPIETARIO (1 A 1)
	/*
	private Propietario propietario;
	
	public Auto() {
		
	}

	public Auto(Long id, String marca, String modelo, Propietario propietario) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.propietario = propietario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
		
	}
	 */
	
	//UN AUTO PUEDE TENER TODOS LOS PROPIETARIOS QUE QUIERA ( 1 A N)
	private List<Propietario> listaPropietarios;
	
	public Auto() {
		
	}

	public Auto(Long id, String marca, String modelo, List<Propietario> listaPropietarios) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.listaPropietarios = listaPropietarios;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public List<Propietario> getListaPropietarios() {
		return listaPropietarios;
	}

	public void setListaPropietarios(List<Propietario> listaPropietarios) {
		this.listaPropietarios = listaPropietarios;
	}

	@Override
	public String toString() {
		return "Auto [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", listaPropietarios=" + listaPropietarios
				+ "]";
	}
	
	
	
	
	
}
