package ejEnVivo_FiguraGeometrica;

public class Main {

	public static void main(String[] args) {
		// Crear instancias de cada figura geométrica
        Cuadrado cuadrado = new Cuadrado("Azul", 5.0);
        Circulo circulo = new Circulo("Rojo", 3.0);
        Triangulo triangulo = new Triangulo("Verde", 4.0, 6.0);

        // Calcular y mostrar el área de cada figura
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());

	}

}
