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
<body>
	<form action="/FlyAway/flightdetails" method="post">
		<table>
			<tr>
				<td colspan="2">Provide Airline Details</td>
			</tr>
			<tr>
				<td>Flight Code</td><td>
				<select name="flightCode">
					<c:forEach items="${flgtBean.getFlightCodesList()}" var="item">
						<option name="${item.getFlightCode()}">${item.getFlightName()}[${item.getFlightCode()}]</option>
					</c:forEach>
				</select>
				</td>
			</tr>
			<tr>
				<td>Departure Location Code</td><td>	<select name="depLocCode">
					<c:forEach items="${flgtBean.getLocCodesList()}" var="item">
						<option name="${item.getLocCode()}">${item.getLocName()}[${item.getLocCode()}]</option>
					</c:forEach>
				</select>
				</td>
				</tr>
			
			<tr>
				<td>Arrival Location Code</td><td>	<select name="arrLocCode">
					<c:forEach items="${flgtBean.getLocCodesList()}" var="item">
						<option name="${item.getLocCode()}">${item.getLocName()}[${item.getLocCode()}]</option>
					</c:forEach>
				</select>
			</tr>
			
			<tr>
				<td>Departure Time</td><td><input type="text" name="depTime"><input type=button value="Select Date" onclick=
"displayDatePicker('date', this);"/></input></td>
			</tr>
			
			<tr>
				<td>Arrival Time</td><td><input type="text" name="arrTime"><input type=button value="Select Date" onclick=
"displayDatePicker('date', this);"/></input></td>
			</tr>
			
			<tr>
				<td>Price</td><td><input type="text" name="price"/></td>
			</tr>
			
			
			
			<tr>
				<td colspan="2"><input type="submit" Value="Add" name="type"/></td>
				<td colspan="2"><input type="Reset" Value="Reset"/></td>
			</tr>
		</table>	
	</form>
	

</body>
</html>