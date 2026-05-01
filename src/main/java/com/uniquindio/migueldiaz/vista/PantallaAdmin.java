package com.uniquindio.migueldiaz.vista;
import com.uniquindio.migueldiaz.dao.UsuarioDAO;
import com.uniquindio.migueldiaz.enums.TipoUsuario;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static com.uniquindio.migueldiaz.enums.TipoUsuario.ESTUDIANTE;
import static com.uniquindio.migueldiaz.enums.TipoUsuario.DOCENTE;
import static com.uniquindio.migueldiaz.enums.TipoUsuario.ADMINISTRATIVO;


public class PantallaAdmin {

    public PantallaAdmin() {

        JFrame ventana = new JFrame("Panel de Administración - Crear Usuarios");
        ventana.setSize(400, 300);
        // OJO: Usamos DISPOSE_ON_CLOSE para que al cerrar esta ventana no se cierre todo el programa
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Centrar la ventana en la pantalla
        ventana.setLocationRelativeTo(null);


        JPanel panel = new JPanel();
        panel.setLayout(null);
        ventana.add(panel);


        JLabel etiquetaUsuario = new JLabel("Nuevo Usuario:");
        etiquetaUsuario.setBounds(30, 30, 100, 25);
        panel.add(etiquetaUsuario);

        JTextField campoUsuario = new JTextField(20);
        campoUsuario.setBounds(150, 30, 180, 25);
        panel.add(campoUsuario);


        JLabel etiquetaClave = new JLabel("Contraseña:");
        etiquetaClave.setBounds(30, 70, 100, 25);
        panel.add(etiquetaClave);

        JTextField campoClave = new JTextField(20);
        campoClave.setBounds(150, 70, 180, 25);
        panel.add(campoClave);


        JLabel etiquetaRol = new JLabel("Asignar tipo de usuario:");
        etiquetaRol.setBounds(30, 110, 100, 25);
        panel.add(etiquetaRol);

        JComboBox<TipoUsuario> desplegableRoles = new JComboBox<>(TipoUsuario.values());
        desplegableRoles.setBounds(150, 110, 180, 25);
        panel.add(desplegableRoles);


        JButton botonGuardar = new JButton("Guardar en BD");
        botonGuardar.setBounds(150, 160, 150, 30);
        panel.add(botonGuardar);


        botonGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtenemos los datos escritos
                String nuevoNombre = campoUsuario.getText();
                String nuevaClave = campoClave.getText();
                TipoUsuario rolUsuario = (TipoUsuario) desplegableRoles.getSelectedItem();

                if (nuevoNombre.isEmpty() || nuevaClave.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, llena todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {

                    UsuarioDAO.registrarNuevoUsuario(nuevoNombre, nuevaClave, rolUsuario.name());

                    JOptionPane.showMessageDialog(null, "¡Usuario '" + nuevoNombre + "' creado con éxito!");


                    campoUsuario.setText("");
                    campoClave.setText("");
                }
            }
        });


        ventana.setVisible(true);
    }
}