<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!-- includes the head -->
<%@ include file="/fheader.jsp" %> 

 <div class="container">
    <div class="card card-login mx-auto mt-5">
      <div class="card-header">Reset Password</div>
      <div class="card-body">
        <div class="text-center mt-4 mb-5">
          <h4>Forgot your password?</h4>
          <!-- p>Enter your email address and we will send you instructions on how to reset your password.</p-->
          <p>Enter valid email address to reset password</p>
        </div>
        <form action="ForgotPassword" method="POST">
          <div class="form-group">
            <input class="form-control" id="email" name="email" type="email" aria-describedby="email" placeholder="Enter email address">
          </div>
          <div class="form-group">
          <input class="btn btn-primary btn-block btn-sm" role="button" type="submit" value="Reset Password">
          </div>
        </form>
        <div class="text-center">
          <a class="d-block small mt-3" href="/AdvJavaProject/register.jsp">Register an Account</a>
          <a class="d-block small" href="/AdvJavaProject/login.jsp">Login Page</a>
        </div>
      </div>
    </div>
  </div>

<!-- include the footer -->
<%@ include file="/ffooter.jsp"  %>