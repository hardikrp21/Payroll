/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.EmpLeaveDetails;

import Beans.LeaveBeans;
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
public class LeaveModel extends CommonDao{
    ConnectionHandler ch;
    public LeaveModel() throws Exception {
        super();
        ch = new ConnectionHandler();
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
    
    public String getAbsencePolicyData()
    {
      List  policy_data=new ArrayList();
        String AbsencePolicyName="";
        try
        {
        String query="select absence_policy_id,absence_policy_name from absence_policy";
        policy_data=ch.selectQuery(query);
            System.out.println(query);
        AbsencePolicyName="<select name='AbsencePolicyData'>";
        for(int i=0;i< policy_data.size();i++)
        {
            List inner=(List) policy_data.get(i);
            if(inner.get(0).toString().equals("1"))
                AbsencePolicyName+="<option value='"+inner.get(0)+"' selected>"+inner.get(1)+"</option>";
            else
                AbsencePolicyName+="<option value='"+inner.get(0)+"'>"+inner.get(1)+"</option>";
        }
        AbsencePolicyName+="</select>";
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return AbsencePolicyName;
    }
    
    public int InsertEmpWagesDetails(LeaveBeans bean) throws SQLException {
    int i=0;
       System.out.println("in the model");
        PreparedStatement psmts = getCon().prepareStatement("insert into employee_leave_details(employee_id,absence_policy_id,absent_days) values(?,?,?)");
        
        psmts.setInt(1, bean.getEmployee_id());
        psmts.setInt(2, bean.getAbsence_policy_id());
        psmts.setString(3, bean.getAbsent_days());
       
        
        System.out.println("employee"+bean.getEmployee_id());
      i = psmts.executeUpdate();
    return i;
    }
}
