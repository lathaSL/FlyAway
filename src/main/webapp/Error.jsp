<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
</head>
<body>
<H1>Error Occurred!!</H1>

<a anchor="/home.jsp">home</a>
<% if (session.getAttribute("adminname") != null ) {
	
	out.println("<a anchor=/admin.jsp>Admin Home</a>");
}


%>
</body>
</html>