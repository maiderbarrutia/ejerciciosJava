package comodinesPersona;

public class ComodinSubtipo<T extends Number> {
	private T objeto;

    public ComodinSubtipo(T objeto) {
        this.objeto = objeto;
    }

    public void mostrarTipo() {
        System.out.println("Tipo: " + objeto.getClass().getName());
    }
}
