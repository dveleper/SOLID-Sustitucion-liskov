package com.solid.Liskov;

import java.util.ArrayList;
import java.util.List;

/**
 * Para implementar el principio de sustitucion de Liskov el cual dice que se
 * debe respetar en la herencia los contratos establecidos inicialmente en la
 * clase padre hacemos uso de la palabra reservada final en los metodos :
 * [obtenerOdometro(), obtenerPlato(), obtenerViajes(), añadirViaje(final Viaje
 * viaje)] que no se quieren que no sean modificados en las subclases
 *
 * @author dveleper
 */
public class Camion {

    private List<Viaje> viajes;
    private double odometro;
    private String placa;

    public Camion(final double odometro, final String plato) {

        this.odometro = odometro;
        this.placa = plato;
        viajes = new ArrayList<>();
    }

    public final double obtenerOdometro() {
        return this.odometro;
    }

    public final String obtenerPlato() {
        return this.placa;
    }

    public final List<Viaje> obtenerViajes() {

        return new ArrayList<>(viajes);
    }

    public final void añadirViaje(final Viaje viaje) {
        viajes.add(viaje);
    }

}
