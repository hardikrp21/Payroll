/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.AbsencePolicy;

import Beans.AbsencePolicy.AbsencePolicyBean;
import Model.AbsencePolicy.AbsencePolicyModel;
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
public class AbsencePolicyController extends HttpServlet {
   
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
            String button=request.getParameter("button");
            AbsencePolicyModel model = new AbsencePolicyModel();
            AbsencePolicyBean bean = new AbsencePolicyBean();
           HttpSession session = request.getSession();
            if (button.equals("getdata")) {
//<--            paystubaccountData-->
                String paystubaccountname = model.getpaystubaccountData();
                System.out.println("paystubaccountData" + paystubaccountname);
                session.setAttribute("paystubaccountData", paystubaccountname);

                 ArrayList list = model.AbsencePolicyTableData();
                 session.setAttribute("absencepolicyData", list);



                response.sendRedirect("View/AbsencePolicy/AbsencePolicy.jsp?redirected=true");

            }

            if (button.equals("submit")) {
               String AbsencePolicyName=request.getParameter("AbsencePolicyName");
               String AbsencePolicyType=request.getParameter("AbsencePolicyType");
                double TotalAmount = Double.parseDouble(request.getParameter("TotalAmount"));
               int  paystubaccountData=Integer.parseInt(request.getParameter("paystubaccountData"));

               bean.setAbsencePolicyName(AbsencePolicyName);
               bean.setAbsencePolicyType(AbsencePolicyType);
               bean.setTotalAmount(TotalAmount);
               bean.setPay_stub_account_id(paystubaccountData);

                boolean result = model.InsertPayStubAccount(bean);
                System.out.println("result" + result);
                if (result == true) {
                    response.sendRedirect("View/AbsencePolicy/AbsencePolicy.jsp?redirected=true");
//                    request.getRequestDispatcher("View/AbsencePolicy/AbsencePolicy.jsp?redirected=true").forward(request, response);
                } else {
                    response.sendRedirect("error.jsp");
                    //request.getRequestDispatcher("error.jsp").forward(request, response);
                }
            }

//            if (button.equals("get_data")) {
////<--            paystubaccountData-->
//                ArrayList paystubaccountname = model.AbsencePolicyTableData();
//
//                 ArrayList list = model.AbsencePolicyTableData();
//                 session.setAttribute("absencepolicyData", paystubaccountname);
//
//
//
//                response.sendRedirect("View/AbsencePolicy/AbsencePolicy.jsp?redirected=true");
//
//            }



        }catch(Exception e){
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
