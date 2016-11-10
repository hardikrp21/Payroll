
<%--
    Document   : index
    Created on : Jan 16, 2013, 12:48:46 PM
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <%@include file="../../header.jsp" %>

        <title> Home </title>

    </head>

    <body>

        <%//@include file="../../mainmenu.jsp" %>
        <%@include file="../../mainmenu.jsp" %>

        <!-- Main Content Wrapper -->
        <div id="da-content-wrap" class="clearfix">

            <!-- Content Area -->
            <div id="da-content-area">
                <div class="grid_3">
                    <ul class="da-circular-stat-wrap">
                                <li class="da-circular-stat {fillColor: '#a6d037', value: 55, maxValue: 98, label: 'paid'}"></li>
                                <li class="da-circular-stat {fillColor: '#ea799b', percent: true, value: 200, maxValue: 241, label: 'work process'}"></li>
                                <li class="da-circular-stat {fillColor: '#fab241', value: 124, maxValue: 523, label: 'Employee'}"></li>
                                <li class="da-circular-stat {fillColor: '#61a5e4', percent: true, value: 42, maxValue: 100, label: 'revanue of currentv project'}"></li>
                            </ul>
                    <div class="da-panel-widget">
                        <h1>Estimated Revenue</h1>
                        <div id="da-ex-gchart-line" style="height:225px;"></div>
                    </div>
                </div>

                <div class="grid_1">
                    <div class="da-panel-widget">
                        <h1>Department</h1>
                        <ul class="da-summary-stat">
                            <li>
                                <a href="#">
                                    <span class="da-summary-icon" style="background-color:white;">
                                        <img src="images/techsupport.jpg" alt="" />
                                    </span>
                                    <span class="da-summary-text">
                                        <span class="value up"></span></br></br>
                                        <span class="label">Technical</span>
                                    </span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="da-summary-icon" style="background-color:white;">
                                        <img src="images/testing.jpg" alt="" />
                                    </span>
                                    <span class="da-summary-text">
                                        <span class="value"></span></br></br>
                                        <span class="label">Testing</span>
                                    </span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="da-summary-icon" style="background-color:white;">
                                        <img src="images/marketing.png" alt="" />
                                    </span>
                                    <span class="da-summary-text">
                                        <span class="value up"></span></br></br>
                                        <span class="label">Marketing</span>
                                    </span>
                                </a>
                            </li>
                           <li>
                                <a href="#">
                                    <span class="da-summary-icon" style="background-color:white;">
                                        <img src="images/develop.jpg" alt="" />
                                    </span>
                                    <span class="da-summary-text">
                                        <span class="value down"></span></br></br>
                                        <span class="label">Development</span>
                                    </span>
                                </a>
                            </li>
                           <!-- <li>
                                <a href="#">
                                    <span class="da-summary-icon" style="background-color:#61a5e4;">
                                        <img src="images/icons/white/32/shopping_basket_2.png" alt="" />
                                    </span>
                                    <span class="da-summary-text">
                                        <span class="value">42</span>
                                        <span class="label">Shops Visited</span>
                                    </span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="da-summary-icon" style="background-color:#656565;">
                                        <img src="images/icons/white/32/users_2.png" alt="" />
                                    </span>
                                    <span class="da-summary-text">
                                        <span class="value">266</span>
                                        <span class="label">Customers Satisfied</span>
                                    </span>
                                </a>
                            </li>-->
                        </ul>
                    </div>
                </div>

               

                

                
            </div>

        </div>

    </div>



    <%@include file="Footer.jsp" %>
       

        </div>

    </body>

</html>
