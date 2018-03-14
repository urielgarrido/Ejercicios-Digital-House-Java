package Ejercicio2;

public class Espectador {
    private String nombre;
    private Integer plata;

    public Espectador(String nombre, Integer plata) {
        this.nombre = nombre;
        this.plata = plata;
    }

    public Integer getPlata() {
        return plata;
    }

    public void setPlata(Integer plata) {
        this.plata = plata;
    }

    public String getNombre() {
        return nombre;
    }
}
