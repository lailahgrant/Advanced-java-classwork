<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My login page</title>

<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
        <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
        <!--Be sure to include popper.min.js before Bootstrap’s JavaScript-->
        <script type="text/javascript" src="js/popper.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>

</head>
<body>
<form method="post" action="index.jsp">
<center>
<table border="1" width="30%" cellpadding="5">
<thead>
<tr>
<th colspan="2">Login page</th>
</tr>
</thead>
<tbody>
<tr>
<td>Enter your username</td>
<td><input type="text" name="user"></td>
</tr>
<tr>
<td>Enter your passsword</td>
<td><input type="password" name="pass"></td>
</tr>
<tr>
<td><input type="submit" name="" value="Submit"></td>
<td><input type="reset" name="" value="Reset"></td>
</tr>
</tbody>
</table>
</center>
</form>
</body>
</html>


<%

	boolean check = request.getMethod().equals("POST");
	if(check){
		
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		String sql = "select * from members where username=? and password=?";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/saipali","root","");
		
		//preparedstatements
		PreparedStatement ps = con.prepareStatement(sql);
		//bind values
		ps.setString(1,user);    ps.setString(2, pass);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.isBeforeFirst()){
			
			out.print("good");
			
		}else{
			out.print("Invalid username password");
		}
		
	}

%>
























