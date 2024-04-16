package comodinesPersona;

public class ComodinGenerico<T> {
	private T objeto;

    public ComodinGenerico(T objeto) {
        this.objeto = objeto;
    }

    public void mostrarTipo() {
        System.out.println("Tipo: " + objeto.getClass().getName());
    }
}
