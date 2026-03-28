package com.uniquindio.migueldiaz.enums;

public class TipoUsuario {

    enum TipoDeUsuario {
        ESTUDIANTE, DOCENTE, ADMINISTRATIVO, VISITANTE
    }

    // Asignación de abreviaturas
    private static TipoDeUsuario administrativo = TipoDeUsuario.ADMINISTRATIVO;
    private static TipoDeUsuario docente = TipoDeUsuario.DOCENTE;
    private static TipoDeUsuario estudiante = TipoDeUsuario.ESTUDIANTE;
    private static TipoDeUsuario visitante = TipoDeUsuario.VISITANTE;

    // Creación de clase que contenga enum TipoUsuario
    public static class EnumTipoDeUsuarios {
        private TipoDeUsuario tipoDeUsuario;


    // Constructor de enum TipoDeUsuario

    public EnumTipoDeUsuarios(TipoDeUsuario tipoDeUsuario){
        this.tipoDeUsuario = tipoDeUsuario;
        }
    }
}