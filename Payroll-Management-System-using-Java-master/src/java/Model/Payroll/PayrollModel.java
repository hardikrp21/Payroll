/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Payroll;

import Beans.Payroll.PayrollBean;
import DAO.ConnectionHandler;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class PayrollModel {

    ConnectionHandler ch;

    public PayrollModel() {

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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Employee;
    }

    public ArrayList timeData(PayrollBean bean) {
        double hourstotal = 0;
        double wagestotal = 0;
        double total1 = 0;
        Object wagid = null;
        Object empid = null;

        double salary = 0;
//        String query="SELECT `employees_id`,DATE(`timestamp`),SUM(TIME_TO_SEC(TIMEDIFF(IFNULL(outtimestamp,0),IFNULL(`timestamp`,0))))/3600 FROM timesheet WHERE `timestamp` BETWEEN '2013-04-05' AND'2013-04-15' GROUP BY employees_id ";
//
//        System.out.println(query);
//        data=ch.selectQuery(query);
        ArrayList main = new ArrayList();

        ArrayList total = new ArrayList();
        String total_hours = "SELECT `mass_punch_schedule_id`, `employees_id` ,`BizDaysInclusive`(`mass_punch_schedule_start_date`,`mass_punch_schedule_end_date`,6)*(SEC_TO_TIME(TIMEDIFF(`mass_punch_schedule_total_time`,SEC_TO_TIME(SUM(TIME_TO_SEC(`meal_policy`.`meal_time`)+TIME_TO_SEC(`break_policy`.`maximum_punch_time`)))))) FROM `mass_punch_schedule_master` INNER JOIN `mass_punch_schedule_details` USING (`mass_punch_schedule_id`) LEFT OUTER JOIN `schedule_policy_master` USING (`schedule_policy_id`) LEFT OUTER JOIN (`meal_policy`,`break_policy`) USING (`mealpolicy_id`,`break_policy_id`) GROUP BY `employees_id` ";
        System.out.println(total_hours);
        total = ch.selectQuery(total_hours);
        System.out.println("total" + total);

        ArrayList emp_hours = new ArrayList();
        String employee_hours = "SELECT `timesheet_id`,`employees_id`,DATE(`timestamp`),SUM(TIME_TO_SEC(TIMEDIFF(IFNULL(outtimestamp,0),IFNULL(`timestamp`,0))))/3600 FROM timesheet WHERE `timestamp` BETWEEN '" + bean.getSdate() + "' AND'" + bean.getEnddate() + "' GROUP BY employees_id ";
        System.out.println(employee_hours);
        emp_hours = ch.selectQuery(employee_hours);

        ArrayList emp_wag = new ArrayList();
        String employee_wages = "SELECT `emp_wages_details_id`,`employee_id`,`wages` FROM `emp_wages_details`";
        System.out.println(employee_wages);
        emp_wag = ch.selectQuery(employee_wages);



        for (int k = 0; k < total.size(); k++) {
            ArrayList temptotal = (ArrayList) total.get(k);
            Object employeeid = temptotal.get(1);
            total1 = Double.parseDouble(temptotal.get(2).toString());
            System.out.println(total1);
            ArrayList temp = new ArrayList();
            for (int j = 0; j < emp_hours.size(); j++) {
                ArrayList emphours = (ArrayList) emp_hours.get(j);
                empid = emphours.get(1);
                hourstotal = Double.parseDouble(emphours.get(3).toString());

                for (int i = 0; i < emp_wag.size(); i++) {
                    ArrayList empwag = (ArrayList) emp_wag.get(i);
                    wagid = empwag.get(1);
                    wagestotal = Double.parseDouble(empwag.get(2).toString());

                    //if(temptotal.get(1).equals(emphours.get(3)) && temptotal.get(1).equals(empwag.get(2)))
                    if (employeeid.equals(empid) && employeeid.equals(wagid)) {
                        //salary=(double(emphours.get(3))* double(empwag.get(2)))/(double(temptotal.get(1)));
                        salary = (hourstotal * wagestotal) / total1;
                        System.out.println("sal" + salary);
                        temp.add(employeeid);
                        temp.add(salary);
                        temp.add(total1);
                        main.add(temp);
                    }



                }
            }
        }
        System.out.println("main array" + main);

        for (int i = 0; i < main.size(); i++) {

            ArrayList temp = (ArrayList) main.get(i);


            String query = "insert into payroll(employee_id,start_date,end_date,trasaction_date,total_hours,salary) "
                    + "values('" + temp.get(0)+ "','" + bean.getSdate() + "','" + bean.getEnddate() + "',now(),'" +temp.get(2)+ "','" + temp.get(1) + "')";
        boolean insertQuery = ch.insertQuery(query);
            System.out.println(query);
       }






            //System.out.println(emp_hours);
            //System.out.println(emp_hours.get(1)+""+emp_wag.get(2));
            return main;
        }

     public ArrayList payrolltabledata(){
       ArrayList data=new ArrayList();
        String query="SELECT payroll.payroll_id,employee_master.employee_first_name,payroll.start_date,payroll.end_date,payroll.trasaction_date,payroll.total_hours,payroll.salary FROM payroll INNER JOIN employee_master ON payroll.employee_id=employee_master.employee_id";

        System.out.println(query);
        data=ch.selectQuery(query);
        return data;
    }

//    public static void main(String[] args) throws Exception {
//        PayrollModel p1 = new PayrollModel();
//        p1.timeData();
//    }
    }
