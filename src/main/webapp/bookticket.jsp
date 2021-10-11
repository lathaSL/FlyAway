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
<body style="background-image: url('bg2.jpg');">
<jsp:include page="userhead.jsp" />


<h2>Your Airline booking details:</h2>
	<form action="/FlyAway/payment.jsp" method="post">
		<table style="width:80%">		
			<tr>
				<% 
				String flightdtlsid=session.getAttribute("flightdtlsid").toString(); %>
				
				
				
				
				
				<% pageContext.setAttribute("flightdtlsid",session.getAttribute("flightdtlsid").toString()); %>
				
				
				<td><b>Airline</b></td><td><b>FROM</b></td><td><b>TO</b></td><td><b>DEPARTURE</b></td><td><b>ARRIVAL</b></td><td><b>Price</b></td>
			</tr>
			
				
					<c:forEach items="${flgtBean.getFlightDetailsList(flightdtlsid)}" var="item">
					<tr>
						
						<td>${item.getFlight().getFlightName()}</td>
						<td>${item.getDeploc().getLocName()}</td>
						<td>${item.getArrloc().getLocName()}</td>
						<td>${item.getDepTime()}</td>
						<td>${item.getArrTime()}</td>
						<td>${item.getPrice()}<input type="hidden" name="price" value="${item.getPrice()}"/></td>
						
						</tr>
					</c:forEach>
				
			<tr>
				<td colspan="2"><br/><br/><input type="submit" Value="Confirm Booking"/></td>
			</tr>
		</table>	
	</form>
	

</body>
</html>