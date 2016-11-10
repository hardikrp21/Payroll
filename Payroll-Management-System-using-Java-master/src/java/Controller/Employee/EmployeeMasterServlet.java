/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Employee;

import Beans.EmployeeMaster.EmployeeBean;
import Model.Employee.EmployeeMasterModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
public class EmployeeMasterServlet extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String button = request.getParameter("button");
           EmployeeMasterModel _employeeMasterModel=new EmployeeMasterModel();
            HttpSession session = request.getSession();
            if (button.equals("submit")) {
                String efirstname = request.getParameter("efirstname");
                String emiddlename = request.getParameter("emiddlename");
                String elastname = request.getParameter("elastname");
                String esex = request.getParameter("esex");
                String eaddress = request.getParameter("eaddress");
                String ecity = request.getParameter("ecity");
                String estate = request.getParameter("estate");
                String ecountry = request.getParameter("ecountry");
                String ezipcode = request.getParameter("ezipcode");
                String eworkphone = request.getParameter("eworkphone");
                String ehomephone = request.getParameter("ehomephone");
                String emobilephone = request.getParameter("emobilephone");
                String efaxno = request.getParameter("efaxno");
                String eemailid = request.getParameter("eemailid");
                String ebirthdate = request.getParameter("ebirthdate");
                //<-- SchedulePolicyName-->
                int SchedulePolicyData = Integer.parseInt(request.getParameter("SchedulePolicyData"));
                System.out.println("PolicyData" + SchedulePolicyData);

                int payperiodScheduleName=Integer.parseInt(request.getParameter("PayPeriodScheduleData"));
                System.out.println("PayPeriodScheduleData"+payperiodScheduleName);

                EmployeeBean ev = new EmployeeBean();
                ev.setEfirstname(efirstname);
                ev.setEmiddlename(emiddlename);
                ev.setElastname(elastname);
                ev.setEsex(esex);
                ev.setEaddress(eaddress);
                ev.setEcity(ecity);
                ev.setEstate(estate);
                ev.setEcountry(ecountry);
                ev.setEzipcode(ezipcode);
                ev.setEworkphone(eworkphone);
                ev.setEhomephone(ehomephone);
                ev.setEmobilephone(emobilephone);
                ev.setEfaxno(efaxno);
                ev.setEemailid(eemailid);
                ev.setEbirthdate(ebirthdate);
                ev.setSchedule_policy_id(SchedulePolicyData);
                ev.setPay_period_schedule_id(payperiodScheduleName);

                int result = _employeeMasterModel.employeeInsertDetails(ev);
                if (result == 1) {
                    ArrayList list = _employeeMasterModel.EmployeeTableData();
                // System.out.println(list);
                session.setAttribute("employeedata", list);
                    response.sendRedirect("View/Employee/Employee.jsp?redirected=true");
                } else {
                    response.sendRedirect("error.jsp");
                }
            }

            if (button.equals("getdata")) {
                String SchedulePolicyName = _employeeMasterModel.getSchedulePolicyData();
                System.out.println("SchedulePolicyName" + SchedulePolicyName);
                session.setAttribute("SchedulePolicyData", SchedulePolicyName);

                //ScheduleTemplate
                String PayPeriodSchedule = _employeeMasterModel.getPayPeriodScheduleData();
                session.setAttribute("PayPeriodScheduleData", PayPeriodSchedule);
                System.out.println("PayPeriodScheduleData"+PayPeriodSchedule);


                ArrayList list = _employeeMasterModel.EmployeeTableData();
                // System.out.println(list);
                session.setAttribute("employeedata", list);

                response.sendRedirect("View/Employee/Employee.jsp?redirected=true");

            }
            if (button.equals("update_data")) {
                String id = request.getParameter("id");
                System.out.println(id);
                String update_data = request.getParameter("update_data");
                ArrayList list = _employeeMasterModel.EmployeeSelectdate(id);
               
                session.setAttribute("employeedata", list);
                response.sendRedirect("View/Employee/Employee.jsp?redirected=true&button=update_get_data&button=update");
                System.out.println(list);
            }

            if (button.equals("update")) {
                String hidid = request.getParameter("hid_id");
                // String id=request.getParameter("id");

                String efirstname = request.getParameter("efirstname");
                String emiddlename = request.getParameter("emiddlename");
                String elastname = request.getParameter("elastname");
                String esex = request.getParameter("esex");
                String eaddress = request.getParameter("eaddress");
                String ecity = request.getParameter("ecity");
                String estate = request.getParameter("estate");
                String ecountry = request.getParameter("ecountry");
                String ezipcode = request.getParameter("ezipcode");
                String eworkphone = request.getParameter("eworkphone");
                String ehomephone = request.getParameter("ehomephone");
                String emobilephone = request.getParameter("emobilephone");
                String efaxno = request.getParameter("efaxno");
                String eemailid = request.getParameter("eemailid");
                String ebirthdate = request.getParameter("ebirthdate");

                EmployeeBean ev = new EmployeeBean();
                ev.setId(hidid);
                ev.setEfirstname(efirstname);
                ev.setEmiddlename(emiddlename);
                ev.setElastname(elastname);
                ev.setEsex(esex);
                ev.setEaddress(eaddress);
                ev.setEcity(ecity);
                ev.setEstate(estate);
                ev.setEcountry(ecountry);
                ev.setEzipcode(ezipcode);
                ev.setEworkphone(eworkphone);
                ev.setEhomephone(ehomephone);
                ev.setEmobilephone(emobilephone);
                ev.setEfaxno(efaxno);
                ev.setEemailid(eemailid);
                ev.setEbirthdate(ebirthdate);

                boolean result = _employeeMasterModel.EmployeeupdateData(ev);

                System.out.println(result);

                if (result == true) {
                    ArrayList list=_employeeMasterModel.EmployeeTableData();
                    session.setAttribute("employeedata", list);
                    response.sendRedirect("View/Employee/Employee.jsp?redirected=true");
                } else {
                    response.sendRedirect("error.jsp");
                }
            }

            if (button.equals("delete_data")) {
                String id = request.getParameter("id");
                System.out.println(id);
               // String update_data = request.getParameter("update_data");
                ArrayList list = _employeeMasterModel.EmployeeSelectdate(id);

                session.setAttribute("employeedata", list);
                response.sendRedirect("View/Employee/Employee.jsp?button=delete_get_data&redirected=true");
                System.out.println(list);
            }
            if(button.equals("Delete"))
            {
               //String id=request.getParameter("id");
               String id = request.getParameter("hid_id");

              boolean result=_employeeMasterModel.EmployeeDelete(id);

                if(result==true)
                {
                     ArrayList list = _employeeMasterModel.EmployeeTableData();
                // System.out.println(list);
                session.setAttribute("employeedata", list);

                response.sendRedirect("View/Employee/Employee.jsp?redirected=true");

                 }
                  //response.sendRedirect("Employee.jsp?button=getdata");}
                else{
                    response.sendRedirect("error.jsp?button=delete");}

            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

         finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
