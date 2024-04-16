package ejEnVivo_FiguraGeometrica;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    // Constructor
    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área del triángulo
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
