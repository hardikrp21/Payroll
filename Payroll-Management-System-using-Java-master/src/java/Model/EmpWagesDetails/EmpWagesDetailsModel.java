/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.EmpWagesDetails;

import Beans.EmpWagesDetailstBean;
import DAO.ConnectionHandler;
import Model.CommonDao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JIGAR
 */
public class EmpWagesDetailsModel  extends CommonDao{
    ConnectionHandler ch;
    public EmpWagesDetailsModel() throws Exception {
        super();
        ch=new ConnectionHandler();
        
    }
    
    public String getEmployeeData()
    {
        List  policy_data=new ArrayList();
        String Employee="";
        try
        {
        String query="select employee_id,employee_first_name from employee_master";
        policy_data=ch.selectQuery(query);
            System.out.println(query);
         Employee="<select name='EmployeeData'>";
        for(int i=0;i< policy_data.size();i++)
        {
            List inner=(ArrayList) policy_data.get(i);
            if(inner.get(0).toString().equals("1"))
                Employee+="<option value='"+inner.get(0)+"' selected>"+inner.get(1)+"</option>";
            else
                Employee+="<option value='"+inner.get(0)+"'>"+inner.get(1)+"</option>";
        }
        Employee+="</select>";
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return Employee;
    }
    
    public int InsertEmpWagesDetails(EmpWagesDetailstBean bean) throws SQLException {
    int i=0;
       System.out.println("in the model");
        PreparedStatement psmts = getCon().prepareStatement("insert into emp_wages_details(employee_id,type,wages,effective_date) values(?,?,?,?)");
        
        psmts.setInt(1, bean.getEmployee_id());
        psmts.setString(2, bean.getType());
        psmts.setString(3, bean.getWages());
        psmts.setString(4, bean.getEffective_date());
        
        System.out.println("employee"+bean.getEmployee_id());
      i = psmts.executeUpdate();
    return i;
    }
    
}
