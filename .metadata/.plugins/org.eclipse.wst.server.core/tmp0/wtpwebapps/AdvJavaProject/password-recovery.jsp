<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.google.gson.Gson ,javax.servlet.http.HttpSession, 
    com.google.gson.GsonBuilder,java.util.* ,project.dao.* ,project.modal.* " %>
    
<%@ include file="/fheader.jsp" %>

<div class="container" id="passwordRcoveryPage">
	<%
HttpSession employeesession = request.getSession(false);
String employee  =(String)employeesession.getAttribute("employeeByEmail");
EmployeeModal emp=null;

try{
	out.print(employee);
	Gson gson = new GsonBuilder().serializeNulls().create();
    emp = gson.fromJson(employee, EmployeeModal.class);
    //out.print(emp.getEmp_email());
    
    
}catch(Exception e){
	out.print(e.getMessage());
}
%>
	<div class="card card-register mx-auto mt-5">

		<div class="card-header">Password Recovery</div>
		<div class="card-body">
			<form  action="PasswordRecoveryServlet" method="POST">
				<div class="form-group">
					<div class="form-row">
						<div class="col-md-6">
							<label for="firstname">First name</label> 
							<input  title="first name cant be changed"
								class="form-control read-only form-control-sm up-form" id="firstname" name="fname" type="text" aria-describedby="firstname"
								value=" <%=emp.getEmp_firstname() %> ">
								
					
						</div>
						<div class="col-md-6">
							<label for="lastname">Last name</label> <input title="last name cant be changed"
								class="form-control form-control-sm" disabled id="lastname" name="lname"
								type="text" aria-describedby="lastname" 
								value="<%=emp.getEmp_lastname() %>">
							
						</div>
					</div>
					<div class="form-group">
						<label for="username">Username</label> <input title="username cant be changed"
							class="form-control form-control-sm" id="username" name="uname"
							type="text" aria-describedby="username" disabled value="<%=emp.getEmp_username() %>"
							placeholder="Enter username">
						
					</div>
				</div>
				<div class="form-group">
					<label for="email">Email address</label> <input
						class="form-control form-control-sm" id="email" name="email"  title="email address cant be changed"
						type="email" aria-describedby="email" disabled value="<%=emp.getEmp_email() %>">
				
				</div>
				<div class="form-group">
					<div class="form-row">
						<div class="col-md-6">
							<label for="password">Password</label> <input
								class="form-control form-control-sm"  id="password" name="pwd"
								type="password" placeholder="Password">
							<p id="password_error"></p>
						</div>
						<div class="col-md-6">
							<label for="cpassword">Confirm password</label> <input
								class="form-control form-control-sm "  id="cpassword" name="cpwd"
								type="password" placeholder="Confirm password">
							<p id="cpassword_error"></p>
						</div>
					</div>
				</div>
				<input type="hidden" name="id" value="<%=emp.getEmp_id() %>">
				<div class="form-group">
				<input role="button"  class="btn btn-primary btn-sm btn-block"
					id="passwordRecovery" value="update password" type="submit" >
				</div>
			</form>
			<div class="text-center">
				<a class="d-block small mt-3" href="login.jsp">Login Page</a> <a
					class="d-block small" href="forgot-password.jsp">Register an Account</a>
			</div>
		</div>
	</div>
</div>

<%@ include file="/ffooter.jsp"  %>