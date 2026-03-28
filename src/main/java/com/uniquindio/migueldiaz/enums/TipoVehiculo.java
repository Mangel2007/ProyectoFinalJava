package com.uniquindio.migueldiaz.enums;

public class TipoVehiculo {

    public enum TipoDeVehiculo {
        CARRO, MOTOCICLETA, BICICLETA
    }

    // Se define y simplifica las constantes
    private static TipoDeVehiculo carro = TipoDeVehiculo.CARRO;
    private static TipoDeVehiculo motocicleta = TipoDeVehiculo.MOTOCICLETA;
    private static TipoDeVehiculo bicicleta = TipoDeVehiculo.BICICLETA;

    // Creación de una clase que contenga el enum
    public static class EnumVehiculos {
        private TipoDeVehiculo tipoDeVehiculo;


        // Creación de constructor para enum de vehículos
        public EnumVehiculos(TipoDeVehiculo tipoDeVehiculo) {
            this.tipoDeVehiculo = tipoDeVehiculo;
        }
    }
}


