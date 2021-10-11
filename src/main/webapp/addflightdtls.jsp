<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
 <jsp:useBean id="flgtBean" class="com.dto.FlightDetails"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"> 
<title>FlyAway Home Page</title>
</head>
<body style="background-color:#FAF0E6;">
<jsp:include page="adminhead.jsp" />
<p>${message}</p>

<h2>Add Flight Schedules & Details </h2>
	<form action="/FlyAway/flightdetails" method="post">
		<table width="70%">
			<tr>
				<td>Flight Code: </td><td>
				<select name="flightId">
					<c:forEach items="${flgtBean.getFlightCodesList()}" var="item">
						<option value="${item.getFlightId()}">${item.getFlightName()}[${item.getFlightCode()}]</option>
					</c:forEach>
				</select>
				</td>
			</tr>
			<tr>
				<td>Departure Location Code</td><td>	<select name="depLocId">
					<c:forEach items="${flgtBean.getLocCodesList()}" var="item">
						<option value="${item.getLocId()}">${item.getLocName()}[${item.getLocCode()}]</option>
					</c:forEach>
				</select>
				</td>
				</tr>
			
			<tr>
				<td>Arrival Location Code</td><td>	<select name="arrLocId">
					<c:forEach items="${flgtBean.getLocCodesList()}" var="item">
						<option value="${item.getLocId()}">${item.getLocName()}[${item.getLocCode()}]</option>
					</c:forEach>
				</select>
			</tr>
			
			<tr>
				<td>Departure Time</td><td><input type="text" name="depTime"/>MM/DD/YYYY hh:mm:ss</td>
			</tr>
			
			<tr>
				<td>Arrival Time</td><td><input type="text" name="arrTime"/>MM/DD/YYYY hh:mm:ss</td>
			</tr>
			
			<tr>
				<td>Price</td><td><input type="text" name="price"/></td>
			</tr>
			<tr><td><br/><br/>
			
			
			<tr>
				<td align="right"><input type="submit" Value="Add" name="type""/></td>
				<td><input type="Reset" Value="Reset"/></td>
			</tr>
		</table>	
	</form>
	

</body>
</html>