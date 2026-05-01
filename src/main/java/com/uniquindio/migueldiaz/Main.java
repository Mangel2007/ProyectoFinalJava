package com.uniquindio.migueldiaz;
import com.uniquindio.migueldiaz.modelo.Usuario;
import com.uniquindio.migueldiaz.configuracion.ConexionBD;

public class Main {

    static void main(String[] args) {
        ConexionBD.inicializarBaseDeDatos();

        System.out.println("Aplicación iniciada correctamente.");
    }
}
