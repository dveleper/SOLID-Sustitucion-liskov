package com.solid.Liskov;

import lombok.Data;

@Data
public class Viaje {

    private Coordenada origen;
    private Coordenada destino;

    public Viaje(Coordenada origen, Coordenada destino) {
        this.origen = origen;
        this.destino = destino;
    }

    public double distancia() {
        return destino.calcularDistancia(origen);
    }

}
