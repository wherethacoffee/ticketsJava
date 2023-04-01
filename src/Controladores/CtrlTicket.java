package Controladores;

import java.awt.event.ActionListener;
import Modelo.*;
import vista.FrmComprobante;
public class CtrlTicket implements ActionListener{
    private final Alumno modelo;
    private final ConsultasAlumno consultas;
    private final FrmComprobante vista;

    public CtrlTicket(Alumno modelo, ConsultasAlumno consultas, FrmComprobante vista) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
    }

    public void iniciar(){
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
}
