<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Addition of 2 numbers</title>
</head>
<body>
<%--declaration is done in <%! %> --%>
<%!
	int num1,num2,sum;

%>

<%-- all in put done in html comes as string,, we convert @runtime it using Integer.parseInt() --%>
<%
	num1 = Integer.parseInt(request.getParameter("n1")); 
	num2 = Integer.parseInt(request.getParameter("n2"));
	sum=num1+num2;
	out.print("The Addition of "+num1+" and "+num2+" is = "+sum);
%>

</body>
</html>