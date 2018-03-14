package Ejercicio3;

public class Alumno {
    private String nombre;
    private Integer numeroDeAlumno;

    public Alumno(String nombre, Integer numeroDeAlumno) {
        this.nombre = nombre;
        this.numeroDeAlumno = numeroDeAlumno;
    }

    public Integer getNumeroDeAlumno() {
        return numeroDeAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        Alumno unAlumno = (Alumno)obj;

        if (numeroDeAlumno.equals(unAlumno.getNumeroDeAlumno())){
            return true;
        }else {
            return false;
        }
    }
}
