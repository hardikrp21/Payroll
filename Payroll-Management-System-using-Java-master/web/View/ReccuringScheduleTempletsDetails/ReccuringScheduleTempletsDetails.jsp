<%-- 
    Document   : ReccuringScheduleTempletsDetails
    Created on : Feb 21, 2013, 2:40:52 PM
    Author     : User
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%if (request.getParameter("redirected") == null) {
                response.sendRedirect("../../ReccuringScheduleTempletsDetailsController?button=getdata");
            }
            String data = (String)session.getAttribute("ScheduleData");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">



<html>
    <head>
<%@include file="../Header/header.jsp" %>
<title>Reccuring Schedule Templets</title>
</head>
<body>
    <%@include file="../Mainmenu/mainmenu.jsp" %>

    <!-- Main Content Wrapper -->
    <div id="da-content-wrap" class="clearfix">

        <!-- Content Area -->
        <div id="da-content-area">
            <div class="grid_4">
                <div class="da-panel">
                    <div class="da-panel-header">
                        <span class="da-panel-title">

                            Reccuring Schedule Templets Details
                        </span>

                    </div>
                    <div class="da-panel-content">
                        <form id="da-ex-company" class="da-form" action="../../ReccuringScheduleTempletsDetailsController?button=getdata">
                            <div id="da-ex-val1-error-company" class="da-message error" style="display:none;"></div>
                            <div class="da-form-inline">


                                <div class="da-form-row">
                                    <label>Reccuring Schedule </label>
                                     <div class="da-form-item small">
                                    <%= data%>
                                     </div>
                                </div>
                                      

                            </div>
                            <input type="hidden" name="hid_id" />
                            <div class="da-button-row" align="center">
                                <input type="reset" value="Reset" class="da-button gray left" />
                                <input type="submit" name="button" value="submit" align="center" class="da-button green" />
                            </div>
                        </form>
                    </div>
                </div>
            </div>
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
                                        <th>In</th>
                                        <th>Out</th>
                                        <th>TimeStamp</th>
                                        <th>Action</th>

                                    </tr>
                                </thead>
                                <tbody>


                                    <tr>
                                        <%

                                                         for (int i = 0; i < data.size(); i++) {
                                                             out.println("<tr>");
                                                             ArrayList temp = (ArrayList) data.get(i);
                                                             for (int j = 1; j < temp.size(); j++) {
                                                                 out.println("<td>" + temp.get(j) + "</td>");

                                                             }


                                                             out.println("<td><a href='../../TimesheetController?id=" + temp.get(0) + "&button=update_data'><img src=../../images/icons/color/pencil.png /></a>");
                                                             out.println("<a href='../../TimesheetController?id=" + temp.get(0) + "&button=delete_data'><img src=../../images/icons/color/cross.png /></a>");
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
                                      <%@include file="../../Footer.jsp" %>
</body>
</html>
