package ejEnVivo_exception;

public class EmailNoValidoException extends Exception {
    public EmailNoValidoException() {
        super("La dirección de correo electrónico no es válida");
    }
}
