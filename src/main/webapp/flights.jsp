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
<body style="background-color:#FAF0E6;">
<jsp:include page="adminhead.jsp" />
<p>${message}</p>

<H2>Available Flights:</H2>
	<form action="/FlyAway/addflight.jsp" method="post">
		<table width="30%">
			<tr>
				<td><b>Flight Code</b></td><td/><td><b>Flight Name</b></td><td></td>
			</tr>	
			<tr><td><br/></td></tr>
					<c:forEach items="${fltBean.getFlights()}" var="item">
		   <tr>
				<td>${item.getFlightCode()}</td><td/><td>${item.getFlightName()}</td><td></td>
			</tr>
			
		</c:forEach>
		
			<tr>
				<td colspan="2"><br/><input type="submit" Value="Add Flight"/></td>
			</tr>
		</table>	
	</form>
	

</body>
</html>