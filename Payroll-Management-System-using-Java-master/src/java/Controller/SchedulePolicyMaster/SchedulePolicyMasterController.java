/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.SchedulePolicyMaster;

import Beans.SchedulePolicyMaster.SchedulePolicyMasterBean;
import Model.SchedulePolicyMaster.SchedulePolicyMasterModel;
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
public class SchedulePolicyMasterController extends HttpServlet {

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
            SchedulePolicyMasterModel model = new SchedulePolicyMasterModel();
            SchedulePolicyMasterBean bean = new SchedulePolicyMasterBean();
            HttpSession session = request.getSession();
            if (button.equals("getdata")) {
//<--             MealPolicy-->
                String MealPolicy = model.getMealPolicyData();
                System.out.println("MealPolicyData" + MealPolicy);
                session.setAttribute("MealPolicyData", MealPolicy);

                // <-- BreakPolicy -->
                String BreakPolicy = model.getBreakPolicyData();
                System.out.println("BreakPolicy" + BreakPolicy);
                session.setAttribute("BreakPolicyData", BreakPolicy);

                //<--            AbsencePolicyData-->
                String AbsencePolicyName = model.getAbsencePolicyData();
                System.out.println("AbsencePolicyData" + AbsencePolicyName);
                session.setAttribute("AbsencePolicyData", AbsencePolicyName);

                 ArrayList list = model.SchedulePolicyTableData();
                 session.setAttribute("SchedulePolicyData", list);

                response.sendRedirect("View/SchedulePolicyMaster/SchedulePolicyMaster.jsp?redirected=true");

            }

            if (button.equals("submit")) {
                //<-- MealPolicy -->
                int MealData = Integer.parseInt(request.getParameter("MealPolicyData"));
                System.out.println("PolicyData" + MealData);

                int BreakData = Integer.parseInt(request.getParameter("BreakPolicyData"));
                System.out.println("BreakPolicyData" + BreakData);

                int AbsencePolicyName=Integer.parseInt(request.getParameter("AbsencePolicyData"));

                String Schedulepolicyname = request.getParameter("Schedulepolicyname");
                System.out.println("Schedulepolicyname" + Schedulepolicyname);

                bean.setSchedulepolicyname(Schedulepolicyname);
                bean.setMealpolicy_id(MealData);
                bean.setBreak_policy_id(BreakData);
                bean.setAbsence_policy_id(AbsencePolicyName);
                boolean result = model.InsertSchedulePolicy(bean);
                System.out.println("result" + result);
                if (result == true) {
                    response.sendRedirect("View/SchedulePolicyMaster/SchedulePolicyMaster.jsp?redirected=true");
 //                   request.getRequestDispatcher("View/SchedulePolicyMaster/SchedulePolicyMaster.jsp?redirected=true").forward(request, response);
                } else {
                    response.sendRedirect("error.jsp");
                    //request.getRequestDispatcher("error.jsp").forward(request, response);
                }
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
