/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Policy;

import Beans.Policy.ExceptionPolicyVo;
import Model.ExceptionPolicyModel;
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
public class ExceptionPolicyServlet extends HttpServlet {
   
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
            ExceptionPolicyModel _ExceptionPolicyModel=new ExceptionPolicyModel();
            HttpSession session = request.getSession();
            if (button.equals("submit")) {
                String ename=request.getParameter("ename");
                String ecode=request.getParameter("ecode");
                String eseverity=request.getParameter("eseverity");
                String egrancetime=request.getParameter("egrancetime");
                String ewindow=request.getParameter("ewindow");
                String estatus=request.getParameter("estatus");

                ExceptionPolicyVo ev=new ExceptionPolicyVo();
                ev.setEname(ename);
                ev.setEcode(ecode);
                ev.setEseverity(eseverity);
                ev.setEgrancetime(egrancetime);
                ev.setEwindow(ewindow);
                ev.setEstatus(estatus);

                boolean result=_ExceptionPolicyModel.ExceptionpolicyInsertDetails(ev);
                 if (result == true) {
                    ArrayList list = _ExceptionPolicyModel.ExceptionpolicyTableData();
                    // System.out.println(list);
                    session.setAttribute("exceptiondata", list);
                    response.sendRedirect("View/Policy/ExceptionPolicy.jsp?redirected=true");
                } else {
                    response.sendRedirect("error.jsp");
                }
    }
            if(button.equals("getdata")) {
                ArrayList list = _ExceptionPolicyModel.ExceptionpolicyTableData();
                // System.out.println(list);
                session.setAttribute("exceptiondata", list);

                response.sendRedirect("View/Policy/ExceptionPolicy.jsp?redirected=true");

            }
            if (button.equals("update_data")) {
                String id = request.getParameter("id");
                System.out.println(id);
               // String update_data = request.getParameter("update_data");
                ArrayList list = _ExceptionPolicyModel.ExceptionpolicySelectdate(id);
                session.setAttribute("exceptiondata", list);
                response.sendRedirect("View/Policy/ExceptionPolicy.jsp?redirected=true&button=update_get_data&button=update");
                System.out.println(list);
            }
            if(button.equals("update")){
                String hidid=request.getParameter("hid_id");
                String ename=request.getParameter("ename");
                String ecode=request.getParameter("ecode");
                String eseverity=request.getParameter("eseverity");
                String egrancetime=request.getParameter("egrancetime");
                String ewindow=request.getParameter("ewindow");
                String estatus=request.getParameter("estatus");

                ExceptionPolicyVo ev=new ExceptionPolicyVo();
                ev.setId(hidid);
                ev.setEname(ename);
                ev.setEcode(ecode);
                ev.setEseverity(eseverity);
                ev.setEgrancetime(egrancetime);
                ev.setEwindow(ewindow);
                ev.setEstatus(estatus);

                 boolean result = _ExceptionPolicyModel.ExceptionpolicyupdateData(ev);

                System.out.println(result);

                if (result == true) {
                    ArrayList list=_ExceptionPolicyModel.ExceptionpolicyTableData();
                    session.setAttribute("exceptiondata", list);
                    response.sendRedirect("View/Policy/ExceptionPolicy.jsp?redirected=true");
                } else {
                    response.sendRedirect("error.jsp");
                }
            }

            if (button.equals("delete_data")) {
                String id = request.getParameter("id");
                System.out.println(id);
               // String update_data = request.getParameter("update_data");
                ArrayList list = _ExceptionPolicyModel.ExceptionpolicySelectdate(id);
                session.setAttribute("exceptiondata", list);
                response.sendRedirect("View/Policy/ExceptionPolicy.jsp?redirected=true&button=delete_get_data");
                System.out.println(list);
            }

             if(button.equals("Delete"))
            {
               //String id=request.getParameter("id");
                 String id=request.getParameter("hid_id");

              boolean result=_ExceptionPolicyModel.ExceptionpolicyDelete(id);

                if(result==true)
                {
                     ArrayList list = _ExceptionPolicyModel.ExceptionpolicyTableData();
                // System.out.println(list);
                session.setAttribute("exceptiondata", list);

                response.sendRedirect("View/Policy/ExceptionPolicy.jsp?redirected=true");

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
