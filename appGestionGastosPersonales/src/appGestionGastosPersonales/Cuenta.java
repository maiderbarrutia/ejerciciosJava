package appGestionGastosPersonales;
import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	private double saldo;
	private Usuario usuario;
	private List<Gasto> gastos;
	private List<Ingreso> ingresos;
	
	public Cuenta(Usuario usuario) {
		this.usuario = usuario;
        this.saldo = 0.0;
        this.gastos = new ArrayList<>();
        this.ingresos = new ArrayList<>();
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	// Método para añadir un ingreso
	public void addIngresos(String description, double cantidad) {
//        Gasto nuevoIngreso = new Gasto(cantidad, description);
//        gastos.add(nuevoIngreso);
		ingresos.add(new Ingreso(cantidad, description));
        saldo += cantidad;
    }

	// Método para añadir un gasto
	public void addGastos(String description, double cantidad) {
//        Gasto nuevoGasto = new Gasto(cantidad, description);
//        gastos.add(nuevoGasto);
		try {
            if (saldo < cantidad) {
                throw new GastoException(); // Lanza la excepción si el saldo es insuficiente
            }
            gastos.add(new Gasto(cantidad, description));
            saldo -= cantidad;
        } catch (GastoException e) {
            System.out.println(e.getMessage()); // Imprime el mensaje de la excepción
        }
    }

	public List<Gasto> getGastos() {
		return gastos;
	}

	public List<Ingreso> getIngresos() {
		return ingresos;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", usuario=" + usuario + ", gastos=" + gastos + ", ingresos=" + ingresos
				+ "]";
	}
	
}
