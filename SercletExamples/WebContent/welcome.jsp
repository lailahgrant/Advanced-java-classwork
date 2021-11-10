<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page after registration</title>
</head>
<body>

Registration is Successful

<%

	boolean isPostMethod = request.getMethod().equals("POST");
	if(isPostMethod){
		String user = request.getParameter("user");
		out.println("<h1>"+user+"</h1>");
	}

%>

Welcome <%= session.getAttribute("username") %>

<% String namez =(String)session.getAttribute("user"); %>

Please Login Here <a href='login.jsp'>Go to Login</a>

</body>
</html>