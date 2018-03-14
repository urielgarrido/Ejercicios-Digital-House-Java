package ejer3;

public abstract class Criatura {
    private Integer nivelDeAtaque;

    public Criatura(Integer nivelDeAtaque) {
        this.nivelDeAtaque = nivelDeAtaque;
    }

    public Integer getNivelDeAtaque() {
        return nivelDeAtaque;
    }

    public void setNivelDeAtaque(Integer nivelDeAtaque) {
        this.nivelDeAtaque = nivelDeAtaque;
    }

}
