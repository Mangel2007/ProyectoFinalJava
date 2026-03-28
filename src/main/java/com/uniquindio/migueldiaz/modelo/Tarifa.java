package com.uniquindio.migueldiaz.modelo;
import com.uniquindio.migueldiaz.enums.TipoVehiculo;

public class Tarifa extends TipoVehiculo {
    private int horas;
    private int descuento;

    // Se definen el valor por hora por vehículo correspondiente
    public static int tarifaCarro = 5000;
    protected static int tarifaMotocicleta = 2000;
    protected static int tarifaBicicleta = 500;

    //creación getters
    public static int getTarifaCarro(){
        return tarifaCarro;
    }
    public static int getTarifaMotocicleta(){
        return tarifaMotocicleta;
    }
    public static int getTarifaBicicleta(){
        return tarifaBicicleta;
    }

    // Se crean inner class temporales para los tests (Solo activar para comprobar)
    protected static class tarifaCarro extends Tarifa{}
    protected static class tarifaMotocicleta extends Tarifa{}
    protected static class tarifaBicicleta extends Tarifa{}
}
