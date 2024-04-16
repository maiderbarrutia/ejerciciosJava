package ej02_calculadora_profe;

public class Calculadora {
	private int numOperaciones;

	public Calculadora() {
		
	}

	public Calculadora(int numOperaciones) {
		this.numOperaciones = numOperaciones;
	}

	public int getNumOperaciones() {
		return numOperaciones;
	}

	public void setNumOperaciones(int numOperaciones) {
		this.numOperaciones = numOperaciones;
	}
	
	private void incrementar() {
		this.setNumOperaciones(this.getNumOperaciones()+1);
	}
	
	public void operacion(int op1, int op2) {
		System.out.println("La multiplicación " + op1 + " x " + op2 + " es " + (op1 * op2));
		this.incrementar();
	}
	
	public void operacion(int op1, int op2, String sumaOresta) {
		switch(sumaOresta) {
		case "sumar":
			System.out.println("La suma " + op1 + " + " + op2 + " es " + (op1 + op2));
			this.incrementar();
			break;
			
		case "restar":
			System.out.println("La resta " + op1 + " - " + op2 + " es " + (op1 - op2));
			this.incrementar();
			break;
		default:
			System.out.println("Esta operación no es válida");
			break;
		}
	}
	
}
