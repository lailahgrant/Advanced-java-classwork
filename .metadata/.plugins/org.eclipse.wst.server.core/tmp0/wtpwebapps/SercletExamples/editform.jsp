<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit User</title>

<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
        <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
        <!--Be sure to include popper.min.js before Bootstrap’s JavaScript-->
        <script type="text/javascript" src="js/popper.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>

</head>
<body>

<%@ page import="education.saipali.UserDao,education.saipali.User" %>

<%

String id = request.getParameter("id");
User u = UserDao.getRecordById(Integer.parseInt(id));

%>

<div class="container">
<div class="row mt-5">
<h1 class="text-dark">Edit Form</h1>
</div>

<div class="row">
<form method="post" action="edituser.jsp">

<input type="hidden" name="id" value="<%= u.getId() %>">

<table class="table table-hover">
<tr><td>Name</td><td><div class="form-group"><input class="form-control" type="text" name="name" value="<%= u.getName()%>"></div></td></tr>
<tr><td>Password</td><td><div class="form-group"><input type="password" name="password" value="<%= u.getPassword()%>"></div></td></tr>
<tr><td>Email</td><td><div class="form-group"><input type="email" name="email" value="<%= u.getEmail()%>"></div></td></tr>
<tr><td>Sex</td><td><div class="form-group"><input type="radio" name="sex" value="M">Male<input type="radio" name="sex" value="F">Female</div></td></tr>
<tr><td>Country</td><td><select class="form-control" name="country" style="width:155px;">
<option>India</option>
<option>Pakistan</option>
<option>Afghanistan</option>
<option>Uganda</option>
<option>Kenya</option>
<option>Japan</option>
<option>Other</option>
</select></td></tr>
<tr>
<div class="form-group">
<td colspan="2"><input type="submit" class="btn btn-outline-primary" value="Edit User"></td>
</div>
</tr>
</table>
</form>
</div>
</div>

</body>
</html>