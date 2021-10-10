<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway Book Ticket Page</title>

  

</head>
<body>

<H1> Welcome to Payment Portal!</H1>
	<form action="/FlyAway/confirm.jsp" method="post">
		<table>
			
		
			<tr>
			<td>
			Hi <%= session.getAttribute("fname").toString() %>, <br/>
			
			Please pay an amount of Rs.<%= request.getParameter("price") %>
				</tr>
			<tr>
				<td colspan="2"><input type="submit" Value="PAY"/></td>
			</tr>
		</table>	
	</form>
	

</body>
</html>