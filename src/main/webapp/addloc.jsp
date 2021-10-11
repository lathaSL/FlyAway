<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway Home Page</title>
</head>
<body style="background-color:#FAF0E6;">
<H1 align="center"> FlyAway Admin Page</H1>
<p align="left"> <a href="/FlyAway/admin.jsp">Home</a></p>
<p align="right"> Logged in as<i> <%= session.getAttribute("adminname") %></i>.&nbsp;<a href="/FlyAway/logout">Logout</a></p>
<H2>Add Location:</H2>

	<form action="/FlyAway/locmaintain" method="post">
		<table>
			<tr>
				<td>Location Code</td><td><input type="text" name="locCode"/></td>
			</tr>
			<tr>
				<td>Location Name</td><td><input type="text" name="locName"/></td>
			</tr>
			<tr><td><br/></td></tr>
			
			<tr>
				<td align="right"><input type="submit" Value="Add" name="type"/></td>
				<td><input type="Reset" Value="Reset"/></td>
			</tr>
		</table>	
	</form>
	

</body>
</html>