<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
 <jsp:useBean id="fltBean" class="com.dto.Flight"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway Home Page</title>
</head>
<body>
<H1 align="center"> FlyAway Admin Page</H1>
<p align="left"> <a href="/FlyAway/admin.jsp">Home</a></p>
<p align="right"> Logged in as<i> <%= session.getAttribute("adminname") %></i>.&nbsp;<a href="/FlyAway/logout">Logout</a></p>
</body>
</html>