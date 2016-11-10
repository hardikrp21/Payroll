/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.MassPunchScheduleMaster;

import Beans.MassPunchScheduleMaster.MassPunchScheduleMasterBean;
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
public class MassPunchScheduleMasterModel extends CommonDao{
ConnectionHandler ch;
    public MassPunchScheduleMasterModel() throws Exception {
        super();
        ch=new ConnectionHandler();
    }
    public String getSchedulePolicyData()
    {
      List  policy_data=new ArrayList();
        String SchedulePolicyName="";
        try
        {
        String query="select schedule_policy_id,schedule_policy_name from schedule_policy_master";
        policy_data=ch.selectQuery(query);
            System.out.println(query);
        SchedulePolicyName="<select name='SchedulePolicyData'>";
        for(int i=0;i< policy_data.size();i++)
        {
            List inner=(List) policy_data.get(i);
            if(inner.get(0).toString().equals("1"))
                SchedulePolicyName+="<option value='"+inner.get(0)+"' selected>"+inner.get(1)+"</option>";
            else
                SchedulePolicyName+="<option value='"+inner.get(0)+"'>"+inner.get(1)+"</option>";
        }
        SchedulePolicyName+="</select>";
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return SchedulePolicyName;
    }

     public String getDepartmentData()
    {
      List  policy_data=new ArrayList();
        String departmentName="";
        try
        {
        String query="select department_id,department_name from department";
        policy_data=ch.selectQuery(query);
            System.out.println(query);
        departmentName="<select name='DepartmentData'>";
        for(int i=0;i< policy_data.size();i++)
        {
            List inner=(List) policy_data.get(i);
            if(inner.get(0).toString().equals("1"))
                departmentName+="<option value='"+inner.get(0)+"' selected>"+inner.get(1)+"</option>";
            else
                departmentName+="<option value='"+inner.get(0)+"'>"+inner.get(1)+"</option>";
        }
        departmentName+="</select>";
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return departmentName;
    }

      public int InsertMassPunchSchedule(MassPunchScheduleMasterBean bean) throws SQLException {
        int i = 0;
        PreparedStatement psmts = getCon().prepareStatement("insert into mass_punch_schedule_master(mass_punch_schedule_name,mass_punch_schedule_status ,mass_punch_schedule_in_time ,mass_punch_schedule_out_time,mass_punch_schedule_total_time,mass_punch_schedule_start_date ,mass_punch_schedule_end_date,sun ,mon ,tue ,wed,thu ,fri ,sat,schedule_policy_id,department_id ) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        psmts.setString(1, bean.getMassPunchSchedulename());
        psmts.setString(2, bean.getMass_punch_schedule_status());
        psmts.setString(3, bean.getMass_punch_schedule_in_time());
        psmts.setString(4, bean.getMass_punch_schedule_out_time());
        psmts.setString(5, bean.getMass_punch_schedule_total_time());
        psmts.setString(6, bean.getMass_punch_schedule_start_date());
        psmts.setString(7, bean.getMass_punch_schedule_end_date());
        psmts.setInt(8, bean.getSun());
        psmts.setInt(9, bean.getMon());
        psmts.setInt(10, bean.getTue());
        psmts.setInt(11, bean.getWed());
        psmts.setInt(12, bean.getThu());
        psmts.setInt(13, bean.getFri());
        psmts.setInt(14, bean.getSat());
        psmts.setInt(15, bean.getSchedule_policy_id());
        psmts.setInt(16, bean.getDepartment_id());

     

        i = psmts.executeUpdate();
        return i;
    }

       public ArrayList MassPunchTableData(){
       ArrayList data=new ArrayList();
        String query="SELECT mass_punch_schedule_master.mass_punch_schedule_id,mass_punch_schedule_master.mass_punch_schedule_name,schedule_policy_master.schedule_policy_name,department.department_name FROM mass_punch_schedule_master INNER JOIN schedule_policy_master ON mass_punch_schedule_master.schedule_policy_id=schedule_policy_master.schedule_policy_id INNER JOIN department ON mass_punch_schedule_master.department_id=department.department_id";

        System.out.println(query);
        data=ch.selectQuery(query);
        return data;
    }

}
