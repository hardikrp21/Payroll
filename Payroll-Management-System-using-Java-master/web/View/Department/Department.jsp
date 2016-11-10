<%-- 
    Document   : Department
    Created on : Jan 10, 2007, 1:00:02 AM
    Author     : User
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
if(request.getParameter("redirected")==null)
    {
        response.sendRedirect("../../DepartmentServlet?button=getdata");
    }
else{
 boolean up=false;
        ArrayList data = (ArrayList) session.getAttribute("departmentdata");
            ArrayList d1 = (ArrayList) data.get(0);
        String button="submit";
        if(request.getParameter("button")!=null)
            {
            button=request.getParameter("button");


                if( button.equals("update_get_data"))
              {
                    up=true;
                    button="update";

               }
         else if(button.equals("delete_get_data"))
               {
              up=true;

               button="Delete";
          }


            }

%>
<html>
    <head>
<%@include file="../../header.jsp" %>

<title>Department</title>

</head>

<body>

	
        <%//@include file="../../mainmenu.jsp" %>
        <jsp:include page="../../mainmenu.jsp">
            <jsp:param name="active" value="company"/>
        </jsp:include>

                <!-- Main Content Wrapper -->
                <div id="da-content-wrap" class="clearfix">

                	<!-- Content Area -->
                	<div id="da-content-area">

                    	<div class="grid_4">
                        	<div class="da-panel">
                            	<div class="da-panel-header">
                                	<span class="da-panel-title">
                                     
                                        Department
                                    </span>
                                </div>
                                <div class="da-panel-content">
                                    <form id="da-ex-validate-department" class="da-form" action="../../DepartmentServlet">
                                    	<div id="da-ex-val1-error-department" class="da-message error" style="display:none;"></div>
                                        <div class="da-form-inline">
                                            <div class="da-form-row">
                                                <label>Department Name<span class="required">*</span></label>
                                                <div class="da-form-item small">
                                                    <input type="text" name="dname" value="<% if(up) out.print(d1.get(1)); else out.print("");%>"/>
                                                </div>
                                            </div>
                                            
                                          
                                           
                                         <input type="hidden" name="hidid" value="<%=d1.get(0)%>"></input>
                                        </div>
                                        <div class="da-button-row">
                                            <input type="submit" name="button" value="<%= button %>" class="da-button green" />
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>

                    	  <div class="clear"></div>
                            <!-- Main Content Wrapper -->
                            <div id="da-content-wrap" class="clearfix"></div>
                            <!-- Content Area -->
                            <div id="da-content-area">


                                <div class="grid_4">
                                    <div class="da-panel collapsible">
                                        <div class="da-panel-header">
                                            <span class="da-panel-title">
                                                <img src="images/icons/black/16/list.png" alt=""/>
                                                Table Styling
                                            </span>



                                            <span class="da-panel-toggler"></span></div>
                                        <div class="da-panel-content">
                                            <table class="da-table">
                                                <thead>
                                                    <tr>

                                                        <th> Department Name</th>
                                                        <th>Department Status</th>
                                                       

                                                        <th>Action</th>

                                                    </tr>
                                                </thead>

                                                <tbody>


                                                    <%

                                                                for (int i = 0; i < data.size(); i++) {
                                                                    out.println("<tr>");
                                                                    ArrayList temp = (ArrayList) data.get(i);
                                                                    for (int j = 1; j < temp.size(); j++) {
                                                                        out.println("<td>" + temp.get(j) + "</td>");
                                                                    }


                                                                    out.println("<td><a href='../../DepartmentServlet?id=" + temp.get(0) + "&button=update_data'><img src=../../images/icons/color/pencil.png /></a>");
                                                                    out.println("<a href='../../DepartmentServlet?id=" + temp.get(0) + "&dstatus=Active&button=changestatus'><img src=../../images/icons/color/accept.png /></a>");
                                                                    out.println("<a href='../../DepartmentServlet?id=" + temp.get(0) + "&dstatus=Deactive&button=changestatus'><img src=../../images/icons/color/cross.png /></a>");
                                                                    out.println("</td>");
                                                                    out.println("</tr>");
                                                                }
                                                    %>




                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>

                    </div>
                </div>
                </div>


        <%@include file="../../Footer.jsp" %>

</div>

</body>

</html>
<%}%>