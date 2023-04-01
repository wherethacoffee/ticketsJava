package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.FrmAdminInicio;
import vista.FrmAgendar;
import vista.FrmGestorAdmin;
import vista.FrmGestorMunicipio;
import Modelo.Alumno;
import Modelo.Admin;
import Modelo.ConsultasAdmin;
import Modelo.ConsultasAlumno;
import Modelo.Municipio;

public class CtrlAdminInicio implements ActionListener {
    private final FrmAdminInicio vista;

    public void iniciar() {
        vista.setVisible(true);
    }

    public CtrlAdminInicio() {
        vista = new FrmAdminInicio();

        vista.getBtnAdmin().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmGestorAdmin frmGestorAdmin = new FrmGestorAdmin();
                ConsultasAdmin cnAdmin = new ConsultasAdmin();
                Admin admin = new Admin();
                CtrlGestorAdmin ctrlAdmin = new CtrlGestorAdmin(admin, frmGestorAdmin, cnAdmin);
                ctrlAdmin.iniciar();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
