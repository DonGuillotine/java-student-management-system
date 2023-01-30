/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author Donald
 */
public class DBConnection {
public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException{
    PreparedStatement ps = null;
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/NewDB ", "Donald", "1234567890");
    
    ps = conn.prepareStatement(sql);
    return ps;
            
}
}
