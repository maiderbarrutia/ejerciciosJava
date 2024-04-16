package ejEnVivo_exception;

public class VerificadorEmail {
    public void verificarEmail(String email) throws EmailNoValidoException {
        // Verificar si la dirección de correo electrónico es válida
        if (!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            throw new EmailNoValidoException();
        }
    }
}
