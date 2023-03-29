package Controladores;

import Modelo.ConsultasAlumno;
import Modelo.Alumno;
import vista.FrmAgendar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;

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
            modelo.setNivel(vista.txtNivel.getText());
            modelo.setAsunto(vista.txtAsunto.getText());
            modelo.setMunicipio_idmunicipio(Integer.parseInt(vista.txtMunicipio.getText()));

            if (consultas.registrar(modelo)) {
                JOptionPane.showMessageDialog(null, "Alumno registrado con exito");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no registrado");
                limpiar();
            }
        }

        if (e.getSource() == vista.btnModificar) {
            modelo.setCurp(vista.txtCurp.getText());
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setPaterno(vista.txtPaterno.getText());
            modelo.setMaterno(vista.txtMaterno.getText());
            modelo.setTelefono(vista.txtTelefono.getText());
            modelo.setCorreo(vista.txtCorreo.getText());
            modelo.setNivel(vista.txtNivel.getText());
            modelo.setAsunto(vista.txtAsunto.getText());
            modelo.setMunicipio_idmunicipio(Integer.parseInt(vista.txtMunicipio.getText()));

            if (consultas.modificar(modelo)) {
                JOptionPane.showMessageDialog(null, "Alumno modificado con exito");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no modificado");
                limpiar();
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
                vista.txtNivel.setText(modelo.getNivel());
                vista.txtAsunto.setText(modelo.getAsunto());
                vista.txtMunicipio.setText(Integer.toString(modelo.getMunicipio_idmunicipio()));

            } else {
                JOptionPane.showMessageDialog(null, "Alumno no encontrado");
                limpiar();
            }
        }
        if (e.getSource() == vista.btnSalir) {
            System.exit(0);
        }

    }

    public void limpiar() {
        vista.txtCurp.setText(null);
        vista.txtNombre.setText(null);
        vista.txtPaterno.setText(null);
        vista.txtMaterno.setText(null);
        vista.txtTelefono.setText(null);
        vista.txtCorreo.setText(null);
        vista.txtNivel.setText(null);
        vista.txtAsunto.setText(null);
        vista.txtMunicipio.setText(null);
    }

    public boolean verficiar_curp(String curp){
        String CURP_REGEX = "^[A-Z]{4}[0-9]{6}[H,M][A-Z]{5}[A-Z0-9]{2}$";
        
        Pattern pattern = Pattern.compile(CURP_REGEX);
        boolean isCurpValid = pattern.matcher(curp).matches();
        
        if (isCurpValid){
            return true;
        } else{
            return false;
        }
    }
}
