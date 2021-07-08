<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>${person.firstName } ${person.lastName }</title>
</head>
<body>

		<h1><c:out value="${person.firstName}"/><c:out value="${person.firstName}"/></h1>
		<p>Numero de licencia: <c:out value="${person.license.number}"/></p>
		<p>Estado: <c:out value="${person.license.state}"/></p>
		<p>Fecha de expiracion: <c:out value="${person.license.expirationDate}"/></p>

</body>
</html>