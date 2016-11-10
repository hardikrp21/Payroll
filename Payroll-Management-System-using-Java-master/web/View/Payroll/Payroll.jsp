<%--
    Document   : Employee
    Created on : Jan 28, 2013, 9:07:32 PM
    Author     : VIRAL
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
            //String Employeedata=(String)session.getAttribute("EmployeeData");
            ArrayList payrolldata = null;

            if (request.getParameter("redirected") == null) {
                response.sendRedirect("../../PayrollController?button=getdata");
                
                // ArrayList d1 = (ArrayList) payrolldata.get(0);
            }
            else{
payrolldata = (ArrayList) session.getAttribute("payrolldata");
%>
<html>
    <head>
        <%@include file="../../header.jsp" %>
        <title>Employee</title>
        <!--<script>
        var e = document.getElementById("optionid");
        var strUser = e.options[e.selectedIndex].value;
        </script>-->
    </head>

    <body onload="optionid">


        <jsp:include page="../../mainmenu.jsp">
            <jsp:param name="active" value="employee"/>
        </jsp:include>
        <%//@include file="../../mainmenu.jsp" %>

        <!-- Main Content Wrapper -->
        <div id="da-content-wrap" class="clearfix">

            <!-- Content Area -->
            <div id="da-content-area">

                <div class="grid_4">
                    <div class="da-panel">
                        <div class="da-panel-header">
                            <span class="da-panel-title">

                                Employee Form
                            </span>
                        </div>
                        <div class="da-panel-content">
                            <form id="da-ex-validate-employee" class="da-form" action="../../PayrollController">
                                <div id="da-ex-val1-error-emp" class="da-message error" style="display:none;"></div>
                                <div class="da-form-inline">



                                    <div class="da-form-row">
                                        <label>Start Date<span class="required"></span></label>
                                        <div class="da-form-item small">
                                            <input  type="date" name="sdate" />
                                        </div>
                                    </div>

                                    <div class="da-form-row">
                                        <label>End Date<span class="required"></span></label>
                                        <div class="da-form-item small">
                                            <input  type="date" name="enddate"  />
                                        </div>
                                    </div>


                                </div>


                                <div class="da-button-row">

                                    <input type="reset" value="Reset" class="da-button gray left" />
                                    <input type="submit" name="button"value="submit" class="da-button green" />
                                </div>
                            </form>
                        </div>
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

                                        <th> Employee Name</th>
                                        <th>Start Date</th>
                                        <th>End Date</th>

                                        <th> Trasaction Date</th>
                                        <th>Total Hours</th>
                                        <th> Salary</th>


                                    </tr>
                                </thead>

                                <tbody>


                                    <%

                                              for (int i = 0; i < payrolldata.size(); i++) {
                                                                    out.println("<tr>");
                                                                    ArrayList temp = (ArrayList) payrolldata.get(i);
                                                                    for (int j = 1; j < temp.size(); j++) {
                                                                        out.println("<td>" + temp.get(j) + "</td>");
                                                                    }
                                                    out.println("</td>");
                                                    out.println("</tr>");
                                                    //  }
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