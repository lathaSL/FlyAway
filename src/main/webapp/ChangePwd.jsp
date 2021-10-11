<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
</head>
<body style="background-color:#FAF0E6;">
<H1 align="center"> FlyAway Admin Page</H1>
<p align="left"> <a href="/FlyAway/admin.jsp">Home</a></p>
	<form action="/FlyAway/changepwd" method="post">
		<table>			
			<tr>
				<td>Enter Current Password: </td><td><input type="password" name="pwd"/></td>
			</tr>
			<tr>
				<td>Enter New Password: </td><td><input type="password" name="newpwd"/></td>
			</tr>
			<tr>
				<td>Re-enter New Password: </td><td><input type="password" name="repeatpwd"/></td>
			</tr>
			<tr><td><br/></td></tr>
			<tr>
				<td><input type="submit" Value="Change Password"/></td>
				<td><input type="Reset" Value="Reset"/></td>
				
			</tr>
		</table>	
	</form>
	

</body>
</html>