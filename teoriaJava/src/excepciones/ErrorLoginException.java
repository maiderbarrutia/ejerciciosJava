package excepciones;

//Modo 1: Excepciones con mensajes estáticos
//public class ErrorLoginException extends Exception {
//
//	public ErrorLoginException() {
//        super("Error en el proceso de login");
//    }
//
//    public ErrorLoginException(String mensaje) {
//        super(mensaje);
//    }
//}

//Modo 2: Más flexible en la gestión de mensajes
class ErrorLoginException extends Exception {
	String sms;
	public ErrorLoginException (){
		this.sms = "El usuario o contraseña no son válidos";
	}
	
	public ErrorLoginException (String sms){
		this.sms = sms;
	}
	
	@Override
	public String getMessage (){
		return sms;
	}
}