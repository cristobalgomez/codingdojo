<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojos</title>
</head>
<body>

	<h1><c:out value="${dojo.name }"/></h1>
	<table>
	    <thead>
	        <tr>
	            <th>Nombre</th>
	            <th>Apellido</th>
	            <th>Edad</th>
	        </tr>
	    </thead>
	    <tbody>
			<c:forEach items="${dojo.ninjas}" var="ninja">
		        <tr>
		            <td><c:out value="${ninja.firstName}"/></td>
		            <td><c:out value="${ninja.lastName}"/></td>
		            <td><c:out value="${ninja.age}"/></td>
		        </tr>
	        </c:forEach>
	    </tbody>
	</table>
</body>
</html>