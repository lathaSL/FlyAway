<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
	<form action="/FlyAway/changepwd" method="post">
		<table>
			<tr>
				<td>User Name: </td><td><input type="text" name="uname"/></td>
			</tr>
			<tr>
				<td>Enter Current Password: </td><td><input type="password" name="pwd"/></td>
			</tr>
			<tr>
				<td>Enter New Password: </td><td><input type="password" name="newpwd"/></td>
			</tr>
			<tr>
				<td>Re-enter New Password: </td><td><input type="password" name="repeatpwd"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" Value="Change Password"/></td>
			</tr>
		</table>	
	</form>
	

</body>
</html>