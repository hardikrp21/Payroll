package org.apache.jsp.View.Report;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.String;
import java.util.List;
import java.util.ArrayList;

public final class Attendence_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/View/Report/../../header.jsp");
    _jspx_dependants.add("/View/Report/../../mainmenu.jsp");
    _jspx_dependants.add("/View/Report/../../Footer.jsp");
  }

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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");

//String EmployeeData=null;

            String EmployeeData=(String)session.getAttribute("EmployeeData");

            if(request.getParameter("redirected")==null)
    {
        response.sendRedirect("../../AttendenceController?button=getdata");

         // EmployeeData=(String)session.getAttribute("EmployeeData");
    }
          
               



      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<title>PAYROLL MANAGEMENT SYSTEM </title>\n");
String path = request.getContextPath();
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("<!-- Viewport metatags -->\n");
      out.write("<meta name=\"HandheldFriendly\" content=\"true\" />\n");
      out.write("<meta name=\"MobileOptimized\" content=\"320\" />\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />\n");
      out.write("\n");
      out.write("<!-- iOS webapp metatags -->\n");
      out.write("<meta name=\"apple-mobile-web-app-capable\" content=\"yes\" />\n");
      out.write("<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\" />\n");
      out.write("\n");
      out.write("<!-- iOS webapp icons -->\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"touch-icon-iphone.html\" />\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"touch-icon-ipad.html\" />\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"touch-icon-retina.html\" />\n");
      out.write("\n");
      out.write("<!-- CSS Reset -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path);
      out.write("/css/reset.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!--  Fluid Grid System -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path);
      out.write("/css/fluid.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!-- Login Stylesheet -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path);
      out.write("/css/login.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!-- Theme Stylesheet -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path);
      out.write("/css/dandelion.theme.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!--  Main Stylesheet -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path);
      out.write("/css/dandelion.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!-- Demo Stylesheet -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path);
      out.write("/css/demo.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!-- jQuery JavaScript File -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/jquery-1.7.2.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- jQuery-UI JavaScript Files -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/jui/js/jquery-ui-1.8.20.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/jui/js/jquery.ui.timepicker.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/jui/js/jquery.ui.touch-punch.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path);
      out.write("/jui/css/jquery.ui.all.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!-- Plugin Files -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- FileInput Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/jquery.fileinput.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Placeholder Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/jquery.placeholder.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Mousewheel Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/jquery.mousewheel.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Scrollbar Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/jquery.tinyscrollbar.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Tooltips Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/plugins/tipsy/jquery.tipsy-min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/plugins/tipsy/tipsy.css\" />\n");
      out.write("\n");
      out.write("<!-- DataTables Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/plugins/datatables/jquery.dataTables.min.js\"></script>\n");
      out.write("<!--<script type=\"text/javascript\" src=\"plugins/datatables/jquery.dataTables.min.js\"></script>-->\n");
      out.write("\n");
      out.write("<!--Demo JavaScript Files -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/demo/demo.tables.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Demo JavaScript Files -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/demo/demo.ui.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Spinner Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/jui/js/jquery.ui.spinner.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Validation Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/plugins/validate/jquery.validate.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Statistic Plugin JavaScript Files (requires metadata and excanvas for IE) -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/jquery.metadata.js\"></script>\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script type=\"text/javascript\" src=\"js/excanvas.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/core/plugins/dandelion.circularstat.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Wizard Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/core/plugins/dandelion.wizard.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Fullcalendar Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/plugins/fullcalendar/fullcalendar.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/plugins/fullcalendar/gcal.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"../../plugins/fullcalendar/fullcalendar.css\" media=\"screen\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"../../plugins/fullcalendar/fullcalendar.print.css\" media=\"print\" />\n");
      out.write("\n");
      out.write("<!-- Load Google Chart Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://www.google.com/jsapi\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    // Load the Visualization API and the piechart package.\n");
      out.write("    google.load('visualization', '1.0', {'packages':['corechart']});\n");
      out.write("</script>\n");
      out.write("<!-- Debounced resize script for preventing to many window.resize events\n");
      out.write("      Recommended for Google Charts to perform optimally when resizing -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/jquery.debouncedresize.js\"></script>\n");
      out.write("<!-- Chosen Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/plugins/chosen/chosen.jquery.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/plugins/chosen/chosen.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!-- Picklist Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/core/plugins/picklist/jquery.picklist.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/js/core/plugins/picklist/jquery.picklist.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!-- Colorpicker Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/plugins/colorpicker/colorpicker.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/plugins/colorpicker/colorpicker.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!-- elRTE Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/plugins/elrte/js/elrte.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/plugins/elrte/css/elrte.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!-- elFinder Plugin -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/plugins/elfinder/js/elfinder.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/plugins/elfinder/css/elfinder.css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<!-- Demo JavaScript Files -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/plugins/elastic/jquery.elastic.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/demo/demo.form.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/demo/demo.validation.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/plugins/validate/jquery.validate.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Core JavaScript Files -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/core/dandelion.core.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Customizer JavaScript File (remove if not needed) -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/core/dandelion.customizer.js\"></script>\n");
      out.write("<!-- Demo JavaScript Files -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/demo/demo.dashboard.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Core JavaScript Files -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/core/dandelion.core.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Customizer JavaScript File (remove if not needed) -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(path);
      out.write("/js/core/dandelion.customizer.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<title>Reccuring Schedule Employees</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
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
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Main Content Wrapper -->\n");
      out.write("    <div id=\"da-content-wrap\" class=\"clearfix\">\n");
      out.write("\n");
      out.write("        <!-- Content Area -->\n");
      out.write("        <div id=\"da-content-area\">\n");
      out.write("            <div class=\"grid_4\">\n");
      out.write("                <div class=\"da-panel\">\n");
      out.write("                    <div class=\"da-panel-header\">\n");
      out.write("                        <span class=\"da-panel-title\">\n");
      out.write("\n");
      out.write("                            Mass Punch Schedule Details\n");
      out.write("                        </span>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"da-panel-content\">\n");
      out.write("                        <form id=\"da-ex-company\" class=\"da-form\" action=\"../../AttendenceController\">\n");
      out.write("                            <div id=\"da-ex-val1-error-company\" class=\"da-message error\" style=\"display:none;\"></div>\n");
      out.write("                            <div class=\"da-form-inline\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                     <div class=\"da-form-row\">\n");
      out.write("                                    <label> Employee Name </label>\n");
      out.write("                                     <div class=\"da-form-item small\">\n");
      out.write("                                    ");
      out.print( EmployeeData);
      out.write("\n");
      out.write("                                     </div>\n");
      out.write("                                </div>\n");
      out.write("                                     <div class=\"da-form-row\">\n");
      out.write("                                        <label>Start Date<span class=\"required\"></span></label>\n");
      out.write("                                        <div class=\"da-form-item small\">\n");
      out.write("                                            <input  type=\"date\" name=\"sdate\" />\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"da-form-row\">\n");
      out.write("                                        <label>End Date<span class=\"required\"></span></label>\n");
      out.write("                                        <div class=\"da-form-item small\">\n");
      out.write("                                            <input  type=\"date\" name=\"enddate\"  />\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                           \n");
      out.write("                            <div class=\"da-button-row\" align=\"center\">\n");
      out.write("                                <input type=\"reset\" value=\"Reset\" class=\"da-button gray left\" />\n");
      out.write("                                <input type=\"submit\" name=\"button\" value=\"submit\" align=\"center\" class=\"da-button green\" />\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                                     \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("                                      ");
      out.write("  <!-- Footer -->\n");
      out.write("<div id=\"da-footer\">\n");
      out.write("            <div class=\"da-container clearfix\">\n");
      out.write("                <p> All Rights Reserved.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
