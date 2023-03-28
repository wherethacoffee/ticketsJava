package Controladores;

import Modelo.ConsultasAlumno;
import Modelo.Municipio;
import Modelo.Alumno;
import vista.FrmAgendar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CtrlAlumno implements ActionListener {
    private final Alumno modelo;
    private final ConsultasAlumno consultas;
    private final FrmAgendar vista;
    private final Municipio municipio;

    public CtrlAlumno(Alumno modelo, ConsultasAlumno consultas, FrmAgendar vista, Municipio municipio) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        this.municipio = municipio;
        this.vista.btnBuscar.addActionListener(this);
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
    }

    public void iniciar() {
        vista.setVisible(false);
        vista.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnGuardar) {
            modelo.setCurp(vista.txtCurp.getText());
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setPaterno(vista.txtPaterno.getText());
            modelo.setMaterno(vista.txtMaterno.getText());
            modelo.setTelefono(vista.txtTelefono.getText());
            modelo.setCorreo(vista.txtCorreo.getText());
            modelo.setNivel(vista.txtAsunto.getText());
            municipio.setNombre(vista.txtMunicipio.getText());

            if (consultas.registrar(modelo, municipio)) {
                JOptionPane.showMessageDialog(null, "Alumno registrado con exito");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no registrado");
                limpiar();
            }
        }
    }

    public void limpiar() {
        vista.txtCurp.setText(null);
        vista.txtNombre.setText(null);
        vista.txtPaterno.setText(null);
        vista.txtMaterno.setText(null);
        vista.txtTelefono.setText(null);
        vista.txtCorreo.setText(null);
        vista.txtAsunto.setText(null);
        vista.txtMunicipio.setText(null);
    }
}
