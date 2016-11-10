package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
String path2=request.getContextPath();
String active="";
if(request.getParameter("active")!=null)
    active=request.getParameter("active");
String isadmin=(String)session.getAttribute("isadmin");


      out.write("\n");
      out.write("        <!-- Main Wrapper. Set this to 'fixed' for fixed layout and 'fluid' for fluid layout' -->\n");
      out.write("        <div id=\"da-wrapper\" class=\"fluid\">\n");
      out.write("\n");
      out.write("            <!-- Header -->\n");
      out.write("            <div id=\"da-header\">\n");
      out.write("\n");
      out.write("                <div id=\"da-header-top\">\n");
      out.write("\n");
      out.write("                    <!-- Container -->\n");
      out.write("                    <div class=\"da-container clearfix\">\n");
      out.write("s\n");
      out.write("                        <!-- Logo Container. All images put here will be vertically centere -->\n");
      out.write("                        <div id=\"da-logo-wrap\">\n");
      out.write("                            <div id=\"da-logo\">\n");
      out.write("                                <div id=\"da-logo-img\">\n");
      out.write("                                    <a href=\"");
      out.print(path2);
      out.write("/home.jsp\">\n");
      out.write("                                        <img src=\"");
      out.print(path2);
      out.write("/images/home.jpg\" alt=\"Payroll Admin\" />\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                       \n");
      out.write("                        <!-- Header Toolbar Menu -->\n");
      out.write("                        <div id=\"da-header-toolbar\" class=\"clearfix\">\n");
      out.write("                            <div id=\"da-user-profile\">\n");
      out.write("                                <div id=\"da-user-avatar\">\n");
      out.write("                                    <img src=\"");
      out.print(path2);
      out.write("/images/Experior_logo.png\" alt=\"\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div id=\"da-user-info\">\n");
      out.write("                                    \n");
      out.write("                                 G I T S\n");
      out.write("                                    <span class=\"da-user-title\"></span>\n");
      out.write("                                </div>\n");
      out.write("                                <ul class=\"da-header-dropdown\">\n");
      out.write("                                    <li class=\"da-dropdown-caret\">\n");
      out.write("                                        <span class=\"caret-outer\"></span>\n");
      out.write("                                        <span class=\"caret-inner\"></span>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"da-dropdown-divider\"></li>\n");
      out.write("\n");
      out.write("                                    <li><a href=\"");
      out.print( path2);
      out.write("/home.jsp\">HOME</a> </li>\n");
      out.write("                                    <li class=\"da-dropdown-divider\"></li>\n");
      out.write("<!--                                    <li><a href=\"#\">Profile</a></li>\n");
      out.write("                                    <li><a href=\"#\">Settings</a></li>-->\n");
      out.write("                                    <li><a href=\"#\">Change Password</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"da-header-button-container\">\n");
      out.write("                                <ul>\n");
      out.write("\n");
      out.write("                                    <li class=\"da-header-button logout\">\n");
      out.write("                                        <a href=\"");
      out.print(path2);
      out.write("/View/Login/Login.jsp\">Logout</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"da-header-bottom\">\n");
      out.write("                    <!-- Container -->\n");
      out.write("                    <div class=\"da-container clearfix\">\n");
      out.write("\n");
      out.write("<!--                        <div id=\"da-search\">\n");
      out.write("                            <form>\n");
      out.write("                                <input type=\"text\" placeholder=\"Search...\" />\n");
      out.write("                            </form>\n");
      out.write("                        </div>-->\n");
      out.write("\n");
      out.write("                        <!-- Breadcrumbs -->\n");
      out.write("<!--                        <div id=\"da-breadcrumb\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"dashboard.jsp\"><img src=\"");
      out.print(path2);
      out.write("/images/icons/black/16/home.png\" alt=\"Home\" />Dashboard</a></li>\n");
      out.write("                                <li><a href=\"#\">Policy</a></li>\n");
      out.write("                                <li class=\"active\"><span>Meal Policy</span></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>-->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Content -->\n");
      out.write("            <div id=\"da-content\">\n");
      out.write("\n");
      out.write("                <!-- Container -->\n");
      out.write("                <div class=\"da-container clearfix\">\n");
      out.write("\n");
      out.write("                    <!-- Sidebar -->\n");
      out.write("                   <div id=\"da-sidebar\">\n");
      out.write("                \n");
      out.write("                    <!-- Main Navigation -->\n");
      out.write("                    <div id=\"da-main-nav\" class=\"da-button-container\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"active\">\n");
      out.write("                            \t<a href=\"");
      out.print( path2);
      out.write("/home.jsp\">\n");
      out.write("                                \t<!-- Icon Container -->\n");
      out.write("                                \t<span class=\"da-nav-icon\">\n");
      out.write("                                    \t<img src=\"");
      out.print( path2);
      out.write("images/home.png\" alt=\"Dashboard\" />\n");
      out.write("                                    </span>\n");
      out.write("                                \tHOME\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                            \t<a href=\"#\">\n");
      out.write("                                \t<!-- Nav Notification -->\n");
      out.write("                                    <span class=\"da-nav-count\"></span>\n");
      out.write("                                \t<!-- Icon Container -->\n");
      out.write("                                \t<span class=\"da-nav-icon\">\n");
      out.write("                                    \t<img src=\"");
      out.print( path2);
      out.write("images/attendence.png\" alt=\"Charts\" />\n");
      out.write("                                    </span>\n");
      out.write("                                \t Attendance\n");
      out.write("                                </a>\n");
      out.write("                                <ul>\n");
      out.write("                                <!--\t<li><a href=\"");
      out.print(path2);
      out.write("/View/Login/Login.jsp\">User Login</a></li>-->\n");
      out.write("                                        <li><a href=\"");
      out.print(path2);
      out.write("/View/Timesheet/Timesheet.jsp\">Timesheet</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                             ");
if(isadmin.equals("1")){
      out.write("\n");
      out.write("                            <li>\n");
      out.write("                            \t<a href=\"");
      out.print(path2);
      out.write("/View/Employee/Employee.jsp\">\n");
      out.write("                                \t<!-- Icon Container -->\n");
      out.write("                                \t<span class=\"da-nav-icon\">\n");
      out.write("                                    \t<img src=\"");
      out.print( path2);
      out.write("images/employee.png\" alt=\"Calendar\" />\n");
      out.write("                                    </span>\n");
      out.write("                                \tEmployee\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                             ");
}
      out.write("\n");
      out.write("                           \n");
      out.write("                            \n");
      out.write("                            <li>\n");
      out.write("                            \t<a href=\"#\">\n");
      out.write("                                \t<!-- Icon Container -->\n");
      out.write("                                \t<span class=\"da-nav-icon\">\n");
      out.write("                                    \t<img src=\"");
      out.print( path2);
      out.write("images/cmp.png\" alt=\"Form\" />\n");
      out.write("                                    </span>\n");
      out.write("                                \tCompany\n");
      out.write("                                </a>\n");
      out.write("                                <ul>\n");
      out.write("                                \t<li><a href=\"");
      out.print( path2);
      out.write("/View/Company/CompanyMaster.jsp\">Company Create</a></li>\n");
      out.write("                                        <li><a href=\"");
      out.print( path2);
      out.write("/View/PayPeriodSchedule/PayPeriodScheduleMaster.jsp\">Pay Period Schedule</a></li>\n");
      out.write("                                        <li><a href=\"");
      out.print( path2);
      out.write("/View/Department/Department.jsp\">Department</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                              ");
if(isadmin.equals("1")){
      out.write("\n");
      out.write("                            <li>\n");
      out.write("                            \t<a href=\"Payroll.jsp\">\n");
      out.write("                                \t<!-- Icon Container -->\n");
      out.write("                                \t<span class=\"da-nav-icon\">\n");
      out.write("                                    \t<img src=\"");
      out.print( path2);
      out.write("images/payroll.png\" alt=\"\" />\n");
      out.write("                                    </span>\n");
      out.write("                                     Payroll\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                               ");
}
      out.write("\n");
      out.write("                            <li>\n");
      out.write("                            \t<a href=\"#\">\n");
      out.write("                                \t<!-- Icon Container -->\n");
      out.write("                                \t<span class=\"da-nav-icon\">\n");
      out.write("                                    \t<img src=\"");
      out.print( path2);
      out.write("images/policy.png\" alt=\"Layout and Typography\" />\n");
      out.write("                                    </span>\n");
      out.write("                                    Policy\n");
      out.write("                                </a>\n");
      out.write("                                <ul>\n");
      out.write("                                \t<li><a href=\"");
      out.print( path2);
      out.write("/View/SchedulePolicyMaster/SchedulePolicyMaster.jsp\">Schedule Policy</a></li>\n");
      out.write("                                        <li><a href=\"");
      out.print( path2);
      out.write("/View/Policy/MealPolicy.jsp\">Meal Policy</a></li>\n");
      out.write("                                        <li><a href=\"");
      out.print( path2);
      out.write("/View/Policy/BreakPolicy.jsp\">Break Policy</a></li>\n");
      out.write("                                        <li><a href=\"");
      out.print( path2);
      out.write("/View/Policy/ExceptionPolicy.jsp\">Exception Policy</a></li>\n");
      out.write("                                        <li><a href=\"");
      out.print( path2);
      out.write("/View/AbsencePolicy/AbsencePolicy.jsp\">Absence Policy</a></li>\n");
      out.write("                                       <!-- <li><a href=\"");
      out.print( path2);
      out.write("/RecurringHolidayMaster.jsp\">Recurring Holiday</a></li>-->\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
