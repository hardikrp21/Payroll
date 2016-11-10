<%--
    Document   : forgotyourpassword
    Created on : Jan 16, 2013, 1:17:49 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!--Header File-->
<html>
    <head>
<%@include  file="header.jsp" %>


<script>
    //var e = document.getElementById("optionid");
    //var strUser = e.options[e.selectedIndex].value;
    //function test(a) {
    //var x = a.selectedIndex;
    //alert(x);
    //}
</script>
</head>

<body>
    <!--Main Menu File-->
    <%@include file="mainmenu.jsp" %>

    <!-- Main Content Wrapper -->
    <div id="da-content-wrap" class="clearfix">

        <!-- Content Area -->
        <div id="da-content-area">

            <div class="grid_4">
                <div class="da-panel">
                    <div class="da-panel-header">
                        <span class="da-panel-title">
                            <img src="images/icons/black/16/pencil.png" alt="" />
                            USER REGISTER
                        </span>
                    </div>

                    <div class="da-panel-content">
                        <form id="da-ex-validate-register" class="da-form" action="../../forgotyourpasswordServlet" method="post">
                            <div id="da-ex-val1-error-company" class="da-message error" style="display:none;"></div>
                            <div class="da-form-inline">
                                <div class="da-form-row">
                                    <label>UserName</label>
                                    <div class="da-form-item small">
                                        <input type="text" name="username" />
                                    </div>
                                </div>

                                <div class="da-form-row">
                                    <label>Email-ID</label>
                                    <div class="da-form-item small">
                                        <input type="text" name="emailid" />
                                    </div>
                                </div>

                                <div class="da-form-row">
                                    <label>Password</label>
                                    <div class="da-form-item small">
                                        <input type="password" name="password" />
                                    </div>
                                </div>
                                 <div class="da-form-row">
                                    <label>Re-Set Password</label>
                                    <div class="da-form-item small">
                                        <input type="password" name="resetpassword" />
                                    </div>
                                </div>


                            </div>

                            <div class="da-button-row">
                                <input type="reset" value="Reset" class="da-button gray left" />
                                <input type="submit" name="insert"value="Submit" class="da-button green" />
                            </div>
                        </form>
                    </div>
                </div>
            </div>

        </div>
    </div>

</div>
 <%@include file="Footer.jsp" %>
</body>

</html>
