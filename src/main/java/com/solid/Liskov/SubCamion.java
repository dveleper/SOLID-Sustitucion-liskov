package com.solid.Liskov;

/**
 * En Esta clase estamos evidenciando que no se pueden modificar los metodos de
 * la clase padre asegurando que se respete el contrato (No se puede modificar
 * el comportamiento de obtenerViajes y añadirViajes ni modificar el odometro)
 * por esta razon en esta clase hija no se puede implementar esos metodos de la
 * clase Camion.
 *
 * @author dveleper
 */
public class SubCamion extends Camion {

    public SubCamion(double odometro, String plato) {
        super(odometro, plato);
    }

}
