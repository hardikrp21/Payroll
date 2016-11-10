/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.MassPunchScheduleDetails;

import Beans.MassPunchScheduleDetails.MassPunchScheduleDetailsBean;
import Model.MassPunchScheduleDetails.MassPunchScheduleDetailsModel;
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
public class MassPunchScheduleDetailsController extends HttpServlet {
   
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
            String  button = request.getParameter("button");
           MassPunchScheduleDetailsModel model =new MassPunchScheduleDetailsModel();
           MassPunchScheduleDetailsBean bean=new MassPunchScheduleDetailsBean();
            HttpSession session = request.getSession();
            if (button.equals("getdata")) {

                //ScheduleTemplate
                String MassPunchScheduleData = model.getMassPunchScheduleData();
                session.setAttribute("MassPunchScheduleData", MassPunchScheduleData);
                System.out.println("MassPunchScheduleData"+MassPunchScheduleData);

               
                //Employee
                String EmployeeMaster = model.getEmployeeData();
                session.setAttribute("EmployeeData", EmployeeMaster);


                //Table Display
                ArrayList list = model.MassPunchDetailTableData();
                 session.setAttribute("MassPunchScheduleDetailsData", list);

                response.sendRedirect("View/MassPunchScheduleDetails/MassPunchScheduleDetails.jsp?redirected=true");

            }

            if(button.equals("Submit")){
                int MassPunchScheduleData=Integer.parseInt(request.getParameter("MassPunchScheduleData"));
                System.out.println("MassPunchScheduleData"+MassPunchScheduleData);
                
                int EmployeeName=Integer.parseInt(request.getParameter("EmployeeData"));
                System.out.println("EmployeeName"+EmployeeName);

                bean.setMass_punch_schedule_id(MassPunchScheduleData);
               bean.setEmployees_id(EmployeeName);
                
               int result= model.InsertEmployeesDetails(bean);
               if(result==1){
                   response.sendRedirect("View/MassPunchScheduleDetails/MassPunchScheduleDetails.jsp?redirected=true");
                 //     request.getRequestDispatcher("View/MassPunchScheduleDetails/MassPunchScheduleDetails.jsp?redirected=true").forward(request, response);
               }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
            finally  {
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
