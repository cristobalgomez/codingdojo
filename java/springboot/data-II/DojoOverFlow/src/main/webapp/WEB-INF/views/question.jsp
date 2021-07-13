<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Pregunta - ${question.question }</title>
</head>
<body>
	<h1><c:out value="${question.question }"/></h1>
	<p>Tags:</p>
		<ul>
			<c:forEach items="${question.tags}" var="t">
				<li><c:out value="${t.subject}"/></li>
			</c:forEach>
		</ul>
		
		<h3>Respuestas</h3>
		<c:choose>
			<c:when test="${question.answer.size() == 0}">
		    	<p>No hay respuestas :(. Se el primero en dar tu opinion</p>
		    </c:when>
			<c:otherwise>
		    	<c:forEach items="${question.answer}" var="answer" varStatus="loop">
					<p>#<c:out value="${loop.index + 1 }"/>. <c:out value="${answer.answer}"/></p>
				</c:forEach>
		    </c:otherwise>
		</c:choose>
		

		
		<h3>Agrega tu respuesta</h3>
		<form:form action="/questions/${question.id }" method="post" modelAttribute="createAnswer">
			 <p>
		        <form:label path="answer">Pregunta:</form:label>
		        <form:errors path="answer"/>
		        <form:textarea path="answer"/> 
		    </p>
			<form:hidden path="question" value="${question.id}" />
		    <input  type="submit" value="Publicar"/>
		</form:form>
		<a href="/questions">Volver al inicio</a>		
</body>
</html>