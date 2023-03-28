package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultasMunicipioTurno extends Conexion{
    
    public boolean registrar(MunicipioTurno mt){
        PreparedStatement ps = null;
        Connection con = obtenerConexion();
        String sql = "INSERT INTO municipio_has_turno (idmunicipio, nturno) values (?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, mt.getIdmunicipio());
            ps.setInt(2, mt.getNturno());
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

    public boolean modificar(MunicipioTurno mt){
        PreparedStatement ps = null;
        Connection con = obtenerConexion();
        String sql = "UPDATE municipio_has_turno SET idmunicipio =?, nturno =? WHERE idmunicipio =? AND nturno =?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, mt.getIdmunicipio());
            ps.setInt(2, mt.getNturno());
            ps.setInt(3, mt.getIdmunicipio());
            ps.setInt(4, mt.getNturno());
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

    public boolean eliminar(MunicipioTurno mt){
        PreparedStatement ps = null;
        Connection con = obtenerConexion();
        String sql = "DELETE FROM municipio_has_turno WHERE idmunicipio =? AND nturno =?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, mt.getIdmunicipio());
            ps.setInt(2, mt.getNturno());
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
    
    public boolean buscar(MunicipioTurno mt){
        PreparedStatement ps = null;
        Connection con = obtenerConexion();
        String sql = "SELECT * FROM municipio_has_turno WHERE idmunicipio =? AND nturno =?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, mt.getIdmunicipio());
            ps.setInt(2, mt.getNturno());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }else{
                return false;
            }
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
