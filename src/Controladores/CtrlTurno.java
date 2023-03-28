package Controladores;

import Modelo.ConsultasTurno;
import Modelo.Turno;
import vista.FrmAdminAgenda;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CtrlTurno implements ActionListener {
    private FrmAdminAgenda vista;
    private Turno modelo;
    private ConsultasTurno consultas;

    public CtrlTurno(FrmAdminAgenda vista, ConsultasTurno consultas, Turno modelo) {
        this.vista = vista;
        this.consultas = consultas;
        this.modelo = modelo;
        this.vista.btnBuscar.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnSalir.addActionListener(this);
    }

    public void iniciar() {
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnGuardar) {
            modelo.setNturno(Integer.parseInt(vista.txtTurno.getText()));
            modelo.setCurp(vista.txtCurp.getText());
            modelo.setIdmunicipio(Integer.parseInt(vista.txtID.getText()));
            modelo.setStatus(vista.txtStatus.getText());

            if (consultas.registrar(modelo)) {
                JOptionPane.showMessageDialog(vista, "Registro guardado correctamente");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(vista, "Error al guardar el registro");
                limpiar();
            }
        } // end-guardar

        if (e.getSource() == vista.btnModificar) {
            modelo.setNturno(Integer.parseInt(vista.txtTurno.getText()));
            modelo.setCurp(vista.txtCurp.getText());
            modelo.setIdmunicipio(Integer.parseInt(vista.txtID.getText()));
            modelo.setStatus(vista.txtStatus.getText());

            if (consultas.modificar(modelo)) {
                JOptionPane.showMessageDialog(vista, "Registro modificado correctamente");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(vista, "Error al modificar el registro");
                limpiar();
            }
        }

        if (e.getSource() == vista.btnBuscar) {
            modelo.setNturno(Integer.parseInt(vista.txtTurno.getText()));

            if (consultas.buscar(modelo)) {
                vista.txtTurno.setText(Integer.toString(modelo.getNturno()));
                vista.txtCurp.setText(modelo.getCurp());
                vista.txtID.setText(Integer.toString(modelo.getNturno()));
                vista.txtStatus.setText(modelo.getStatus());
            } else {
                JOptionPane.showMessageDialog(vista, "El turno no existe");
                limpiar();
            }
        }

        if (e.getSource() == vista.btnEliminar) {
            modelo.setNturno(Integer.parseInt(vista.txtTurno.getText()));

            if (consultas.eliminar(modelo)) {
                JOptionPane.showMessageDialog(vista, "Registro eliminado correctamente");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(vista, "Error al eliminar el registro");
                limpiar();
            }
        }

        if (e.getSource() == vista.btnSalir) {
            System.exit(0);
        }
    }

    public void limpiar() {
        vista.txtTurno.setText(null);
        vista.txtCurp.setText(null);
        vista.txtID.setText(null);
        vista.txtStatus.setText(null);
    }
}
