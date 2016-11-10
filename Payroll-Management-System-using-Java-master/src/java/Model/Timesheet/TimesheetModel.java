/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Timesheet;

import Beans.Timesheet.TimesheetBean;
import DAO.ConnectionHandler;
import Model.CommonDao;

import java.net.UnknownHostException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class TimesheetModel extends CommonDao{
ConnectionHandler ch;
    public TimesheetModel() throws Exception {
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

     public int InsertTimeSheetDetails(TimesheetBean bean) throws SQLException, UnknownHostException {
    int i=0;
       System.out.println("in the model");
        PreparedStatement psmts = getCon().prepareStatement("insert into timesheet(employees_id,checkin,checkout,timestamp,ip_checkin,ip_checkout) values(?,?,?,now(),?,?)");
         System.out.println("pstms"+psmts);
        psmts.setInt(1, bean.getEmployee_id());
        psmts.setInt(2, bean.getCheckin());
        psmts.setInt(3, bean.getCheckout());
        psmts.setString(4,bean.getIp_checkin());
        psmts.setString(5,bean.getIp_checkout());


        

        System.out.println("employee"+bean.getEmployee_id());
      i = psmts.executeUpdate();
    return i;
    }

      public List TimsheetTableData(){
       List data=new ArrayList();
        String query="SELECT timesheet.timesheet_id,employee_master.employee_first_name ,timesheet.checkin,timesheet.checkout,timesheet.timestamp FROM timesheet INNER JOIN employee_master ON timesheet.employees_id=employee_master.employee_id";

        //System.out.println(query);
        data=ch.selectQuery(query);
        return data;
    }

       public int UpdataTimeSheetDetails(TimesheetBean bean,int EmployeeName) throws SQLException, UnknownHostException {
    int i=0;
    System.out.println("in the model");
    int empId = 0;
        PreparedStatement pstms = getCon().prepareStatement("SELECT MAX(timesheet_id) FROM timesheet WHERE employees_id="+EmployeeName+"");
        ResultSet rs = pstms.executeQuery();
        rs.next();
            int timesheetId = rs.getInt(1);
            //empId = rs.getInt(2);
            System.out.println("employeeId"+EmployeeName);
        
       
     //   String employeeID = null;
        PreparedStatement psmts1 = getCon().prepareStatement("UPDATE timesheet SET `checkout` =?, `outtimestamp`=NOW() WHERE timesheet_id=?");
           System.out.println("pstms1"+psmts1);
        psmts1.setInt(1, bean.getCheckout());
        psmts1.setInt(2, timesheetId);

        //System.out.println("employee"+bean.getEmployee_id());
      i = psmts1.executeUpdate();
    return i;
    }

        

}
