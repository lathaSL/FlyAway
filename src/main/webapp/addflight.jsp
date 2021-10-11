<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway Home Page</title>
</head>
<body style="background-color:#FAF0E6;">
<jsp:include page="adminhead.jsp" />
<H2>Add Flight:</H2>
	<form action="/FlyAway/flightmaintain" method="post">
		<table>
			<tr>
				<td><b>Flight Code</b></td><td><input type="text" name="flightCode"/></td>
			</tr>
			<tr>
				<td><b>Flight Name</b></td><td><input type="text" name="flightName"/></td>
			</tr>
			
			<tr><td><br/></td></tr>
			<tr>
				<td><input type="submit" Value="Add" name="type"/></td>
				<td><input type="Reset" Value="Reset"/></td>
			</tr>
		</table>	
	</form>
	

</body>
</html>