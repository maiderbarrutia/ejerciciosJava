package ej12_excepciones;

class NombreEmpleadoVacioException extends Exception {
    public NombreEmpleadoVacioException() {
        super("El nombre del empleado no puede estar vacío");
    }
}
