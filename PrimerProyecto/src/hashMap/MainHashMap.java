package hashMap;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {

	public static void main(String[] args) {
		//1- DECLARAR UN MAPA
		Map<Integer,String> mapaEmpleados = new HashMap<>();
		
		//2- AÑADIR ELEMENTOS AL MAPA
		mapaEmpleados.put(1523, "Maider"); // key: 1523 y value: "Maider"
		mapaEmpleados.put(1657, "Pepe");
		mapaEmpleados.put(1524, "Aritz");
		
		//3- BUSCAR UN OBJETO QUE TENGA UN VALOR
		boolean estaElValor = mapaEmpleados.containsValue("Maider8");
		
		//Mirar si está el valor
		if(estaElValor == true) {
			System.out.println("El valor buscado SÍ está");
		}
		else {
			System.out.println("El valor buscado NO está");
		}
		
		//4- BUSCAR UN OBJETO QUE TENGA UNA CLAVE
		boolean estaLaClave = mapaEmpleados.containsKey(1523);
		
		//Mirar si está la clave
		if(estaLaClave == true) {
			System.out.println("La clave buscada SÍ está");
		}
		else {
			System.out.println("La clave buscada NO está");
		}
		
		//5- MOSTRAR LOS VALORES EN UN ARRAY
		System.out.println(mapaEmpleados.values());
		
		//6- MOSTRAR LAS CLAVES EN UN ARRAY
		System.out.println(mapaEmpleados.keySet());
		
		//7- OBTENER EL VALOR ASOCIADO A UNA CLAVE
		String nombre = mapaEmpleados.get(1545);

		//Hacer una busqueda de los empleados mediante la clave, en caso de que no exista salta un mensaje
		if(nombre != null) {
			System.out.println("El empleado buscado es: " + nombre);
		}
		else {
			System.out.println("El empleado buscado no existe");
		}
		
		//8- ELIMINAR UN VALOR DEL MAPA MEDIANTE LA CLAVE
		mapaEmpleados.remove(1657);
		
		//9- OBTENER TODA LA LISTA DE MAP
		for (Map.Entry<Integer, String> mapaEmpleadosCompleta : mapaEmpleados.entrySet()) {
		    System.out.println("Clave = " + mapaEmpleadosCompleta.getKey() + ", Valor = " + mapaEmpleadosCompleta.getValue());
		}
	}

}
