<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*, java.util.*" %>
    <%@ page isErrorPage="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator</title>
       <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
        <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
        <!--Be sure to include popper.min.js before Bootstrap’s JavaScript-->
        <script type="text/javascript" src="js/popper.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>

<form method=post action="calculater.jsp">
<div class="container">
	<div class="row mt-5">
		<h1 class="text-primary">Calculator</h1>
	</div>
	<div class="row">
		<div class="form-group">
			First Number
			<input type=text name=t1 class="form-control" required>
		</div>
		<div class="form-group">
		Second Number
	<input type=text name=t2 class="form-control" required>
		</div></div>
		<div class="row">
		<div class="form-group">
		<input type=radio name=choice value="add">Addition
		<input type=radio name=choice value="sub">Subtraction
		<input type=radio name=choice value="mul">Multiplication
		<input type=radio name=choice value="div">Division
		</div></div>
		<div class="row">
		<div class="form-group">
		<input class="btn btn-outline-danger" type=submit name=submit value=Submit>
		</div>
	</div>
</div>
</form>
</body>
</html>

<%
	float a=0,b=0,result=0;

	String operation=null;
	
	boolean lai = request.getMethod().equals("POST");
	if(lai){
		a= Float.parseFloat(request.getParameter("t1"));
		b= Float.parseFloat(request.getParameter("t2"));
		String choice = request.getParameter("choice");
		
		if(choice.equalsIgnoreCase("add")){
			result=a+b;
			operation="Addition";
		}else if(choice.equalsIgnoreCase("sub")){
			result=a-b;
			operation="Subtraction";
		}else if(choice.equalsIgnoreCase("mul")){
			result=a*b;
			operation="Multiplication";
		}else {
			result=a/b;
			operation="Division";
		}
		out.print("<h1>The "+operation+" of "+a+" and "+b+" is = "+result+"</h1>");
	}
	

%>

















