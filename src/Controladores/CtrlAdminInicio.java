package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import vista.FrmAdminInicio;
import vista.FrmAgendar;
import vista.FrmGestorAdmin;
import vista.FrmGestorMunicipio;
import Modelo.Alumno;
import Modelo.Admin;
import Modelo.ConsultasAdmin;
import Modelo.ConsultasAlumno;
import Modelo.ConsultasMunicipio;
import Modelo.Municipio;
import Modelo.graficasDashboard;

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

        vista.getBtnMunicipios().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmGestorMunicipio frmGestorMunicipio = new FrmGestorMunicipio();
                ConsultasMunicipio cnMunicipio = new ConsultasMunicipio();
                Municipio municipio = new Municipio();
                CtrlMunicipioAgenda ctrlMunicipio = new CtrlMunicipioAgenda(municipio, cnMunicipio, frmGestorMunicipio);
                ctrlMunicipio.iniciar();
            }
        });

        vista.getBtnAgenda().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmAgendar frmAgendar = new FrmAgendar();
                ConsultasAlumno cnAlumno = new ConsultasAlumno();
                Alumno alumno = new Alumno();
                CtrlAlumno ctrlAlumno = new CtrlAlumno(alumno, cnAlumno, frmAgendar);
                ctrlAlumno.iniciar();
            }

        });

        vista.getBtnGrafica1().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                graficasDashboard gr = new graficasDashboard();
                try {
                    gr.crearFrame();
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
