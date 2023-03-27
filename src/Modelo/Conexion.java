package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    static Connection conn = null;
    static String base = "ticketdb";
    static String URL = "jdbc:mysql://localhost:3306/" + base;
    static String USER = "root";
    static String PASSWORD = "";

    public static Connection obtenerConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión establecida.");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);

        }
        return conn;
    }

}
