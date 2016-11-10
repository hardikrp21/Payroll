/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.MassPunchScheduleDetails;

import Beans.MassPunchScheduleDetails.MassPunchScheduleDetailsBean;
import DAO.ConnectionHandler;
import Model.CommonDao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class MassPunchScheduleDetailsModel extends CommonDao {
ConnectionHandler ch;
    public MassPunchScheduleDetailsModel() throws Exception {
        super();
        ch=new ConnectionHandler();
    }
    
    public String getMassPunchScheduleData()
    {
        List  policy_data=new ArrayList();
        String MassPunchSchedule="";
        try
        {
        String query="select mass_punch_schedule_id,mass_punch_schedule_name from mass_punch_schedule_master";
        policy_data=ch.selectQuery(query);
            System.out.println(query);
         MassPunchSchedule="<select name='MassPunchScheduleData'>";
        for(int i=0;i< policy_data.size();i++)
        {
            List inner=(ArrayList) policy_data.get(i);
            if(inner.get(0).toString().equals("1"))
                MassPunchSchedule+="<option value='"+inner.get(0)+"' selected>"+inner.get(1)+"</option>";
            else
                MassPunchSchedule+="<option value='"+inner.get(0)+"'>"+inner.get(1)+"</option>";
        }
        MassPunchSchedule+="</select>";
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return MassPunchSchedule;
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

     public int InsertEmployeesDetails(MassPunchScheduleDetailsBean bean) throws SQLException {
    int i=0;
       System.out.println("in the model");
        PreparedStatement psmts = getCon().prepareStatement("insert into mass_punch_schedule_details(mass_punch_schedule_id,employees_id) values(?,?)");
        psmts.setInt(1, bean.getMass_punch_schedule_id());
        psmts.setInt(2, bean.getEmployees_id());
        System.out.println("MASSSschedule"+bean.getMass_punch_schedule_id());

        System.out.println("employee"+bean.getEmployees_id());
      i = psmts.executeUpdate();
    return i;
    }

      public ArrayList MassPunchDetailTableData(){
       ArrayList data=new ArrayList();
        String query="SELECT mass_punch_schedule_details.mass_punch_schedule_details_id,mass_punch_schedule_master.mass_punch_schedule_name,employee_master.employee_first_name FROM mass_punch_schedule_details INNER JOIN mass_punch_schedule_master ON mass_punch_schedule_details.mass_punch_schedule_id=mass_punch_schedule_master.mass_punch_schedule_id INNER JOIN employee_master ON mass_punch_schedule_details.employees_id=employee_master.employee_id ";

        System.out.println(query);
        data=ch.selectQuery(query);
        return data;
    }



}
