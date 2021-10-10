<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway Home Page</title>
</head>
<body>
	<form action="/FlyAway/insertadmin" method="post">
		<table>
			<tr>
				<td>User Name: </td><td><input type="text" name="uname"/></td>
			</tr>
			<tr>
				<td>Password: </td><td><input type="password" name="pwd"/></td>
			</tr>
			<tr>
				<td>Role: </td><td><select name="role" >
					<option value="admin">Admin</option>
					<option value="user">User</option>
					</select>
				</td>
			</tr>
			
			<tr>
				<td colspan="2"><input type="submit" Value="Insert"/></td>
			</tr>
		</table>	
	</form>
	

</body>
</html>