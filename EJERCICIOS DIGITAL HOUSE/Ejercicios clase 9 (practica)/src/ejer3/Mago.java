package ejer3;

public class Mago extends Heroe {

    public Mago(Integer nivelDeExperiencia) {
        super(nivelDeExperiencia);
    }
    public void resucitarGuerrero(Guerrero unGuerrero){
        if (unGuerrero.getNivelDeExperiencia()<=this.getNivelDeExperiencia()){
            unGuerrero.setNivelDeVida(1);
            System.out.println("Reviviendo Guerrero");
        }
    }

    @Override
    public void luchar(Criatura unaCriatura) {
        if (unaCriatura.getNivelDeAtaque() < this.getNivelDeExperiencia()){
            this.setNivelDeExperiencia(this.getNivelDeExperiencia()+2);
            System.out.println("El Mago ganó");
        } else {
            this.setNivelDeExperiencia(getNivelDeExperiencia()-1);
            System.out.println("El Mago perdió");
        }
    }
}
