


<%String path2=request.getContextPath();
String active="";
if(request.getParameter("active")!=null)
    active=request.getParameter("active");
String isadmin=(String)session.getAttribute("isadmin");

%>
        <!-- Main Wrapper. Set this to 'fixed' for fixed layout and 'fluid' for fluid layout' -->
        <div id="da-wrapper" class="fluid">

            <!-- Header -->
            <div id="da-header">

                <div id="da-header-top">

                    <!-- Container -->
                    <div class="da-container clearfix">
s
                        <!-- Logo Container. All images put here will be vertically centere -->
                        <div id="da-logo-wrap">
                            <div id="da-logo">
                                <div id="da-logo-img">
                                    <a href="<%=path2%>/home.jsp">
                                        <img src="<%=path2%>/images/home.jpg" alt="Payroll Admin" />
                                    </a>
                                </div>
                            </div>
                        </div>

                       
                        <!-- Header Toolbar Menu -->
                        <div id="da-header-toolbar" class="clearfix">
                            <div id="da-user-profile">
                                <div id="da-user-avatar">
                                    <img src="<%=path2%>/images/Experior_logo.png" alt="" />
                                </div>
                                <div id="da-user-info">
                                    
                                 G I T S
                                    <span class="da-user-title"></span>
                                </div>
                                <ul class="da-header-dropdown">
                                    <li class="da-dropdown-caret">
                                        <span class="caret-outer"></span>
                                        <span class="caret-inner"></span>
                                    </li>
                                    <li class="da-dropdown-divider"></li>

                                    <li><a href="<%= path2%>/home.jsp">HOME</a> </li>
                                    <li class="da-dropdown-divider"></li>
<!--                                    <li><a href="#">Profile</a></li>
                                    <li><a href="#">Settings</a></li>-->
                                    <li><a href="#">Change Password</a></li>
                                </ul>
                            </div>
                            <div id="da-header-button-container">
                                <ul>

                                    <li class="da-header-button logout">
                                        <a href="<%=path2%>/View/Login/Login.jsp">Logout</a>
                                    </li>
                                </ul>
                            </div>
                        </div>

                    </div>
                </div>

                <div id="da-header-bottom">
                    <!-- Container -->
                    <div class="da-container clearfix">

<!--                        <div id="da-search">
                            <form>
                                <input type="text" placeholder="Search..." />
                            </form>
                        </div>-->

                        <!-- Breadcrumbs -->
<!--                        <div id="da-breadcrumb">
                            <ul>
                                <li><a href="dashboard.jsp"><img src="<%=path2%>/images/icons/black/16/home.png" alt="Home" />Dashboard</a></li>
                                <li><a href="#">Policy</a></li>
                                <li class="active"><span>Meal Policy</span></li>
                            </ul>
                        </div>-->

                    </div>
                </div>
            </div>

            <!-- Content -->
            <div id="da-content">

                <!-- Container -->
                <div class="da-container clearfix">

                    <!-- Sidebar -->
                   <div id="da-sidebar">
                
                    <!-- Main Navigation -->
                    <div id="da-main-nav" class="da-button-container">
                        <ul>
                            <li class="active">
                            	<a href="<%= path2%>/home.jsp">
                                	<!-- Icon Container -->
                                	<span class="da-nav-icon">
                                    	<img src="<%= path2%>images/home.png" alt="Dashboard" />
                                    </span>
                                	HOME
                                </a>
                            </li>
                            <li>
                            	<a href="#">
                                	<!-- Nav Notification -->
                                    <span class="da-nav-count"></span>
                                	<!-- Icon Container -->
                                	<span class="da-nav-icon">
                                    	<img src="<%= path2%>images/attendence.png" alt="Charts" />
                                    </span>
                                	 Attendance
                                </a>
                                <ul>
                                <!--	<li><a href="<%=path2%>/View/Login/Login.jsp">User Login</a></li>-->
                                        <li><a href="<%=path2%>/View/Timesheet/Timesheet.jsp">Timesheet</a></li>
                                </ul>
                            </li>
                             <%if(isadmin.equals("1")){%>
                            <li>
                            	<a href="<%=path2%>/View/Employee/Employee.jsp">
                                	<!-- Icon Container -->
                                	<span class="da-nav-icon">
                                    	<img src="<%= path2%>images/employee.png" alt="Calendar" />
                                    </span>
                                	Employee
                                </a>
                            </li>
                             <%}%>
                           
                            
                            <li>
                            	<a href="#">
                                	<!-- Icon Container -->
                                	<span class="da-nav-icon">
                                    	<img src="<%= path2%>images/cmp.png" alt="Form" />
                                    </span>
                                	Company
                                </a>
                                <ul>
                                	<li><a href="<%= path2%>/View/Company/CompanyMaster.jsp">Company Create</a></li>
                                        <li><a href="<%= path2%>/View/PayPeriodSchedule/PayPeriodScheduleMaster.jsp">Pay Period Schedule</a></li>
                                        <li><a href="<%= path2%>/View/Department/Department.jsp">Department</a></li>
                                </ul>
                            </li>
                              <%if(isadmin.equals("1")){%>
                            <li>
                            	<a href="Payroll.jsp">
                                	<!-- Icon Container -->
                                	<span class="da-nav-icon">
                                    	<img src="<%= path2%>images/payroll.png" alt="" />
                                    </span>
                                     Payroll
                                </a>
                            </li>
                               <%}%>
                            <li>
                            	<a href="#">
                                	<!-- Icon Container -->
                                	<span class="da-nav-icon">
                                    	<img src="<%= path2%>images/policy.png" alt="Layout and Typography" />
                                    </span>
                                    Policy
                                </a>
                                <ul>
                                	<li><a href="<%= path2%>/View/SchedulePolicyMaster/SchedulePolicyMaster.jsp">Schedule Policy</a></li>
                                        <li><a href="<%= path2%>/View/Policy/MealPolicy.jsp">Meal Policy</a></li>
                                        <li><a href="<%= path2%>/View/Policy/BreakPolicy.jsp">Break Policy</a></li>
                                        <li><a href="<%= path2%>/View/Policy/ExceptionPolicy.jsp">Exception Policy</a></li>
                                        <li><a href="<%= path2%>/View/AbsencePolicy/AbsencePolicy.jsp">Absence Policy</a></li>
                                       <!-- <li><a href="<%= path2%>/RecurringHolidayMaster.jsp">Recurring Holiday</a></li>-->
                                </ul>
                            </li>
                           
                           
                           
                        </ul>
                    </div>
                    
                </div>
