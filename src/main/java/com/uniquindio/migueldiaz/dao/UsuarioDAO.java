package com.uniquindio.migueldiaz.dao;
import com.uniquindio.migueldiaz.configuracion.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public static boolean verificarLogin(String usuario, String clave) {
        String sql = "SELECT * FROM usuarios WHERE nombreUsuario = ? AND contrasena = ?";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, usuario);
            pstmt.setString(2, clave);
            ResultSet rs = pstmt.executeQuery();

            // Si el ResultSet tiene al menos un resultado, las credenciales son correctas
            return rs.next();

        } catch (SQLException e) {
            System.out.println("Error al verificar login: " + e.getMessage());
            return false;
        }
    }

    public static String obtenerRol(String usuario) {
        String sql = "SELECT rol FROM usuarios WHERE nombreUsuario = ?";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, usuario);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return rs.getString("rol");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener rol: " + e.getMessage());
        }
        return "DESCONOCIDO";
    }

    public static void registrarNuevoUsuario(String nombre, String clave, String rol) {
        String sql = "INSERT INTO usuarios (nombreUsuario, contrasena, rol) VALUES (?, ?, ?)";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.setString(2, clave);
            pstmt.setString(3, rol);
            pstmt.executeUpdate();
            System.out.println("Usuario " + nombre + " registrado exitosamente en la BD.");

        } catch (SQLException e) {
            System.out.println("Error al registrar usuario (¿quizás el usuario ya existe?): " + e.getMessage());
        }
    }
}