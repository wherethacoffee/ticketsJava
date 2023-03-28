package mvc;

import Controladores.CtrlAlumno;
import Controladores.CtrlInicio;
import Modelo.Alumno;
import Modelo.Municipio;
import vista.FrmAgendar;
import Modelo.ConsultasAlumno;

public class App {
    public static void main(String[] args) throws Exception {
        Alumno al = new Alumno();
        Municipio m = new Municipio();
        FrmAgendar frmAgendar = new FrmAgendar();
        ConsultasAlumno ca = new ConsultasAlumno();

        CtrlInicio ctrlInicio = new CtrlInicio();
        ctrlInicio.iniciar();
        CtrlAlumno ctrlAlumno = new CtrlAlumno(al, ca, frmAgendar, m);
    }

}
