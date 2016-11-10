<%--
    Document   : MassPunchScheduleMaster
    Created on : Jan 22, 2007, 3:37:18 AM
    Author     : User
--%>

<%@page import="java.util.List"%>
<%@page import="java.beans.Beans"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>




<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%
          /* if (request.getParameter("redirected") == null) {
               response.sendRedirect("../../MassPunchScheduleMasterController?button=getdata");
            }

           String schedulepolicydata = (String) session.getAttribute("SchedulePolicyData");
            String DepartmentData = (String) session.getAttribute("DepartmentData");*/

            if(request.getParameter("redirected")==null)
    {
        response.sendRedirect("../../MassPunchScheduleMasterController?button=getdata");
    }
else{
 boolean up=false;
       String schedulepolicydata = (String) session.getAttribute("SchedulePolicyData");
            String DepartmentData = (String) session.getAttribute("DepartmentData");
        ArrayList data = (ArrayList) session.getAttribute("MasspunchData");
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

        <title>Mass Punch Schedule Master</title>
        <!--<script>
        var e = document.getElementById("optionid");
        var strUser = e.options[e.selectedIndex].value;
        </script>-->
    </head>


    <body>

        <!-- Main Menu File -->
        <%@include  file="../../mainmenu.jsp" %>

        <!-- Main Content Wrapper -->
        <div id="da-content-wrap" class="clearfix">

            <!-- Content Area -->
            <div id="da-content-area">


                <div class="grid_4">
                    <div class="da-panel">
                        <div class="da-panel-header"
                             <span class="da-panel-title">

                                Mass Punch Schedule Master
                            </span>

                        </div>
                        <div class="da-panel-content">
                            <form id="da-ex-reccuringscheduletemplate" class="da-form"action="../../MassPunchScheduleMasterController" >
                                <div id="da-ex-val1-error-reccuringscheduletemplate" class="da-message error" style="display:none;"></div>
                                <div class="da-form-inline">

                                    <div class="da-form-row">
                                        <label>Schedule Name</label>
                                        <div class="da-form-item small">
                                            
                                            <input type="text" name="MassPunchSchedulename" ></input>
                                        </div>
                                    </div>
                                    <div class="da-form-row">
                                        <label>Status<span class="required">*</span></label>
                                        <div class="da-form-item small">
                                            <select id="optionid" name="mass_punch_schedule_status" >

                                                <option value="working" selected="selected" >Working</option>
                                                <option value="absent" >Absent</option>

                                            </select>
                                            <label for="da-ex-val-chzn" generated="true" class="error" style="display:none;"></label>
                                        </div>
                                    </div>
                                    <div class="da-form-row">
                                        <label>In Time</label>
                                        <div class="da-form-item small">
                                           
                                            <input type="text" name="mass_punch_schedule_in_time" ></input>
                                        </div>
                                    </div>
                                    <div class="da-form-row">
                                        <label>Out Time</label>
                                        <div class="da-form-item small">
                                            
                                            <input type="text" name="mass_punch_schedule_out_time" ></input>
                                        </div>
                                    </div>
                                    <div class="da-form-row">
                                        <label>Total Time</label>
                                        <div class="da-form-item small">
                                            
                                            <input type="text" name="mass_punch_schedule_total_time" ></input>
                                        </div>
                                    </div>
                                     <div class="da-form-row">
                                                <label>Start Date<span class="required">*</span></label>
                                                <div class="da-form-item small">
                                                    <input type="date" name="mass_punch_schedule_start_date"  />
                                                </div>
                                            </div> <div class="da-form-row">
                                                <label>End Date<span class="required">*</span></label>
                                                <div class="da-form-item small">
                                                    <input type="date" name="mass_punch_schedule_end_date"  />
                                                </div>
                                            </div>

                                    <div class="da-form-row">
                                        <label>Checkbox  <span class="required">*</span></label>
                                        <div class="da-form-item large" id="vail">
                                            <ul class="da-form-list">
                                                <li><input type="checkbox" name="sun"  /> <label>Sunday</label></li>
                                                <li><input type="checkbox" name="mon" /> <label>Monday</label></li>
                                                <li><input type="checkbox" name="tue" /> <label>Tuesday</label></li>
                                                <li><input type="checkbox" name="wed"  /> <label>Wednesday</label></li>
                                                <li><input type="checkbox" name="thu" /> <label>Thursday</label></li>
                                                <li><input type="checkbox" name="fri" /> <label>Friday</label></li>
                                                <li><input type="checkbox" name="sat" /> <label>Saturday</label></li>


                                            </ul>
                                            <label for="sport" class="error" generated="true" style="display:none;"></label>
                                        </div>
                                    </div>



                                    <div class="da-form-row">
                                        <label> Schedule Policy Name </label>
                                        <div class="da-form-item small">
                                            <%= schedulepolicydata%>
                                        </div>
                                    </div>


                                    <div class="da-form-row">
                                        <label> Department Name </label>
                                        <div class="da-form-item small">
                                            <%= DepartmentData%>
                                        </div>
                                    </div>

                                </div>


                                <input type="hidden" name="hidid" ></input>
                                <div class="da-button-row" align="center">
                                    <input type="reset" value="Reset" class="da-button gray left" />
                                    <input type="submit" name="button" value="Submit" align="center" class="da-button green" />
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
                                    <th>Mass Punch Schedule Name</th>
                                    <th>Schedule Policy Name</th>
                                    <th>Department Name</th>
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

<%}%>