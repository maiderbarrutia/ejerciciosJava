package ejEnVivo_FiguraGeometrica;

public class FiguraGeometrica {
    private String color;
    private double area;

    // Constructor
    public FiguraGeometrica(String color) {
        this.color = color;
        this.area = 0;
    }

    // Getters y setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    // Método para calcular el área
    public double calcularArea() {
        return 0;
    }
}
