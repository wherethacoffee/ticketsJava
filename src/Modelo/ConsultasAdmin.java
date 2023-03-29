package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultasAdmin extends Conexion {
    public boolean registrar(Admin ad) {
        PreparedStatement ps = null;
        Connection con = obtenerConexion();
        String sql = "insert into admin (usuario, contrasena) values (?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ad.getUsuario());
            ps.setString(2, ad.getUsuario());
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
        String sql = "update admin set usuario=?, contrasenia=? where idusuario=?";
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
        String sql = "delete from admin where idusuario = ?";
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
    }// end-eliminar

    public boolean buscar(Admin ad) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = obtenerConexion();
        String sql = "select * from admin where idusuario = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ad.getIdusuario());
            rs = ps.executeQuery();

            if (rs.next()) {
                ad.setIdusuario(Integer.parseInt(rs.getString("idusuario")));
                ad.setUsuario(rs.getString("usuario"));
                ad.setContraseña(rs.getString("contrasenia"));
                return true;
            }
            return false;
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
    }// end-buscar

    public boolean verificar_credenciales(Admin ad) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = obtenerConexion();
        String sql = "select * from admin where usuario =? and contrasenia =?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ad.getUsuario());
            ps.setString(2, ad.getContraseña());
            rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }
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
    }
}
