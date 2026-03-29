package com.uniquindio.migueldiaz.modelo;
import com.uniquindio.migueldiaz.enums.TipoVehiculo;

public class Usuario extends TipoVehiculo {
    public String nombre;
    protected String identificacion;
    protected String tipoUsuario;
    public String vehiculo;
    protected Boolean aplicaDescuento;

    // Constructor
    public Usuario (String nombreRecibido, String identificacionRecibido, String tipoUsuarioRecibido, String vehiculoRecibido, TipoDeVehiculo TipoDeVehiculo , Boolean aplicaDescuentoVerificar){
        this.nombre = nombreRecibido;
        this.identificacion = identificacionRecibido;
        this.tipoUsuario = tipoUsuarioRecibido;
        this.vehiculo = vehiculoRecibido;
        this.aplicaDescuento = aplicaDescuentoVerificar;

        Usuario usuario1 = new Usuario("Miguel", "1092852740", "Administrativo", "Totoya", carro, true);
        Usuario usuario2 = new Usuario("Erika", "1095181507", "Porfesor", "Kawasaki", motocicleta, true);
        Usuario usuario3 = new Usuario("Panda", "1029374368", "Estudiante", "BMX", bicicleta, false);
    }
}