<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View users</title>

<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
        <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
        <!--Be sure to include popper.min.js before Bootstrap’s JavaScript-->
        <script type="text/javascript" src="js/popper.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>

</head>
<body>

<%@ page import="education.saipali.UserDao,education.saipali.User,java.util.*" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- taglib enables us create our own jsp tags -->

<h1>User List</h1>

<%

List<User> list = UserDao.getAllRecords();
request.setAttribute("list", list);

%>

<table class="table table-hover">
<tr><th scope="col">Id</th><th scope="col">Name</th><th scope="col">Password</th><th scope="col">Email</th><th scope="col">Sex</th>
<th scope="col">Country</th><th scope="col">Edit</th><th scope="col">Delete</th></tr>

<c:forEach items = "${list}" var="u">

<tr>
<td>${u.getId()}</td>
<td>${u.getName()}</td>
<td>${u.getPassword()}</td>
<td>${u.getEmail()}</td>
<td>${u.getSex()}</td>
<td>${u.getCountry()}</td>
<td><a class="btn btn-outline-primary" href="editform.jsp?id=${u.getId() }"><span class=""></span>Edit</a></td>
<td><a class="btn btn-outline-danger" href="deleteuser.jsp?id=${u.getId()}"><span class=""></span>Delete</a></td>
</tr>

</c:forEach>

</table>

<br/>

<a class="btn btn-outline-primary" href="adduserform.jsp">Add New User</a>


</body>
</html>