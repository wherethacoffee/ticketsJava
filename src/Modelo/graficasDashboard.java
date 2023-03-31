package Modelo;

import java.sql.*;
import javax.swing.JFrame;
import org.jfree.chart.*;
import org.jfree.data.general.DefaultPieDataset;
public class graficasDashboard extends Conexion{
    
    public JFreeChart crearGrafica(Connection cn, String consulta) throws SQLException {
        PreparedStatement ps = cn.prepareStatement(consulta);
        ResultSet rs = ps.executeQuery();
        
        DefaultPieDataset ds = new DefaultPieDataset();

        while(rs.next()){
            String status = rs.getString("status");
            int total = rs.getInt("total");
            ds.setValue(status, total);
        }
        JFreeChart chart = ChartFactory.createPieChart3D("Conteo total de Pendiente y Realizado", ds, true, true, true);

        return chart;
    }

    public void crearFrame() throws SQLException{
        Connection conn = obtenerConexion();
        String consulta = "SELECT * FROM status_total";

        JFreeChart chart = crearGrafica(conn, consulta);
        ChartPanel chartPanel = new ChartPanel(chart);

        JFrame frame = new JFrame("Status del total de solicitudes");
        frame.setContentPane(chartPanel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
