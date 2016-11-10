/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.PayPeriodSchedule;

import Beans.PayPeriodSchedule.PayPeriodScheduleBean;
import Model.PayPeriodSchedule.PayPeriodScheduleModel;
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
public class PayPeriodScheduleController extends HttpServlet {
   
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

           PayPeriodScheduleModel _PayPeriodScheduleModel=new PayPeriodScheduleModel();
            HttpSession session = request.getSession();
            if (button.equals("submit")) {
                String schedulename = request.getParameter("pay_period_schedule_name");
                String payperiodtype = request.getParameter("pay_period_type");
                String transactiondate = request.getParameter("transaction_date");
                String payperiodform = request.getParameter("pay_periods_from");
                
                System.out.println("submit"+schedulename);
                PayPeriodScheduleBean ppsb=new PayPeriodScheduleBean();
                ppsb.setPay_period_schedule_name(schedulename);
                ppsb.setPay_period_type(payperiodtype);
                ppsb.setTransaction_date(transactiondate);
                ppsb.setPay_periods_from(payperiodform);

                boolean result = _PayPeriodScheduleModel.PayPeriodScheduleDetails(ppsb);
                if (result == true) {
                    System.out.println("result"+result);
                    ArrayList list = _PayPeriodScheduleModel.PayPeriodScheduletabledata();
                 System.out.println(list);
                session.setAttribute("payperiodscheduledata", list);
                    response.sendRedirect("View/PayPeriodSchedule/PayPeriodScheduleMaster.jsp?redirected=true");
                } else {
                    response.sendRedirect("error.jsp");
                }
            }

            if (button.equals("getdata")) {
                ArrayList list = _PayPeriodScheduleModel.PayPeriodScheduletabledata();
                // System.out.println(list);
                session.setAttribute("payperiodscheduledata", list);

                response.sendRedirect("View/PayPeriodSchedule/PayPeriodScheduleMaster.jsp?redirected=true");

            }
            if (button.equals("update_data")) {
                String id = request.getParameter("id");
                System.out.println(id);
                String update_data = request.getParameter("update_data");
                ArrayList list = _PayPeriodScheduleModel.PayPeriodScheduleSelectdate(id);

                session.setAttribute("payperiodscheduledata", list);
                response.sendRedirect("View/PayPeriodSchedule/PayPeriodScheduleMaster.jsp?redirected=true&button=update_get_data&button=update");
                System.out.println(list);
            }

            if (button.equals("update")) {
                String id = request.getParameter("hid_id");
                // String id=request.getParameter("id");

                String schedulename = request.getParameter("pay_period_schedule_name");
                String payperiodtype = request.getParameter("pay_period_type");
                String transactiondate = request.getParameter("transaction_date");
                String payperiodform = request.getParameter("pay_periods_from");


                PayPeriodScheduleBean ppsb=new PayPeriodScheduleBean();
                ppsb.setId(id);
                ppsb.setPay_period_schedule_name(schedulename);
                ppsb.setPay_period_type(payperiodtype);
                ppsb.setTransaction_date(transactiondate);
                ppsb.setPay_periods_from(payperiodform);

                boolean result = _PayPeriodScheduleModel.PayPeriodScheduleupdate(ppsb);

                System.out.println(result);

                if (result == true) {
                    ArrayList list=_PayPeriodScheduleModel.PayPeriodScheduletabledata();
                    session.setAttribute("payperiodscheduledata", list);
                    response.sendRedirect("View/PayPeriodSchedule/PayPeriodScheduleMaster.jsp?redirected=true");
                } else {
                    response.sendRedirect("error.jsp");
                }
            }

            if (button.equals("delete_data")) {
                String id = request.getParameter("id");
                System.out.println(id);
                String update_data = request.getParameter("update_data");
                ArrayList list = _PayPeriodScheduleModel.PayPeriodScheduleSelectdate(id);

                session.setAttribute("payperiodscheduledata", list);
                response.sendRedirect("View/PayPeriodSchedule/PayPeriodScheduleMaster.jsp?redirected=true&button=delete_get_data&button=update");
                System.out.println(list);
            }
            if(button.equals("Delete"))
            {
               //String id=request.getParameter("id");
               String id = request.getParameter("hid_id");

              boolean result=_PayPeriodScheduleModel.PayPeriodScheduleDelete(id);

                if(result==true)
                {
                     ArrayList list =_PayPeriodScheduleModel.PayPeriodScheduletabledata();
                // System.out.println(list);
                session.setAttribute("payperiodscheduledata", list);

                response.sendRedirect("View/PayPeriodSchedule/PayPeriodScheduleMaster.jsp?redirected=true");

                 }
                  //response.sendRedirect("Employee.jsp?button=getdata");}
                else{
                    response.sendRedirect("error.jsp?button=delete");}

            }
        
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
