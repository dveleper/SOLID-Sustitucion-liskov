package com.solid.Liskov;

import lombok.Data;

@Data
public class Coordenada {

    private int latitud;
    private int longitud;

    public Coordenada(int latitud, int longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public double calcularDistancia(Coordenada punto) {
        return Math.sqrt(Math.pow(latitud, 2) - Math.pow(punto.getLatitud(), 2)
                - Math.pow(longitud, 2) - Math.pow(punto.getLongitud(), 2));
    }

}
