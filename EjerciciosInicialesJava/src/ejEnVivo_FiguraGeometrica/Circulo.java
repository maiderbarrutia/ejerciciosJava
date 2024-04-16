package ejEnVivo_FiguraGeometrica;

public class Circulo extends FiguraGeometrica {
    private double radio;

    // Constructor
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    // Método para calcular el área del círculo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
