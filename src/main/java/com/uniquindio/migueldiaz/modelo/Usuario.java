package com.uniquindio.migueldiaz.modelo;
import com.uniquindio.migueldiaz.enums.TipoVehiculo;

public class Usuario {
    protected String nombre;
    protected String identificacion;
    protected String tipoUsuario;
    public String vehiculo;
    public TipoVehiculo tipoVehiculo;
    protected Boolean aplicaDescuento;

    // Constructor
    public Usuario (String nombreRecibido, String identificacionRecibido, String tipoUsuarioRecibido, String vehiculoRecibido, TipoVehiculo tipoVehiculo, Boolean aplicaDescuentoVerificar){
        this.nombre = nombreRecibido;
        this.identificacion = identificacionRecibido;
        this.tipoUsuario = tipoUsuarioRecibido;
        this.vehiculo = vehiculoRecibido;
        this.tipoVehiculo = tipoVehiculo;
        this.aplicaDescuento = aplicaDescuentoVerificar;
    }
}