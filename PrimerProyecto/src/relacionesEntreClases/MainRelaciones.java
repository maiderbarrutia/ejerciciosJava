package relacionesEntreClases;

import java.util.ArrayList;
import java.util.List;

public class MainRelaciones {

	public static void main(String[] args) {
		
		//Mostrar la lista de propietarios de un auto
		
		//CREAR UN OBJETO AUTO VACÍO
		Auto aut = new Auto();
		
		//ASIGNAR O AÑADIR DATOS AL AUTO: LA ID, MARCA Y MODELO
		aut.setId(1L);
		aut.setMarca("Renault");
		aut.setModelo("Duster");
		
		//CREAR UNA LISTA DE PROPIETARIOS VACIA
		List<Propietario> listaPropietarios = new ArrayList<Propietario>();
		
		//CREAR LOS PROPIETARIOS
		Propietario prop1 = new Propietario();
		Propietario prop2 = new Propietario();
		
		//AÑADIR LOS DATOS A LOS PROPIETARIOS CREADOS
		prop1.setId(35L);
		prop1.setNombre("Maider");
		prop1.setApellido("Barrutia");
		
		prop2.setId(23L);
		prop2.setNombre("Aritz");
		prop2.setApellido("Salas");
		
		//AÑADIR A LA LISTA DE ARRAY LOS PROPIETARIOS CREADOS
		listaPropietarios.add(prop1);
		listaPropietarios.add(prop2);
		
		//ASIGNAR A MI AUTO LA LISTA DE PROPIETARIOS QUE DEBERIA TENER
		aut.setListaPropietarios(listaPropietarios);
		
		//MOSTRAR LOS PROPIETARIOS QUE TIENE EL AUTO
		System.out.println("El auto " + aut.getMarca() + " " + aut.getModelo() +
				" tiene como propietarios a: " + aut.getListaPropietarios().toString());

	}

}
