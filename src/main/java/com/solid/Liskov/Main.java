package com.solid.Liskov;

public class Main {

    public static final double DISTANCIA_INICIAL = 10000;

    /**
     * En este ejemplo se puede ver que el metodo obtenerOdometro() tiene el
     * mismo comportamiento ya que la clase hija de Camion que es subcamion no
     * puede modificar su comportamiento así en la implementacion se cambie la
     * instancia de clase padre a hija.
     *
     * @param args
     */
    public static void main(String[] args) {

//        Camion camion = new Camion(DISTANCIA_INICIAL, "IBG869");
        Camion camion = new SubCamion(DISTANCIA_INICIAL, "IBG869");

        camion.añadirViaje(new Viaje(new Coordenada(0, 0), new Coordenada(20, 0)));

        if (camion.obtenerOdometro() == DISTANCIA_INICIAL) {
            System.out.println("Odometro es correcto");
        } else {
            System.out.println("El odometro ha sido modificado");
        }

    }

}
