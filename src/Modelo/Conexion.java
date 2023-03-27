package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/ticketDB";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection obtenerConexion() throws SQLException {

           Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión establecida.");
        } catch (ClassNotFoundException e) {
            System.out.println("No se pudo cargar el driver.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("No se pudo establecer la conexión.");
            e.printStackTrace();
        }
        return conexion;
    }

}
