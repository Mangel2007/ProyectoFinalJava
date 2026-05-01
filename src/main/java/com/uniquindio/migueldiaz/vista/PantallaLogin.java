package com.uniquindio.migueldiaz.vista;
import com.uniquindio.migueldiaz.configuracion.ConexionBD;
import com.uniquindio.migueldiaz.dao.UsuarioDAO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaLogin {

    static void main(String[] args){
        ConexionBD.inicializarBaseDeDatos();
        JFrame ventana = new JFrame("Inicio de sesión");
        ventana.setSize(350, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        ventana.add(panel);

        panel.setLayout(null);

        JLabel etiquetaUsuario = new JLabel("Usuario");
        etiquetaUsuario.setBounds(20, 20, 80, 25);
        panel.add(etiquetaUsuario);

        JTextField campoUsuario = new JTextField(20);
        campoUsuario.setBounds(100, 20, 165, 25);
        panel.add(campoUsuario);

        JLabel etiquetaClave = new JLabel("Contraseña");
        etiquetaClave.setBounds(20, 50, 80, 25);
        panel.add(etiquetaClave);

        JPasswordField campoClave = new JPasswordField(20);
        campoClave.setBounds(100, 50, 165, 25);
        panel.add(campoClave);

        JButton botonEntrar = new JButton("Entrar");
        botonEntrar.setBounds(100, 90, 80, 25);
        panel.add(botonEntrar);

        botonEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String usuarioIngresado = campoUsuario.getText();
                String claveIngresada = new String(campoClave.getPassword());
                // Lógica de validación
                if (UsuarioDAO.verificarLogin(usuarioIngresado, claveIngresada)) {
                    String rol = UsuarioDAO.obtenerRol(usuarioIngresado);

                    // Cerramos la ventana de login
                    ventana.dispose();

                    // Verificamos qué ventana abrir según el rol
                    if (rol.equals("ADMIN")) {
                        // Abrimos la pantalla que acabamos de crear
                        new PantallaAdmin();
                    } else {
                        JOptionPane.showMessageDialog(null, "Bienvenido usuario normal. (Pantalla estándar en construcción)");
                        // Aquí luego pondremos: new PantallaUsuarioEstandar();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } ) ;
        ventana.setVisible(true);
    }
}

