package Model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Paresb
 */
public class ConnectionUtil {
    
    static {
        try {
            Class.forName(Driver.class.getName());
            System.out.println("Driver Loaded Successfully.");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
   
    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection("jdbc:mysql://localhost/payroll","root","root");
    }
    
    public static void closeConnection(Connection con){
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    
}
