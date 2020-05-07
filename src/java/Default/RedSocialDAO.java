/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Default;

import Default.MySQLConexion;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Johan
 */
public class RedSocialDAO {
    
    private RedSocialDTO user; 
    
    public static void main(String[] args) {
        RedSocialDTO user = new RedSocialDTO();
        user.setCodigo(123456);
        user.setNombre("Johan");
        user.setCorreo("johan@g.com");
        user.setContrasena("asdfg");
        RedSocialDAO a = new RedSocialDAO(user);
        try {
            //a.registrarUsuario();
            System.out.println(a.buscarUsuario(123456));
        } catch (Exception ex) {
            Logger.getLogger(RedSocialDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public RedSocialDAO() {
    }

    public RedSocialDAO(RedSocialDTO user) {
        this.user = user;
    }
    
    public void registrarUsuario() throws Exception
    {
        Connection con = MySQLConexion.getConnection();
        PreparedStatement ps = (PreparedStatement) con.prepareStatement("INSERT INTO usuario(codigo, nombre, correo, contrasena) VALUES(?,?,?,?)");
        System.out.println(user.getCodigo());
        ps.setInt(1, user.getCodigo());
        ps.setString(2, user.getNombre());
        ps.setString(3, user.getCorreo());
        ps.setString(4, user.getContrasena());
        ps.execute();
        con.close();
    }
    
    public RedSocialDTO buscarUsuario(Integer codigo) throws SQLException, Exception
    {
        Connection con = MySQLConexion.getConnection();
        PreparedStatement ps = (PreparedStatement) con.prepareCall("SELECT * FROM usuario");
        ResultSet res = ps.executeQuery();
        RedSocialDTO usuario = new RedSocialDTO();
        while(res.next())
        {
            if(res.getInt(1)==codigo)
            {
                usuario.setCodigo(res.getInt(1));
                usuario.setNombre(res.getString(2));
                usuario.setCorreo(res.getString(3));
                usuario.setContrasena(res.getString(4));
            }
        }
        return usuario;
    }
}
