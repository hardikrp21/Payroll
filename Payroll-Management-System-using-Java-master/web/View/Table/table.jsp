<%--
    Document   : index
    Created on : Jan 16, 2013, 12:48:46 PM
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%
            if (request.getParameter("redirected") == null) {
                response.sendRedirect("../../TableDataServlet?button=get_data");
            } else {
                ArrayList data = (ArrayList) session.getAttribute("tabledata");
                ArrayList d1 = (ArrayList) data.get(0);
%>
<!--   Header File-->
<%@include file="../Header/header.jsp" %>
<title> Table</title>

</head>

<body>

    <!--Main Menu -->
    <%@include file="../Mainmenu/mainmenu.jsp" %>

    <!-- Main Content Wrapper -->
    <div id="da-content-wrap" class="clearfix">

        <!-- Content Area -->
        <div id="da-content-area">


            <div class="grid_4">
                <div class="da-panel collapsible">
                    <div class="da-panel-header">
                        <span class="da-panel-title">
                            <img src="images/icons/black/16/list.png" alt="" />
                            Table 
                        </span>

                    </div>
                    <div class="da-panel-content">
                        <table class="da-table">
                            <thead>
                                <tr>

                                    <th>User Name</th>
                                    <th>Email ID</th>
                                    <th>password</th>
                                    <th>Mobile No</th>
                                    <th>city</th>
                                    <th>State</th>
                                    <th>Country</th>
                                    <th>status</th>
                                    <th>action</th>
                                    <input type="hidden" name="hid_id" value="<%=data.get(0)%>"></input>

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


                                          out.println("<td><a href='../../TableDataServlet?id=" + temp.get(0) + "&status=1&button=changestatus'><img src=../../images/icons/color/accept.png /></a>");
                                          out.println("<a href='../../TableDataServlet?id=" + temp.get(0) + "&status=0&button=changestatus'><img src=../../images/icons/color/cross.png /></a>");
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


    <!-- Footer -->
    <div id="da-footer">
        <div class="da-container clearfix">
            <p>Copyright 2012. Dandelion Admin. All Rights Reserved.</p>
        </div>
    </div>

</div>

</body>

</html>
<%}%>