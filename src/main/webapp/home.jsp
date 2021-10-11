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
<body style="background-image: url('bg2.jpg');background-size:cover;">
<H1 align="center"> Welcome to FlyAway Portal!</H1>

<form action="/FlyAway/loginvalidate" method="post">
		<table align="right" style="border:solid; 1px; black">
		<tr>
		<td colspan="2" ><b>Admin Login:</b></td></tr><tr/>
			<tr>
				<td>User Name: </td><td><input type="text" name="uname"/></td>
			</tr>
			<tr>
				<td>Password: </td><td><input type="password" name="pwd"/></td>
			</tr>
			<tr/>
			<tr>
				<td colspan="2" ><input type="submit" Value="Login"/></td>
			</tr>
			<tr><td colspan="2"><p><B><font color="red">${message}</font></B></p></td></tr>
		</table>	
	</form>
	
	<br/><br/><br/>
<H2>Enter your search criteria: </H2>
	<form action="/FlyAway/searchresult.jsp" method="post">
		<table style="align:center; width:75%; ">
			
			<tr>
				<td><b>FROM</b></td><td><b>TO</b></td><td><b>DEPARTURE</b></td><td><b>AIRLINE</b></td>
			</tr>
			<tr/>
			<tr>
				<td>
					<select name="depLocId">
					<c:forEach items="${flgtBean.getLocCodesList()}" var="item">
						<option value="${item.getLocId()}">${item.getLocName()}[${item.getLocCode()}]</option>
					</c:forEach>
				</select>
				</td>
				
				<td>
					<select name="arrLocId">
					<c:forEach items="${flgtBean.getLocCodesList()}" var="item">
						<option value="${item.getLocId()}">${item.getLocName()}[${item.getLocCode()}]</option>
					</c:forEach>
				</select>
				</td>
				<td>
				
				Date: <input type="text" id="datepicker" name="datepicker"></td>
				
				<td><select name="flightId">
					<c:forEach items="${flgtBean.getFlightCodesList()}" var="item">
						<option value="${item.getFlightId()}">${item.getFlightName()}</option>
					</c:forEach>
				</select></td>
			</tr>
			<tr><td><br/></td></tr>
			<tr>
				<td colspan="2"><b><input type="submit" Value="Search Flights"/></b></td>
			</tr>
		</table>	
	</form>
	<br/><br/><br/><br/>

	
</body>
</html>