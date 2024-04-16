package ejEnVivo_FiguraGeometrica;

public class Cuadrado extends FiguraGeometrica {
    private double lado;

    // Constructor
    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    // Método para calcular el área del cuadrado
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}