package excepciones;

public class LoginService {
	//Modo 1:
//	public boolean login(String user, String pass) throws ErrorLoginException {
//        // Lógica para validar el inicio de sesión
//        // Supongamos que aquí ocurre un error y lanzamos la excepción
//        throw new ErrorLoginException("Credenciales de inicio de sesión incorrectas");
//    }
	
	//Modo 2:
	static boolean login (String user, String pass){
		String usuario = "user";
		String clave = "pass";
		if(user.equals(usuario)&& pass.equals(clave)){
			return true;
		}else{
			return false;
		}
	}
}
