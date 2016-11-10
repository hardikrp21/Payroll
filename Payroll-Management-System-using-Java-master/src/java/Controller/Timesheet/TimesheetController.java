/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Timesheet;

import Beans.Timesheet.TimesheetBean;
import Model.Timesheet.TimesheetModel;
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
public class TimesheetController extends HttpServlet {

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
            TimesheetModel model = new TimesheetModel();
            TimesheetBean bean = new TimesheetBean();
            HttpSession session = request.getSession();
           

              if (button.equals("getdata")) {
                  //Employee
                String EmployeeMaster = model.getEmployeeData();
                session.setAttribute("EmployeeData", EmployeeMaster);

                  List list = model.TimsheetTableData();
                System.out.println(list);
                 session.setAttribute("timesheet", list);
                //request.setAttribute("data", list);
                response.sendRedirect("View/Timesheet/Timesheet.jsp?redirected=true");
                //request.getRequestDispatcher("DisplayEmployeeMaster.jsp").forward(request, response);

            }
            
            if (button.equals("submit")) {

                String ip_checkin;
                int EmployeeName = Integer.parseInt(request.getParameter("EmployeeData"));
                System.out.println("EmployeeName" + EmployeeName);
                int checkin = 0;
                int checkout = 0;
                if (request.getParameter("checkin") != null && request.getParameter("checkin").equals("on")) {
                    checkin = 1;
                }
                if (request.getParameter("checkout") != null && request.getParameter("checkout").equals("on")) {
                    checkout = 1;
                    System.out.println("checkout"+checkout);
                }

                bean.setEmployee_id(EmployeeName);
                bean.setCheckin(checkin);
                bean.setCheckout(checkout);
              

                //System.out.println("address"+Inet4Address.getByAddress());
                if (checkin == 1) {
                    //ipaddress checkin
                    String ipAddressin = request.getHeader("X-FORWARDED-FOR");
                    if (ipAddressin == null) {
                        ipAddressin = request.getRemoteAddr();
                    }
                    System.out.println("ipAddress:" + ipAddressin);
                    bean.setIp_checkin(ipAddressin);
                    int result = model.InsertTimeSheetDetails(bean);
                    if (result == 1) {
                    response.sendRedirect("View/Timesheet/Timesheet.jsp?redirected=true");
                }
                }
                if(checkout==1){
                    // ip address checkout

                    String ipAddressout = request.getHeader("X-FORWARDED-FOR");
                    if (ipAddressout == null) {
                        ipAddressout = request.getRemoteAddr();
                    }
                    System.out.println("ipAddress:" + ipAddressout);
                    bean.setIp_checkout(ipAddressout);
                      
                   int result =  model.UpdataTimeSheetDetails(bean,EmployeeName);
                 if(result==1){
                     response.sendRedirect("View/Timesheet/Timesheet.jsp?redirected=true");
                 }
                }

                //int result = model.InsertTimeSheetDetails(bean);

//                if (result == 1) {
//                    response.sendRedirect("View/Timesheet/Timesheet.jsp?redirected=true");
//                }
            }

            

        } catch (Exception e) {
            e.printStackTrace();
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
