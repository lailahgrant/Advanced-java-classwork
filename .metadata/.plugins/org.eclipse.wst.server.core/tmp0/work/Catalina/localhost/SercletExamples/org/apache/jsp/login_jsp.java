/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.56
 * Generated at: 2018-07-11 13:18:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/index1.jsp", Long.valueOf(1524475008225L));
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
      out.write("    ");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Login logout</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<!--Be sure to include popper.min.js before Bootstrapâs JavaScript-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/popper.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<a href=\"login.jsp\">Login</a>\r\n");
      out.write("<a href=\"logout.jsp\">Logout</a>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!DOCTYPE html><!--   include file=\"index.jsp\" it include all the features in index.jsp file -->\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Login page</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<!--Be sure to include popper.min.js before Bootstrapâs JavaScript-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/popper.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<hr/>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"row mt-5 ml-5\">\r\n");
      out.write("<h3 class=\"text-dark\">Login form</h3>\r\n");
      out.write("</div>\r\n");
      out.write("<table class=\"table table-hover\">\r\n");
      out.write("<thead>\r\n");
      out.write("<tr>\r\n");
      out.write("<th colspan=\"2\"><h3 class=\"text-dark\">Enter your Login Credentials</h3></th>\r\n");
      out.write("</tr>\r\n");
      out.write("</thead>\r\n");
      out.write("<tbody>\r\n");

String profile_msg = (String)request.getAttribute("profile_msg");
if(profile_msg != null){
	out.print(profile_msg);
}
String login_msg = (String)request.getAttribute("login_msg");
if(login_msg != null){
	out.print(login_msg);
}

      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write("\r\n");
      out.write("<form action=\"loginprocess.jsp\" method=\"post\">\r\n");
      out.write("<!-- <div  class=\"form-group row\"> -->\r\n");
      out.write("<!-- <label class='col-sm-3'>Email</label> -->\r\n");
      out.write("<!-- <input class=\"form-control col-sm-4 form-control-sm \" style=\"border:none; border-bottom:1px solid black;\"> -->\r\n");
      out.write("<!-- </div> -->\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Email</td>\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("<td><input type=\"text\" name=\"email\" class=\"form-control\"></td>\r\n");
      out.write("</div>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td>Password</td>\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("<td><input type=\"password\" name=\"password\" class=\"form-control\"></td>\r\n");
      out.write("</div>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("<td><input type=\"submit\" value=\"Submit\" class=\"btn btn-outline-danger\"></td>\r\n");
      out.write("<td><input type=\"reset\" value=\"Reset\" class=\"btn btn-outline-primary\"></td>\r\n");
      out.write("</div>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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