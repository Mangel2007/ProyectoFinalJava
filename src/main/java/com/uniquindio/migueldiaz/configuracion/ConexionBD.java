package com.uniquindio.migueldiaz.configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {

    // Ruta donde se creará el archivo de la base de datos
    private static final String URL = "jdbc:sqlite:sistema_login.db";

    public static Connection conectar() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL);
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return conexion;
    }

    public static void inicializarBaseDeDatos() {
        String sql = "CREATE TABLE IF NOT EXISTS usuarios (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombreUsuario TEXT UNIQUE NOT NULL," +
                "contrasena TEXT NOT NULL," +
                "rol TEXT NOT NULL" +
                ");";

        try (Connection conn = conectar();
             Statement stmt = conn.createStatement()) {

            // Crear tabla si no existe
            stmt.execute(sql);

            // Insertamos al admin por defecto si la base de datos está vacía
            stmt.execute("INSERT OR IGNORE INTO usuarios (nombreUsuario, contrasena, rol) VALUES ('admin', '1234', 'ADMIN');");
            System.out.println("Base de datos inicializada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al crear la tabla: " + e.getMessage());
        }
    }
}