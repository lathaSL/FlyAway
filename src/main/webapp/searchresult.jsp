<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
 <jsp:useBean id="flgtBean" class="com.dto.FlightDetails"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway Home Page</title>

  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepicker" ).datepicker();
  } );
  </script>


</head>
<body>

<H1> Welcome to FlyAway Portal!</H1>
	<form action="/FlyAway/register.jsp" method="post">
		<table>
			<tr>
				<td>Search Results:
			</tr>
		
			<tr>
				<% 
				String FlgtId=request.getParameter("flightId");%>
				
				<% String depLocId=request.getParameter("depLocId");%>
				<% String arrLocId=request.getParameter("arrLocId");%>
				<% String depTime=request.getParameter("datepicker"); %>
				
				<% pageContext.setAttribute("FlgtId", request.getParameter("flightId")); %>
				<% pageContext.setAttribute("depLocId", request.getParameter("depLocId")); %>
				<% pageContext.setAttribute("arrLocId", request.getParameter("arrLocId")); %>
				<% pageContext.setAttribute("datepicker", request.getParameter("datepicker")); %>
				
				
				<td/><td>flight Name</td><td>FROM</td><td>TO</td><td>DEPARTURE</td><td>ARRIVAL</td><td>Price</td>
			</tr>
			
				
					<c:forEach items="${flgtBean.getFlightDetailsList(FlgtId,depLocId,arrLocId,depTime)}" var="item">
					<tr>
						<td><input type="radio" name="flightdtlsid" value="${item.getFlightDtlsId()}"/>
						<td>${item.getFlight().getFlightName()}</td>
						<td>${item.getDeploc().getLocName()}</td>
						<td>${item.getArrloc().getLocName()}</td>
						<td>${item.getDepTime()}</td>
						<td>${item.getArrTime()}</td>
						<td>${item.getPrice()}</td>
						
						</tr>
					</c:forEach>
				
			<tr>
				<td colspan="2"><input type="submit" Value="Book Ticket"/></td>
			</tr>
		</table>	
	</form>
	

</body>
</html>