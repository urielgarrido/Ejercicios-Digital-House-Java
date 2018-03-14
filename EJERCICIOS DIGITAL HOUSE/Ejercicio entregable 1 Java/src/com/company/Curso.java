package com.company;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private Integer codigoDeCurso;
    private ProfesorAdjunto profesorAdjunto;
    private ProfesorTitular profesorTitular;
    private Integer cupoMaximoDeAlumnos;
    private List<Alumno>alumnosInscriptos;

    public Curso(String nombre, Integer codigoDeCurso,ProfesorAdjunto profesorAdjunto,ProfesorTitular profesorTitular,Integer cupoMaximoDeAlumnos) {
        this.nombre = nombre;
        this.codigoDeCurso = codigoDeCurso;
        this.profesorAdjunto=profesorAdjunto;
        this.profesorTitular=profesorTitular;
        this.cupoMaximoDeAlumnos=cupoMaximoDeAlumnos;
        alumnosInscriptos=new ArrayList<>();
    }

    public Curso(String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos) {
        this.nombre=nombre;
        this.codigoDeCurso=codigoCurso;
        this.cupoMaximoDeAlumnos=cupoMaximoDealumnos;
        alumnosInscriptos=new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProfesorAdjunto(ProfesorAdjunto profesorAdjunto) {
        this.profesorAdjunto = profesorAdjunto;
    }

    public void setProfesorTitular(ProfesorTitular profesorTitular) {
        this.profesorTitular = profesorTitular;
    }

    public ProfesorAdjunto getProfesorAdjunto() {
        return profesorAdjunto;
    }

    public ProfesorTitular getProfesorTitular() {
        return profesorTitular;
    }

    public Integer getCupoMaximoDeAlumnos() {
        return cupoMaximoDeAlumnos;
    }

    public List<Alumno> getAlumnosInscriptos() {
        return alumnosInscriptos;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCodigoDeCurso() {
        return codigoDeCurso;
    }

    @Override
    public boolean equals(Object obj) {
        Curso unCurso=(Curso)obj;
        if (unCurso.getCodigoDeCurso().equals(codigoDeCurso)){
            return true;
        }else return false;
    }

    public Boolean agregarUnAlumno(Alumno unAlumno){
        if (alumnosInscriptos.size()<cupoMaximoDeAlumnos){
            alumnosInscriptos.add(unAlumno);
            return true;
        }else return false;
    }

    public void eliminarAlumno(Alumno unAlumno){
        if (alumnosInscriptos.contains(unAlumno)) {
            alumnosInscriptos.remove(unAlumno);
        }
    }

}
