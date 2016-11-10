/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author JIGAR
 */
public class CommonDao {
      private Connection con;

    public CommonDao() throws Exception {
        con = ConnectionUtil.getConnection();
    }
    
    public void closeConnection() 
    {
        if(con != null)
        {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
        }
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    
}
