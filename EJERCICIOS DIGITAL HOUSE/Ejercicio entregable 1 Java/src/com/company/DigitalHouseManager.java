package com.company;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Alumno>listaDeAlumnos;
    private List<Curso>listaDeCursos;
    private List<Profesor>listaDeProfesores;
    private List<Inscripcion>listaDeInscripciones;

    public DigitalHouseManager() {
        listaDeAlumnos = new ArrayList<>();
        listaDeCursos = new ArrayList<>();
        listaDeProfesores = new ArrayList<>();
        listaDeInscripciones = new ArrayList<>();
    }

    public List<Alumno> getListaDeAlumnos() {
        return listaDeAlumnos;
    }

    public List<Curso> getListaDeCursos() {
        return listaDeCursos;
    }

    public List<Profesor> getListaDeProfesores() {
        return listaDeProfesores;
    }

    public List<Inscripcion> getListaDeInscripciones() {
        return listaDeInscripciones;
    }

    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos){
        Curso curso =new Curso(nombre,codigoCurso,cupoMaximoDealumnos);
        listaDeCursos.add(curso);
    }

    public void bajaCurso(Integer codigoCurso){
        for (Curso unCurso:listaDeCursos) {
            if (unCurso.getCodigoDeCurso().equals(codigoCurso)){
                listaDeCursos.remove(unCurso);
                break;
            }
        }
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras){
        ProfesorAdjunto profesorAdjunto=new ProfesorAdjunto(nombre,apellido,0,codigoProfesor,cantidadDeHoras);
        listaDeProfesores.add(profesorAdjunto);
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad){
        ProfesorTitular profesorTitular=new ProfesorTitular(nombre,apellido,0,codigoProfesor,especialidad);
        listaDeProfesores.add(profesorTitular);
    }

    public void bajaProfesor(Integer codigoProfesor){
        for (Profesor unProfesor:listaDeProfesores) {
            if (unProfesor.getCodigoDeProfesor().equals(codigoProfesor)){
                listaDeProfesores.remove(unProfesor);
                break;
            }
        }
    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno){
        Alumno alumno =new Alumno(nombre,apellido,codigoAlumno);
        listaDeAlumnos.add(alumno);
    }

    private Curso buscarCurso(Integer codigoDeCurso) {
        Curso cursoEncontrado = null;
        try {
            for (Curso unCurso : listaDeCursos) {
                if (unCurso.getCodigoDeCurso().equals(codigoDeCurso)) {
                    cursoEncontrado = unCurso;
                    break;
                }
            }
        } catch (Exception e){
            System.out.println("El curso no está disponible");
            e.printStackTrace();
        }
        return cursoEncontrado;
    }
    private Alumno buscarAlumno(Integer codigoAlumno){
        Alumno alumnoEncontrado=null;
        try {
            for (Alumno unAlumno:listaDeAlumnos) {
                if (unAlumno.getCodigoDeAlumno().equals(codigoAlumno)){
                    alumnoEncontrado=unAlumno;
                    break;
                }
            }
        }catch (Exception e){
            System.out.println("El alumno no está inscripto");
            e.printStackTrace();
        }
        return alumnoEncontrado;
    }

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso){
        Curso curso=buscarCurso(codigoCurso);
        Alumno alumno=buscarAlumno(codigoAlumno);
        if (curso.agregarUnAlumno(alumno)) {
            Inscripcion inscripcion = new Inscripcion(alumno, curso, "12/03/2018");
            listaDeInscripciones.add(inscripcion);
            System.out.println("La inscripcion del alumno: "+alumno.getNombre()+" "+alumno.getApellido()+" "+"fue hecha con éxito");
        }else System.out.println("No se pudo inscribir el alumno: "+alumno.getNombre()+" "+alumno.getApellido());

    }

    private ProfesorTitular buscarProfesorTitular(Integer codigoProfesorTitular){
        ProfesorTitular profesorTitular=null;
        try {
            for (Profesor unProfesorTitular:listaDeProfesores) {
                if (unProfesorTitular.getCodigoDeProfesor().equals(codigoProfesorTitular)){
                    profesorTitular=(ProfesorTitular) unProfesorTitular;
                    break;
                }
            }
        }catch (Exception e){
            System.out.println("El profesor titular no se encuentra disponible");
            e.printStackTrace();
        }
        return profesorTitular;
    }

    private ProfesorAdjunto buscarProfesorAdjunto(Integer codigoProfesorAdjunto){
        ProfesorAdjunto profesorAdjunto=null;
        try {
            for (Profesor unProfesorAdjunto:listaDeProfesores) {
                if (unProfesorAdjunto.getCodigoDeProfesor().equals(codigoProfesorAdjunto)){
                    profesorAdjunto=(ProfesorAdjunto)unProfesorAdjunto;
                    break;
                }
            }
        }catch (Exception e){
            System.out.println("El profesor adjunto no se encuentra disponible");
            e.printStackTrace();
        }
        return profesorAdjunto;
    }

    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto){
        ProfesorAdjunto profesorAdjuntoACargo=buscarProfesorAdjunto(codigoProfesorAdjunto);
        ProfesorTitular profesorTitularACargo=buscarProfesorTitular(codigoProfesorTitular);
        Curso curso=buscarCurso(codigoCurso);
        curso.setProfesorAdjunto(profesorAdjuntoACargo);
        curso.setProfesorTitular(profesorTitularACargo);
    }

}
