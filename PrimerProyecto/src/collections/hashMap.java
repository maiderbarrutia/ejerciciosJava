package collections;

import java.util.HashMap;
import java.util.Map;

public class hashMap {

	public static void main(String[] args) {
		//DECLARAR UN MAPA
        Map<Integer, String> mapaEmpleados = new HashMap<>();
        
        //MÉTODOS

        // put(): Añade un nuevo par (KEY,VALUE) si ya existe un valor para KEY sobreescribe VALUE
        mapaEmpleados.put(1523, "Maider"); // key: 1523 y value: "Maider"
        mapaEmpleados.put(1657, "Pepe");
        mapaEmpleados.put(1524, "Aritz");

        // containsValue(): Busca un objeto que tenga un valor x
        boolean estaElValor = mapaEmpleados.containsValue("Maider8");
        
        if (estaElValor) {
            System.out.println("El valor buscado SÍ está");
        } else {
            System.out.println("El valor buscado NO está");
        }

        //constainsKey(): Busca un objeto que tenga una clave x
        boolean estaLaClave = mapaEmpleados.containsKey(1523);

        if (estaLaClave) {
            System.out.println("La clave buscada SÍ está");
        } else {
            System.out.println("La clave buscada NO está");
        }

        //values(): Muestra los valores
        System.out.println("Valores en el mapa: " + mapaEmpleados.values());

        //keySet(): Muestra las claves
        System.out.println("Claves en el mapa: " + mapaEmpleados.keySet());

        //get(): Obtiene el valor asociado a una clave dada
        String nombre = mapaEmpleados.get(1545);

        if (nombre != null) {
            System.out.println("El empleado buscado es: " + nombre);
        } else {
            System.out.println("El empleado buscado no existe");
        }

        //remove(): Elimina un valor del mapa mediante la clave
        mapaEmpleados.remove(1657);
        
        //entrySet(): Muestra la lista de empleados
        for (Map.Entry<Integer, String> entradaMapa : mapaEmpleados.entrySet()) {
            System.out.println("Clave = " + entradaMapa.getKey() + ", Valor = " + entradaMapa.getValue());
        }
	}

}
