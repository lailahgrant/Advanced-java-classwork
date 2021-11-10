/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.56
 * Generated at: 2018-06-05 14:34:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.google.gson.Gson;
import javax.servlet.http.HttpSession;
import com.google.gson.GsonBuilder;
import java.util.*;
import project.dao.*;
import project.modal.*;

public final class password_002drecovery_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/fheader.jsp", Long.valueOf(1527285007373L));
    _jspx_dependants.put("/ffooter.jsp", Long.valueOf(1527285176401L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("  <meta name=\"description\" content=\"\">\r\n");
      out.write("  <meta name=\"author\" content=\"\">\r\n");
      out.write("  <title>Employee management system</title>\r\n");
      out.write("  <!-- Bootstrap core CSS-->\r\n");
      out.write("  <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <!-- Custom fonts for this template-->\r\n");
      out.write("  <link href=\"vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <!-- Custom styles for this template-->\r\n");
      out.write("  <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"bg-dark\">");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\" id=\"passwordRcoveryPage\">\r\n");
      out.write("\t");

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

      out.write("\r\n");
      out.write("\t<div class=\"card card-register mx-auto mt-5\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"card-header\">Password Recovery</div>\r\n");
      out.write("\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t<form  action=\"PasswordRecoveryServlet\" method=\"POST\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"firstname\">First name</label> \r\n");
      out.write("\t\t\t\t\t\t\t<input  title=\"first name cant be changed\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control read-only form-control-sm up-form\" id=\"firstname\" name=\"fname\" type=\"text\" aria-describedby=\"firstname\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\" ");
      out.print(emp.getEmp_firstname() );
      out.write(" \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"lastname\">Last name</label> <input title=\"last name cant be changed\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control form-control-sm\" disabled id=\"lastname\" name=\"lname\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\" aria-describedby=\"lastname\" \r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(emp.getEmp_lastname() );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"username\">Username</label> <input title=\"username cant be changed\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control form-control-sm\" id=\"username\" name=\"uname\"\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" aria-describedby=\"username\" disabled value=\"");
      out.print(emp.getEmp_username() );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Enter username\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"email\">Email address</label> <input\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control form-control-sm\" id=\"email\" name=\"email\"  title=\"email address cant be changed\"\r\n");
      out.write("\t\t\t\t\t\ttype=\"email\" aria-describedby=\"email\" disabled value=\"");
      out.print(emp.getEmp_email() );
      out.write("\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"password\">Password</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control form-control-sm\"  id=\"password\" name=\"pwd\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"password\" placeholder=\"Password\">\r\n");
      out.write("\t\t\t\t\t\t\t<p id=\"password_error\"></p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"cpassword\">Confirm password</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"form-control form-control-sm \"  id=\"cpassword\" name=\"cpwd\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"password\" placeholder=\"Confirm password\">\r\n");
      out.write("\t\t\t\t\t\t\t<p id=\"cpassword_error\"></p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(emp.getEmp_id() );
      out.write("\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<input role=\"button\"  class=\"btn btn-primary btn-sm btn-block\"\r\n");
      out.write("\t\t\t\t\tid=\"passwordRecovery\" value=\"update password\" type=\"submit\" >\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t<a class=\"d-block small mt-3\" href=\"login.jsp\">Login Page</a> <a\r\n");
      out.write("\t\t\t\t\tclass=\"d-block small\" href=\"forgot-password.jsp\">Register an Account</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <!-- Bootstrap core JavaScript-->\r\n");
      out.write("  <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("  <!-- Core plugin JavaScript-->\r\n");
      out.write("  <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("  <!-- page scripts -->\r\n");
      out.write("  <script src=\"js/scripts.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
