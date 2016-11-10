package DAO;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

public class ConnectionHandler {

    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    public ConnectionHandler() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Load......");
            con=DriverManager.getConnection("jdbc:mysql://localhost/payroll","root","root");
            System.out.println("Connection .......");
            st=con.createStatement();


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

     public ArrayList selectQuery(String query)
    {
        ArrayList data=new ArrayList();
        try{
            rs=st.executeQuery(query);
            ResultSetMetaData rsmd=rs.getMetaData();
            int cc=rsmd.getColumnCount();
            while(rs.next())
            {
                ArrayList temp=new ArrayList();
                    for(int i=1;i<=cc;i++)
                    {
                        temp.add(rs.getObject(i));
                    }
                data.add(temp);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return data;
    }

     

    public boolean insertQuery(String query)
    {
        boolean result=false;
        try{
            int c=st.executeUpdate(query);
            if(c>0)
                result=true;
            else
                result=false;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return result;
    }

     public boolean executeUpdate(String query)
    {
        boolean result=false;
        try{
            int c=st.executeUpdate(query);
            if(c>0)
                result=true;
            else
                result=false;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return result;
    }
    public boolean insertQueryPsmts(String query,Object data[])
    {
        boolean result=false;
        try{
            PreparedStatement psmts=con.prepareStatement(query);
            for(int i=0;i<data.length;i++)
            {
                psmts.setObject(i+1, data[i]);
            }
            int c=st.executeUpdate(query);
            if(c>0)
                result=true;
            else
                result=false;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return result;
    }


}
