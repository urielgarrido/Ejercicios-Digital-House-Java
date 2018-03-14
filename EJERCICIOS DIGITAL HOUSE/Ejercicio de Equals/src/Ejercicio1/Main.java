package Ejercicio1;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Uriel",40675474);
        Persona persona2 = new Persona("Maxi",40675474);

        System.out.println(persona1.equals(persona2));
    }
}
