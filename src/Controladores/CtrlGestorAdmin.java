package Controladores;

import Modelo.Admin;
import Modelo.ConsultasAdmin;
import vista.FrmGestorAdmin;
import Modelo.ConsultasAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class CtrlGestorAdmin implements ActionListener {
    private final Admin modelo;
    private final FrmGestorAdmin vista;
    private final ConsultasAdmin consultas;

    public CtrlGestorAdmin(Admin modelo, FrmGestorAdmin vista, ConsultasAdmin consultas) {
        this.modelo = modelo;
        this.vista = vista;
        this.consultas = consultas;
        this.vista.btnActualizar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnAgregar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
    }

    public void iniciar() {
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnAgregar) {
            modelo.setIdusuario(Integer.parseInt(vista.txtIDusuario.getText()));
            modelo.setUsuario(vista.txtUsuario.getText());
            modelo.setContraseña(vista.txtContrasena.getText());

            if (consultas.buscar(modelo)) {
                JOptionPane.showMessageDialog(null, "Admin Registrado");
            } else {
                JOptionPane.showMessageDialog(null, "Admin No Registrado");
            }
        }

        if (e.getSource() == vista.btnActualizar) {
            modelo.setIdusuario(Integer.parseInt(vista.txtIDusuario.getText()));
            modelo.setUsuario(vista.txtUsuario.getText());
            modelo.setContraseña(vista.txtContrasena.getText());

            if (consultas.modificar(modelo)) {
                JOptionPane.showMessageDialog(null, "Admin Actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "Admin No Actualizado");
            }
        }

        if (e.getSource() == vista.btnEliminar) {
            modelo.setIdusuario(Integer.parseInt(vista.txtIDusuario.getText()));
            if (consultas.eliminar(modelo)) {
                JOptionPane.showMessageDialog(null, "Admin Eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "Admin No Eliminado");
            }

        }

        if (e.getSource() == vista.btnBuscar) {
            modelo.setIdusuario(Integer.parseInt(vista.txtIDusuario.getText()));

            if (consultas.buscar(modelo)) {
                vista.txtIDusuario.setText(Integer.toString(modelo.getIdusuario()));
                vista.txtUsuario.setText(modelo.getUsuario());
                vista.txtContrasena.setText(modelo.getContraseña());
            } else {
                JOptionPane.showMessageDialog(null, "Admin No Encontrado");
            }
        }

    }

}
