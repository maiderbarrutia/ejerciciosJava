package appGestionGastosPersonales;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Paso 1: Creación del usuario y sus datos
        System.out.println("Introduzca los datos del usuario:");
        Usuario usuario = crearUsuario(scanner);

        // Paso 2: Creación de la cuenta (
        Cuenta cuenta = new Cuenta(usuario);

        // Paso 3: Visualización del menú

        mostrarMenu();

        // Paso 4: Procesar acciones
        boolean salir = false;
        while (!salir) {
            System.out.print("Realiza una nueva acción:");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    gastar(scanner, cuenta);
                    break;
                case 2:
                    ingresar(scanner, cuenta);
                    break;
                case 3:
                    System.out.println(cuenta.getGastos());
                    break;
                case 4:
                	System.out.println(cuenta.getIngresos());
                    break;
                case 5:
                	System.out.println(cuenta.getSaldo());
                    break;
	            case 0:
	                salir = true;
	                break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        
        

        // Paso 6: Finalización de la aplicación
        System.out.println("Fin del programa.");
        System.out.println("Gracias por utilizar la aplicación de M03B en el curso 1s2324");
        // Cerrar el scanner
        scanner.close();

	}
	
	private static Usuario crearUsuario(Scanner scanner) {
        Usuario usuario = new Usuario();

        System.out.print("Nombre: ");
        usuario.setNombre(scanner.nextLine());

        System.out.print("Edad: ");
        usuario.setEdad(scanner.nextInt());
        scanner.nextLine(); // Limpiar el buffer

        // DNI (Dará falso hasta que se introduzca uno correcto)
        boolean dniCorrecto = false;
        while (!dniCorrecto) {
        	
            System.out.print("DNI: ");
            String dni = scanner.nextLine();
            
            if (usuario.setDNI(dni)) { // Llamada al método setDNI de la clase Usuario
                dniCorrecto = true;
            } 
        }

        return usuario;
    }

    
    // Método para mostrar el menú
    private static void mostrarMenu() {
        System.out.println("1 Introduce un nuevo gasto");
        System.out.println("2 Introduce un nuevo ingreso");
        System.out.println("3 Mostrar gastos");
        System.out.println("4 Mostrar ingresos");
        System.out.println("5 Mostrar saldo");
        System.out.println("0 Salir");
    }
    
    // Método para procesar la acción de ingreso
    private static void ingresar(Scanner scanner, Cuenta cuenta) {
        System.out.print("Cantidad a ingresar: ");
        double cantidad = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        cuenta.addIngresos("ingreso", cantidad);
    }
    
    // Método para procesar la acción de gasto
    private static void gastar(Scanner scanner, Cuenta cuenta) {
        System.out.print("Cantidad a gastar: ");
        double cantidad = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer
        
        cuenta.addGastos("gasto", cantidad);
        
    }

}
