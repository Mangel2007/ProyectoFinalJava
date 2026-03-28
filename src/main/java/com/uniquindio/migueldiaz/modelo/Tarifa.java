package com.uniquindio.migueldiaz.modelo;
import com.uniquindio.migueldiaz.enums.TipoVehiculo;

public class Tarifa extends TipoVehiculo {
    int valorPorHora;
    int descuento;

    public int tarifaCarro = 5000;


    // Definir clase en la cual se determinaran y conectaran los valores dependiendo tipo de vehículo
    public class definicionTarifas {
        int carro = tarifaCarro;
    }


}
