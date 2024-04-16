package comodinesPersona;

public class MainComodines {

	public static void main(String[] args) {
		// Ejemplo de comodín ?
        ComodinGenerico<?> ejemplo1 = new ComodinGenerico<>("Hola");
        ejemplo1.mostrarTipo(); // Output: Tipo: java.lang.String

        // Ejemplo de comodín ? extends Tipo
        ComodinSubtipo<? extends Number> ejemplo2 = new ComodinSubtipo<>(123);
        ejemplo2.mostrarTipo(); // Output: Tipo: java.lang.Integer

        // Ejemplo de comodín ? super Tipo
        ComodinSupertipo<? super Integer> ejemplo3 = new ComodinSupertipo<>(123);
        ejemplo3.mostrarTipo(); // Output: Tipo: java.lang.Object

	}

}
