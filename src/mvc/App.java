package mvc;

import Controladores.CtrlAlumno;
import Controladores.CtrlInicio;
import Modelo.Alumno;
import Modelo.Municipio;
import vista.FrmAgendar;
import Modelo.ConsultasAlumno;
import vista.FrmAdminAgenda;
import Controladores.CtrlTurno;
import Modelo.Turno;
import vista.FrmAdminAgenda;
import Modelo.ConsultasTurno;
import Modelo.Admin;
import Modelo.ConsultasAdmin;
import vista.FrmLoginAdmin;
import Controladores.CtrlLogin;

public class App {
    public static void main(String[] args) throws Exception {
        // CtrlInicio ctrlInicio = new CtrlInicio();
        // ctrlInicio.iniciar();

        Alumno al = new Alumno();
        FrmAgendar frmAgendar = new FrmAgendar();
        ConsultasAlumno ca = new ConsultasAlumno();

        CtrlAlumno ctrlAlumno = new CtrlAlumno(al, ca, frmAgendar);
        ctrlAlumno.iniciar();

        // Turno tu = new Turno();
        // FrmAdminAgenda frmAdminAgenda = new FrmAdminAgenda();
        // ConsultasTurno conTur = new ConsultasTurno();

        // CtrlTurno ctrlTurno = new CtrlTurno(frmAdminAgenda, conTur, tu);
        // ctrlTurno.iniciar();

        // Admin ad = new Admin();
        // FrmLoginAdmin frmLoginAdmin = new FrmLoginAdmin();
        // ConsultasAdmin conAdmin = new ConsultasAdmin();

        // CtrlLogin ctrlLogin = new CtrlLogin(ad, frmLoginAdmin, conAdmin);
        // ctrlLogin.iniciar();

    }

}
