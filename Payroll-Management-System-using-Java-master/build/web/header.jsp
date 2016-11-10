<%-- 
    Document   : header
    Created on : Jan 16, 2007, 1:52:09 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<title>PAYROLL MANAGEMENT SYSTEM </title>
<%String path = request.getContextPath();%>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Viewport metatags -->
<meta name="HandheldFriendly" content="true" />
<meta name="MobileOptimized" content="320" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />

<!-- iOS webapp metatags -->
<meta name="apple-mobile-web-app-capable" content="yes" />
<meta name="apple-mobile-web-app-status-bar-style" content="black" />

<!-- iOS webapp icons -->
<link rel="apple-touch-icon" href="touch-icon-iphone.html" />
<link rel="apple-touch-icon" sizes="72x72" href="touch-icon-ipad.html" />
<link rel="apple-touch-icon" sizes="114x114" href="touch-icon-retina.html" />

<!-- CSS Reset -->
<link rel="stylesheet" type="text/css" href="<%=path%>/css/reset.css" media="screen" />

<!--  Fluid Grid System -->
<link rel="stylesheet" type="text/css" href="<%=path%>/css/fluid.css" media="screen" />

<!-- Login Stylesheet -->
<link rel="stylesheet" type="text/css" href="<%=path%>/css/login.css" media="screen" />

<!-- Theme Stylesheet -->
<link rel="stylesheet" type="text/css" href="<%=path%>/css/dandelion.theme.css" media="screen" />

<!--  Main Stylesheet -->
<link rel="stylesheet" type="text/css" href="<%=path%>/css/dandelion.css" media="screen" />

<!-- Demo Stylesheet -->
<link rel="stylesheet" type="text/css" href="<%=path%>/css/demo.css" media="screen" />

<!-- jQuery JavaScript File -->
<script type="text/javascript" src="<%=path%>/js/jquery-1.7.2.min.js"></script>

<!-- jQuery-UI JavaScript Files -->
<script type="text/javascript" src="<%=path%>/jui/js/jquery-ui-1.8.20.min.js"></script>
<script type="text/javascript" src="<%=path%>/jui/js/jquery.ui.timepicker.min.js"></script>
<script type="text/javascript" src="<%=path%>/jui/js/jquery.ui.touch-punch.min.js"></script>
<link rel="stylesheet" type="text/css" href="<%=path%>/jui/css/jquery.ui.all.css" media="screen" />

<!-- Plugin Files -->


<!-- FileInput Plugin -->
<script type="text/javascript" src="<%=path%>/js/jquery.fileinput.js"></script>

<!-- Placeholder Plugin -->
<script type="text/javascript" src="<%=path%>/js/jquery.placeholder.js"></script>

<!-- Mousewheel Plugin -->
<script type="text/javascript" src="<%=path%>/js/jquery.mousewheel.min.js"></script>

<!-- Scrollbar Plugin -->
<script type="text/javascript" src="<%=path%>/js/jquery.tinyscrollbar.min.js"></script>

<!-- Tooltips Plugin -->
<script type="text/javascript" src="<%=path%>/plugins/tipsy/jquery.tipsy-min.js"></script>
<link rel="stylesheet" href="<%=path%>/plugins/tipsy/tipsy.css" />

<!-- DataTables Plugin -->
<script type="text/javascript" src="<%=path%>/plugins/datatables/jquery.dataTables.min.js"></script>
<!--<script type="text/javascript" src="plugins/datatables/jquery.dataTables.min.js"></script>-->

<!--Demo JavaScript Files -->
<script type="text/javascript" src="<%=path%>/js/demo/demo.tables.js"></script>

<!-- Demo JavaScript Files -->
<script type="text/javascript" src="<%=path%>/js/demo/demo.ui.js"></script>


<!-- Spinner Plugin -->
<script type="text/javascript" src="<%=path%>/jui/js/jquery.ui.spinner.min.js"></script>

<!-- Validation Plugin -->
<script type="text/javascript" src="<%=path%>/plugins/validate/jquery.validate.js"></script>

<!-- Statistic Plugin JavaScript Files (requires metadata and excanvas for IE) -->
<script type="text/javascript" src="<%=path%>/js/jquery.metadata.js"></script>
<!--[if lt IE 9]>
<script type="text/javascript" src="js/excanvas.js"></script>
<![endif]-->
<script type="text/javascript" src="<%=path%>/js/core/plugins/dandelion.circularstat.min.js"></script>

<!-- Wizard Plugin -->
<script type="text/javascript" src="<%=path%>/js/core/plugins/dandelion.wizard.min.js"></script>

<!-- Fullcalendar Plugin -->
<script type="text/javascript" src="<%=path%>/plugins/fullcalendar/fullcalendar.min.js"></script>
<script type="text/javascript" src="<%=path%>/plugins/fullcalendar/gcal.js"></script>
<link rel="stylesheet" href="../../plugins/fullcalendar/fullcalendar.css" media="screen" />
<link rel="stylesheet" href="../../plugins/fullcalendar/fullcalendar.print.css" media="print" />

<!-- Load Google Chart Plugin -->
<script type="text/javascript" src="https://www.google.com/jsapi"></script>
<script type="text/javascript">
    // Load the Visualization API and the piechart package.
    google.load('visualization', '1.0', {'packages':['corechart']});
</script>
<!-- Debounced resize script for preventing to many window.resize events
      Recommended for Google Charts to perform optimally when resizing -->
<script type="text/javascript" src="<%=path%>/js/jquery.debouncedresize.js"></script>
<!-- Chosen Plugin -->
<script type="text/javascript" src="<%=path%>/plugins/chosen/chosen.jquery.js"></script>
<link rel="stylesheet" href="<%=path%>/plugins/chosen/chosen.css" media="screen" />

<!-- Picklist Plugin -->
<script type="text/javascript" src="<%=path%>/js/core/plugins/picklist/jquery.picklist.min.js"></script>
<link rel="stylesheet" href="<%=path%>/js/core/plugins/picklist/jquery.picklist.css" media="screen" />

<!-- Colorpicker Plugin -->
<script type="text/javascript" src="<%=path%>/plugins/colorpicker/colorpicker.js"></script>
<link rel="stylesheet" href="<%=path%>/plugins/colorpicker/colorpicker.css" media="screen" />

<!-- elRTE Plugin -->
<script type="text/javascript" src="<%=path%>/plugins/elrte/js/elrte.min.js"></script>
<link rel="stylesheet" href="<%=path%>/plugins/elrte/css/elrte.css" media="screen" />

<!-- elFinder Plugin -->
<script type="text/javascript" src="<%=path%>/plugins/elfinder/js/elfinder.min.js"></script>
<link rel="stylesheet" href="<%=path%>/plugins/elfinder/css/elfinder.css" media="screen" />

<!-- Demo JavaScript Files -->
<script type="text/javascript" src="<%=path%>/plugins/elastic/jquery.elastic.min.js"></script>
<script type="text/javascript" src="<%=path%>/js/demo/demo.form.js"></script>
<script type="text/javascript" src="<%=path%>/js/demo/demo.validation.js"></script>
<script type="text/javascript" src="<%=path%>/plugins/validate/jquery.validate.min.js"></script>

<!-- Core JavaScript Files -->
<script type="text/javascript" src="<%=path%>/js/core/dandelion.core.js"></script>

<!-- Customizer JavaScript File (remove if not needed) -->
<script type="text/javascript" src="<%=path%>/js/core/dandelion.customizer.js"></script>
<!-- Demo JavaScript Files -->
<script type="text/javascript" src="<%=path%>/js/demo/demo.dashboard.js"></script>

<!-- Core JavaScript Files -->
<script type="text/javascript" src="<%=path%>/js/core/dandelion.core.js"></script>

<!-- Customizer JavaScript File (remove if not needed) -->
<script type="text/javascript" src="<%=path%>/js/core/dandelion.customizer.js"></script>


