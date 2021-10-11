<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Page</title>

  

</head>
<body style="background-color:powderblue;">

<H1 align="center"> Payment Portal</H1>
<p align="right"> <a href="/FlyAway/home.jsp">Home</a></p>

	<form action="/FlyAway/confirm.jsp" method="post">
	<table style="width:85%">
			
		
			<tr>
			<td>
			Hi <%= session.getAttribute("fname").toString() %>, <br/><br/>
			
			               Please pay an amount of <b>Rs. <%= request.getParameter("price") %></b><br/><br/></td>
				</tr>
			<tr>
				<td colspan="2"><input type="submit" Value="PAY"/></td>
			</tr>
		</table>	
	</form>
	

</body>
</html>