/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Policy;

import Beans.Policy.MealPolicyVo;
import Model.RegisterModel;
import Model.MealPolicyModel;
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
public class MealPolicyServlet extends HttpServlet {

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
            MealPolicyModel mealPolicyModel=new MealPolicyModel();
            HttpSession session = request.getSession();
            if (button.equals("submit")) {
                String mpolicyname = request.getParameter("mpolicyname");
                String  mactiveafter =request.getParameter("mactiveafter");
                String mmealtime = request.getParameter("mmealtime");
                String mmintime = request.getParameter("mmintime");
                String mmaxtime = request.getParameter("mmaxtime");

                MealPolicyVo mpv = new MealPolicyVo();
                System.out.println("mealpolicy"+mpv);
                mpv.setMpolicyname(mpolicyname);
                mpv.setMactiveafter(mactiveafter);
                mpv.setMmealtime(mmealtime);
                mpv.setMmintime(mmintime);
                mpv.setMmaxtime(mmaxtime);

                boolean result = mealPolicyModel.MealpolicyInsertDetails(mpv);
                if (result == true) {
                    ArrayList list = mealPolicyModel.MealpolicyTableData();
                    // System.out.println(list);
                    session.setAttribute("mealpolicydata", list);
                    response.sendRedirect("View/Policy/MealPolicy.jsp?redirected=true");
                } else {
                    response.sendRedirect("error.jsp");
                }


            }
            if(button.equals("getdata")) {
                if(button.equals("submit")){
                    String submit=request.getParameter("submit");
                }

                ArrayList list = mealPolicyModel.MealpolicyTableData();
                // System.out.println(list);
                session.setAttribute("mealpolicydata", list);

                response.sendRedirect("View/Policy/MealPolicy.jsp?redirected=true");

            }
            if (button.equals("update_data")) {
                String id = request.getParameter("id");
                System.out.println(id);
               // String update_data = request.getParameter("update_data");
                ArrayList list = mealPolicyModel.MealpolicySelectdate(id);
                session.setAttribute("mealpolicydata", list);
                response.sendRedirect("View/Policy/MealPolicy.jsp?redirected=true&button=update_get_data&button=update");
                System.out.println(list);
            }
            if (button.equals("update")) {
                String hidid = request.getParameter("hid_id");
                String mpolicyname = request.getParameter("mpolicyname");
                 String  mactiveafter =request.getParameter("mactiveafter");
                String mmealtime = request.getParameter("mmealtime");
                String mmintime = request.getParameter("mmintime");
                String mmaxtime = request.getParameter("mmaxtime");

                MealPolicyVo mpv = new MealPolicyVo();
                mpv.setId(hidid);
                mpv.setMpolicyname(mpolicyname);
                mpv.setMactiveafter(mactiveafter);
                mpv.setMmealtime(mmealtime);
                mpv.setMmintime(mmintime);
                mpv.setMmaxtime(mmaxtime);

                boolean result = mealPolicyModel.MealpolicyupdateData(mpv);

                System.out.println(result);

                if (result == true) {
                    ArrayList list=mealPolicyModel.MealpolicyTableData();
                    session.setAttribute("mealpolicydata", list);
                    response.sendRedirect("View/Policy/MealPolicy.jsp?redirected=true");
                } else {
                    response.sendRedirect("error.jsp");
                }
            }

             if (button.equals("delete_data")) {
                String id = request.getParameter("id");
                System.out.println(id);
               // String update_data = request.getParameter("update_data");
                ArrayList list = mealPolicyModel.MealpolicySelectdate(id);
                session.setAttribute("mealpolicydata", list);
                response.sendRedirect("View/Policy/MealPolicy.jsp?redirected=true&button=delete_get_data");
                System.out.println(list);
            }
            
            if(button.equals("Delete"))
            {
               //String id=request.getParameter("id");
               String id = request.getParameter("hid_id");

              boolean result=mealPolicyModel.MealpolicyDelete(id);


                if(result==true)
                {
                     ArrayList list = mealPolicyModel.MealpolicyTableData();
                // System.out.println(list);
                session.setAttribute("mealpolicydata", list);

                response.sendRedirect("View/Policy/MealPolicy.jsp?redirected=true");

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
