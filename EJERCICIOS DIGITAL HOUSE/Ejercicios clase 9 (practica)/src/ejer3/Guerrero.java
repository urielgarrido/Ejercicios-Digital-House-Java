package ejer3;

public class Guerrero extends Heroe {
    private Integer nivelDeVida;

    public Guerrero(Integer nivelDeExperiencia, Integer nivelDeVida) {
        super(nivelDeExperiencia);
        this.nivelDeVida = nivelDeVida;
    }

    public Integer getNivelDeVida() {
        return nivelDeVida;
    }

    public void setNivelDeVida(Integer nivelDeVida) {
        this.nivelDeVida = nivelDeVida;
    }

    @Override
    public void luchar(Criatura unaCriatura) {
        if (unaCriatura.getNivelDeAtaque() < this.getNivelDeExperiencia()){
            this.setNivelDeExperiencia(this.getNivelDeExperiencia()+1);
            System.out.println("El Guerrero ganó");
        }else {
            this.setNivelDeVida(0);
            System.out.println("El Guerrero perdió y se quedó sin vida");
        }

        if (this.getNivelDeVida()==0){
            System.out.println("El guerrero no puede luchar y deberá esperar su resurrección");
        }
    }
}
