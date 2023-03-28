package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultasTurno extends Conexion{

    public boolean registrar(Turno trn){
        PreparedStatement ps = null;
        Connection con = obtenerConexion();
        String sql = "INSERT INTO turno (nturno, curp, idmunicipio, status) values (?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, trn.getNturno());
            ps.setString(2, trn.getCurp());
            ps.setInt(3, trn.getIdmunicipio());
            ps.setString(4, trn.getStatus());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean modificar(Turno trn){
        PreparedStatement ps = null;
        Connection con = obtenerConexion();
        String sql = "UPDATE turno SET nturno =?, curp =?, idmunicipio =?, status =? WHERE nturno =?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, trn.getNturno());
            ps.setString(2, trn.getCurp());
            ps.setInt(3, trn.getIdmunicipio());
            ps.setString(4, trn.getStatus());
            ps.setInt(5, trn.getNturno());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean eliminar(Turno trn){
        PreparedStatement ps = null;
        Connection con = obtenerConexion();
        String sql = "DELETE FROM turno WHERE nturno =?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, trn.getNturno());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean buscar(Turno trn){
        PreparedStatement ps = null;
        Connection con = obtenerConexion();
        String sql = "SELECT * FROM turno WHERE nturno =?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, trn.getNturno());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
            return false;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}
