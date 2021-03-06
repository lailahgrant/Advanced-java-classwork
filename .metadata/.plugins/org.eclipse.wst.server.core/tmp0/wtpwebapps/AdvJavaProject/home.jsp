<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="project.dao.* ,project.modal.EmployeeModal ,  javax.servlet.http.HttpSession ,com.google.gson.Gson,com.google.gson.GsonBuilder" %>
<!-- include the page top part -->
<%@ include file="/header.jsp"%>

<div class="content-wrapper">

<% 
//logined in employee
	HttpSession employeesession = request.getSession(false);
	String employee  =(String)employeesession.getAttribute("employeeDetails");
	
	EmployeeModal LoggedInEmployee=null;
	try{
  	Gson gson = new GsonBuilder().serializeNulls().create();
       LoggedInEmployee = gson.fromJson(employee, EmployeeModal.class);
    
  }catch(Exception e){
  	out.print(e.getMessage());
  }
int totalrecords = EmployeeDao.retrieveEmployees().size();
%>
	<div class="container-fluid">
  <%=employee %>
		<!-- Breadcrumbs-->
		<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="#">Dashboard</a></li>
			<li class="breadcrumb-item active">Index</li>
		</ol>
		<!-- Icon Cards-->
		<div class="row">
			<div class="col-xl-3 col-sm-6 mb-3">
				<div class="card text-white bg-warning o-hidden h-100">
					<div class="card-body">
						<div class="card-body-icon">
							<i class="fa fa-fw fa-list"></i>
						</div>
						<div class="mr-5">11 New Tasks!</div>
					</div>
					<a class="card-footer text-white clearfix small z-1" href="#">
						<span class="float-left">View Details</span> <span
						class="float-right"> <i class="fa fa-angle-right"></i>
					</span>
					</a>
				</div>
			</div>

			<div class="col-xl-3 col-sm-6 mb-3">
				<div class="card text-white bg-success o-hidden h-100">
					<div class="card-body">
						<div class="card-body-icon">
							<i class="fa fa-fw fa-shopping-cart"></i>
						</div>
						<div class="mr-5">123 New Orders!</div>
					</div>
					<a class="card-footer text-white clearfix small z-1" href="#">
						<span class="float-left">View Details</span> <span
						class="float-right"> <i class="fa fa-angle-right"></i>
					</span>
					</a>
				</div>
			</div>

			<div class="col-xl-3 col-sm-6 mb-3">
				<div class="card text-white bg-primary o-hidden h-100">
					<div class="card-body">
						<div class="card-body-icon">
							<i class="fa fa-fw fa-comments"></i>
						</div>
						<div class="mr-5"><%=totalrecords %> Employees</div>
					</div>
					<a class="card-footer text-white clearfix small z-1" href="#">
						<span class="float-left">View Details</span> <span
						class="float-right"> <i class="fa fa-angle-right"></i>
					</span>
					</a>
				</div>
			</div>

			<div class="col-xl-3 col-sm-6 mb-3">
				<div class="card text-white bg-dark o-hidden h-100">
					<div class="card-body">
						<div class="card-body-icon">
							<i class="fa fa-fw fa-support"></i>
						</div>
						<div class="mr-5">13 New Messages!</div>
					</div>
					<a class="card-footer text-white clearfix small z-1" href="#">
						<span class="float-left">View Details</span> <span
						class="float-right"> <i class="fa fa-angle-right"></i>
					</span>
					</a>
				</div>
			</div>
		</div>

		<!-- Example DataTables Card-->
		<div class="card mb-3">
			<div class="card-header">
				<i class="fa fa-table"></i> Data Table Example
			</div>
			<div class="card-body"></div>
			<div class="card-footer small text-muted">Updated yesterday at
				11:59 PM</div>
		</div>
	</div>
</div>
<!-- /.container-fluid-->
<!-- /.content-wrapper-->


<!-- includes the footer -->
<%@  include file="/footer.jsp"%>
