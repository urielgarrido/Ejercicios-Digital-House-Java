package ejer3;

public class Main {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero(300,1000);
        Mago mago = new Mago(400);
        Dragon dragon = new Dragon(900);

        mago.luchar(dragon);
        guerrero.luchar(dragon);
        mago.resucitarGuerrero(guerrero);
        guerrero.luchar(dragon);
    }
}
