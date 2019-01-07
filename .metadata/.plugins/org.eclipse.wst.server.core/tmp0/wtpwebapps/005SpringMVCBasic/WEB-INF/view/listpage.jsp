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
				<th>ID</th>
				<th>Name</th>
				<th>Location</th>
				<th colspan="2">Actions</th>
			</tr>
			<c:forEach items="${friends}" var="friend">
			 <tr>
			 	<td><c:out value="${friend.id}"></c:out></td>
			 	<td><c:out value="${friend.friendName}"></c:out></td>
			 	<td><c:out value="${friend.friendLocation}"></c:out></td>
			 	<td>
			 		<a href="delete.spring?id=${friend.id}">Delete</a> 
			 	</td>
			 	<td>
			 		<a href="update.spring?id=${friend.id}">Update</a>
			 	</td>
			 	
			 </tr>
			</c:forEach>
		</table>
		

</body>
</html>