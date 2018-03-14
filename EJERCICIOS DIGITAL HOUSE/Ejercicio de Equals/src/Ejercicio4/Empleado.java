package Ejercicio4;

public class Empleado {
    private String nombre;
    private Integer numeroDeLegajo;

    public Empleado(String nombre, Integer numeroDeLegajo) {
        this.nombre = nombre;
        this.numeroDeLegajo = numeroDeLegajo;
    }

    public Integer getNumeroDeLegajo() {
        return numeroDeLegajo;
    }

    @Override
    public boolean equals(Object obj) {
        Empleado unEmpleado = (Empleado)obj;
        if (numeroDeLegajo.equals(unEmpleado.getNumeroDeLegajo())){
            return true;
        }else {
            return false;
        }
    }
}
