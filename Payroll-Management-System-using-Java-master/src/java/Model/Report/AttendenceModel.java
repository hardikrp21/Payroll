/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Report;

import Beans.Report.AttendenceBean;
import DAO.ConnectionHandler;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class AttendenceModel {

     ConnectionHandler ch;

    public AttendenceModel() {

        ch = new ConnectionHandler();
    }

    public String getEmployeeData() {
        List policy_data = new ArrayList();
        String Employee = "";
        try {
            String query = "select employee_id,employee_first_name from employee_master";
            policy_data = ch.selectQuery(query);
            System.out.println(query);
            Employee = "<select name='EmployeeData'>";
            for (int i = 0; i < policy_data.size(); i++) {
                List inner = (ArrayList) policy_data.get(i);
                if (inner.get(0).toString().equals("1")) {
                    Employee += "<option value='" + inner.get(0) + "' selected>" + inner.get(1) + "</option>";
                } else {
                    Employee += "<option value='" + inner.get(0) + "'>" + inner.get(1) + "</option>";
                }
            }
            Employee += "</select>";
            System.out.println("employee"+Employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Employee;
    }

       public List AttendenceTableData(AttendenceBean bean,int empid){
       List data=new ArrayList();
        String query="SELECT timesheet.timesheet_id,employee_master.employee_first_name ,timesheet.timestamp,`timesheet`.`outtimestamp`,TIMEDIFF(outtimestamp,TIMESTAMP) FROM timesheet  INNER JOIN employee_master ON timesheet.employees_id=employee_master.employee_id  WHERE `timestamp` BETWEEN '" + bean.getSdate() + "' AND'" + bean.getEnddate() + "' and employees_id='"+empid+"'";
try{
        //System.out.println(query);
        data=ch.selectQuery(query);
           }
catch(Exception e){
    e.printStackTrace();
}
        return data;
    }
}
