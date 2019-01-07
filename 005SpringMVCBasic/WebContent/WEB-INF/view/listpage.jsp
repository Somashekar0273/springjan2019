<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Page</title>
</head>
<body>
		<table border="1">
			<tr>
				<th>Name</th>
				<th>Location</th>
			</tr>
			<c:forEach items="${friends}" var="friend">
			 <tr>
			 	<td><c:out value="${friend.friendName}"></c:out></td>
			 	<td><c:out value="${friend.friendLocation}"></c:out></td>
			 </tr>
			</c:forEach>
		</table>
		

</body>
</html>