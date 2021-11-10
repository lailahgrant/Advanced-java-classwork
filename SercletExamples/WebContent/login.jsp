<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="index1.jsp" %>
<!DOCTYPE html><!--   include file="index.jsp" it include all the features in index.jsp file -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<!--Be sure to include popper.min.js before Bootstrap’s JavaScript-->
<script type="text/javascript" src="js/popper.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>
<hr/>
<div class="container">
<div class="row mt-5 ml-5">
<h3 class="text-dark">Login form</h3>
</div>
<table class="table table-hover">
<thead>
<tr>
<th colspan="2"><h3 class="text-dark">Enter your Login Credentials</h3></th>
</tr>
</thead>
<tbody>
<%
String profile_msg = (String)request.getAttribute("profile_msg");
if(profile_msg != null){
	out.print(profile_msg);
}
String login_msg = (String)request.getAttribute("login_msg");
if(login_msg != null){
	out.print(login_msg);
}
%>
<br/>

<form action="loginprocess.jsp" method="post">
<!-- <div  class="form-group row"> -->
<!-- <label class='col-sm-3'>Email</label> -->
<!-- <input class="form-control col-sm-4 form-control-sm " style="border:none; border-bottom:1px solid black;"> -->
<!-- </div> -->
<tr>
<td>Email</td>
<div class="form-group">
<td><input type="text" name="email" class="form-control"></td>
</div>
</tr>
<tr>
<td>Password</td>
<div class="form-group">
<td><input type="password" name="password" class="form-control"></td>
</div>
</tr>
<tr>
<div class="form-group">
<td><input type="submit" value="Submit" class="btn btn-outline-danger"></td>
<td><input type="reset" value="Reset" class="btn btn-outline-primary"></td>
</div>
</tr>

</form>

</tbody>
</table>

</div>


</body>
</html>