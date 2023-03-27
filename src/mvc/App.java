package mvc;
import Controladores.CtrlInicio;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.SQLException;


public class App {
        public static void main(String[] args) throws Exception {
            CtrlInicio ctrlInicio = new CtrlInicio();
            ctrlInicio.iniciar();

        Connection conn = Conexion.obtenerConexion();
        if(conn != null) {
            System.out.println("Conexion exitosa");
        } else {
            System.out.println("No se pudo hacer la conexión");
        }

    }

}
