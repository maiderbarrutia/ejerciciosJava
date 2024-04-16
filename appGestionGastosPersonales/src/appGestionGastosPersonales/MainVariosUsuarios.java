package appGestionGastosPersonales;


import java.util.Scanner;

public class MainVariosUsuarios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Usuario usuario = crearUsuario(scanner);
            Cuenta cuenta = new Cuenta(usuario);
            procesarAcciones(scanner, cuenta);

            System.out.println("¿Desea agregar otro usuario? (S/N)");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("S")) {
                break;
            }
        }

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

    private static void procesarAcciones(Scanner scanner, Cuenta cuenta) {
        mostrarMenu();

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

        System.out.println("Fin de las acciones para " + cuenta.getUsuario().getNombre());
    }

    private static void mostrarMenu() {
        System.out.println("1 Introduce un nuevo gasto");
        System.out.println("2 Introduce un nuevo ingreso");
        System.out.println("3 Mostrar gastos");
        System.out.println("4 Mostrar ingresos");
        System.out.println("5 Mostrar saldo");
        System.out.println("0 Salir");
    }

    private static void ingresar(Scanner scanner, Cuenta cuenta) {
        System.out.print("Cantidad a ingresar: ");
        double cantidad = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        cuenta.addIngresos("Ingreso", cantidad);
    }

    private static void gastar(Scanner scanner, Cuenta cuenta) {
        System.out.print("Cantidad a gastar: ");
        double cantidad = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        cuenta.addGastos("Gasto", cantidad);
    }
}
