/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Beans.UserMaster.UserMasterVo;
import DAO.ConnectionHandler;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author User
 */
public class LoginModel extends CommonDao {
ConnectionHandler ch;
    public LoginModel() throws Exception {
        super();
          ch=new ConnectionHandler();
    }

    public ArrayList getData(String username, String password)
    {
        ArrayList data=new ArrayList();
        String query="select * from user_master where username='"+username+"' and password='"+password+"'";

        System.out.println(query);
        data=ch.selectQuery(query);
        System.out.println(data);
        return data;
    }

        public List<UserMasterVo> getAutoData() throws SQLException
    {
        System.out.println("insert dao layer........");
        List<UserMasterVo> list=new ArrayList<UserMasterVo>();

        PreparedStatement psmts = getCon().prepareStatement("SELECT * FROM user_master");
        System.out.println("psmts"+psmts);
        ResultSet rs = psmts.executeQuery();
        System.out.println("resultset"+rs);
        while(rs.next()){

              UserMasterVo vo=new UserMasterVo();
          vo.setUsername(rs.getString(2));
            list.add(vo);
        }

       String[] str = new String[list.size()];
       Iterator it = list.iterator();

       int i = 0;
       while(it.hasNext())
       {
           String p = (String)it.next();
           str[i] = p;
           i++;
       }
        return list;
    }


}
