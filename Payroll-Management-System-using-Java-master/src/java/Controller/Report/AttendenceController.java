/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Report;

import Beans.Report.AttendenceBean;
import Model.Report.AttendenceModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
public class AttendenceController extends HttpServlet {
   
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
        HttpSession session = request.getSession();
        AttendenceModel model = new AttendenceModel();
        AttendenceBean bean = new AttendenceBean();
           if (button.equals("getdata")) {

      //Employee
                String EmployeeMaster = model.getEmployeeData();
                session.setAttribute("EmployeeData", EmployeeMaster);
               System.out.println("empl"+EmployeeMaster);
          response.sendRedirect("View/Report/Attendence.jsp?redirected=true");

            }
        if(button.equals("submit")){
String sdate = request.getParameter("sdate");
          String enddate = request.getParameter("enddate");
          bean.setSdate(sdate);
          bean.setEnddate(enddate);
                int EmployeeName=Integer.parseInt(request.getParameter("EmployeeData"));
                System.out.println("EmployeeName"+EmployeeName);

               //bean.setEmployees_id(EmployeeName);
                List list = model.AttendenceTableData(bean,EmployeeName);
              session.setAttribute("attendence", list);
              System.out.println("list"+list);
                response.sendRedirect("View/Report/newjsp.jsp");
        }
//        if(button.equals("get_data")){
//            List list = model.AttendenceTableData();
//               session.setAttribute("attendence", list);
//                response.sendRedirect("View/Report/newjsp.jsp?redirected=true");
//        }

        } finally { 
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
