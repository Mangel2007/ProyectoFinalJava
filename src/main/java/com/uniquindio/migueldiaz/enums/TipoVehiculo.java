package com.uniquindio.migueldiaz.enums;

public class TipoVehiculo {

    public enum TipoDeVehiculo {
        CARRO, MOTOCICLETA, BICICLETA
    }

    TipoDeVehiculo carro;

    public TipoVehiculo() {
        this.carro = TipoDeVehiculo.CARRO;
    }

    public TipoDeVehiculo getCarro() {
        return carro;
    }

}
