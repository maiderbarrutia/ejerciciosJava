package clasesAbstractas;

public abstract class Figura {
	protected double x; //posición en x
	protected double y; //posición en y
	
	
	
	protected Figura() {}


	protected Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}



	public abstract double calcularArea();
}
