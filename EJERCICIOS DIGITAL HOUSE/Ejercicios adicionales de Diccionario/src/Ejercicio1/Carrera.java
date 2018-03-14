package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private Integer Distancia;
    private Integer premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    protected List<Vehiculo> listaDeVehiculos;

    public Carrera(Integer distancia, Integer premioEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos) {
        Distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        listaDeVehiculos=new ArrayList<>();
    }

    public Integer getDistancia() {
        return Distancia;
    }

    public void setDistancia(Integer distancia) {
        Distancia = distancia;
    }

    public Integer getPremioEnDolares() {
        return premioEnDolares;
    }

    public void setPremioEnDolares(Integer premioEnDolares) {
        this.premioEnDolares = premioEnDolares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadDeVehiculosPermitidos() {
        return cantidadDeVehiculosPermitidos;
    }

    public void setCantidadDeVehiculosPermitidos(Integer cantidadDeVehiculosPermitidos) {
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
    }

    public void darDeAltaAuto(Integer velocidad,Integer aceleracion,Double anguloDeGiro,String patente) {
        Auto unAuto=new Auto(velocidad, aceleracion, anguloDeGiro, patente);
        if (listaDeVehiculos.size()<getCantidadDeVehiculosPermitidos()){
            listaDeVehiculos.add(unAuto);
        }
    }
    public void eliminarVehiculo(Vehiculo unVehiculo){
        listaDeVehiculos.remove(unVehiculo);
    }
    public void eliminarVehiculoConPatente(String unaPatente){
        Vehiculo vehiculoRemover = null;
        for (Vehiculo unVehiculo:listaDeVehiculos) {
            if (unVehiculo.getPatente().equals(unaPatente)){
                vehiculoRemover = unVehiculo;
            }
        }
        listaDeVehiculos.remove(vehiculoRemover);
    }

    public Vehiculo ganadorDeLaCarrera(){
        Vehiculo vehiculoGanador = listaDeVehiculos.get(0);
        for (Vehiculo unVehiculo:listaDeVehiculos) {
            if (unVehiculo.formulaGanador()>vehiculoGanador.formulaGanador()){
                vehiculoGanador = unVehiculo;
            }
        }
        System.out.println("El vehiculo ganador es : "+vehiculoGanador);
        return vehiculoGanador;
    }
}
