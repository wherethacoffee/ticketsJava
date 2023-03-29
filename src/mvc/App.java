package mvc;

// import Controladores.CtrlAlumno;
// import Controladores.CtrlInicio;
// import Modelo.Alumno;
// import Modelo.Municipio;
// import vista.FrmAgendar;
// import Modelo.ConsultasAlumno;
// import vista.FrmAdminAgenda;
// import Controladores.CtrlTurno;
// import Modelo.Turno;
// import vista.FrmAdminAgenda;
// import Modelo.ConsultasTurno;
import Modelo.Admin;
import Modelo.ConsultasAdmin;
import vista.FrmLoginAdmin;
import Controladores.CtrlLogin;

public class App {
    public static void main(String[] args) throws Exception {
        // Alumno al = new Alumno();
        // Municipio m = new Municipio();
        // FrmAgendar frmAgendar = new FrmAgendar();
        // ConsultasAlumno ca = new ConsultasAlumno();

        // CtrlInicio ctrlInicio = new CtrlInicio();
        // ctrlInicio.iniciar();
        // CtrlAlumno ctrlAlumno = new CtrlAlumno(al, ca, frmAgendar, m);
        // ctrlAlumno.iniciar();

        // Turno tu = new Turno();
        // FrmAdminAgenda frmAdminAgenda = new FrmAdminAgenda();
        // ConsultasTurno cu = new ConsultasTurno();

        // CtrlTurno ctrlTurno = new CtrlTurno(frmAdminAgenda, cu, tu);
        // ctrlTurno.iniciar();
        Admin ad = new Admin();
        FrmLoginAdmin frmLoginAdmin = new FrmLoginAdmin();
        ConsultasAdmin ca = new ConsultasAdmin();

        CtrlLogin ctrlLogin = new CtrlLogin(ad, frmLoginAdmin, ca);
        ctrlLogin.iniciar();

    }

}
