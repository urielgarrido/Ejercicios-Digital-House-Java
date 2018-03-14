package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Empleado> empleados = new ArrayList<>();

        Empleado empleado1 = new Empleado("Uriel",1);
        Empleado empleado2 = new Empleado("Maxi", 2);
        Empleado empleado3 = new Empleado("Leonel", 3);
        Empleado empleado4 = new Empleado("Vero",4);

        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);

        Empleado empleado5 = new Empleado("Agus",2);

        System.out.println(empleados.contains(empleado5));
    }
}
