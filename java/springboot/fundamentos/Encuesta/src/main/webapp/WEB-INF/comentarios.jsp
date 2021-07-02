<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Comentarios</title>
</head>
<body>
<%-- 	<c:out value="${comentarios }"/> --%>
	

 		<c:forEach items="${comentarios}" var="comentario">
 			<ul>
		  		<li>Nombre: <c:out value="${comentario.get(0)}"/></li>
		  		<li>Ubicacion: <c:out value="${comentario.get(1)}"/></li>
		  		<li>Lenguaje Favorito: <c:out value="${comentario.get(2)}"/></li>
		  		<li>Comentario: <c:out value="${comentario.get(3)}"/></li>
	  		</ul>
 		</c:forEach>

</body>
</html>