/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Department;

import Beans.Department.DepartmentVo;
import Model.DepartmentModel;
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
public class DepartmentServlet extends HttpServlet {
   
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
            DepartmentModel departmentModel=new DepartmentModel();
            HttpSession session = request.getSession();
            if(button.equals("submit")){
                String dname=request.getParameter("dname");
              // String dstatus= request.getParameter("dstatus");

               DepartmentVo dv=new DepartmentVo();
               dv.setDname(dname);
             //  dv.setDstatus(dstatus);

               boolean result=departmentModel.DepartmentInsertDetails(dv);
               if(result==true){

               ArrayList list = departmentModel.DepartmentTableData();
                    // System.out.println(list);
                    session.setAttribute("departmentdata", list);
                    response.sendRedirect("View/Department/Department.jsp?redirected=true");
                } else {
                    response.sendRedirect("error.jsp");
                }

            }

            if(button.equals("getdata")) {

                ArrayList list = departmentModel.DepartmentTableData();
                // System.out.println(list);
                session.setAttribute("departmentdata", list);

                response.sendRedirect("View/Department/Department.jsp?redirected=true");

            }

            if (button.equals("update_data")) {
                String id = request.getParameter("id");
                System.out.println(id);
               // String update_data = request.getParameter("update_data");
                ArrayList list = departmentModel.DepartmentSelectdate(id);
                session.setAttribute("departmentdata", list);
                response.sendRedirect("View/Department/Department.jsp?redirected=true&button=update_get_data&button=update");
                System.out.println(list);
            }
            if(button.equals("update")){
                String hidid=request.getParameter("hidid");
                 String dname=request.getParameter("dname");
               String dstatus= request.getParameter("dstatus");

               DepartmentVo dv=new DepartmentVo();
               dv.setId(hidid);
               dv.setDname(dname);
               dv.setDstatus(dstatus);
                boolean result = departmentModel.DepartmentupdateData(dv);
                System.out.println(result);

                if (result == true) {
                    ArrayList list=departmentModel.DepartmentTableData();
                    session.setAttribute("departmentdata", list);
                    response.sendRedirect("View/Department/Department.jsp");
                } else {
                    response.sendRedirect("error.jsp");
                }
            }

                if (button.equals("changestatus")) {

                String id = request.getParameter("id");
                String dstatus = request.getParameter("dstatus");
                String changestatus = request.getParameter("changestatus");

                DepartmentVo dv=new DepartmentVo();
                dv.setId(id);
                dv.setDstatus(dstatus);
                System.out.println("status" + dstatus);
                boolean data = departmentModel.updatastatus(dv);
                System.out.println(data);
                if (data == true) {

                    ArrayList list = departmentModel.DepartmentTableData();
                    session.setAttribute("departmentdata", list);

                    response.sendRedirect("View/Department/Department.jsp?redirected=true");


                }

            }

            if(button.equals("delete"))
            {
               String id=request.getParameter("id");

              boolean result=departmentModel.DepartmentDelete(id);

                if(result==true)
                {
                     ArrayList list = departmentModel.DepartmentTableData();
                // System.out.println(list);
                session.setAttribute("departmentdata", list);

                response.sendRedirect("View/Department/Department.jsp?redirected=true");

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
