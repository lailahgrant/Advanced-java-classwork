/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.56
 * Generated at: 2018-06-04 16:35:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import project.dao.*;
import project.modal.EmployeeModal;
import java.util.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1527664812020L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1527645726889L));
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("  <meta name=\"description\" content=\"\">\r\n");
      out.write("  <meta name=\"author\" content=\"\">\r\n");
      out.write("  <title>Employee Management System</title>\r\n");
      out.write("  <!-- Bootstrap core CSS-->\r\n");
      out.write("  <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <!-- Custom fonts for this template-->\r\n");
      out.write("  <link href=\"vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write(" \r\n");
      out.write("  <!-- Custom styles for this template-->\r\n");
      out.write("  <link href=\"css/mystyles.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"css/sb-admin.css\" rel=\"stylesheet\">\r\n");
      out.write("  \r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"fixed-nav sticky-footer bg-dark\" id=\"page-top\">\r\n");
      out.write(" <!-- Navigation-->\r\n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\" id=\"mainNav\">\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"home.jsp\">Rwenzori Firm</a>\r\n");
      out.write("    <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\r\n");
      out.write("      <ul class=\"navbar-nav navbar-sidenav\" id=\"exampleAccordion\">\r\n");
      out.write("        <li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Dashboard\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"home.jsp\">\r\n");
      out.write("            <i class=\"fa fa-fw fa-dashboard\"></i>\r\n");
      out.write("            <span class=\"nav-link-text\">Dashboard</span>\r\n");
      out.write("          </a>\r\n");
      out.write("        </li>\r\n");
      out.write("      \r\n");
      out.write("        <li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Manage Employees\">\r\n");
      out.write("          <a class=\"nav-link nav-link-collapse collapsed\" data-toggle=\"collapse\" href=\"#collapseComponents\" data-parent=\"#exampleAccordion\">\r\n");
      out.write("            <i class=\"fa fa-fw fa-user\"></i>\r\n");
      out.write("            <span class=\"nav-link-text\">Manage Employees</span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <ul class=\"sidenav-second-level collapse\" id=\"collapseComponents\">\r\n");
      out.write("            <li>\r\n");
      out.write("                \r\n");
      out.write("              <a href=\"register.jsp\" title=\"add employee\"><i class=\"fa fa-plus-square-o mr-1\"></i>Add Employee</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"view-employees.jsp\"><i class=\"fa fa-eye mr-1\"></i>view Employees</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            \r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("       \r\n");
      out.write("      </ul>\r\n");
      out.write("      <ul class=\"navbar-nav sidenav-toggler\">\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link text-center\" id=\"sidenavToggler\">\r\n");
      out.write("            <i class=\"fa fa-fw fa-angle-left\"></i>\r\n");
      out.write("          </a>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("        <li class=\"nav-item dropdown\">\r\n");
      out.write("          <a class=\"nav-link dropdown-toggle mr-lg-2\" id=\"messagesDropdown\" href=\"#\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("            <i class=\"fa fa-fw fa-envelope\"></i>\r\n");
      out.write("            <span class=\"d-lg-none\">Messages\r\n");
      out.write("              <span class=\"badge badge-pill badge-primary\">12 New</span>\r\n");
      out.write("            </span>\r\n");
      out.write("            <span class=\"indicator text-primary d-none d-lg-block\">\r\n");
      out.write("              <i class=\"fa fa-fw fa-circle\"></i>\r\n");
      out.write("            </span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <div class=\"dropdown-menu\" aria-labelledby=\"messagesDropdown\">\r\n");
      out.write("            <h6 class=\"dropdown-header\">New Messages:</h6>\r\n");
      out.write("            <div class=\"dropdown-divider\"></div>\r\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("              <strong>David Miller</strong>\r\n");
      out.write("              <span class=\"small float-right text-muted\">11:21 AM</span>\r\n");
      out.write("              <span class=\"dropdown-message small\">Hey there! This new version of SB Admin is pretty awesome! These messages clip off when they reach the end of the box so they don't overflow over to the sides!</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            </div>\r\n");
      out.write("           \r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item dropdown\">\r\n");
      out.write("          <a class=\"nav-link dropdown-toggle mr-lg-2\" id=\"alertsDropdown\" href=\"#\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("            <i class=\"fa fa-fw fa-bell\"></i>\r\n");
      out.write("            <span class=\"d-lg-none\">Alerts\r\n");
      out.write("              <span class=\"badge badge-pill badge-warning\">6 New</span>\r\n");
      out.write("            </span>\r\n");
      out.write("            <span class=\"indicator text-warning d-none d-lg-block\">\r\n");
      out.write("              <i class=\"fa fa-fw fa-circle\"></i>\r\n");
      out.write("            </span>\r\n");
      out.write("          </a>\r\n");
      out.write("          <div class=\"dropdown-menu\" aria-labelledby=\"alertsDropdown\">\r\n");
      out.write("            <h6 class=\"dropdown-header\">New Alerts:</h6>\r\n");
      out.write("            <div class=\"dropdown-divider\"></div>\r\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("              <span class=\"text-success\">\r\n");
      out.write("                <strong>\r\n");
      out.write("                  <i class=\"fa fa-long-arrow-up fa-fw\"></i>Status Update</strong>\r\n");
      out.write("              </span>\r\n");
      out.write("              <span class=\"small float-right text-muted\">11:21 AM</span>\r\n");
      out.write("              <span class=\"dropdown-message small\">This is an automated server response message. All systems are online.</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </li>\r\n");
      out.write("       \r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" data-toggle=\"modal\" data-target=\"#logoutModal\">\r\n");
      out.write("            <i class=\"fa fa-fw fa-sign-out\"></i>Logout</a>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"content-wrapper\">\r\n");
      out.write("\t");

		EmployeeModal employee = EmployeeDao.retrieveEmployeeById(Integer.parseInt(request.getParameter("id")));
	//HttpSession s = request.getSession(true);
	//String id= request.getParameter("id");
	//session.setAttribute("employee_id",id );
	
      out.write("\r\n");
      out.write("\t<div class=\"container-fluid\" id=\"updatePage\">\r\n");
      out.write("\t\t<h4>\r\n");
      out.write("\t\t\tAre u sure to update me at\r\n");
      out.write("\t\t\t");
      out.print(employee.getEmp_firstname());
      out.write("\r\n");
      out.write("\t\t</h4>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"card card-register mx-auto mt-5\">\r\n");
      out.write("\t\t\t<div class=\"card-header\">Update Employee Details</div>\r\n");
      out.write("\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t<form action=\"UpdateEmployee\" method=\"POST\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"firstname\">First name</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"form-control form-control-sm\" id=\"firstname\" type=\"text\" name=\"fname\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\taria-describedby=\"fname\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(employee.getEmp_firstname());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p id=\"firstname_error\"></p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"lastname\">Last name</label> <input class=\"form-control form-control-sm\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"lastname\" name=\"lname\" value=\"");
      out.print(employee.getEmp_lastname() );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" aria-describedby=\"lname\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p id=\"lastname_error\"></p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"username\">Username</label> <input\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control form-control-sm\" id=\"username\" name=\"uname\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\taria-describedby=\"email\" value=\"");
      out.print(employee.getEmp_username() );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t   <p id=\"username_error\"></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"email\">Email address</label> <input\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"email\" name=\"email\" type=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\taria-describedby=\"email\" value=\"");
      out.print(employee.getEmp_email());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t <div id=\"email_error\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"emp_id\" value=");
 out.print(employee.getEmp_id()); 
      out.write(">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<input class=\"btn btn-primary btn-block btn-sm\"  type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\tname=\"updatebtn\" id=\"updatebtn\" value=\"update\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <footer class=\"sticky-footer\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"text-center\">\r\n");
      out.write("          <small>Copyright ?? Your Website 2018</small>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!-- Scroll to Top Button-->\r\n");
      out.write("    <a class=\"scroll-to-top rounded\" href=\"#page-top\">\r\n");
      out.write("      <i class=\"fa fa-angle-up\"></i>\r\n");
      out.write("    </a>\r\n");
      out.write("    <!-- Logout Modal-->\r\n");
      out.write("    <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("      <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("          <div class=\"modal-header\">\r\n");
      out.write("            <h5 class=\"modal-title\" id=\"exampleModalLabel\">Mr  Ready to Leave?</h5>\r\n");
      out.write("            <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("              <span aria-hidden=\"true\">??</span>\r\n");
      out.write("            </button>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\r\n");
      out.write("          <div class=\"modal-footer\">\r\n");
      out.write("            <button class=\"btn btn-secondary btn-sm\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("            <form action=\"LogOutServlet\" method=\"GET\">\r\n");
      out.write("            <input type=\"submit\" class=\"btn btn-primary btn-sm\" value=\"Logout\" name=\"logout\" id=\"logout\">\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Bootstrap core JavaScript-->\r\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <!-- Core plugin JavaScript-->\r\n");
      out.write("    <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"js/sb-admin.min.js\"></script>\r\n");
      out.write("    <script src=\"js/scripts.js\"></script>\r\n");
      out.write("   \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
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
