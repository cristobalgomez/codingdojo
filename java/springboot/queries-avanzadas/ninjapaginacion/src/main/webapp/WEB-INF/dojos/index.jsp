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
	<table>
	    <thead>
	        <tr>
	            <th>Nombre</th>
	            <th>numero de ninjas</th>
	        </tr>
	    </thead>
	    <tbody>
	        <c:forEach items="${dojos}" var="dojo">
		        <tr>
		            <td><c:out value="${dojo.name}"/></td>
		            <td><c:out value="${dojo.ninjas.size()}"/></td>
		        </tr>
	        </c:forEach>
	    </tbody>
	</table>
</body>
</html>