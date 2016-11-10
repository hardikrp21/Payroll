<%-- 
    Document   : AbsencePolicy
    Created on : Feb 22, 2013, 3:55:53 PM
    Author     : User
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%
            /*if (request.getParameter("redirected") == null) {
                response.sendRedirect("../../AbsencePolicyController?button=getdata");
            }

            String data = (String) session.getAttribute("paystubaccountData");*/

if(request.getParameter("redirected")==null)
    {
        response.sendRedirect("../../AbsencePolicyController?button=getdata");
    }
else{
 boolean up=false;
        String data1 = (String) session.getAttribute("paystubaccountData");
        ArrayList data = (ArrayList) session.getAttribute("absencepolicyData");
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
<html>
    <head>
        <!--Header File-->
        <%@include file="../../header.jsp" %>
        <title>Absence Policy</title>

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

                                Absence Policy
                            </span>
                        </div>
                        <div class="da-panel-content">
                            <form id="da-ex-absencepolicy" class="da-form" action="../../AbsencePolicyController?button=getdata">
                                <div id="da-ex-val1-error-absencepolicy" class="da-message error" style="display:none;"></div>
                                <div class="da-form-inline">
                                    <div class="da-form-row">
                                        <label>Absence Policy Name<span class="required"</span></label>
                                        <div class="da-form-item small">
                                            <input type="text" name="AbsencePolicyName"/>

                                        </div>
                                    </div>

                                    <div class="da-form-row">
                                        <label>Absence Policy Type<span class="required"></span></label>
                                        <div class="da-form-item small">
                                            <input type="text" name="AbsencePolicyType" />
                                        </div>
                                    </div>

                                    <div class="da-form-row">
                                        <label>Total Amount</label>
                                        <div class="da-form-item small">
                                            <input id="da-ex-timepicker" type="text" name="TotalAmount" />
                                        </div>
                                    </div>

                                     <div class="da-form-row">
                                        <label>Pay Stub Name</label>
                                        <div class="da-form-item small">
                                           
                                            <%= data1 %>
                                        </div>
                                    </div>





                                </div>


                                <input type="hidden" name="hid_id" />
                                <div class="da-button-row">
                                    <input type="reset" value="Reset" name="button" class="da-button gray left" />
                                    <input type="submit" name="button" value="submit" class="da-button green" />
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
                                        <th>Absence Policy</th>
                                        <th>Absence Policy Type</th>
                                        <th>Total Amount</th>
                                        <th>Pay Stub Account Name</th>
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

                                        <jsp:include page="../../Footer.jsp"></jsp:include>

    </body>

</html>
<%}%>

