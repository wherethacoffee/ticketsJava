package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConsultasAdmin extends Conexion {
    public boolean registrar(Admin ad) {
        PreparedStatement ps = null;
        Connection con = obtenerConexion();
        String sql = "inser into admin (idusuario, usuario, contrasena) values (?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ad.getIdusuario());
            ps.setString(2, ad.getUsuario());
            ps.setString(3, ad.getUsuario());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }// end-registrar

    public boolean modificar(Admin ad) {
        PreparedStatement ps = null;
        Connection con = obtenerConexion();
        String sql = "update admin set usuario=?, contrasena=? where id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ad.getUsuario());
            ps.setString(2, ad.getContraseña());
            ps.setInt(3, ad.getIdusuario());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }// end-modificar

    public boolean eliminar(Admin ad) {
        PreparedStatement ps = null;
        Connection con = obtenerConexion();
        String sql = "delete from admin where id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ad.getIdusuario());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }//
}
