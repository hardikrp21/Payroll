<%-- 
    Document   : MeanPolicy
    Created on : Jan 9, 2007, 3:18:50 AM
    Author     : User
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
if(request.getParameter("redirected")==null)
    {
        response.sendRedirect("../../MealPolicyServlet?button=getdata");
    }
else{
 boolean up=false;
        ArrayList data = (ArrayList) session.getAttribute("mealpolicydata");
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
<!--Header File-->
<%@include file="../../header.jsp" %>

        <title>Meal Policy</title>

    </head>

    <body>

        <!-- Main Menu -->
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

                                            Meal Policy
                                        </span>
                                    </div>
                                    <div class="da-panel-content">
                                        <form id="da-ex-meal" class="da-form" action="../../MealPolicyServlet?button=getdata">
                                            <div id="da-ex-val1-error-meal" class="da-message error" style="display:none;"></div>
                                            <div class="da-form-inline">
                                                <div class="da-form-row">
                                                    <label>policy name<span class="required">*</span></label>
                                                    <div class="da-form-item small">
                                                        <input type="text" name="mpolicyname" value="<% if(up) out.print(d1.get(1)); else out.print("");%>"/>
                                                    </div>
                                                </div>

                                                <div class="da-form-row">
                                                    <label>Active After<span class="required">*</span></label>
                                                    <div class="da-form-item small">
                                                        <input type="text" name="mactiveafter" value="<% if(up) out.print(d1.get(2)); else out.print("");%>"/>
                                                    </div>
                                                </div>
                                          

                                                <div class="da-form-row">
                                                    <label>Meal Time<span class="required">*</span></label>
                                                    <div class="da-form-item small">
                                                        <input id="da-ex-timepicker" type="text" name="mmealtime" value="<% if(up) out.print(d1.get(3)); else out.print("");%>"/>
                                                    </div>
                                                </div>

                                                <div class="da-form-row">
                                                    <label>Minimum Punch Time<span class="required">*</span></label>
                                                    <div class="da-form-item small">
                                                        <input type="text" name="mmintime" value="<% if(up) out.print(d1.get(4)); else out.print("");%>"/>

                                                    </div>
                                                </div>

                                                <div class="da-form-row">
                                                    <label>Maximum Punch Time<span class="required">*</span></label>
                                                    <div class="da-form-item small">
                                                        <input type="text" name="mmaxtime" value="<% if(up) out.print(d1.get(5)); else out.print("");%>"/>
                                                    </div>
                                                </div>
                                            </div>

                                                <input type="hidden" name="hid_id" value="<%=d1.get(0)%>"></input>
                                            <div class="da-button-row">
                                                <input type="reset" name="button" value="Reset" class="da-button gray left" />
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

                                                        <th> Policy Name</th>
                                                        <th>Active After</th>
                                                        <th>Meal Time</th>

                                                        <th>Minimum Punch Time</th>
                                                        <th>Maximum Punch Time</th>

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


                                                                    out.println("<td><a href='../../MealPolicyServlet?id=" + temp.get(0) + "&button=update_data'><img src=../../images/icons/color/pencil.png /></a>");
                                                                    out.println("<a href='../../MealPolicyServlet?id=" + temp.get(0) + "&button=delete_data'><img src=../../images/icons/color/cross.png /></a>");
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