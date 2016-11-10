/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Policy;

import Beans.Policy.BreakPolicyVo;
import Beans.Policy.MealPolicyVo;
import Model.BreakPolicyModel;
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
public class BreakPolicyServlet extends HttpServlet {
   
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
           BreakPolicyModel _BreakPolicyModel=new BreakPolicyModel();
            HttpSession session = request.getSession();
            if (button.equals("submit")) {
                String bpolicyname = request.getParameter("bpolicyname");
                String bactiveafter = request.getParameter("bactiveafter");
                String bdeductiontime = request.getParameter("bdeductiontime");
                String bmintime = request.getParameter("bmintime");
                String bmaxtime = request.getParameter("bmaxtime");

               BreakPolicyVo bpv=new BreakPolicyVo();
                System.out.println("breakpolicy"+bpv);
                bpv.setBpolicyname(bpolicyname);
                bpv.setBactiveafter(bactiveafter);
                bpv.setBdeductiontime(bdeductiontime);
                bpv.setBmintime(bmintime);
                bpv.setBmaxtime(bmaxtime);

                boolean result = _BreakPolicyModel.BreakpolicyInsertDetails(bpv);
                if (result == true) {
                    ArrayList list = _BreakPolicyModel.BreakpolicyTableData();
                    // System.out.println(list);
                    session.setAttribute("breakpolicydata", list);
                    response.sendRedirect("View/Policy/BreakPolicy.jsp?redirected=true");
                } else {
                    response.sendRedirect("error.jsp");
                }


            }
            if(button.equals("getdata")) {
                ArrayList list = _BreakPolicyModel.BreakpolicyTableData();
                // System.out.println(list);
                session.setAttribute("breakpolicydata", list);

                response.sendRedirect("View/Policy/BreakPolicy.jsp?redirected=true");

            }
            if (button.equals("update_data")) {
                String id = request.getParameter("id");
                System.out.println(id);
                String update_data = request.getParameter("update_data");
                ArrayList list = _BreakPolicyModel.BreakpolicySelectdate(id);
                session.setAttribute("breakpolicydata", list);
                response.sendRedirect("View/Policy/BreakPolicy.jsp?redirected=true&button=update_get_data&button=update");
                System.out.println(list);
            }
            if (button.equals("update")) {
                String hidid = request.getParameter("hid_id");
                String bpolicyname = request.getParameter("bpolicyname");
                String bactiveafter = request.getParameter("bactiveafter");
                String bdeductiontime = request.getParameter("bdeductiontime");
                String bmintime = request.getParameter("bmintime");
                String bmaxtime = request.getParameter("bmaxtime");

               BreakPolicyVo bpv=new BreakPolicyVo();
                System.out.println("breakpolicy"+bpv);
                bpv.setId(hidid);
                bpv.setBpolicyname(bpolicyname);
                bpv.setBactiveafter(bactiveafter);
                bpv.setBdeductiontime(bdeductiontime);
                bpv.setBmintime(bmintime);
                bpv.setBmaxtime(bmaxtime);

                boolean result = _BreakPolicyModel.BreakpolicyupdateData(bpv);

                System.out.println(result);

                if (result == true) {
                    ArrayList list=_BreakPolicyModel.BreakpolicyTableData();
                    session.setAttribute("breakpolicydata", list);
                    response.sendRedirect("View/Policy/BreakPolicy.jsp?redirected=true");
                } else {
                    response.sendRedirect("error.jsp");
                }
            }

             if (button.equals("delete_data")) {
                String id = request.getParameter("id");
                System.out.println(id);
               String update_data = request.getParameter("delete_data");
                ArrayList list = _BreakPolicyModel.BreakpolicySelectdate(id);
                session.setAttribute("breakpolicydata", list);
                response.sendRedirect("View/Policy/BreakPolicy.jsp?redirected=true&button=delete_get_data");
                System.out.println(list);
            }
            if(button.equals("Delete"))
            {
               //String id=request.getParameter("id");
                String id = request.getParameter("hid_id");
              

              boolean result=_BreakPolicyModel.BreakpolicyDelete(id);

                if(result==true)
                {
                     ArrayList list = _BreakPolicyModel.BreakpolicyTableData();
                // System.out.println(list);
                session.setAttribute("breakpolicydata", list);

                response.sendRedirect("View/Policy/BreakPolicy.jsp?redirected=true");

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
