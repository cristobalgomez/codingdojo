<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Personas - Licencias</title>
</head>
<body>
	<table>
	    <thead>
	        <tr>
	            <th>Nombre</th>
	            <th>Numero licencia</th>
	            <th>Fecha Expiracion</th>
	        </tr>
	    </thead>
	    <tbody>
	        <c:forEach items="${people}" var="person">
	        <tr>
	            <td><c:out value="${person.firstName}"/></td>
	            <td><a href="/persons/${person.id }"><c:out value="${person.license.number}"/></a></td>
	            <td><c:out value="${person.license.expirationDate}"/></td>
	        </tr>
	        </c:forEach>
	    </tbody>
	</table>
</body>
</html>