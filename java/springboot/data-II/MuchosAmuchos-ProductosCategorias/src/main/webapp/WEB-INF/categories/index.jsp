<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>categorias</title>
</head>
<body>
	<table>
	    <thead>
	        <tr>
	            <th>Nombre categoria</th>
	            <th>Numero de productos</th>
	        </tr>
	    </thead>
	    <tbody>
	        <c:forEach items="${categories}" var="category">
		        <tr>
		            <td><c:out value="${category.name}"/></td>
		            <td><c:out value="${category.products.size()}"/></td>
		        </tr>
	        </c:forEach>
	    </tbody>
	</table>
</body>
</html>