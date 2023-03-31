package mvc;

import Controladores.CtrlAlumno;
import Controladores.CtrlInicio;
import Modelo.Alumno;
import Modelo.Municipio;
import vista.FrmAgendar;
import Modelo.ConsultasAlumno;
// import vista.FrmAdminAgenda;
// import vista.FrmAdminAgenda;
import Modelo.Admin;
import Modelo.ConsultasAdmin;
import vista.FrmLoginAdmin;
import Controladores.CtrlLogin;

public class App {
    public static void main(String[] args) throws Exception {
        CtrlInicio ctrlInicio = new CtrlInicio();
        ctrlInicio.iniciar();
    }

}
