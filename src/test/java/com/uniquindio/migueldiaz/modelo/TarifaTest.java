package com.uniquindio.migueldiaz.modelo;
import com.uniquindio.migueldiaz.enums.TipoVehiculo;
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

class UsuarioTest{

    @Test

    void ComprobacionInformacionUsuarios() {

        // Se comprueban que los datos se están guardando correctamente
        Usuario usuario1 = new Usuario("Miguel", "1092852740", "Administrativo", "Toyota", TipoVehiculo.CARRO, true);
        Usuario usuario2 = new Usuario("Erika", "1095181507", "Porfesor", "Kawasaki", TipoVehiculo.MOTOCICLETA, true);
        Usuario usuario3 = new Usuario("Panda", "1029374368", "Estudiante", "BMX", TipoVehiculo.BICICLETA, false);
    }
}