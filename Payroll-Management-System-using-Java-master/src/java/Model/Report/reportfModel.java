/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Report;

import Beans.Report.AttendenceBean;
import DAO.ConnectionHandler;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author JIGAR
 */
public class reportfModel {
    ConnectionHandler ch;
    private String path;
    private Object JasperExportManager;
    private Object JasperFillManager;

    public reportfModel() {
        ch = new ConnectionHandler();
        
    }
    public boolean genterreport(String Path, AttendenceBean bean, int empid)
    {
        boolean result = false;
        try{
        String Query="SELECT timesheet.timesheet_id,employee_master.employee_first_name ,timesheet.timestamp,`timesheet`.`outtimestamp`,TIMEDIFF(outtimestamp,TIMESTAMP) FROM timesheet  INNER JOIN employee_master ON timesheet.employees_id=employee_master.employee_id  WHERE `timestamp` BETWEEN '" + bean.getSdate() + "' AND'" + bean.getEnddate() + "' and employees_id='"+empid+"'";
        ArrayList array_data=ch.selectQuery(Query);
        
        HashMap<String, Object> parameters = new HashMap<String, Object>();
            parameters.put("date",new java.util.Date().toString());

            Map data[] = new HashMap[array_data.size()];

            for(int i=0;i<array_data.size();i++)
            {
                ArrayList temp_array=(ArrayList)array_data.get(i);
                data[i] = new HashMap();
                data[i].put("sr",i+1+"");
                data[i].put("empname",temp_array.get(0).toString());
                data[i].put("timestamp",temp_array.get(1).toString());
                data[i].put("outtimestamp",temp_array.get(2).toString());
                data[i].put("timediff",temp_array.get(3).toString());
                
            }



            /*File f_delete=new File(path+"\\report.pdf");
                boolean file_deleted=false;
                if (f_delete.exists())
                {
                    if(f_delete.canWrite())
                    {
                        file_deleted = f_delete.delete();
                    }

                }*/
                FileOutputStream output = new FileOutputStream(new File(path+"\\demo_report.pdf"));

                JasperPrint print = JasperFillManager.fillReport(path+"\\report1.jasper",parameters, new JRMapArrayDataSource(data));

                JasperExportManager.exportReportToPdfStream(print, output);

                //JasperViewer.viewReport(print,false);


                output.close();
                output.flush();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }
    
     public boolean payrollreport()
    {
        boolean result = false;
        try{
        String Query="SELECT payroll.payroll_id,employee_master.employee_first_name,payroll.start_date,payroll.end_date,payroll.trasaction_date,payroll.total_hours,payroll.salary FROM payroll INNER JOIN employee_master ON payroll.employee_id=employee_master.employee_id";
        ArrayList array_data=ch.selectQuery(Query);
        
        HashMap<String, Object> parameters = new HashMap<String, Object>();
            parameters.put("date",new java.util.Date().toString());

            Map data[] = new HashMap[array_data.size()];

            for(int i=0;i<array_data.size();i++)
            {
                ArrayList temp_array=(ArrayList)array_data.get(i);
                data[i] = new HashMap();
                data[i].put("sr",i+1+"");
                data[i].put("empname",temp_array.get(0).toString());
                data[i].put("startdate",temp_array.get(1).toString());
                data[i].put("enddate",temp_array.get(2).toString());
                data[i].put("trasactiondate",temp_array.get(3).toString());
                data[i].put("totalhours",temp_array.get(4).toString());
                data[i].put("salary",temp_array.get(5).toString());
                
            }



            /*File f_delete=new File(path+"\\report.pdf");
                boolean file_deleted=false;
                if (f_delete.exists())
                {
                    if(f_delete.canWrite())
                    {
                        file_deleted = f_delete.delete();
                    }

                }*/
                FileOutputStream output = new FileOutputStream(new File(path+"\\demo_report.pdf"));

                JasperPrint print = JasperFillManager.fillReport(path+"\\report1.jasper",parameters, new JRMapArrayDataSource(data));

                JasperExportManager.exportReportToPdfStream(print, output);

                //JasperViewer.viewReport(print,false);


                output.close();
                output.flush();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }
    
}
