<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Checkbox example</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
        <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
        <!--Be sure to include popper.min.js before Bootstrap’s JavaScript-->
        <script type="text/javascript" src="js/popper.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>
<h1 class="text-primary">Select a LAnguage</h1>
<form action="checkbox1.jsp">
<div class="container">
<div class="form-group">
<input type="checkbox" name="id" value="Java">Java<br>
	<input type="checkbox" name="id" value=".NET">.NET<br>
	<input type="checkbox" name="id" value="PHP">PHP<br>
	<input type="checkbox" name="id" value="C/C++">C/C++<br>
	<input type="checkbox" name="id" value="PERL">PERL<br>
	<input type="submit" value="Submit">
</div></div>
</form>

<%
	String select[] = request.getParameterValues("id");
	if(select != null && select.length != 0){
		out.println("You have selected : ");
		for(int i=0; i<select.length; i++){
			out.println(select[i]);
		}
	}
%>








</body>
</html>