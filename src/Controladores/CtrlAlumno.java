package Controladores;

import Modelo.ConsultasAlumno;
import Modelo.Alumno;
import vista.FrmAgendar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import vista.FrmComprobante;

public class CtrlAlumno implements ActionListener {
    private final Alumno modelo;
    private final ConsultasAlumno consultas;
    private final FrmAgendar vista;

    public CtrlAlumno(Alumno modelo, ConsultasAlumno consultas, FrmAgendar vista) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.btnBuscar.addActionListener(this);
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
        this.vista.btnSalir.addActionListener(this);
    }

    public void iniciar() {
        vista.setVisible(true);
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
            modelo.setNivel(vista.cbNivel.getSelectedItem().toString());
            modelo.setAsunto(vista.cbAsunto.getSelectedItem().toString());
            modelo.setMunicipio_idmunicipio(vista.cbMunicipio.getSelectedIndex());

            boolean curpValida = verficiar_curp(modelo.getCurp());
            if (curpValida) {
                if (consultas.registrar(modelo)) {
                    JOptionPane.showMessageDialog(null, "Alumno Registrado con exito");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Alumno no registrado");
                    limpiar();
                }

            } else {
                JOptionPane.showMessageDialog(null, "La curp ingresada no es válida");
            }
        }

        if (e.getSource() == vista.btnModificar) {
            modelo.setCurp(vista.txtCurp.getText());
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setPaterno(vista.txtPaterno.getText());
            modelo.setMaterno(vista.txtMaterno.getText());
            modelo.setTelefono(vista.txtTelefono.getText());
            modelo.setCorreo(vista.txtCorreo.getText());
            modelo.setNivel(vista.cbNivel.getSelectedItem().toString());
            modelo.setAsunto(vista.cbAsunto.getSelectedItem().toString());
            modelo.setMunicipio_idmunicipio(vista.cbMunicipio.getSelectedIndex());

            boolean curpValida = verficiar_curp(modelo.getCurp());
            if (curpValida) {
                if (consultas.modificar(modelo)) {
                    JOptionPane.showMessageDialog(null, "Alumno modificado con exito");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Alumno no modificado");
                    limpiar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "La curp ingresada no es válida");
            }
        }

        if (e.getSource() == vista.btnBuscar) {
            modelo.setCurp(vista.txtCurp.getText());

            if (consultas.buscar(modelo)) {
                vista.txtCurp.setText(modelo.getCurp());
                vista.txtNombre.setText(modelo.getNombre());
                vista.txtPaterno.setText(modelo.getPaterno());
                vista.txtMaterno.setText(modelo.getMaterno());
                vista.txtTelefono.setText(modelo.getTelefono());
                vista.txtCorreo.setText(modelo.getCorreo());
                vista.cbNivel.setSelectedItem(modelo.getNivel());
                vista.cbAsunto.setSelectedItem(modelo.getAsunto());
                vista.cbMunicipio.setSelectedIndex(modelo.getMunicipio_idmunicipio());

            } else {
                JOptionPane.showMessageDialog(null, "Alumno no encontrado");
                limpiar();
            }
        }
        if (e.getSource() == vista.btnSalir) {
            CtrlInicio fInicio = new CtrlInicio();
            fInicio.iniciar();
            vista.dispose();
        }

    }

    public void limpiar() {
        vista.txtCurp.setText(null);
        vista.txtNombre.setText(null);
        vista.txtPaterno.setText(null);
        vista.txtMaterno.setText(null);
        vista.txtTelefono.setText(null);
        vista.txtCorreo.setText(null);
        vista.cbNivel.getSelectedItem();
        vista.cbAsunto.setSelectedItem(null);
        ;
        vista.cbMunicipio.setSelectedItem(null);
        ;
    }

    public boolean verficiar_curp(String curp) {
        String CURP_REGEX = "^[A-Z]{4}[0-9]{6}[H,M][A-Z]{5}[A-Z0-9]{2}$";

        Pattern pattern = Pattern.compile(CURP_REGEX);
        boolean isCurpValid = pattern.matcher(curp).matches();

        if (isCurpValid) {
            return true;
        } else {
            return false;
        }
    }
}
