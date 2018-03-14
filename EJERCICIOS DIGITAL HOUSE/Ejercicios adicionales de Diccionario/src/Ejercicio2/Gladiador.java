package Ejercicio2;

public class Gladiador {
    private String nombre;
    private Integer vida;
    private Integer ataque;
    private Integer defensa;
    private Integer vidaTotal;

    public Gladiador(String nombre, Integer vida, Integer ataque, Integer defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        vidaTotal=vida;
    }

    public Integer getVidaTotal() {
        return vidaTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Integer getDefensa() {
        return defensa;
    }

    public void setDefensa(Integer defensa) {
        this.defensa = defensa;
    }

    @Override
    public boolean equals(Object obj) {
        Gladiador gladiador= (Gladiador) obj;
        if (nombre.equals(gladiador.getNombre())){
            return true;
        }else return false;
    }
}
