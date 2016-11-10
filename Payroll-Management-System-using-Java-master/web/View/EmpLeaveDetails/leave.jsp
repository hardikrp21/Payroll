<%-- 
    Document   :leave
    Created on : Feb 22, 2013, 3:55:53 PM
    Author     : User
--%>


<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <!--Header File-->
        <jsp:include page="../../header.jsp">
            <jsp:param name="active" value="Policy"/>
        </jsp:include>
        <%//@include file="../../header.jsp" %>
        <title>Absence Policy</title>

    </head>

    <body>
        
<%
    if (request.getParameter("redirected") == null) {
        response.sendRedirect("../../LeaveController?button=getdata");

    }
    String Employeedata=(String)session.getAttribute("EmployeeData");
     String AbsencePolicy = (String) session.getAttribute("AbsencePolicyData");

%>

        <!-- MainMenu -->
        <%@include file="../../mainmenu.jsp" %>

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
                            <form id="da-ex-validate-break" class="da-form" action="../../LeaveController?button=Submit">
                                <div id="da-ex-val1-error-break" class="da-message error" style="display:none;"></div>
                                <div class="da-form-inline">
                                    <div class="da-form-row">
                                    <label> Employee First Name </label>
                                     <div class="da-form-item small">
                                    <%= Employeedata%>
                                     </div>
                                </div>

                                       <div class="da-form-row">
                                        <label>Absence Policy Name</label>
                                        <div class="da-form-item small">
                                            <%= AbsencePolicy %>
                                        </div>
                                    </div>


                                    <div class="da-form-row">
                                        <label>Absent Days</label>
                                        <div class="da-form-item small">
                                            <input  type="text" name="absentdays" />
                                        </div>
                                    </div>

                                    

                                   </div>


                                <input type="hidden" name="hid_id"/>
                                <div class="da-button-row">
                                    <input type="reset" value="Reset" name="button" class="da-button gray left" />
                                    <input type="submit" name="button" value="Submit" class="da-button green" />
                                </div>
                            </form>
                        </div>
                    </div>
                </div>


            </div>
        </div>



    </body>

</html>

