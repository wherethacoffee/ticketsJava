package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConsultasAlumno extends Conexion {
    public boolean registrar(Alumno pro) {
        PreparedStatement ps = null;
        Connection conn = obtenerConexion();
        String sql = "INSERT INTO alumno (curp, nombre, paterno, materno, telefono, correo, nivel, " +
                "asunto, turno, idmunicipio) SELECT ?, ?, ?, ?, ?, ?, ?, ?, (SELECT IFNULL(MAX(turno), 0)" +
                " + 1 FROM alumno WHERE idmunicipio = ?), ?;";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, pro.getCurp());
            ps.setString(2, pro.getNombre());
            ps.setString(3, pro.getPaterno());
            ps.setString(4, pro.getMaterno());
            ps.setString(5, pro.getTelefono());
            ps.setString(6, pro.getCorreo());
            ps.setString(7, pro.getNivel());
            ps.setString(8, pro.getAsunto());
            ps.setInt(9, pro.getMunicipio_idmunicipio());
            ps.setInt(10, pro.getMunicipio_idmunicipio());
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

    }// end registrar

    public boolean modificar(Alumno pro) {
        PreparedStatement ps = null;
        Connection conn = obtenerConexion();
        String sql = "UPDATE alumno SET nombre=?,Paterno=?,materno=?,telefono=?,correo=?,nivel=?,asunto=?,idmunicipio=?  where curp=?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, pro.getNombre());
            ps.setString(2, pro.getPaterno());
            ps.setString(3, pro.getMaterno());
            ps.setString(4, pro.getTelefono());
            ps.setString(5, pro.getCorreo());
            ps.setString(6, pro.getNivel());
            ps.setString(7, pro.getAsunto());
            ps.setInt(8, pro.getMunicipio_idmunicipio());
            ps.setString(9, pro.getCurp());
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

    public boolean eliminar(Alumno pro) {
        PreparedStatement ps = null;
        Connection conn = obtenerConexion();
        String sql = "DELETE FROM alumno WHERE curp=?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, pro.getCurp());
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

    }// end eliminar

    public boolean buscar(Alumno pro) {
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

    }// end buscar

    public ArrayList<String> cbMunicipio_fill() {
        ArrayList<String> nombresMunicipio = new ArrayList<String>();
        // PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = obtenerConexion();
        String sql = "SELECT nombremunicipio FROM municipio";
        try {
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                nombresMunicipio.add(rs.getString("nombremunicipio"));
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        return nombresMunicipio;
    }

    public boolean comprobante_fill(Alumno pro){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = obtenerConexion();
        String sql = "SELECT nombre, asunto, turno FROM alumno WHERE curp =?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, pro.getCurp());
            rs = ps.executeQuery();
            if (rs.next()) {
                pro.setNombre(rs.getString("nombre"));
                pro.setAsunto(rs.getString("asunto"));
                pro.setTurno(rs.getInt("turno"));
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally{
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }

    }

}// end class