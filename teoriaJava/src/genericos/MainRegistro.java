package genericos;

public class MainRegistro {

	public static void main(String[] args) {
		// Crear un registro de tipo String e Integer
		Registro<String, Integer> registro1 = new Registro<>("Juan", 30);
        Registro<String, Integer> registro2 = new Registro<>("María", 25);

        // Obtener y mostrar los valores del registro
        System.out.println("Primero: " + registro1.getPrimero() + ", Segundo: " + registro1.getSegundo());

        // Cambiar los valores del registro
        registro1.setPrimero("Aitor");
        registro1.setSegundo(20);

        // Obtener y mostrar los nuevos valores del registro
        System.out.println("Después de cambiar los valores: Primero: " + registro1.getPrimero() + ", Segundo: " + registro1.getSegundo());
        
     // Comparar los registros
        if (registro1.compararRegistros(registro2)) {
            System.out.println("Los registros son iguales.");
        } else {
            System.out.println("Los registros son diferentes.");
        }

	}

}
