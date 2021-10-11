<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
 <jsp:useBean id="locBean" class="com.dto.Location"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway Home Page</title>
</head>
<body style="background-color:#FAF0E6;">
<jsp:include page="adminhead.jsp" />
<p><font color="blue">${message}</font></p>


	<form action="/FlyAway/addloc.jsp" method="post">
		<table>
			<tr>
				<td><b>Location Code</b></td><td/><td><b>Location Name</b></td><td></td>
			</tr>	
			<tr><td><br/></td></tr>
					<c:forEach items="${locBean.getLocations()}" var="item">
		   <tr>
				<td>${item.getLocCode()}</td><td/><td>${item.getLocName()}</td><td></td>
			</tr>
			
		</c:forEach>
		<tr><td><br/></td></tr>
			<tr>
				<td colspan="2"><input type="submit" Value="Add Location"/></td>
			</tr>
		</table>	
	</form>
	

</body>
</html>