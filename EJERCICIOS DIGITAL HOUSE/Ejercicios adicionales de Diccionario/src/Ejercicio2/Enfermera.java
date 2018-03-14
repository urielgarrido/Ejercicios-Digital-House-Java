package Ejercicio2;

public class Enfermera {
    private String nombre;

    public Enfermera(String nombre) {
        this.nombre = nombre;
    }
    public void restaurarVidaDelGladiador(Gladiador unGladiador){
        if (unGladiador.getVida()<unGladiador.getVidaTotal()){
            unGladiador.setVida(unGladiador.getVidaTotal());
        }
    }
}
