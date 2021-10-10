<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
 <jsp:useBean id="flgtBean" class="com.dto.FlightDetails"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway Book Ticket Page</title>

  

</head>
<body>

<H1> Welcome to FlyAway Portal!</H1>
	<form action="/FlyAway/confirm.jsp" method="post">
		<table>
			<tr>
				<td>Thanks for Booking <%= session.getAttribute("fname").toString() %>, Your ticket details below:</td>
			</tr>
		<% 
				String flightdtlsid=session.getAttribute("flightdtlsid").toString(); %>
				
				
				
				
				<% String count=request.getParameter("count");%>
				
				<% pageContext.setAttribute("flightdtlsid",session.getAttribute("flightdtlsid").toString()); %>
				
				<% pageContext.setAttribute("count",session.getAttribute("count").toString()); %>
				
				<td>flight Name</td><td>FROM</td><td>TO</td><td>DEPARTURE</td><td>ARRIVAL</td><td>Price</td><td>No. of passengers</td>
			</tr>
			
				
					<c:forEach items="${flgtBean.getFlightDetailsList(flightdtlsid)}" var="item">
					<tr>
						
						<td>${item.getFlight().getFlightName()}</td>
						<td>${item.getDeploc().getLocName()}</td>
						<td>${item.getArrloc().getLocName()}</td>
						<td>${item.getDepTime()}</td>
						<td>${item.getArrTime()}</td>
						<td>${item.getPrice()}</td>
						<td>${count}</td>
						
						</tr>
					</c:forEach>
			<tr>
			<td>
			
				</tr>
			
		</table>	
	</form>
	

</body>
</html>