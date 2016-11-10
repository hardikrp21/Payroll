<%--
    Document   : MassPunchScheduleDetails
    Created on : Mar 12, 2013, 12:37:33 PM
    Author     : User
--%>

<%@page import="java.lang.String"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
//String EmployeeData=null;

            String EmployeeData=(String)session.getAttribute("EmployeeData");

            if(request.getParameter("redirected")==null)
    {
        response.sendRedirect("../../AttendenceController?button=getdata");

         // EmployeeData=(String)session.getAttribute("EmployeeData");
    }
          
               


%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">



<html>
    <head>
<%@include file="../../header.jsp" %>
<title>Reccuring Schedule Employees</title>
</head>
<body>
    <%@include file="../../mainmenu.jsp" %>

    <!-- Main Content Wrapper -->
    <div id="da-content-wrap" class="clearfix">

        <!-- Content Area -->
        <div id="da-content-area">
            <div class="grid_4">
                <div class="da-panel">
                    <div class="da-panel-header">
                        <span class="da-panel-title">

                            Mass Punch Schedule Details
                        </span>

                    </div>
                    <div class="da-panel-content">
                        <form id="da-ex-company" class="da-form" action="../../AttendenceController">
                            <div id="da-ex-val1-error-company" class="da-message error" style="display:none;"></div>
                            <div class="da-form-inline">


                                     <div class="da-form-row">
                                    <label> Employee Name </label>
                                     <div class="da-form-item small">
                                    <%= EmployeeData%>
                                     </div>
                                </div>
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
                           
                            <div class="da-button-row" align="center">
                                <input type="reset" value="Reset" class="da-button gray left" />
                                <input type="submit" name="button" value="submit" align="center" class="da-button green" />

                            </div>
                        </form>
                    </div>
                </div>
            </div>
                                     

        </div>
    </div>
                                      <%@include file="../../Footer.jsp" %>
</body>
</html>

