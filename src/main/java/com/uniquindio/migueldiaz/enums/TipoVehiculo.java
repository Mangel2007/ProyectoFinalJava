package com.uniquindio.migueldiaz.enums;

public class TipoVehiculo {

    public enum TipoDeVehiculo {
        CARRO, MOTOCICLETA, BICICLETA
    }

    // Se define y simplifica las constantes
    private TipoDeVehiculo carro = TipoDeVehiculo.CARRO;
    private TipoDeVehiculo motocicleta = TipoDeVehiculo.MOTOCICLETA;
    private TipoDeVehiculo bicicleta = TipoDeVehiculo.BICICLETA;

    // Creación de una clase que contenga el enum
    public class EnumVehiculos {
        private TipoDeVehiculo tipoDeVehiculo;


        // Creación de constructor para enum de vehículos
        public EnumVehiculos(TipoDeVehiculo tipoDeVehiculo) {
            this.tipoDeVehiculo = tipoDeVehiculo;
        }
    }
}


