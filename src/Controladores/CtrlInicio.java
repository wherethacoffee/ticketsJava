package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FrmInicio;
import vista.FrmLoginAdmin;
import vista.FrmAgendar;
import vista.FrmComprobante;
import Modelo.Alumno;
import Modelo.ConsultasAlumno;
import Modelo.ConsultasAdmin;
import Modelo.Admin;

public class CtrlInicio implements ActionListener {

    private final FrmInicio vista;

    // ------- Controlador de la vista LoginAdmin -------
    public CtrlInicio() {
        vista = new FrmInicio();

        vista.getBtnAdmin().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmLoginAdmin frmLoginAdmin = new FrmLoginAdmin();
                ConsultasAdmin cAdmin = new ConsultasAdmin();
                Admin admin = new Admin();
                CtrlLogin ctrlLogin = new CtrlLogin(admin, frmLoginAdmin, cAdmin);
                ctrlLogin.iniciar();
                vista.dispose();
            }
        });

        vista.getBtnAgendarCita().addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                FrmAgendar frmAgendar = new FrmAgendar();
                FrmComprobante frmcomprobante = new FrmComprobante();
                ConsultasAlumno conAl = new ConsultasAlumno();
                Alumno alumno = new Alumno();
                CtrlAlumno ctrlAlumno = new CtrlAlumno(alumno, conAl, frmAgendar, frmcomprobante);
                ctrlAlumno.iniciar();
                vista.dispose();
            }

        });
    }

    // ------- Controlador de la vista Agendar Cita --------
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBtnAgendarCita()) {
            // Lógica para abrir ventana de agendar cita
        }
    }

    public void iniciar() {
        vista.setVisible(true);
    }

}
