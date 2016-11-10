/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.MassPunchScheduleMaster;

import Beans.MassPunchScheduleMaster.MassPunchScheduleMasterBean;
import Model.MassPunchScheduleMaster.MassPunchScheduleMasterModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
public class MassPunchScheduleMasterController extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String button = request.getParameter("button");
            MassPunchScheduleMasterModel model = new MassPunchScheduleMasterModel();
            MassPunchScheduleMasterBean bean = new MassPunchScheduleMasterBean();
            HttpSession session = request.getSession();
            if (button.equals("getdata")) {
                String SchedulePolicyName = model.getSchedulePolicyData();
                System.out.println("SchedulePolicyName" + SchedulePolicyName);
                session.setAttribute("SchedulePolicyData", SchedulePolicyName);

                String departmentName = model.getDepartmentData();
                System.out.println("departmentName" + departmentName);
                session.setAttribute("DepartmentData", departmentName);

                ArrayList list = model.MassPunchTableData();
                 session.setAttribute("MasspunchData", list);


                response.sendRedirect("View/MassPunchScheduleMaster/MassPunchScheduleMaster.jsp?redirected=true");
            }

            if (button.equals("Submit")) {

                String MassPunchSchedulename = request.getParameter("MassPunchSchedulename");
                String masspunchschedulestatus = request.getParameter("mass_punch_schedule_status");
                String masspunchscheduleintime = request.getParameter("mass_punch_schedule_in_time");
                String masspunchscheduleouttime = request.getParameter("mass_punch_schedule_out_time");
                String masspunchscheduletotaltime = request.getParameter("mass_punch_schedule_total_time");
                String masspunchschedulestartdate = request.getParameter("mass_punch_schedule_start_date");
                String masspunchscheduleenddate = request.getParameter("mass_punch_schedule_end_date");

                int sun = 0;
                int mon = 0;
                int tue = 0;
                int wed = 0;
                int thu = 0;
                int fri = 0;
                int sat = 0;

                // String Schedule = request.getParameter("Schedule ");

                if (request.getParameter("sun") != null && request.getParameter("sun").equals("on")) {
                    sun = 1;
                }
                if (request.getParameter("mon") != null && request.getParameter("mon").equals("on")) {
                    mon = 1;

                }
                if (request.getParameter("tue") != null && request.getParameter("tue").equals("on")) {
                    tue = 1;

                }
                if (request.getParameter("wed") != null && request.getParameter("wed").equals("on")) {
                    wed = 1;
                }
                if (request.getParameter("thu") != null && request.getParameter("thu").equals("on")) {
                    thu = 1;
                }
                if (request.getParameter("fri") != null && request.getParameter("fri").equals("on")) {
                    fri = 1;
                }
                if (request.getParameter("sat") != null && request.getParameter("sat").equals("on")) {
                    sat = 1;
                }
//<-- SchedulePolicyName-->
                int SchedulePolicyData = Integer.parseInt(request.getParameter("SchedulePolicyData"));
                System.out.println("PolicyData" + SchedulePolicyData);
//DepartmentData
                int DepartmentData = Integer.parseInt(request.getParameter("DepartmentData"));
                System.out.println("PolicyData" + DepartmentData);

                System.out.println("sun....." + sun);
                System.out.println("mon..........." + mon);

                bean.setMassPunchSchedulename(MassPunchSchedulename);
                bean.setMass_punch_schedule_status(masspunchschedulestatus);
                bean.setMass_punch_schedule_in_time(masspunchscheduleintime);
                bean.setMass_punch_schedule_out_time(masspunchscheduleouttime);
                bean.setMass_punch_schedule_total_time(masspunchscheduletotaltime);
                bean.setMass_punch_schedule_start_date(masspunchschedulestartdate);
                bean.setMass_punch_schedule_end_date(masspunchscheduleenddate);
                bean.setSun(sun);
                bean.setMon(mon);
                bean.setTue(tue);
                bean.setWed(wed);
                bean.setThu(thu);
                bean.setFri(fri);
                bean.setSat(sat);

                // bean.setSchedule(Schedule);

                // SchedulePolicyData
                bean.setSchedule_policy_id(SchedulePolicyData);
                //DepartmentData
                bean.setDepartment_id(DepartmentData);

                int result = model.InsertMassPunchSchedule(bean);

                if (result == 1) {
                    response.sendRedirect("View/MassPunchScheduleMaster/MassPunchScheduleMaster.jsp?redirected=true");
                }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(MassPunchScheduleMasterController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(MassPunchScheduleMasterController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
