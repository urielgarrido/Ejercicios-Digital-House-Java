package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Coliseo {
    private List<Gladiador> listaDeGladiadores;
    private List<PersonalTrainer> listaDePersonalTrainer;
    private List<Enfermera> listaDeEnfermeras;
    private List<Vendedor> vendedorAmbulante;
    private List<Producto> listaDeProductos;
    private List<Espectador> listaDeEspectadores;

    public Coliseo() {
        listaDeGladiadores=new ArrayList<>();
        listaDeEspectadores=new ArrayList<>();
        listaDeProductos=new ArrayList<>();
        listaDePersonalTrainer=new ArrayList<>();
        listaDeEnfermeras=new ArrayList<>();
        vendedorAmbulante=new ArrayList<>();
    }
    public void agregarGladiador(String nombre, Integer vida, Integer ataque, Integer defensa){
        Gladiador unGladiador = new Gladiador(nombre,vida,ataque,defensa);
        listaDeGladiadores.add(unGladiador);
    }
    public void agregarPersonalTrainer(String nombre, Integer porcentaje){
        PersonalTrainer unPersonalTrainer = new PersonalTrainer(nombre,porcentaje);
        listaDePersonalTrainer.add(unPersonalTrainer);
    }
    public void agregarEnfermera(String nombre){
        Enfermera unaEnfermera = new Enfermera(nombre);
        listaDeEnfermeras.add(unaEnfermera);
    }
    public void entrenarGladiador(String nombreGladiador, String nombrePersonalTrainer){
       Gladiador gladiadorEntrenar = encontrarGladiador(nombreGladiador);
       PersonalTrainer personalTrainer = encontrarPersonalTrainer(nombrePersonalTrainer);

       gladiadorEntrenar.setVida(gladiadorEntrenar.getVida()+(gladiadorEntrenar.getVida()*personalTrainer.getPorcentaje()/100));
        gladiadorEntrenar.setAtaque(gladiadorEntrenar.getAtaque()+(gladiadorEntrenar.getAtaque()*personalTrainer.getPorcentaje()/100));
        gladiadorEntrenar.setDefensa(gladiadorEntrenar.getDefensa()+(gladiadorEntrenar.getDefensa()*personalTrainer.getPorcentaje()/100));
    }
    public void eliminarGladiador(String nombreGladiador){
        Gladiador  gladiadorARemover=encontrarGladiador(nombreGladiador);
        listaDeGladiadores.remove(gladiadorARemover);
    }
    public void pelaDeGladiadores(String nombreGladiador1, String nombreGladiador2){
        Gladiador gladiador1 = encontrarGladiador(nombreGladiador1);
        Gladiador gladiador2 = encontrarGladiador(nombreGladiador2);
        gladiador1.setVida(gladiador1.getVida()-(gladiador1.getDefensa()-gladiador2.getAtaque()));
        gladiador2.setVida(gladiador2.getVida()-(gladiador2.getDefensa()-gladiador1.getAtaque()));
    }
    public void venderProducto(String nombreVendedor, String nombreEspectador, String nombreProducto){
        Vendedor unVendedor = encontrarVendedor(nombreVendedor);
        Producto unProducto = encontrarProducto(nombreProducto);
        Espectador unEspectador = encontrarEspectador(nombreEspectador);
        unVendedor.setProducto(unProducto);
        unVendedor.setPlata(unVendedor.getPlata()+unProducto.getPrecio()+(unVendedor.getCarisma()+unVendedor.getExperiencia()));
        unEspectador.setPlata(unEspectador.getPlata()-unProducto.getPrecio()-(unVendedor.getExperiencia()+unVendedor.getCarisma()));
    }
    public void agregarEspectador(String nombre, Integer plata){
        Espectador espectador = new Espectador(nombre,plata);
        listaDeEspectadores.add(espectador);
    }

    public void agregarProducto(String nombre, Integer precio){
        Producto producto = new Producto(nombre,precio);
        listaDeProductos.add(producto);
    }

    public void agregarVendedor(String nombre, Integer carisma, Integer experiencia, Integer matricula, Integer plata){
        Vendedor vendedor = new Vendedor(nombre,carisma,experiencia,matricula,plata);
        vendedorAmbulante.add(vendedor);
    }

    private Vendedor encontrarVendedor (String nombreVendedor){
        for (Vendedor unVendedor:vendedorAmbulante) {
            if (unVendedor.getNombre().equals(nombreVendedor)){
                return unVendedor;
            }
        }
        return null;
    }

    private Producto encontrarProducto(String nombreProducto){
        for (Producto unProducto:listaDeProductos) {
            if (unProducto.getNombre().equals(nombreProducto)){
                return unProducto;
            }
        }
        return null;

    }

    private Espectador encontrarEspectador(String nombreEspectador){
        for (Espectador unEspectador:listaDeEspectadores) {
            if (unEspectador.getNombre().equals(nombreEspectador)){
                return unEspectador;
            }
        }
        return null;

    }

    private Gladiador encontrarGladiador(String nombreGladiador){

        for (Gladiador unGladiador:listaDeGladiadores) {
            if (unGladiador.getNombre().equals(nombreGladiador)){
                return unGladiador;
            }
        }
            return null;
    }
    private PersonalTrainer encontrarPersonalTrainer(String nombrePersonalTrainer){
        for (PersonalTrainer unPersonalTrainer:listaDePersonalTrainer) {
            if (unPersonalTrainer.getNombre().equals(nombrePersonalTrainer)){
                return unPersonalTrainer;
            }
        }
        return null;
    }
}
