/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Payroll;

import Beans.Payroll.PayrollBean;
import Model.Payroll.PayrollModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
public class PayrollController extends HttpServlet {
   
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
           PayrollModel model = new PayrollModel();
           PayrollBean bean = new PayrollBean();
            HttpSession session = request.getSession();
          if(button.equals("submit")){
          String sdate = request.getParameter("sdate");
          String enddate = request.getParameter("enddate");
          bean.setSdate(sdate);
          bean.setEnddate(enddate);

           //int EmployeeName=Integer.parseInt(request.getParameter("EmployeeData"));
               // System.out.println("EmployeeName"+EmployeeName);

              //  bean.setEmployees_id(EmployeeName);
                ArrayList result = model.timeData(bean);
                response.sendRedirect("View/Payroll/Payroll.jsp?redirected=true");
          }

//             if (button.equals("getdata")) {
//
//
//
//
//                //Employee
//                String EmployeeMaster = model.getEmployeeData();
//                session.setAttribute("EmployeeData", EmployeeMaster);
//
//
////                //Table Display
////                ArrayList list = model.MassPunchDetailTableData();
////                 session.setAttribute("MassPunchScheduleDetailsData", list);
//
//                response.sendRedirect("View/Payroll/Payroll.jsp?redirected=true");
//
//            }
            if (button.equals("getdata")) {

                ArrayList list = model.payrolltabledata();
                // System.out.println(list);
                session.setAttribute("payrolldata", list);

                response.sendRedirect("View/Payroll/Payroll.jsp?redirected=true");


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
