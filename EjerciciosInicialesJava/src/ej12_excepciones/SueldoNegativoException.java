package ej12_excepciones;

class SueldoNegativoException extends Exception {
    public SueldoNegativoException() {
        super("El sueldo del empleado no puede ser negativo");
    }
}
