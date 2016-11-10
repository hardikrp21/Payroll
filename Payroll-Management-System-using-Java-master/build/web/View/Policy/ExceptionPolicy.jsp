<%--
    Document   : BreakPolicy
    Created on : Jan 9, 2007, 4:28:41 AM
    Author     : User
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
if(request.getParameter("redirected")==null)
    {
        response.sendRedirect("../../ExceptionPolicyServlet?button=getdata");
    }
else{
 boolean up=false;
        ArrayList data = (ArrayList) session.getAttribute("exceptiondata");
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

        <title>Exception Policy</title>

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

                                            Exception Policy
                                        </span>
                                    </div>
                                    <div class="da-panel-content">
                                        <form id="da-ex-exception" class="da-form" action="../../ExceptionPolicyServlet?button=getdata">
                                            <div id="da-ex-val1-error" class="da-message error" style="display:none;"></div>
                                            <div class="da-form-inline">
                                                <div class="da-form-row">
                                                    <label>Exception name<span class="required">*</span></label>
                                                    <div class="da-form-item small">
                                                        <input type="text" name="ename" value="<% if(up) out.print(d1.get(1)); else out.print("");%>"/>
                                                    </div>
                                                </div>

                                                 <div class="da-form-row">
                                                    <label>Exception Code<span class="required">*</span></label>
                                                    <div class="da-form-item small">
                                                        <input type="text" name="ecode" value="<% if(up) out.print(d1.get(2)); else out.print("");%>" />
                                                    </div>
                                                </div>

                                                 <div class="da-form-row">
                                                     <label>Severity<span class="required">*</span></label>
                                                    <div class="da-form-item small">
                                                        <input type="text" name="eseverity" value="<% if(up) out.print(d1.get(3)); else out.print("");%>"/>
                                                    </div>
                                                </div>

                                                 <div class="da-form-row">
                                                    <label>Grance Time<span class="required">*</span></label>
                                                    <div class="da-form-item small">
                                                        <input type="text" name="egrancetime" value="<% if(up) out.print(d1.get(4)); else out.print("");%>"/>

                                                    </div>
                                                </div>

                                                 <div class="da-form-row">
                                                    <label>Watch Window<span class="required">*</span></label>
                                                    <div class="da-form-item small">
                                                        <input type="text" name="ewindow" value="<% if(up) out.print(d1.get(5)); else out.print("");%>"/>
                                                    </div>
                                                </div>

                                                <div class="da-form-row">
                                                    <label>Active Status<span class="required">*</span></label>
                                                    <div class="da-form-item small">
                                                        
                                                        <select id="optionid" name="estatus"  value="<% if(up) out.print(d1.get(6)); else out.print("");%>">

                                                        <option value="1" >1</option>
                                                        <option value="0" >0</option>

                                                    </select>
                                                    </div>
                                                </div>
                                            </div>

                                            <input type="hidden" name="hid_id" value="<%=d1.get(0)%>"></input>
                                            <div class="da-button-row">
                                                <input type="reset" value="Reset" name="button" class="da-button gray left" />
                                                <input type="submit" name="button" value="<%= button %>" class="da-button green" />
                                            </div>
                                        </form>
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
                                              Meal Policy Table
                                        </span>



                                        <span class="da-panel-toggler"></span></div>
                                    <div class="da-panel-content">
                                        <table class="da-table">
                                            <thead>
                                                <tr>

                                                    <th> Policy Name</th>
                                                    <th>Exception Code</th>
                                                      <th>Severity</th>

                                                    <th>Grance Time</th>
                                                    <th>Watch Window</th>
                                                    <th>Active Status</th>

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


                                                                out.println("<td><a href='../../ExceptionPolicyServlet?id=" + temp.get(0) + "&button=update_data'><img src=../../images/icons/color/pencil.png /></a>");
                                                                out.println("<a href='../../ExceptionPolicyServlet?id=" + temp.get(0) + "&button=delete_data'><img src=../../images/icons/color/cross.png /></a>");
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