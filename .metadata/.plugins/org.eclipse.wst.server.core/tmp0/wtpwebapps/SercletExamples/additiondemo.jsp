<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Addition having both client and server program in one file</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
        <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
        <!--Be sure to include popper.min.js before Bootstrap’s JavaScript-->
        <script type="text/javascript" src="js/popper.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>
<form action="additiondemo.jsp" method=post>
	<input type=number name=n1>
	<input type=number name=n2>
	<input type="submit" name=submit value=Addition> 
</form>
</body>
</html>

<%!
	int num1,num2,sum;
%>

<%
	boolean lailah = request.getMethod().equals("POST");
	if(lailah){
		num1 = Integer.parseInt(request.getParameter("n1"));
		num2 = Integer.parseInt(request.getParameter("n2"));
		sum=num1+num2;
		out.print("The addition of "+num1+" and "+num2+" is = "+sum);
	}
	
%>