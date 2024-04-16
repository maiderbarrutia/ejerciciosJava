package ejEnVivo_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VerificadorEmail verificador = new VerificadorEmail();
        
        	//METER EL EMAIL
	        //Opción 1:
	//      String email = "correo@ejemplo.com";
	        
	        //Opción 2:
	        Scanner scanner = new Scanner(System.in);
	
	        System.out.print("Introduce tu dirección de correo electrónico: ");
	        String email = scanner.nextLine();
        
        
        try {
            // Verificar la validez del correo electrónico
            verificador.verificarEmail(email);
            System.out.println("La dirección de correo electrónico es válida");
        } catch (EmailNoValidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
