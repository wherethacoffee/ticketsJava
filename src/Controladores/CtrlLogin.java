package Controladores;

import Modelo.Admin;
import Modelo.ConsultasAdmin;
import vista.FrmLoginAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.FrmAdminAgenda;
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

            if (consultas.buscar(modelo)) {
                vista.txtUsuario.setText(modelo.getUsuario());
                vista.txtContrasena.setText(modelo.getContraseña());
                Cambiar();
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

    public void Cambiar() {
        FrmAdminAgenda frmAdminAgenda = new FrmAdminAgenda();
        frmAdminAgenda.setVisible(true);
        frmAdminAgenda.setLocationRelativeTo(null);
        vista.dispose();
    }
}