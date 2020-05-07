/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Default;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Johan
 */
public class MySQLConexion {
    public static final String URL = "jdbc:mysql://localhost:3306/redsocial";
    public static final String USERNAME = "admin1";
    public static final String PASSWORD = "1234";
    
    public static Connection getConnection() throws Exception
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        catch(Exception e)
        {
            throw Exception("No se realizo la conexion");
        }
        return con;
    }

    private static Exception Exception(String no_se_realizo_la_conexion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
