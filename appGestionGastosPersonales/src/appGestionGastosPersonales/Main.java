package appGestionGastosPersonales;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Paso 1: Creación del usuario y sus datos
        System.out.println("Introduzca los datos del usuario:");
        Usuario usuario = crearUsuario(scanner);

        // Paso 2: Creación de la cuenta
        Cuenta cuenta = new Cuenta(usuario);

        // Paso 3: Visualización del menú
        mostrarMenu();

        // Paso 4: Procesar acciones
        boolean salir = false;
        while (!salir) {
            System.out.print("Seleccione una opción (1 para ingresar, 2 para gastar, 3 para salir): ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    ingresar(scanner, cuenta);
                    break;
                case 2:
                    gastar(scanner, cuenta);
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        
        

        // Paso 6: Finalización de la aplicación
        System.out.println("Fin del programa.");
        System.out.println("Gracias por utilizar la aplicación de M03B en el curso 1s2324.");

        // Cerrar el scanner
        scanner.close();

	}
	
	// Método para crear un usuario
	private static Usuario crearUsuario(Scanner scanner) {
        Usuario usuario = new Usuario();

        System.out.print("Nombre: ");
        usuario.setNombre(scanner.nextLine());

        System.out.print("Edad: ");
        usuario.setEdad(scanner.nextInt());
        scanner.nextLine(); // Limpiar el buffer

        // Paso 1c: DNI (hasta que se introduzca uno correcto)
        boolean dniCorrecto = false;
        while (!dniCorrecto) {
            System.out.print("DNI: ");
            String dni = scanner.nextLine();
            if (validarDNI(dni)) {
                usuario.setDNI(dni);
                dniCorrecto = true;
            } else {
                System.out.println("DNI incorrecto. Intente de nuevo.");
            }
        }

        return usuario;
    }
    
    // Método para validar el formato del DNI
	private static boolean validarDNI(String dni) {
        // Expresión regular para validar el formato del DNI
        String regex = "^\\d{8}[-]?[a-zA-Z]$";
        return dni.matches(regex);
    }
    
    // Método para mostrar el menú
    private static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1. Ingresar");
        System.out.println("2. Gastar");
        System.out.println("3. Salir");
    }
    
    // Método para procesar la acción de ingreso
    private static void ingresar(Scanner scanner, Cuenta cuenta) {
        System.out.print("Cantidad a ingresar: ");
        double cantidad = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        cuenta.addIngresos("Ingreso", cantidad);
        System.out.println("Ingreso registrado correctamente.");
    }
    
    // Método para procesar la acción de gasto
    private static void gastar(Scanner scanner, Cuenta cuenta) {
        System.out.print("Cantidad a gastar: ");
        double cantidad = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer
        
        cuenta.addGastos("Gasto", cantidad);
        System.out.println("Gasto registrado correctamente.");
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }

}
