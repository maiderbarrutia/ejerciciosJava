package genericos;

/*Un genérico es una característica que permite crear clases, interfaces y métodos que operan con tipos de datos de manera flexible 
 * y reutilizable. En lugar de definir un tipo específico para los datos que maneja una clase o método, 
 * se utiliza un parámetro de tipo (o varios) que representa un tipo de dato genérico.*/

public class Registro<T, U> {
    private T primero;
    private U segundo;

    public Registro(T primero, U segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public T getPrimero() {
        return primero;
    }

    public void setPrimero(T primero) {
        this.primero = primero;
    }

    public U getSegundo() {
        return segundo;
    }

    public void setSegundo(U segundo) {
        this.segundo = segundo;
    }
    
 // Método para comparar dos registros
    public boolean compararRegistros(Registro<T, U> otroRegistro) {
        return this.primero.equals(otroRegistro.getPrimero()) && this.segundo.equals(otroRegistro.getSegundo());
    }
    
    
    
    
}
