<%--
    Document   : index
    Created on : Jan 16, 2013, 12:48:46 PM
    Author     : User
--%>
<%@page import="java.beans.Beans"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>




<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!--Redirected Form-->
<%
if(request.getParameter("redirected")==null)
    {
        response.sendRedirect("../../PayPeriodScheduleController?button=getdata");
    }
else{
 boolean up=false;
        ArrayList data = (ArrayList) session.getAttribute("payperiodscheduledata");
            ArrayList d1 = (ArrayList) data.get(0);
        String button="submit";
        if(request.getParameter("button")!=null){
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
<!--Header File-->
<%@include file="../../header.jsp" %>



        <title> Pay Period Schedule </title>
<!--<script>
var e = document.getElementById("optionid");
var strUser = e.options[e.selectedIndex].value;
</script>-->
    </head>


    <body>

        <!-- Main Menu File -->
        <%//@include  file="../../mainmenu.jsp" %>
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

                                            Pay Period Schedule
                                        </span>

                                    </div>
                                    <div class="da-panel-content">
                                        <form id="da-ex-PayPeriodSchedule" class="da-form" action="../../PayPeriodScheduleController?button=getdata">
                                            <div id="da-ex-val1-error-PayPeriodSchedule" class="da-message error" style="display:none;"></div>
                                            <div class="da-form-inline">
                                            <div class="da-form-row">
                                                <label>Pay Period Schedule Name</label>
                                                <div class="da-form-item small">
                                                    <input type="text" name="pay_period_schedule_name" size="10" value="<% if(up) out.print(d1.get(1)); else out.print("");%>" />
                                                </div>
                                            </div>

                                            <div class="da-form-row">
                                                <label>Pay Period Type</label>
                                                <div class="da-form-item small">
                                                    <input type="text" name="pay_period_type" value="<% if(up) out.print(d1.get(2)); else out.print("");%>"/>
                                                </div>
                                            </div>


                                            

                                            <div class="da-form-row">
                                                <label>Transaction Date</label>
                                                <div class="da-form-item small">
                                                    <input type="text" name="transaction_date" value="<% if(up) out.print(d1.get(3)); else out.print("");%>"/>
                                                </div>
                                            </div>

                                            <div class="da-form-row">
                                                <label>Pay Periods Date</label>
                                                <div class="da-form-item small">
                                                    <input type="date" name="pay_periods_from" value="<% if(up) out.print(d1.get(4)); else out.print("");%>"/>
                                                </div>
                                            </div>
                                            </div>
                                            <input type="hidden" name="hid_id" value="<%=d1.get(0)%>"></input>
                                            <div class="da-button-row" align="center">
                                                <input type="reset" value="Reset" class="da-button gray left" />
                                                <input type="submit" name="button" value="<%= button %>"  class="da-button green" />
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>




                      
                        <!-- Content Area -->
                        <div id="da-content-area">


                            <div class="grid_4">
                                <div class="da-panel collapsible">
                                    <div class="da-panel-header">
                                        <span class="da-panel-title">
                                            <img src="images/icons/black/16/list.png" alt=""/>
                                            Pay Period Schedule Table
                                        </span>



                                        <span class="da-panel-toggler"></span></div>
                                    <div class="da-panel-content">
                                        <table class="da-table">
                                            <thead>
                                                <tr>

                                                    <th>Pay Period Schedule Name</th>
                                                    <th>Pay Period Type</th>
                                                    <th>Transaction Date</th>
                                                    <th>Pay Periods From</th>
                                                    

                                                    <th>Action</th>


                                                </tr>
                                            </thead>

                                            <tbody>


                                                <%

                                                        System.out.println("data::"+data);

                                                            for (int i = 0; i < data.size(); i++) {
                                                                out.println("<tr>");
                                                                ArrayList temp = (ArrayList) data.get(i);
                                                              for (int j = 1; j < temp.size(); j++) {

                                                                    out.println("<td>" + temp.get(j) + "</td>");
                                                                   }


                                                                out.println("<td><a href='../../PayPeriodScheduleController?id=" + temp.get(0) + "&button=update_data'><img src=../../images/icons/color/pencil.png /></a>");
                                                                out.println("<a href='../../PayPeriodScheduleController?id=" + temp.get(0) + "&button=delete_data'><img src=../../images/icons/color/cross.png /></a>");
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

            <%@include file="../../Footer.jsp" %>

        </div>

    </body>

</html>
<%}%>