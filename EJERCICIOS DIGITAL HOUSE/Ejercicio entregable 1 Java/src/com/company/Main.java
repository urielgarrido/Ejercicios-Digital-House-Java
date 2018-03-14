package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();
        digitalHouseManager.altaProfesorAdjunto("Pepe", "Argento", 12345, 8);
        digitalHouseManager.altaProfesorAdjunto("Maria", "Grifo", 23456, 12);
        digitalHouseManager.altaProfesorTitular("Carlos", "Gardel", 90000, "Matematico");
        digitalHouseManager.altaProfesorTitular("Esteban","Quito",30303,"Carpintero");
        digitalHouseManager.altaCurso("Full Stack",20001,3);
        digitalHouseManager.altaCurso("Android",20002,2);
        digitalHouseManager.asignarProfesores(20002,90000,12345);
        digitalHouseManager.asignarProfesores(20001,30303,23456);
        digitalHouseManager.altaAlumno("Andres","Hetchar",71477);
        digitalHouseManager.altaAlumno("Nicolas","Ruiz",98754);
        digitalHouseManager.altaAlumno("Antonio","Rosas",23019);
        digitalHouseManager.inscribirAlumno(71477,20001);
        digitalHouseManager.inscribirAlumno(98754,20001);
        digitalHouseManager.inscribirAlumno(23019,20002);
        digitalHouseManager.inscribirAlumno(71477,20002);
        digitalHouseManager.inscribirAlumno(71477,20002);
        digitalHouseManager.inscribirAlumno(98754,20002);
        digitalHouseManager.inscribirAlumno(23019,20002);

    }
}
