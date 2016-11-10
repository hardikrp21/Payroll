/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.EmpWagesDetails;

import Beans.EmpWagesDetailstBean;
import Model.EmpWagesDetails.EmpWagesDetailsModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
public class EmpWagesDetailsController extends HttpServlet {
   
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
            EmpWagesDetailsModel model = new EmpWagesDetailsModel();
            EmpWagesDetailstBean bean = new EmpWagesDetailstBean();
            HttpSession session = request.getSession();
            if (button.equals("getdata")) {
                //Employee
                String EmployeeMaster = model.getEmployeeData();
                session.setAttribute("EmployeeData", EmployeeMaster);

                response.sendRedirect("View/EmpWagesDetails/empWagesDetails.jsp?redirected=true");
            }
            if (button.equals("Submit")) {
                int EmployeeName = Integer.parseInt(request.getParameter("EmployeeData"));
                System.out.println("EmployeeName" + EmployeeName);
                String type = request.getParameter("type");
                String wages = request.getParameter("wages");
              String edate =request.getParameter("edate");
                System.out.println("emp"+EmployeeName);
                System.out.println("type"+type);
                bean.setEmployee_id(EmployeeName);
                bean.setType(type);
                bean.setWages(wages);
                bean.setEffective_date(edate);

                int result = model.InsertEmpWagesDetails(bean);
                if(result==1){
                response.sendRedirect("View/EmpWagesDetails/empWagesDetails.jsp?redirected=true");
                }
            }
        } catch (Exception e) {
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
