package excepciones;
import excepciones.LoginService;

import java.util.Scanner;

public class MainExcepcionesCreadas {

	public static void main(String[] args) {
		
		//Modo 1:
//		LoginService loginService = new LoginService();
//        String nombreUsuario = "usuario";
//        String contraseña = "contraseña";
//
//        try {
//            loginService.login(nombreUsuario, contraseña);
//        } catch (ErrorLoginException e) {
//            System.out.println("¡Error de inicio de sesión: " + e.getMessage());
//            // Aquí podrías manejar la excepción de acuerdo a tus necesidades
//        }
		
		//Modo 2:
		//Inicializar las variables
		Scanner sc = new Scanner(System.in);
		String nombre ="";
		String passwd ="";
		boolean valido =true;
		
		try{
			//Pedir los datos para el loguin
			System.out.println ("Introduzca el usuario:");
			nombre = sc.nextLine();
			System.out.println ("Introduzca la contraseña:");
			passwd = sc.nextLine();
			//Lanzar el método loguin
			if(!LoginService.login(nombre, passwd)){
				valido =false;
				throw new ErrorLoginException ();
			}
		}catch(ErrorLoginException error){
		//Código que se ejecutará si el código del bloque try lanza una excepción
			System.out.println(error.getMessage());
		}finally{
			//Código que se va ejecutar siempre (aunque se entre en el catch)
			if(valido){
				System.out.println("Bienvenido "+ nombre);
			}else{
				System.out.println("Vuelva a reiniciar el programa para registrarse como usuario");
			}
		}

	}

}
