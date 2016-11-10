<%-- 
    Document   : newjsp
    Created on : May 15, 2013, 4:45:13 PM
    Author     : User
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="../../header.jsp" %>
    </head>
    <%
   
 List attendence = (List) session.getAttribute("attendence");
%>
    <body>
         <%@include file="../../mainmenu.jsp" %>
          <div id="da-content-wrap" class="clearfix">

        <!-- Content Area -->
        <div id="da-content-area">
       <div class="grid_4">
                    <div class="da-panel collapsible">
                        <div class="da-panel-header">
                            <span class="da-panel-title">
                                <img src="../../images/icons/black/16/list.png" alt="" />
                                Data Table with Numbered Pagination
                            </span>

                        </div>
                        <div class="da-panel-content">
                            <table id="da-ex-datatable-numberpaging" class="da-table">
                                <thead>
                                    <tr>

                                        <th>Employee Name</th>
                                        <th>Timestamp</th>
                                        <th>Outtimestamp</th>
                                        <th>Total Hours</th>



                                    </tr>
                                </thead>
                                <tbody>


                                    <tr>
                                        <%

                                                        for (int i = 0; i < attendence.size(); i++) {
                                                             out.println("<tr>");
                                                             List temp = (List) attendence.get(i);
                                                             for (int j = 1; j < temp.size(); j++) {
                                                                 out.println("<td>" + temp.get(j) + "</td>");

                                                             }

                                                             out.println("</td>");
                                                             out.println("</tr>");
                                                         }
                                        %>
                                    </tr>
                                </tbody>
                            </table>

                        </div>
                    </div>

                </div>
        </div>
          </div>
    </body>
</html>
