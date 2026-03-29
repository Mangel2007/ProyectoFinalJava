package com.uniquindio.migueldiaz.enums;

public class TipoVehiculo {

    public enum TipoDeVehiculo {
        CARRO, MOTOCICLETA, BICICLETA
    }

    // Se define y simplifica las constantes
    protected static TipoDeVehiculo carro = TipoDeVehiculo.CARRO;
    protected static TipoDeVehiculo motocicleta = TipoDeVehiculo.MOTOCICLETA;
    protected static TipoDeVehiculo bicicleta = TipoDeVehiculo.BICICLETA;

    // Creación de una clase que contenga el enum
    public static class EnumVehiculos {
        protected TipoDeVehiculo tipoDeVehiculo;


        // Creación de constructor para enum de vehículos
        public EnumVehiculos(TipoDeVehiculo tipoDeVehiculo) {
            this.tipoDeVehiculo = tipoDeVehiculo;
        }
        public TipoDeVehiculo getEnumVehiculos() {
            return tipoDeVehiculo;
        }
    }
}


