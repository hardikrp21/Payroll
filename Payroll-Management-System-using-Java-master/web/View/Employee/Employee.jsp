<%-- 
    Document   : Employee
    Created on : Jan 28, 2013, 9:07:32 PM
    Author     : VIRAL
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
if(request.getParameter("redirected")==null)
    {
        response.sendRedirect("../../EmployeeMasterServlet?button=getdata");
    }
else{
 boolean up=false;
        ArrayList data = (ArrayList) session.getAttribute("employeedata");
        String schedulepolicydata = (String) session.getAttribute("SchedulePolicyData");
        String PayperiodScheduledata=(String)session.getAttribute("PayPeriodScheduleData");

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
                                        <form id="da-ex-validate-employee" class="da-form" action="../../EmployeeMasterServlet?button=getdata">
                                            <div id="da-ex-val1-error-emp" class="da-message error" style="display:none;"></div>
                                            <div class="da-form-inline">
                                            <div class="da-form-row">
                                                <label>First Name<span class="required">*</span></label>
                                                <div class="da-form-item small">
                                                    <input type="text" name="efirstname" value="<% if(up) out.print(d1.get(1)); else out.print("");%>" />
                                                </div>
                                            </div>
                                            <div class="da-form-row">
                                                <label>Middle Name<span class="required">*</span></label>
                                                <div class="da-form-item small">
                                                    <input type="text" name="emiddlename" value="<% if(up) out.print(d1.get(2)); else out.print("");%>"/>
                                                </div>
                                            </div>
                                            <div class="da-form-row">
                                                <label> Last Name<span class="required">*</span></label>
                                                <div class="da-form-item small">
                                                    <input type="text" name="elastname" value="<% if(up) out.print(d1.get(3)); else out.print("");%>"/>
                                                </div>
                                            </div>
                                            <div class="da-form-row">
                                                <label>Sex<span class="required">*</span></label>
                                                  <div class="da-form-item large">
                                                	<ul class="da-form-list">
                                                    	<li><input type="radio" name="esex" /> <label>Male</label></li>
                                                                <li><input type="radio" name="esex" /> <label>Female</label></li>
                                                    </ul>
                                                      
                                                    <label for="gender" class="error" generated="false" style=""></label>
                                                </div>
                                               
                                            </div>
                                            <div class="da-form-row">
                                                <label>Address<span class="required">*</span></label>
                                                <div class="da-form-item small">
                                                   
                                                    <input type="text"  name="eaddress" value="<% if(up) out.print(d1.get(5)); else out.print("");%>"></input>
                                                </div>
                                            </div>
                                            <div class="da-form-row">
                                                <label> City <span class="required">*</span></label>
                                                <div class="da-form-item small">
                                                    <select id="optionid" name="ecity" value="<% if(up) out.print(d1.get(6)); else out.print("");%>">
                                                      
                                                        <option value="1">Ahmedabad</option>
                                                        <option value="2" >Surat</option>
                                                        <option value="3" >Rajkot</option>
                                                    </select>
                                                    <label for="da-ex-val-chzn" generated="true" class="error" style="display:none;"></label>
                                                </div>
                                            </div>
                                            <div class="da-form-row">
                                                <label>State<span class="required">*</span></label>
                                                <div class="da-form-item small">
                                                    <select id="optionid" name="estate" value="<% if(up) out.print(d1.get(7)); else out.print("");%>">
                                                     
                                                        
                                                        <option value="1" >Gujarat</option>
                                                        <option value="2" >Maharastra</option>
                                                        <option value="3" >Panjab</option>
                                                    </select>
                                                    <label for="da-ex-val-chzn" generated="true" class="error" style="display:none;"></label>
                                                </div>
                                            </div>
                                            <div class="da-form-row">
                                                <label>Country<span class="required">*</span></label>
                                                <div class="da-form-item small">
                                                    <select  name="ecountry" value="<% if(up) out.print(d1.get(8)); else out.print("");%>">
                                                      
                                                        <option value="1" >India</option>
                                                        <option value="2" >London</option>
                                                        <option value="3" >Usa</option>
                                                    </select>
                                                    <label for="da-ex-val-chzn" generated="true" class="error" style="display:none;"></label>
                                                </div>
                                            </div>
                                            <div class="da-form-row">
                                                <label>Zip Code<span class="required">*</span></label>
                                                <div class="da-form-item small">
                                                    <input type="text" name="ezipcode" value="<% if(up) out.print(d1.get(9)); else out.print("");%>"/>
                                                </div>
                                            </div>
                                            <div class="da-form-row">
                                                <label>Work phone<span class="required">*</span></label>
                                                <div class="da-form-item small">
                                                    <input type="text" name="eworkphone" value="<% if(up) out.print(d1.get(10)); else out.print("");%>"/>
                                                </div>
                                            </div>
                                            <div class="da-form-row">
                                                <label>Home Phone<span class="required">*</span></label>
                                                <div class="da-form-item small">
                                                    <input type="text" name="ehomephone" value="<% if(up) out.print(d1.get(11)); else out.print("");%>"/>
                                                </div>
                                            </div>
                                            <div class="da-form-row">
                                                <label>Mobile Phone<span class="required">*</span></label>
                                                <div class="da-form-item small">
                                                    <input type="text" name="emobilephone" value="<% if(up) out.print(d1.get(12)); else out.print("");%>"/>
                                                </div>
                                            </div>
                                            <div class="da-form-row">
                                                <label>Fax No<span class="required">*</span></label>
                                                <div class="da-form-item small">
                                                    <input type="text" name="efaxno" value="<% if(up) out.print(d1.get(13)); else out.print("");%>"/>
                                                </div>
                                            </div>
                                            <div class="da-form-row">
                                                <label>Email Id<span class="required">*</span></label>
                                                <div class="da-form-item small">
                                                    <input type="text" name="eemailid" value="<% if(up) out.print(d1.get(14)); else out.print("");%>"/>
                                                </div>
                                            </div>
                                            <div class="da-form-row">
                                                <label>Birth Date<span class="required">*</span></label>
                                                <div class="da-form-item small">
                                                    <input id="da-ex-datepicker" type="text" name="ebirthdate"  value="<% if(up) out.print(d1.get(15)); else out.print("");%>"/>
                                                </div>
                                            </div>

                                                     <div class="da-form-row">
                                        <label> Schedule Policy Name </label>
                                        <div class="da-form-item small">
                                            <%= schedulepolicydata%>
                                        </div>
                                    </div>
                                         <div class="da-form-row">
                                    <label> Pay Period Schedule Name </label>
                                     <div class="da-form-item small">
                                    <%= PayperiodScheduledata%>
                                     </div>
                                </div>

                                        
                                            </div>

                                                  <input type="hidden" name="hid_id" value="<%=d1.get(0)%>"></input>
                                            <div class="da-button-row">

                                                <input type="reset" value="Reset" class="da-button gray left" />
                                                <input type="submit" name="button"value="<%= button %>" class="da-button green" />
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

                                                    <th> First Name</th>
                                                    <th>Middle Name</th>
                                                    <th>Last Name</th>

                                                    <th> City</th>
                                                    <th> State</th>
                                                    <th> Country</th>
                                                    <th>Mobile no</th>
                                                    <th>Email ID</th>
                                                    <th>Action</th>

                                                </tr>
                                            </thead>

                                            <tbody>


                                                <%

                                                            for (int i = 0; i < data.size(); i++) {
                                                                out.println("<tr>");
                                                                ArrayList temp = (ArrayList) data.get(i);
                                                                //for (int j = 1; j < temp.size(); j++) {
                                                                out.println("<td>" + temp.get(1) + "</td>");
                                                                out.println("<td>" + temp.get(2) + "</td>");
                                                                out.println("<td>" + temp.get(3) + "</td>");
                                                                out.println("<td>" + temp.get(6) + "</td>");
                                                                out.println("<td>" + temp.get(7) + "</td>");
                                                                out.println("<td>" + temp.get(8) + "</td>");
                                                                out.println("<td>" + temp.get(11) + "</td>");
                                                                out.println("<td>" + temp.get(13) + "</td>");

                                                                // }


                                                                out.println("<td><a href='../../EmployeeMasterServlet?id=" + temp.get(0) + "&button=update_data'><img src=../../images/icons/color/pencil.png /></a>");
                                                                out.println("<a href='../../EmployeeMasterServlet?id=" + temp.get(0) + "&button=delete_data'><img src=../../images/icons/color/cross.png /></a>");
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