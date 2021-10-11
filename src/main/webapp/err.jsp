
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
</head>
<body style="background-color:#FFFFF0;">
<H1 align="center"> FlyAway Portal</H1>

<H1>Error!!!</H1>

<p>${message}</p>


<% if (session.getAttribute("adminname") != null ) {
	
	out.println("<a href='admin.jsp'>Admin Home</a>");
}
else{
	out.println("<a href='home.jsp'>Home</a>");
	
}

%>
</body>
</html>