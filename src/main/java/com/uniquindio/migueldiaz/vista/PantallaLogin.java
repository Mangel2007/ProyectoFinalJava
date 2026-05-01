package com.uniquindio.migueldiaz.vista;
import com.uniquindio.migueldiaz.configuracion.ConexionBD;
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
                if (usuarioIngresado.equals("admin") && claveIngresada.equals("1234")) {
                    JOptionPane.showMessageDialog(null, "¡Bienvenido al sistema!");
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } ) ;
        ventana.setVisible(true);
    }
}

