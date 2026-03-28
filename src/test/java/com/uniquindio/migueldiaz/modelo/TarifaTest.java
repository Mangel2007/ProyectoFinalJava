package com.uniquindio.migueldiaz.modelo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TarifaTest {


    @Test

    void comprobacionTarifasVehiculos() {

        // Se crean diferentes objetos para comprobar el valor de las tarifas

        Tarifa tarifaCarro = new Tarifa.tarifaCarro();
        int resultadoObtenidoCarro = tarifaCarro.getTarifaCarro();

        Tarifa tarifaMotocicleta = new Tarifa.tarifaMotocicleta();
        int resultadoObtenidoMotocicleta = tarifaMotocicleta.getTarifaMotocicleta();

        Tarifa tarifaBicicleta = new Tarifa.tarifaBicicleta();
        int resultadoObtenidoBicicleta = tarifaBicicleta.getTarifaBicicleta();


        assertEquals(5000, resultadoObtenidoCarro);
        assertEquals(2000, resultadoObtenidoMotocicleta);
        assertEquals(500, resultadoObtenidoBicicleta);
    }
}