<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- includes the head -->
<%@ include file="/fheader.jsp" %>

 <div class="container" id="loginPage">
    <div class="card card-login mx-auto mt-5">
      <div class="card-header">Login</div>
      <div class="card-body">
      <!-- EmployeeLogin -->
        <form action="EmployeeLogin" method="POST">
          <div class="form-group">
            <label for="email">Email address</label>
            <input class="form-control form-control-sm" id="email" name="email" type="email" aria-describedby="email" placeholder="Enter email">
            <p id="email_error"></p>
          </div>
          <div class="form-group">
            <label for="emain">Password</label>
            <input class="form-control form-control-sm" id="password" name="password" type="password" placeholder="Password">
            <p id="password_error"><p>
          </div>
          <div class="form-group">
            <div class="form-check">
              <label class="form-check-label">
                <input class="form-check-input" type="checkbox"> Remember Password</label>
                
            </div>
          </div>
          <input type="submit" value="register" name="submit" id="submitBtn" class="btn btn-primary btn-sm btn-block">
          
        </form>
        <div class="text-center">
          <a class="d-block small mt-3" href="register.jsp">Register an Account</a>
          <a class="d-block small" href="/AdvJavaProject/forgot-password.jsp">Forgot Password?</a>
        </div>
      </div>
    </div>
  </div>

<!-- include the footer -->
<%@ include file="/ffooter.jsp"  %>