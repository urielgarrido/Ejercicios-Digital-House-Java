package Ejercicio1;

public class Persona {
   private String nombre;
    private Integer dni;

    public Persona(String nombre, Integer dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Integer getDni() {
        return dni;
    }

    @Override
    public boolean equals(Object obj) {
        Persona unaPersona = (Persona) obj;
        if (dni.equals(unaPersona.getDni())){
            return true;
        }else {return false;
        }
    }
}
