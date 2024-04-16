package comodinesPersona;

public class ComodinSupertipo<T> {
	private T objeto;

    public ComodinSupertipo(T objeto) {
        this.objeto = objeto;
    }

    public void mostrarTipo() {
        System.out.println("Tipo: " + objeto.getClass().getName());
    }
}
