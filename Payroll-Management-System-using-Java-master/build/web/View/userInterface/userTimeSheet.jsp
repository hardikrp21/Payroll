<%--
    Document   : Timesheet
    Created on : Jan 22, 2007, 3:37:18 AM
    Author     : User
--%>

<%@page import="java.util.List"%>
<%@page import="java.beans.Beans"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>




<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%
            /*if (request.getParameter("redirected") == null) {
            response.sendRedirect("../../TimesheetController?button=get_data");
            }*/



            if (request.getParameter("redirected") == null) {
                response.sendRedirect("../../TimesheetController?button=getdata");

            } else {
                boolean up = false;
                String employeedata = (String) session.getAttribute("EmployeeData");
                List data = (List) session.getAttribute("timesheet");
                //List d1 = (List) data.get(0);
                String button = "submit";
                if (request.getParameter("button") != null) {
                    button = request.getParameter("button");


                    if (button.equals("update_get_data")) {
                        up = true;
                        button = "update";

                    } else if (button.equals("delete_get_data")) {
                        up = true;

                        button = "Delete";
                    }


                }

%>
<html>
    <head>
        <!--Header File-->
        <%@include file="../../header.jsp" %>


        <!--<script>
        var e = document.getElementById("optionid");
        var strUser = e.options[e.selectedIndex].value;
        </script>-->
    </head>


    <body>

        <!-- Main Menu File -->
        <jsp:include page="../../mainmenu.jsp">
           <jsp:param name="active" value="attendance"/>
        </jsp:include>


        <!-- Main Content Wrapper -->
        <div id="da-content-wrap" class="clearfix">

            <!-- Content Area -->
            <div id="da-content-area">


                <div class="grid_4">
                    <div class="da-panel">
                        <div class="da-panel-header"
                             <span class="da-panel-title">

                               TimeSheet
                            </span>

                        </div>
                        <div class="da-panel-content">
                            <form id="da-ex-reccuringscheduletemplate" class="da-form"action="../../TimesheetController" >
                                <div id="da-ex-val1-error-reccuringscheduletemplate" class="da-message error" style="display:none;"></div>
                                <div class="da-form-inline">

                                    <div class="da-form-row">
                                        <label>Employees Name</label>
                                        <div class="da-form-item small">

                                            <%= employeedata%>
                                        </div>
                                    </div>
                                    <div class="da-form-row">
                                        <label>Attendence<span class="required"></span></label>
                                        <div class="da-form-item large">
                                            <ul class="da-form-list">
                                                <li><input type="radio" name="checkin" /> <label>checkin</label></li>
                                                <li><input type="radio" name="checkout"  /> <label>checkout</label></li>
                                            </ul>

                                            <label for="gender" class="error" generated="false" style=""></label>
                                        </div>

                                    </div>

                                </div>


                                <input type="hidden" name="hidid" ></input>
                                <div class="da-button-row" align="center">
                                    <input type="reset" value="Reset" class="da-button gray left" />
                                    <input type="submit" name="button" value="<%= button%>" align="center" class="da-button green" />
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
        </div>

        <%@include file="../../Footer.jsp" %>


        </div>
    </body>

</html>


