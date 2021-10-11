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
<br/>
<p>
Thanks for Booking <%= session.getAttribute("fname").toString() %>, Your ticket details below:</p><br/>
		<table style="width:60%; border: solid; padding:20px; align:center;">		
		
				<tr>
				<% 
				String flightdtlsid=session.getAttribute("flightdtlsid").toString(); %>
				
				
				
				
				<% String count=request.getParameter("count");%>
				
				<% pageContext.setAttribute("flightdtlsid",session.getAttribute("flightdtlsid").toString()); %>
				
				<% pageContext.setAttribute("count",session.getAttribute("count").toString()); %>
				
				
					<c:forEach items="${flgtBean.getFlightDetailsList(flightdtlsid)}" var="item">
					<tr style="padding:10;">
						<td><b>Name:</b></td><td><%= session.getAttribute("fname").toString() %></td></tr>
						<tr><td><b>Airline: </b></td><td>${item.getFlight().getFlightName()}</td></tr>
						<tr><td><b>Source:</b></td><td>${item.getDeploc().getLocName()}</td></tr>
						<tr><td><b>Destination:</b></td><td>${item.getArrloc().getLocName()}</td>
						</tr><tr><td><b>Departure:</b></td><td>${item.getDepTime()}</td>
						</tr><tr><td><b>Arrival:</b></td><td>${item.getArrTime()}</td>
						</tr><tr><td><b>Cost:</b></td><td>Rs. ${item.getPrice()}</td>
						</tr><tr><td><b>No. of Passengers:</b></td><td>${count}</td>
						
						</tr>
					</c:forEach>
			<tr>
			<td>
			
				</tr>
				
			
		</table>	
		<br/>
<p>Want to book another ticket? <a href="/FlyAway/home.jsp">Search for Flights</a>.

</body>
</html>