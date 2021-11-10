<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- includes the head -->
<%@ include file="/fheader.jsp"%>

<div class="container" id="registrationPage">
	<div class="card card-register mx-auto mt-5">
		<div class="card-header">Register an Account</div>
		<div class="card-body">
			<form action="RegisterEmployee" method="POST">
				<div class="form-group">
					<div class="form-row">
						<div class="col-md-6">
							<label for="firstname">First name</label> <input
								class="form-control form-control-sm up-form" id="firstname"
								name="fname" type="text" aria-describedby="firstname"
								placeholder="Enter first name">
							<p id="firstname_error"></p>
						</div>
						<div class="col-md-6">
							<label for="lastname">Last name</label> <input
								class="form-control form-control-sm" id="lastname" name="lname"
								type="text" aria-describedby="lastname"
								placeholder="Enter last name">
							<p id="lastname_error"></p>
						</div>
					</div>
					<div class="form-group">
						<label for="username">Username</label> <input
							class="form-control form-control-sm" id="username" name="uname"
							type="text" aria-describedby="username"
							placeholder="Enter username">
						<p id="username_error"></p>
					</div>
				</div>
				<div class="form-group">
					<label for="email">Email address</label> <input
						class="form-control form-control-sm" id="email" name="email"
						type="email" aria-describedby="email" placeholder="Enter email">
					<p id="email_error"></p>
				</div>
				<div class="form-group">
					<div class="form-row">
						<div class="col-md-6">
							<label for="password">Password</label> <input
								class="form-control form-control-sm" id="password" name="pwd"
								type="password" placeholder="Password">
							<p id="password_error"></p>
						</div>
						<div class="col-md-6">
							<label for="cpassword">Confirm password</label> <input
								class="form-control form-control-sm " id="cpassword" name="cpwd"
								type="password" placeholder="Confirm password">
							<p id="cpassword_error"></p>
						</div>
					</div>
				</div>
				<div class="form-group">
				<input role="button" class="btn btn-primary btn-sm btn-block"
					id="register" value="Register" type="submit">
				 </div>
			</form>
			<div class="text-center">
				<a class="d-block small mt-3" href="login.jsp">Login Page</a> <a
					class="d-block small" href="forgot-password.jsp">Forgot
					Password?</a>
			</div>
		</div>
	</div>
</div>

<!-- include the footer -->
<%@ include file="/ffooter.jsp"%>