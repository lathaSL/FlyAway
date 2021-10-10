<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway Home Page</title>
</head>
<body>
	<form action="/FlyAway/locmaintain" method="post">
		<table>
			<tr>
				<td>Location Code</td><td><input type="text" name="locCode"/></td>
			</tr>
			<tr>
				<td>Location Name</td><td><input type="text" name="locName"/></td>
			</tr>
			
			
			<tr>
				<td colspan="2"><input type="submit" Value="Add" name="type"/></td>
				<td colspan="2"><input type="Reset" Value="Reset"/></td>
			</tr>
		</table>	
	</form>
	

</body>
</html>