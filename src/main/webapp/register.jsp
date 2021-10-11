<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway Registration Page</title>

</head>
<body style="background-image: url('bg2.jpg');">
<jsp:include page="userhead.jsp" />


<% 
				String flightdtlsid=request.getParameter("flightdtlsid");
      			session.setAttribute("flightdtlsid", flightdtlsid);
  		 %>
				<form action="/FlyAway/userdetails" method="post">
		<table>
			<tr>
				<td><b>Please Fill your details:</b><br/><br/></td>
				
      			
			</tr>
		
			<tr>
				<td>First Name: </td><td><input type="text" name="fname"/></td>
			</tr>
			
			<tr>
				<td>Last Name: </td><td><input type="text" name="lname"/></td>
			</tr>
			
			<tr>
				<td>Age: </td><td><input type="text" name="age"/></td>
			</tr>
			
			<tr>
				<td>Address: </td><td><input type="textarea" name="addr"/></td>
			</tr>
			
			<tr>
				<td>City: </td><td><input type="text" name="city"/></td>
			</tr>
			
			<tr>
				<td>Country: </td><td><input type="text" name="coun"/></td>
			</tr>
			
			<tr>
				<td>No. of passengers: </td><td><input type="text" name="count"/></td>
			</tr>
			<tr>
				<td colspan="2"><br/><br/><input type="submit" name="adduserdetail" Value="Register"/></td>
			</tr>
		</table>	
	</form>
	

</body>
</html>