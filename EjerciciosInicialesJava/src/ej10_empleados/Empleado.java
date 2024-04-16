package ej10_empleados;

public class Empleado {
    private static int contadorId = 1; // Variable estática para mantener el contador de IDs
    private int id; // ID del empleado
    private String nombre;
    private double sueldo;

    public Empleado() {
        this.id = contadorId++;
    }

    public Empleado(String nombre, double sueldo) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado buscarMayorSueldo(Empleado[] empleados) {
        Empleado empleadoMayorSueldo = empleados[0];
        for (int i = 1; i < empleados.length; i++) {
            if (empleados[i].getSueldo() > empleadoMayorSueldo.getSueldo()) {
                empleadoMayorSueldo = empleados[i];
            }
        }
        return empleadoMayorSueldo;
    }

    @Override
    public String toString() {
        return "Empleado " + id + ": [nombre = " + nombre + ", sueldo = " + sueldo + "]";
    }
}
