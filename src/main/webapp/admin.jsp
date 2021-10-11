<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
</head>
<body style="width:90%; left-margin:5px; background-color:#FAF0E6;">


<H1 align="center"> FlyAway Admin Page</H1>
<p align="left"> <a href="/FlyAway/home.jsp">Home</a></p>
<p align="right"> Logged in as<i> <%= session.getAttribute("adminname") %></i>.&nbsp;<a href="/FlyAway/logout">Logout</a></p>
<p align="right"> <a href="/FlyAway/ChangePwd.jsp">Change Password</a></p>

<p>${message}</p>
<h2>Select your options:</h2>

<form action="/FlyAway/adminmaintain" method="post">
		<table style="align:center; width:20%">
			<tr>
				<td><select name="maintainType" id ="types">				
					<option value="addAdmin">Add Admin</option>
					<option value="locMaintain">Location Maintain</option>
					<option value="airMaintain">Flight Details Maintain</option>
					<option value="flightMaintain">Flight Maintain</option>
				</select>	
				</td>
			</tr>
			<tr><td><br/><br/></td></tr>
			<tr>
				<td colspan="2"><input type="submit" Value="Submit"/></td>
				<td colspan="2"><input type="reset" Value="Reset"/></td>
			</tr>
			
			
		</table>	
	</form>

</body>
</html>