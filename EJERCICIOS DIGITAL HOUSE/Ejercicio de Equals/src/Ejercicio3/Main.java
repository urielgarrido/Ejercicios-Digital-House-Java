package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();

        Alumno alumno1 = new Alumno("Matias",1);
        Alumno alumno2 = new Alumno("Antonio",2);
        Alumno alumno3 = new Alumno("Uriel", 3);
        Alumno alumno4 = new Alumno("Pablo",4);

        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);

        Alumno alumno5 = new Alumno("Juan",3);

        System.out.println(alumnos.contains(alumno5));
    }
}
