/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Company;

import Beans.CompanyMaster.CompanyMasterVo;
import Model.CompanyMasterModel;
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
public class CompanyMasterServlet extends HttpServlet {

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
            CompanyMasterModel companyMasterModel = new CompanyMasterModel();
            HttpSession session = request.getSession();

            CompanyMasterVo _bean;

            if (session.getAttribute("_bean") == null) {
                _bean = new CompanyMasterVo();
                session.setAttribute("_bean", _bean);
            }
            _bean = (CompanyMasterVo) session.getAttribute("_bean");

            if (button.equals("data")) {
                ArrayList list = companyMasterModel.Companytabledata();
                _bean.setList_arr(list);
                response.sendRedirect("CompanyMaster.jsp?redirected=true");
            }
            if (button.equals("submit")) {
                System.out.println(button);
                String cfullname = request.getParameter("cfullname");
                String cshortname = request.getParameter("cshortname");
                String caddress = request.getParameter(" caddress");
                String ccity = request.getParameter("ccity");
                String cstate = request.getParameter("cstate");
                String ccountry = request.getParameter("ccountry");
                String czipcode = request.getParameter("czipcode");
                String cphoneno = request.getParameter("cphoneno");
                String cfaxno = request.getParameter("cfaxno");

                System.out.println(cfullname);
                CompanyMasterVo cmv = new CompanyMasterVo();

                cmv.setCfullname(cfullname);
                cmv.setCshortname(cshortname);
                cmv.setCaddress(caddress);
                cmv.setCcity(ccity);
                cmv.setCstate(cstate);
                cmv.setCcountry(ccountry);
                cmv.setCzipcode(czipcode);
                cmv.setCphoneno(cphoneno);
                cmv.setCfaxno(cfaxno);
                boolean result = companyMasterModel.CompanyDetails(cmv);
                if (result == true) {
                    ArrayList list = companyMasterModel.Companytabledata();
                    // System.out.println(list);
                    session.setAttribute("companydata", list);
                    //_bean.setList_arr(list);
                    response.sendRedirect("View/Company/CompanyMaster.jsp?redirected=true");



                } else {
                    response.sendRedirect("error.jsp");
                }
            }

            if (button.equals("getdata")) {

                ArrayList list = companyMasterModel.Companytabledata();
                // System.out.println(list);
                session.setAttribute("companydata", list);

                response.sendRedirect("View/Company/CompanyMaster.jsp?redirected=true");


            }

            if (button.equals("update_data")) {

                String id = request.getParameter("id");
                System.out.println(id);
                String update_data = request.getParameter("update_data");
                ArrayList list = companyMasterModel.CompanySelectdate(id);
                session.setAttribute("companydata", list);
                response.sendRedirect("View/Company/CompanyMaster.jsp?redirected=true&button=update_get_data&button=update");
                System.out.println(list);
            }

            if (button.equals("update")) {

                String hidid = request.getParameter("hid_id");
                // String id=request.getParameter("id");
                //String update_data=request.getParameter("update_data");
                String cfullname = request.getParameter("cfullname");
                String cshortname = request.getParameter("cshortname");
                String caddress = request.getParameter(" caddress");
                String ccity = request.getParameter("ccity");
                String cstate = request.getParameter("cstate");
                String ccountry = request.getParameter("ccountry");
                String czipcode = request.getParameter("czipcode");
                String cphoneno = request.getParameter("cphoneno");
                String cfaxno = request.getParameter("cfaxno");

                System.out.println(cfullname);
                System.out.println("Hidid" + hidid);
                CompanyMasterVo cmv = new CompanyMasterVo();
                cmv.setId(hidid);
                cmv.setCfullname(cfullname);

                cmv.setCshortname(cshortname);
                cmv.setCaddress(caddress);
                cmv.setCcity(ccity);
                cmv.setCstate(cstate);
                cmv.setCcountry(ccountry);
                cmv.setCzipcode(czipcode);
                cmv.setCphoneno(cphoneno);
                cmv.setCfaxno(cfaxno);

                boolean result = companyMasterModel.CompanyMasterupdate(cmv);

                System.out.println(result);

                if (result == true) {

                 ArrayList list = companyMasterModel.Companytabledata();
                  // System.out.println(list);
                 session.setAttribute("companydata", list);
                    response.sendRedirect("View/Company/CompanyMaster.jsp?redirected=true");
                } else {
                    response.sendRedirect("error.jsp");
                }
            }
 if (button.equals("delete_data")) {

                String id = request.getParameter("id");
                System.out.println(id);
              //  String update_data = request.getParameter("update_data");
                ArrayList list = companyMasterModel.CompanySelectdate(id);
                session.setAttribute("companydata", list);
                response.sendRedirect("View/Company/CompanyMaster.jsp?redirected=true&button=delete_get_data");
                System.out.println(list);
            }

            if (button.equals("Delete")) {
               // String id = request.getParameter("id");

                String id = request.getParameter("hid_id");
                // String id=request.getParameter("id");
                //String update_data=request.getParameter("update_data");
               
                boolean result = companyMasterModel.CompanyDelete(id);

                if (result == true) {
                    ArrayList list = companyMasterModel.Companytabledata();
                    // System.out.println(list);
                    session.setAttribute("companydata", list);
                    response.sendRedirect("View/Company/CompanyMaster.jsp?redirected=true");
                } else {
                    response.sendRedirect("error.jsp?button=delete");
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
