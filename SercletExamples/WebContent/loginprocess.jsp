<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="education.saipali.*" %>
    <jsp:useBean id="obj" class="education.saipali.LoginBean"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>After Login</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logout</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<!--Be sure to include popper.min.js before Bootstrap’s JavaScript-->
<script type="text/javascript" src="js/popper.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>

<jsp:setProperty property="*" name="obj" />

<%

boolean status = LoginDao.validate(obj);

if(status){
	out.println("<h2 class='text-dark'>You are successfully logged in</h2>");
	session.setAttribute("email", obj.getEmail()); //set a session on email
	
	out.println("<h1 class='text-warning'>Welcome :"+session.getAttribute("email"));
	out.println("<h2 class='text-dark'><a href=logout.jsp>Logout</a></h2>");
}else{
	out.print("<h2 class='text-danger'>Sorry, email or password error</h2>");


%>

<jsp:include page="index1.jsp"></jsp:include>
<%

}

%>

</body>
</html>