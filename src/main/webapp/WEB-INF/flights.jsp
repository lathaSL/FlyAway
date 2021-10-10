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
	<form action="/FlyAway/addflight.jsp" method="post">
		<table>
			<tr>
				<td>Flight Code</td><td>Flight Name</td><td></td>
			</tr>	
					<c:forEach items="${fltBean.getFlights()}" var="item">
		   <tr>
				<td>${item.getFlightCode()}</td><td>${item.getFlightName()}</td><td></td>
			</tr>
			
		</c:forEach>
		
			<tr>
				<td colspan="2"><input type="submit" Value="Add Flight"/></td>
			</tr>
		</table>	
	</form>
	

</body>
</html>