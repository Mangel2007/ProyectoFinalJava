package com.uniquindio.migueldiaz.modelo;
import com.uniquindio.migueldiaz.enums.TipoVehiculo;
import com.uniquindio.migueldiaz.enums.TipoUsuario;

public class Usuario {
    protected String nombre;
    protected String identificacion;
    protected TipoUsuario tipoUsuario;
    public String vehiculo;
    public TipoVehiculo tipoVehiculo;
    protected Boolean aplicaDescuento;

    // Constructor
    public Usuario (String nombreRecibido, String identificacionRecibido, TipoUsuario tipoUsuario, String vehiculoRecibido, TipoVehiculo tipoVehiculo, Boolean aplicaDescuentoVerificar){
        this.nombre = nombreRecibido;
        this.identificacion = identificacionRecibido;
        this.tipoUsuario = tipoUsuario;
        this.vehiculo = vehiculoRecibido;
        this.tipoVehiculo = tipoVehiculo;
        this.aplicaDescuento = aplicaDescuentoVerificar;
    }
}