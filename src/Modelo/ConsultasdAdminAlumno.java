package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConsultasdAdminAlumno extends Conexion {
    public boolean buscarCurp(Alumno pro) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = obtenerConexion();
        String sql = "SELECT * FROM alumno WHERE curp = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, pro.getCurp());
            rs = ps.executeQuery();

            if (rs.next()) {
                pro.setCurp(rs.getString("curp"));
                pro.setNombre(rs.getString("nombre"));
                pro.setPaterno(rs.getString("Paterno"));
                pro.setMaterno(rs.getString("materno"));
                pro.setTelefono(rs.getString("telefono"));
                pro.setCorreo(rs.getString("correo"));
                pro.setNivel(rs.getString("nivel"));
                pro.setAsunto(rs.getString("asunto"));
                pro.setMunicipio_idmunicipio(rs.getInt("idmunicipio"));
                return true;
            }

            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println(e);

            }
        }

    }// end buscarCurp

    public boolean buscarNombre(Alumno pro) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = obtenerConexion();
        String sql = "SELECT * FROM alumno WHERE nombre = ? ;";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, pro.getNombre());
            rs = ps.executeQuery();

            if (rs.next()) {
                pro.setCurp(rs.getString("curp"));
                pro.setNombre(rs.getString("nombre"));
                pro.setPaterno(rs.getString("Paterno"));
                pro.setMaterno(rs.getString("materno"));
                pro.setTelefono(rs.getString("telefono"));
                pro.setCorreo(rs.getString("correo"));
                pro.setNivel(rs.getString("nivel"));
                pro.setAsunto(rs.getString("asunto"));
                pro.setMunicipio_idmunicipio(rs.getInt("idmunicipio"));
                return true;
            }

            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println(e);

            }
        }

    }// end buscarNombre

    public boolean modificarStatus(Alumno pro) {
        PreparedStatement ps = null;
        Connection conn = obtenerConexion();
        String sql = "UPDATE alumno SET status = ? where curp= ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, pro.getStatus());
            ps.setString(2, pro.getCurp());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println(e);

            }
        }
    }// end modificar

}
