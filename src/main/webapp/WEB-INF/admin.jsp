<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
Login as <%= session.getAttribute("adminname") %> <a href="/FlyAway/logout">Logout</a>

<form action="/FlyAway/adminmaintain" method="post">
		<table>
			<tr>
				<td><select name="maintainType" id ="types">				
					<option value="addAdmin">Add Admin</option>
					<option value="locMaintain">Location Maintain</option>
					<option value="airMaintain">Flight Details Maintain</option>
					<option value="flightMaintain">Flight Maintain</option>
				</select>	
				</td>
			</tr>
			
			<tr>
				<td colspan="2"><input type="submit" Value="Submit"/></td>
				<td colspan="2"><input type="reset" Value="Reset"/></td>
			</tr>
			
			<tr>
				<td align="right">
					<a href="/FlyAway/ChangePwd.jsp">Change Password</a>
				</td>
			</tr>
		</table>	
	</form>

</body>
</html>