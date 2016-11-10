/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Employee;

import Beans.EmployeeMaster.EmployeeBean;
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
public class EmployeeMasterModel extends CommonDao {
ConnectionHandler ch;
    public EmployeeMasterModel() throws Exception {
        super();
        ch=new ConnectionHandler();
    }

    public String getPayPeriodScheduleData()
    {
        List  policy_data=new ArrayList();
        String PayPeriodSchedule="";
        try
        {
        String query="select pay_period_schedule_id,pay_period_schedule_name from pay_period_schedule";
        policy_data=ch.selectQuery(query);
            System.out.println(query);
         PayPeriodSchedule="<select name='PayPeriodScheduleData'>";
        for(int i=0;i< policy_data.size();i++)
        {
            List inner=(ArrayList) policy_data.get(i);
            if(inner.get(0).toString().equals("1"))
                PayPeriodSchedule+="<option value='"+inner.get(0)+"' selected>"+inner.get(1)+"</option>";
            else
                PayPeriodSchedule+="<option value='"+inner.get(0)+"'>"+inner.get(1)+"</option>";
        }
        PayPeriodSchedule+="</select>";
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return PayPeriodSchedule;
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

    public int employeeInsertDetails(EmployeeBean vo) throws SQLException
    {
         int i=0;
        PreparedStatement psmts = getCon().prepareStatement("insert into employee_master (employee_first_name, employee_middle_name, employee_last_name, employee_sex, employee_address, employee_city, employee_state,employee_country,employee_zip_code,employee_work_phone,employee_home_phone,employee_mobile_phone,employee_fax_no,employee_email_id,employee_birth_date,schedule_policy_id,pay_period_schedule_id) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        psmts.setString(1, vo.getEfirstname());
        psmts.setString(2, vo.getEmiddlename());
        psmts.setString(3, vo.getElastname());
        psmts.setString(4, vo.getEsex());
        psmts.setString(5, vo.getEaddress());
        psmts.setString(6, vo.getEcity());
        psmts.setString(7, vo.getEstate());
        psmts.setString(8, vo.getEcountry());
        psmts.setString(9, vo.getEzipcode());
        psmts.setString(10, vo.getEworkphone());
        psmts.setString(11, vo.getEhomephone());
        psmts.setString(12, vo.getEmobilephone());
        psmts.setString(13, vo.getEfaxno());
        psmts.setString(14, vo.getEemailid());
        psmts.setString(15, vo.getEbirthdate());
        psmts.setInt(16, vo.getSchedule_policy_id());
        psmts.setInt(17, vo.getPay_period_schedule_id());
        i = psmts.executeUpdate();
        System.out.println("list"  +i);
      return i;
    }

   public ArrayList EmployeeTableData(){
       ArrayList data=new ArrayList();
        String query="SELECT employee_id,employee_first_name, employee_middle_name, employee_last_name, employee_sex, employee_address, employee_city, employee_state,employee_country,employee_zip_code,employee_work_phone,employee_home_phone,employee_mobile_phone,employee_fax_no,employee_email_id,employee_birth_date FROM employee_master ";

        System.out.println(query);
        data=ch.selectQuery(query);
        return data;
    }

    public ArrayList EmployeeSelectdate(String id){
       ArrayList data=new ArrayList();
        String query="SELECT employee_id,employee_first_name, employee_middle_name, employee_last_name, employee_sex, employee_address, employee_city, employee_state,employee_country,employee_zip_code,employee_work_phone,employee_home_phone,employee_mobile_phone,employee_fax_no,employee_email_id,employee_birth_date FROM employee_master where employee_id="+id;

        System.out.println(query);
        data=ch.selectQuery(query);
        return data;
    }

    public boolean EmployeeupdateData(EmployeeBean ev){
       String query="update employee_master set employee_first_name='"+ev.getEfirstname()+"', employee_middle_name='"+ev.getEmiddlename()+"', employee_last_name='"+ev.getElastname()+"', employee_sex='"+ev.getEsex()+"', employee_address='"+ev.getEaddress()+"',"
               + "employee_city='"+ev.getEcity()+"', employee_state='"+ev.getEstate()+"',employee_country='"+ev.getEcountry()+"',employee_zip_code='"+ev.getEzipcode()+"',employee_work_phone='"+ev.getEworkphone()+"',employee_home_phone='"+ev.getEhomephone()+"',"
               + "employee_mobile_phone='"+ev.getEmobilephone()+"',employee_fax_no='"+ev.getEfaxno()+"',employee_email_id='"+ev.getEemailid()+"',employee_birth_date='"+ev.getEbirthdate()+"' where employee_id='"+ev.getId()+"'";

     // String query="update company_master set company_full_name='"+companyMasterVo.getCfullname()+"',company_short_name='"+companyMasterVo.getCshortname()+"'where company_id='"+companyMasterVo.getId()+"'";
       System.out.println(query);
      boolean data=ch.executeUpdate(query);

       return data;
   }

public boolean  EmployeeDelete(String id)
    {
        String query="delete from employee_master where employee_id="+id;
        System.out.println("DELETE....."+query);
       boolean result=ch.executeUpdate(query);
        return result;
    }




}
