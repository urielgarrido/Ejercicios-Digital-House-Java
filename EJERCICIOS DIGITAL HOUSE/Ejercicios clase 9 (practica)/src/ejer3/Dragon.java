package ejer3;

public class Dragon extends Criatura {

    public Dragon(Integer nivelDeAtaque) {
        super(nivelDeAtaque);
    }

    public void volar(){
        System.out.println("Estoy volando");
    }
    public void lanzarFuego(){
        System.out.println("Lanzando fuego");
    }

}
