<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="project.dao.* ,  project.modal.EmployeeModal , java.util.* "%>
<%@ include file="/header.jsp"%>


<div class="content-wrapper">
	<%
		double totalrecords = EmployeeDao.retrieveEmployees().size();

		double numperpage = 7;

		double numofpages = Math.ceil(totalrecords / numperpage);

		int start = (request.getParameter("page") == null) ? 1 : Integer.parseInt(request.getParameter("page"));

		List<EmployeeModal> employees = EmployeeDao.retrieveLimitedEmployees(start, (int) numperpage);
	%>
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-12">
				<!-- Breadcrumbs-->
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="#">Dashboard</a></li>
					<li class="breadcrumb-item active">employees</li>
				</ol>
			</div>
		</div>

		<div class="row mb-1">
			<div class="col-4">
				<button title="add" data-toggle="modal"
					data-target="#addEmployeeModal" class="btn btn-primary btn-sm">
					<i class="fa fa-plus-square-o mr-1"></i>Add Employee
				</button>
			</div>
			<div class="col-sm-8 ">
				<form class="ml-auto">
					<label class="sr-only">search</label> <input type="text"
						name="search" id="search"
						class="form-control form-control-sm col-4 ml-auto mr-5 "
						placeholder="search">
				</form>
			</div>
		</div>

		<!-- Employee table Card-->

		<div class="table-responsive">
			<table class="table table-hovered ">
				<thead>
					<tr>
						<th>#</th>
						<th>firstname</th>
						<th>lastname</th>
						<th>username</th>
						<th>email</th>
						<th>Action</th>
					</tr>
				</thead>

				<tbody>
					<%
						int cout = 1;
						for (EmployeeModal emp : employees) {
					%>
					<tr>
						<td><%=cout++%></td>
						<td><%=emp.getEmp_firstname()%></td>
						<td><%=emp.getEmp_lastname()%></td>
						<td><%=emp.getEmp_username()%></td>
						<td><%=emp.getEmp_email()%></td>
						<%
							out.print(emp.getEmp_id());
						%>
						<td><a role="button"
							href="DeleteEmployee?id=<%=emp.getEmp_id()%>"
							class="btn btn-sm btn-danger">delete</a> <a role="button"
							href="update.jsp?id=<%=emp.getEmp_id()%>"
							class="btn btn-sm btn-warning">update</a></td>
					</tr>

					<%
						}
					%>
				</tbody>

			</table>
		</div>

		<div class="row">
			<div class="pagination-links ml-auto mr-5">
				<ul class="pagination ">
					<%
						for (int i = 1; i <= (int) numofpages; i++) {
					%>

					<li><a class="btn btn-sm btn-primary ml-1"
						title="page <%=i%>" role="button"
						href="/AdvJavaProject/view-employees.jsp?page=<%out.print(i);%>">
							<%
								out.print(i);
							%>
					</a></li>
					<%
						}
					%>

				</ul>
			</div>
		</div>

	</div>



</div>
<!-- /.container-fluid-->
<!-- /.content-wrapper-->


<div id="registrationPage">
	<!-- to activate validations -->
</div>
<!-- employee -->
<!-- product modal -->
<div id="addEmployeeModal" class="modal fade" role="dialog">
	<div class="modal-dialog">
		<!-- modal content -->
		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title">Add Employee</h4>
				<button class="close text-danger" data-dismiss="modal" type="button">&times;</button>
			</div>
			<div class="modal-body">
				<form action="AddEmployee" method="POST">
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="firstname">First name</label> <input
									class="form-control form-control-sm " id="firstname"
									name="fname" type="text" aria-describedby="firstname"
									placeholder="Enter first name">
								<p id="firstname_error"></p>
							</div>
							<div class="col-md-6">
								<label for="lastname">Last name</label> <input
									class="form-control" id="lastname" name="lname" type="text"
									aria-describedby="lastname" placeholder="Enter last name">
								<p id="lastname_error"></p>
							</div>
						</div>
					</div>
					<div class="form-group">
						<label for="username">Username</label> <input class="form-control"
							id="username" name="uname" type="text"
							aria-describedby="username" placeholder="Enter username">
						<p id="username_error"></p>
					</div>
					<div class="form-group">
						<label for="email">Email address</label> <input
							class="form-control" id="email" name="email" type="email"
							aria-describedby="email" placeholder="Enter email">
						<p id="email_error"></p>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<label for="password">Password</label> <input
									class="form-control" id="password" name="pwd" type="password"
									placeholder="Password">
								<p id="password_error"></p>
							</div>
							<div class="col-md-6">
								<label for="cpwd">Confirm password</label> <input
									class="form-control" id="cpassword" type="password"
									placeholder="Confirm password">
								<p id="cpassword_error"></p>
							</div>
						</div>
					</div>
					<input type="submit" name="submit" value="Add Employee"
						id="register">
				</form>

			</div>
		</div>
	</div>
</div>

<%@ include file="/footer.jsp"%>

