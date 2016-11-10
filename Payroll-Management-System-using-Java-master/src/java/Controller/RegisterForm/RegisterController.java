/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.RegisterForm;

import Beans.UserMaster.UserMasterVo;
import Model.RegisterModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class RegisterController extends HttpServlet {
   
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
           String insert = request.getParameter("insert");
            RegisterModel _RegisterModel = new RegisterModel();

            if (insert.equals("Submit")) {

                String username = request.getParameter("username");
                String emailid = request.getParameter("emailid");
                String password = request.getParameter("password");
                String mobileno = request.getParameter("mobileno");
                String address = request.getParameter("address");
                String city = request.getParameter("city");
                String state=request.getParameter("state");
                String country=request.getParameter("country");
                String pincode = request.getParameter("pincode");

               // System.out.println(address + " " + mobileno);

                UserMasterVo userMasterVo = new UserMasterVo();

                userMasterVo.setUsername(username);
                userMasterVo.setEmailid(emailid);
                userMasterVo.setPassword(password);
                userMasterVo.setMobileno(mobileno);
                userMasterVo.setAddress(address);
                userMasterVo.setCity(city);
                userMasterVo.setState(state);
                userMasterVo.setCountry(country);
                userMasterVo.setPincode(pincode);

                boolean result = _RegisterModel.InsertDetails(userMasterVo);

                if (result == true) {
                    response.sendRedirect("Success.jsp");
                } else {
                    response.sendRedirect("error.jsp");
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
