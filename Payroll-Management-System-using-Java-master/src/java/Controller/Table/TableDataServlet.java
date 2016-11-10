/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Table;

import Beans.UserMaster.UserMasterVo;
import Model.RegisterModel;
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
public class TableDataServlet extends HttpServlet {

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
            RegisterModel insertModel = new RegisterModel();
            UserMasterVo userMasterVo = new UserMasterVo();



            if (button.equals("get_data")) {

                ArrayList list = insertModel.tabledata();
                // System.out.println(list);
                session.setAttribute("tabledata", list);

                response.sendRedirect("View/Table/table.jsp?redirected=true");
              //  response.sendRedirect("newjsp.jsp?redirected=true");
            }




            //  String id=request.getParameter("hid_id");
            if (button.equals("changestatus")) {

                String id = request.getParameter("id");
                String status = request.getParameter("status");
                String changestatus = request.getParameter("changestatus");

                userMasterVo.setStatus(status);
                userMasterVo.setId(id);
                System.out.println("status" + status);
                boolean data = insertModel.updatastatus(userMasterVo);
                System.out.println(data);
                if (data == true) {

                    ArrayList list = insertModel.tabledata();
                    session.setAttribute("tabledata", list);

                    response.sendRedirect("View/Table/table.jsp");


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
