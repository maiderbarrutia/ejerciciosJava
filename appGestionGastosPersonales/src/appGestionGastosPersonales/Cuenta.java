package appGestionGastosPersonales;
import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	private double saldo;
	private Usuario usuario;
	private List<Gasto> gastos;
	private List<Ingreso> ingresos;
	
	public Cuenta(Usuario usuario) {
        this.saldo = 0.0;
		this.usuario = usuario;
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
	    Ingreso nuevoIngreso = new Ingreso(cantidad, description); // Crear un objeto de tipo Ingreso
	    nuevoIngreso.setDinero(cantidad);
	    ingresos.add(nuevoIngreso); // Agregar el ingreso a la lista de ingresos
	    saldo += cantidad; // Actualizar el saldo agregando la cantidad del ingreso
	}


	// Método para añadir un gasto
	public void addGastos(String description, double cantidad) {
		Gasto nuevoGasto = new Gasto(cantidad, description);
	    nuevoGasto.setDinero(cantidad);
		try {
			
            if (saldo < cantidad) {
                throw new GastoException(); // Lanza la excepción si el saldo es insuficiente
            }
            
            gastos.add(nuevoGasto);
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
//	public String toString() {
//		return "Usuario: " + usuario + "\n   Saldo: " + saldo;
//	}
	public String toString() {
	    String resultCuenta = 
	    		"\nUsuario: " + usuario + "\n" +
	    		"\nSaldo: " + saldo + "\n" +
	            "\nGastos:\n";
				for (Dinero dinero : gastos) {
				    	resultCuenta += dinero + "\n";
				    }
	    
				resultCuenta += "\nIngresos:\n";
			    for (Dinero dinero : ingresos) {
			    	resultCuenta += dinero;
			    }
	    
	    return resultCuenta;
	}
	
}
