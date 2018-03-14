package ejer3;

public abstract class Heroe {
    private Integer nivelDeExperiencia;

    public Heroe(Integer nivelDeExperiencia) {
        this.nivelDeExperiencia = nivelDeExperiencia;
    }

    public Integer getNivelDeExperiencia() {
        return nivelDeExperiencia;
    }

    public void setNivelDeExperiencia(Integer nivelDeExperiencia) {
        this.nivelDeExperiencia = nivelDeExperiencia;
    }

    public abstract void luchar(Criatura unaCriatura);
}
