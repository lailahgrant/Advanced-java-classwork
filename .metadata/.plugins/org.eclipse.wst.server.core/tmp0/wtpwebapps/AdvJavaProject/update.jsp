<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="project.dao.*,project.modal.EmployeeModal,java.util.*"%>

<%@ include file="/header.jsp"%>

<div class="content-wrapper">
	<%
		EmployeeModal employee = EmployeeDao.retrieveEmployeeById(Integer.parseInt(request.getParameter("id")));
	//HttpSession s = request.getSession(true);
	//String id= request.getParameter("id");
	//session.setAttribute("employee_id",id );
	%>
	<div class="container-fluid" id="updatePage">
		<h4>
			Are u sure to update me at
			<%=employee.getEmp_firstname()%>
		</h4>


		<div class="card card-register mx-auto mt-5">
			<div class="card-header">Update Employee Details</div>
			<div class="card-body">
				<form action="UpdateEmployee" method="POST">
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="firstname">First name</label> <input
									class="form-control form-control-sm" id="firstname" type="text" name="fname"
									aria-describedby="fname"
									value="<%=employee.getEmp_firstname()%>">
									<p id="firstname_error"></p>
							</div>
							<div class="col-md-6">
								<label for="lastname">Last name</label> <input class="form-control form-control-sm"
									id="lastname" name="lname" value="<%=employee.getEmp_lastname() %>"
									type="text" aria-describedby="lname" 
									>
									<p id="lastname_error"></p>
							</div>
						</div>
					</div>
					<div class="form-group">
						<label for="username">Username</label> <input
							class="form-control form-control-sm" id="username" name="uname" type="text"
							aria-describedby="email" value="<%=employee.getEmp_username() %>">
					   <p id="username_error"></p>
					</div>
					<div class="form-group">
						<label for="email">Email address</label> <input
							class="form-control" id="email" name="email" type="email"
							aria-describedby="email" value="<%=employee.getEmp_email()%>">
					 <div id="email_error"></div>
					</div>
					<input type="hidden" name="emp_id" value=<% out.print(employee.getEmp_id()); %>>
					<div class="form-group">
					<input class="btn btn-primary btn-block btn-sm"  type="submit"
						name="updatebtn" id="updatebtn" value="update">
					</div>
				</form>

			</div>
		</div>
	</div>
</div>


<%@ include file="/footer.jsp"%>
