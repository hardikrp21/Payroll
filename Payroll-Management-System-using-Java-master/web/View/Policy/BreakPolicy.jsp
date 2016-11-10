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
        response.sendRedirect("../../BreakPolicyServlet?button=getdata");
    }
else{
 boolean up=false;
        ArrayList data = (ArrayList) session.getAttribute("breakpolicydata");
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
        <title>Break Policy</title>

    </head>

    <body>

        <!-- MainMenu -->
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

                                           Break Policy
                                        </span>
                                    </div>
                                    <div class="da-panel-content">
                                        <form id="da-ex-validate-break" class="da-form" action="../../BreakPolicyServlet?button=getdata">
                                            <div id="da-ex-val1-error-break" class="da-message error" style="display:none;"></div>
                                            <div class="da-form-inline">
                                                <div class="da-form-row">
                                                    <label>policy name<span class="required">*</span></label>
                                                    <div class="da-form-item small">
                                                        <input type="text" name="bpolicyname"  value="<% if(up) out.print(d1.get(1)); else out.print("");%>"/>
                                                       
                                                    </div>
                                                </div>

                                                <div class="da-form-row">
                                                    <label>Active After<span class="required">*</span></label>
                                                    <div class="da-form-item small">
                                                        <input type="text" name="bactiveafter" value="<% if(up) out.print(d1.get(2)); else out.print("");%>"/>
                                                    </div>
                                                </div>

<!--                                                 <div class="da-form-row">
                                                     <label>Deduction Addition Time<span class="required"></span></label>
                                                    <div class="da-form-item large">
                                                        <input id="da-ex-timepicker" type="text" name="bdeductiontime" class="hasDatepicker" value="<% if(up) out.print(d1.get(3)); else out.print("");%>"/>
                                                        
                                                    </div>
                                                </div>-->
                                                        <div class="da-form-row">
                                        	<label>Deduction Addition Time</label>
                                            <div class="da-form-item small">
                                            	<input id="da-ex-timepicker" type="text" name="bdeductiontime"  value="<% if(up) out.print(d1.get(3)); else out.print("");%>"/>
                                            </div>
                                        </div>


                                                 <div class="da-form-row">
                                                    <label>Minimum Punch Time<span class="required">*</span></label>
                                                    <div class="da-form-item small">
                                                        <input type="text" name="bmintime" value="<% if(up) out.print(d1.get(4)); else out.print("");%>"/>

                                                    </div>
                                                </div>


                                                 <div class="da-form-row">
                                                    <label>Maximum Punch Time<span class="required">*</span></label>
                                                    <div class="da-form-item small">
                                                        <input type="text" name="bmaxtime" value="<% if(up) out.print(d1.get(5)); else out.print("");%>"/>
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



                    <!-- Table form-->
                        <!-- Content Area -->
                        <div id="da-content-area">


                            <div class="grid_4">
                                <div class="da-panel collapsible">
                                    <div class="da-panel-header">
                                        <span class="da-panel-title">
                                            <img src="images/icons/black/16/list.png" alt=""/>
                                               Break Policy Table
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


                                                                out.println("<td><a href='../../BreakPolicyServlet?id=" + temp.get(0) + "&button=update_data'><img src=../../images/icons/color/pencil.png /></a>");
                                                                out.println("<a href='../../BreakPolicyServlet?id=" + temp.get(0) + "&button=delete_data'><img src=../../images/icons/color/cross.png /></a>");
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