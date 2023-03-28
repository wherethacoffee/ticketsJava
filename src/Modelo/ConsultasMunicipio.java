package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultasMunicipio extends Conexion {
    public boolean registrar(Municipio pro){
        PreparedStatement ps = null;
        Connection conn = obtenerConexion();
        String sql= "INSERT INTO municipio (nombre) values (?)";
        try{
            ps= conn.prepareStatement(sql);
            ps.setString(1,pro.getNombre());
            ps.execute();
            return true;
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        } 
        finally{
            try{
                conn.close();
            }
            catch(SQLException e){
                System.err.println(e);
            
            }
        }
        
    }//end registrar
    
    public boolean modificar(Municipio pro){
        PreparedStatement ps = null;
        Connection conn = obtenerConexion();
        String sql= "UPDATE municipio SET nombre=? where idmunicipio=?";
        try{
            ps= conn.prepareStatement(sql);
            ps.setString(1,pro.getNombre());
            ps.setInt(2,pro.getIdmunicipio());
            
            ps.execute();
            return true;
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        } 
        finally{
            try{
                conn.close();
            }
            catch(SQLException e){
                System.err.println(e);
            
            }
        }
        
    }//end modificar
    
    public boolean eliminar(Municipio pro){
        PreparedStatement ps = null;
        Connection conn = obtenerConexion();
        String sql= "DELETE FROM municipio WHERE idmunicipio=?";
        try{
            ps= conn.prepareStatement(sql);
            ps.setInt(1,pro.getIdmunicipio());
            ps.execute();
            return true;
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        } 
        finally{
            try{
                conn.close();
            }
            catch(SQLException e){
                System.err.println(e);
            
            }
        }
        
    }//end eliminar
    
    public boolean buscar(Municipio pro){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = obtenerConexion();
        String sql= "SELECT * FROM municipio WHERE idmunicipio=?";
        try{
            ps= conn.prepareStatement(sql);
            ps.setInt(1,pro.getIdmunicipio());
            rs=ps.executeQuery();
            
            if (rs.next()){
                pro.setNombre(rs.getString("nombre"));
                return true;  
            }
                    
            return false;
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        } 
        finally{
            try{
                conn.close();
            }
            catch(SQLException e){
                System.err.println(e);
            
            }
        }
        
    }//end buscar
}
