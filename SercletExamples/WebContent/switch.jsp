<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.* , java.util.*" %>
    <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator using Switch</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
        <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
        <!--Be sure to include popper.min.js before Bootstrap’s JavaScript-->
        <script type="text/javascript" src="js/popper.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>

	<form method=post action="switch.jsp">
		<div class="container">
			<div class="row mt-5">
			<h3 class="text-warning">Calculator</h3>
			</div>
			<div  class="row">
			<div class="form-group">
			First number <input type=text name=a class="form-control" placeholder="enter a number">
			</div>
			<div class="form-group">
			Second number<input type=text name=b class="form-control" placeholder="enter a number">
			</div>
			</div>
			<div class="form-group row">
			<input type="radio" name="go" value="1">Addition
			<input type="radio" name="go" value="2">Subtraction
			<input type="radio" name="go" value="3">Multiplication
			<input type="radio" name="go" value="4">Division
			</div>
			<div class="form-group">
			<input type=submit value="Add" name=submit>
			</div>
		</div>
	</form>

</body>
</html>



<%

	float x=0,y=0,z=0;
	boolean lai = request.getMethod().equals("POST");
	if(lai){
		int go = Integer.parseInt(request.getParameter("go"));
		x=Integer.parseInt(request.getParameter("a"));
		y=Integer.parseInt(request.getParameter("b"));
		switch(go){
		case 1:
			z=x+y;
			break;
			
		case 2:
			z=x-y;
			break;
			
		case 3:
			z=x*y;
			break;
			
		case 4:
			z=x/y;
			break;
		}
		
			out.print("The operation of "+x+" and "+y+" is = "+z);
	}
%>



















