<%-- 
    Document   : SchedulePolicyMaster
    Created on : Jan 22, 2007, 12:58:35 AM
    Author     : User
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
/*if (request.getParameter("redirected") == null) {
                response.sendRedirect("../../SchedulePolicyMasterController?button=get_data");
            }
            String Mealdata = (String)session.getAttribute("MealPolicyData");
            String Breakdata=(String)session.getAttribute("BreakPolicyData");*/

            if(request.getParameter("redirected")==null)
    {
        response.sendRedirect("../../SchedulePolicyMasterController?button=getdata");
    }
else{
 boolean up=false;

       String Mealdata = (String)session.getAttribute("MealPolicyData");
            String Breakdata=(String)session.getAttribute("BreakPolicyData");
        ArrayList data = (ArrayList) session.getAttribute("SchedulePolicyData");
        String AbsencePolicy = (String) session.getAttribute("AbsencePolicyData");
           // ArrayList d1 = (ArrayList) data.get(0);
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
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">



<html>
    <head>
<%@include file="../../header.jsp" %>
<title>Schedule Policy Master</title>
</head>
<body>
    <%//@include file="../../mainmenu.jsp" %>
    <jsp:include page="../../mainmenu.jsp">
            <jsp:param name="active" value="policy"/>
        </jsp:include>


    <!-- Main Content Wrapper -->
    <div id="da-content-wrap" class="clearfix">

        <!-- Content Area -->
        <div id="da-content-area">
            <div class="grid_4">
                <div class="da-panel">
                    <div class="da-panel-header">
                        <span class="da-panel-title">

                            SchedulePolicyMaster
                        </span>

                    </div>
                    <div class="da-panel-content">
                        <form id="da-ex-schedulepolicymaster" class="da-form" action="../../SchedulePolicyMasterController?button=get_data">
                            <div id="da-ex-val1-error-schedulepolicymaster" class="da-message error" style="display:none;"></div>
                            <div class="da-form-inline">
                                <div class="da-form-row">
                                    <label>Schedule Policy Name</label>
                                    <div class="da-form-item small ">
                                        <input type="text" name="Schedulepolicyname" size="10" value="" />
                                    </div>
                                </div>

                                <div class="da-form-row">
                                    <label> Meal Name </label>
                                     <div class="da-form-item small">
                                    <%= Mealdata%>
                                     </div>
                                </div>
                                     <div class="da-form-row">
                                    <label> Break Name </label>
                                     <div class="da-form-item small">
                                    <%= Breakdata%>
                                     </div>
                                </div>
                                      <div class="da-form-row">
                                        <label>Absence Policy Name</label>
                                        <div class="da-form-item small">
                                            <%= AbsencePolicy %>
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
                                        <th>Schedule Policy Name</th>
                                        <th>Meal Policy Name</th>
                                        <th>Break Policy Name</th>
                                        
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
<%}%>
