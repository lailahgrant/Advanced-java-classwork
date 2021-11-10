<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="education.saipali.UserDao" %>
    <jsp:useBean id="u" class="education.saipali.User"></jsp:useBean>
    <jsp:setProperty property="*" name="u"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit user</title>

<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
        <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
        <!--Be sure to include popper.min.js before Bootstrap’s JavaScript-->
        <script type="text/javascript" src="js/popper.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>

</head>
<body>

<%

int i = UserDao.update(u);
response.sendRedirect("viewusers.jsp");

%>

</body>
</html>