package Controladores;

import Modelo.Admin;
import Modelo.ConsultasAdmin;
import vista.FrmLoginAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.FrmInicio;

public class CtrlLogin implements ActionListener {
    private final Admin modelo;
    private final FrmLoginAdmin vista;
    private final ConsultasAdmin consultas;

    public CtrlLogin(Admin modelo, FrmLoginAdmin vista, ConsultasAdmin consultas) {
        this.modelo = modelo;
        this.vista = vista;
        this.consultas = consultas;
        this.vista.btnIngresar.addActionListener(this);
        this.vista.btnSalir.addActionListener(this);

    }

    public void iniciar() {
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnIngresar) {
            modelo.setUsuario(vista.txtUsuario.getText());
            modelo.setContraseña(new String(vista.txtContrasena.getPassword())); // Obtiene la contrsaeña del campo de
                                                                                 // texto

            if (ConsultasAdmin.verificar_credenciales(modelo)) {
                CtrlAdminInicio ctrlAdminInicio = new CtrlAdminInicio();
                ctrlAdminInicio.iniciar();
                vista.dispose();
            } else {
                JOptionPane.showMessageDialog(vista, "Usuario o contraseña incorrectos");
            }
        }

        if (e.getSource() == vista.btnSalir) {
            CtrlInicio fInicio = new CtrlInicio();
            fInicio.iniciar();
            vista.dispose();

            // System.exit(0);
        }

    }
}