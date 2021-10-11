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
<body style="background-image: url('bg2.jpg');">
<jsp:include page="userhead.jsp" />
 <H2>Available Airline(s) Details:</H2>
<p>Select and book your tickets.</p>
	<form action="/FlyAway/register.jsp" method="post">
		<table style="width:80%">
			
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
				
				
				<td><i>Select</i></td><td><b>Airline</b></td><td><b>FROM</b></td><td><b>TO</b></td><td><b>DEPARTURE</b></td><td><b>ARRIVAL</b></td><td><b>Price</b></td>
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
				<td colspan="2"><br/<br/><input type="submit" Value="Book Ticket"/></td>
			</tr>
		</table>	
	</form>
	

</body>
</html>