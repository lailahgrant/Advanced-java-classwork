<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<!-- import="java.util.*" for date function  -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<!--Be sure to include popper.min.js before Bootstrap’s JavaScript-->
<script type="text/javascript" src="js/popper.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>
	<form method="post" action="registration.jsp">
		<div class="container">
			<div class="row mt-5">
				<h3 class="text-primary">Registration Form</h3>
			</div>
			<div class="col-lg-8">
				<div class="row">
					<table	class="table table-hover">
						<thead>
							<tr>
								<th colspan="2"><h3 class="text-dark">Enter	Information Here</h3></th>
							</tr>
						</thead>
						<tbody>
						<tr>
								<td>First name</td>
								<div class="form-group">
								<td><input type="text" name="fname" class="form-control"></td>
								</div>
							</tr>
							
							<tr>
							<td>Last name</td>
							<div class="form-group">
							<td><input type="text" name="lname" class="form-control"></td>
							</div>
							</tr>
							
							<tr>
								<td>Email</td>
								<div class="form-group">
								<td><input type="email" name="email" class="form-control"></td>
								</div>
							</tr>
							
							<tr>
								<td>Mobile</td>
								<div class="form-group">
								<td><input type="text" name="mobile" class="form-control"></td>
								</div>
								
							</tr>
							
							<tr>
								<td>Username</td>
								<div class="form-group">
								<td><input type="text" name="uname" class="form-control"></td>
								</div>
							</tr>
							<tr>
							<div class="form-group">
							<td>Password</td>
								<td><input type="password" name="pass" class="form-control"></td>
							</div>
							</tr>
							<tr>
							<div class="form-group">
							<td><input type="submit" value="Submit" name="" class="btn btn-outline-primary"></td>
								<td><input type="reset" value="Reset" name="" class="btn btn-outline-danger"></td>
							</div>
							</tr>
							<tr>
								<td colspan="2">Already Registered!! <a href="login.jsp">Login
										Here</a></td>
							</tr>
							
							</tbody>
					</table>
							
							</div>
							</div>
							</div>
		
					
	</form>


	<%
		boolean isPostMethod = request.getMethod().equals("POST");
		if (isPostMethod) {

			String user = request.getParameter("uname");
			String pass = request.getParameter("pass");
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String email = request.getParameter("email");
			String mobile = request.getParameter("mobile");

			Class.forName("com.mysql.jdbc.Driver"); //load driver
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/saipali", "root", ""); //set connection parameters eg username,pass,dbname

			Statement st = con.createStatement();
			//result set
			int i = st.executeUpdate(
					"insert into members(first_name,last_name,email,mobile,username,password,regdate)	values('"
							+ fname + "','" + lname + "','" + email + "','" + mobile + "','" + user + "','" + pass
							+ "', CURDATE())");

			if (i > 0) {
				ServletContext sc = getServletContext().getContext("/SercletExamples");
				session.setAttribute("username", user);
				//redirect to another page
				response.sendRedirect("http://localhost:8080/SercletExamples/welcome.jsp?name=" + user + "");
				//out.println("Registration Successfull !!"+"<a href='index.jsp'> Go to Login</a>");
			} else {
				response.sendRedirect("index.jsp");
			}

		}
	%>



















</body>
</html>