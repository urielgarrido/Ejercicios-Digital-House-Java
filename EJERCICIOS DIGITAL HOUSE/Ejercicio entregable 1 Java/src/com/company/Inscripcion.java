package com.company;

public class Inscripcion {
    private Alumno alumno;
    private Curso curso;
    private String fechaDeInscripcion;

    public Inscripcion(Alumno alumno, Curso curso, String fechaDeInscripcion) {
        this.alumno = alumno;
        this.curso = curso;
        this.fechaDeInscripcion = fechaDeInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Curso getCurso() {
        return curso;
    }

    public String getFechaDeInscripcion() {
        return fechaDeInscripcion;
    }
}
