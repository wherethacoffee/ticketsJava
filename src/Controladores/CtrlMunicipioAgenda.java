package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Modelo.ConsultasMunicipio;
import Modelo.Municipio;
import vista.FrmGestorMunicipio;

public class CtrlMunicipioAgenda implements ActionListener {
    private final Municipio modelo;
    private final ConsultasMunicipio consultas;
    private final FrmGestorMunicipio vista;

    public CtrlMunicipioAgenda(Municipio modelo, ConsultasMunicipio consultas, FrmGestorMunicipio vista) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.btnAgregar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnActualizar.addActionListener(this);
        this.vista.btnSalir.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this); 
        this.vista.btnLimpiar.addActionListener(this);
    }

    public void iniciar(){
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnAgregar){
            modelo.setIdmunicipio(Integer.parseInt(vista.txtIDMunicipio.getText()));
            modelo.setNombre(vista.txtNombreMunicipio.getText());

            if (consultas.registrar(modelo)){
                JOptionPane.showMessageDialog(null, "Municipio Registrado con exito");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Municipio no registrado");
                limpiar();
            }
        }

        if (e.getSource() == vista.btnEliminar){
            modelo.setIdmunicipio(Integer.parseInt(vista.txtIDMunicipio.getText()));

            if (consultas.eliminar(modelo)){
                JOptionPane.showMessageDialog(null, "Municipio Eliminado con exito");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Municipio no eliminado");
                limpiar();
            }
        }

        if (e.getSource() == vista.btnActualizar){
            modelo.setIdmunicipio(Integer.parseInt(vista.txtIDMunicipio.getText()));
            modelo.setNombre(vista.txtNombreMunicipio.getText());

            if (consultas.modificar(modelo)){
                JOptionPane.showMessageDialog(null, "Municipio modificado con exito");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Municipio no actualizado");
                limpiar();
            }
        }

        if (e.getSource() == vista.btnBuscar){
            modelo.setIdmunicipio(Integer.parseInt(vista.txtIDMunicipio.getText()));

            if (consultas.buscar(modelo)){
                vista.txtIDMunicipio.setText(String.valueOf(modelo.getIdmunicipio()));
                vista.txtNombreMunicipio.setText(modelo.getNombre());
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Municipio no encontrado");
                limpiar();
            }
        }

        if (e.getSource() == vista.btnSalir){
            System.exit(0);
        }
        
        if (e.getSource() == vista.btnLimpiar){
            limpiar();
        }
    }

    public void limpiar(){
        vista.txtIDMunicipio.setText(null);
        vista.txtNombreMunicipio.setText(null);
    }
}
