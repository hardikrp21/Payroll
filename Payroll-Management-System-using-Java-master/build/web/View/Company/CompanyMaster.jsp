<%--
    Document   : index
    Created on : Jan 16, 2013, 12:48:46 PM
    Author     : User
--%>
<%@page import="java.beans.Beans"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>




<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%
if(request.getParameter("redirected")==null)
    {
        response.sendRedirect("../../CompanyMasterServlet?button=getdata");
    }
else{
 boolean up=false;
        ArrayList data = (ArrayList) session.getAttribute("companydata");
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
<!--<script>
    function load1()
    {
       // alert("insert");
         //$.jGrowl("Hello world!");
         $.jGrowl("Hello World!",{
            position:"bottom-right"
        });
        
    }

</script>-->
        <title>Company Form</title>
<!--<script>
var e = document.getElementById("optionid");
var strUser = e.options[e.selectedIndex].value;
</script>-->
    </head>

    
<body onload="load1()">

        <!-- Main Menu File -->
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
                                          
                                            Company Form
                                        </span>

                                    </div>
                                    <div class="da-panel-content">
                                        <form id="da-ex-company" class="da-form" action="../../CompanyMasterServlet?button=getdata">
                                            <div id="da-ex-val1-error-company" class="da-message error" style="display:none;"></div>
                                            <div class="da-form-inline">
                                            <div class="da-form-row">
                                                <label>Company Full Name</label>
                                                <div class="da-form-item small">
                                                    <input type="text" name="cfullname" size="10" value="<% if(up) out.print(d1.get(1)); else out.print("");%>" />
                                                </div>
                                            </div>

                                            <div class="da-form-row">
                                                <label>Company Short Name</label>
                                                <div class="da-form-item small ">
                                                    <input type="text" name="cshortname" value="<% if(up) out.print(d1.get(2)); else out.print("");%>"/>
                                                </div>
                                            </div>

                                            <div class="da-form-row">
                                                <label>Address</label>
                                                <div class="da-form-item small">
                                                    <input type="text" name=caddress" value="<% if(up) out.print(d1.get(3)); else out.print("");%>"/>
                                                </div>
                                            </div>

                                            <div class="da-form-row">
                                                <label>Company City <span class="required">*</span></label>
                                                <div class="da-form-item small">
                                                    <select id="optionid" name="ccity" value="<% if(up) out.print(d1.get(4)); else out.print("");%>">
                                                     
                                                        <option value="1" selected="selected">Ahmedabad</option>
                                                        <option value="2" selected="selected">Surat</option>
                                                        <option value="3" selected="selected">Rajkot</option>
                                                    </select>
                                                    <label for="da-ex-val-chzn" generated="true" class="error" style="display:none;"></label>
                                                </div>
                                            </div>

                                            <div class="da-form-row">
                                                <label>Company State<span class="required">*</span></label>
                                                <div class="da-form-item small">
                                                    <select id="optionid" name="cstate" value="<% if(up) out.print(d1.get(5)); else out.print("");%>">
                                                     
                                                        <option value="1" selected="selected">Gujarat</option>
                                                        <option value="2" selected="selected">Maharastra</option>
                                                        <option value="3" selected="selected">Panjab</option>
                                                    </select>
                                                    <label for="da-ex-val-chzn" generated="true" class="error" style="display:none;"></label>
                                                </div>
                                            </div>

                                            <div class="da-form-row">
                                                <label>Company Country <span class="required">*</span></label>
                                                <div class="da-form-item small">
                                                    <select id="optionid" name="ccountry" value="<% if(up) out.print(d1.get(6)); else out.print("");%>" >
                                                   
                                                        <option value="1" selected="selected">India</option>
                                                        <option value="2" selected="selected">London</option>
                                                        <option value="3" selected="selected">Usa</option>
                                                    </select>
                                                    <label for="da-ex-val-chzn" generated="true" class="error" style="display:none;"></label>
                                                </div>
                                            </div>


                                            <div class="da-form-row">
                                                <label>Company ZipCode</label>
                                                <div class="da-form-item small">
                                                    <input type="text" name="czipcode" value="<% if(up) out.print(d1.get(7)); else out.print("");%>"/>
                                                </div>
                                            </div>

                                            <div class="da-form-row">
                                                <label>Company PhoneNo</label>
                                                <div class="da-form-item small">
                                                    <input type="text" name="cphoneno" value="<% if(up) out.print(d1.get(8)); else out.print("");%>"/>
                                                </div>
                                            </div>

                                            <div class="da-form-row">
                                                <label>Company FaxNo</label>
                                                <div class="da-form-item small">
                                                    <input type="text" name="cfaxno" value="<% if(up) out.print(d1.get(9)); else out.print("");%>"/>
                                                </div>
                                            </div>
                                            </div>
                                            <input type="hidden" name="hid_id" value="<%=d1.get(0)%>"></input>
                                            

                                            <div class="da-button-row" align="center">
                                                <input type="reset" value="Reset" class="da-button gray left" />
                                                <input type="submit"  name="button" value="<%= button %>" onclick="load();" align="center" class="da-button green" />
                                               
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
                                           Companyu Table
                                        </span>



                                        <span class="da-panel-toggler"></span></div>
                                    <div class="da-panel-content">
                                        <table class="da-table">
                                            <thead>
                                                <tr>

                                                    <th>Company Full Name</th>
                                                    <th>Company Short Name</th>
                                                    <th>Company City</th>
                                                    <th>Company State</th>
                                                    <th>Company Country</th>

                                                    <th>Action</th>


                                                </tr>
                                            </thead>

                                            <tbody>


                                                <%

                                                        System.out.println("data::"+data);

                                                            for (int i = 0; i < data.size(); i++) {
                                                                out.println("<tr>");
                                                                ArrayList temp = (ArrayList) data.get(i);
                                                              //  for (int j = 1; j < temp.size(); j++) {

                                                                    out.println("<td>" + temp.get(1) + "</td>");
                                                                    out.println("<td>" + temp.get(2) + "</td>");
                                                                    out.println("<td>" + temp.get(4) + "</td>");
                                                                    out.println("<td>" + temp.get(5) + "</td>");
                                                                    out.println("<td>" + temp.get(6) + "</td>");
                                                                //}


                                                                out.println("<td><a href='../../CompanyMasterServlet?id=" + temp.get(0) + "&button=update_data'><img src=../../images/icons/color/pencil.png /></a>");
                                                                out.println("<a href='../../CompanyMasterServlet?id=" + temp.get(0) + "&button=delete_data'><img src=../../images/icons/color/cross.png /></a>");
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