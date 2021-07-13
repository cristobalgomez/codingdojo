<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Preguntas</title>
</head>
<body>
<h1>Preguntas:</h1>
	
	<table>
	    <thead>
	        <tr>
	            <th>Preguntas</th>
	            <th>Tags</th>
	        </tr>
	    </thead>
	    <tbody>
	        <c:forEach items="${questions}" var="q">
		        <tr>
		            <td><a href="/questions/${q.id }"><c:out value="${q.question}"/> </a></td>
		            <td>
		           	 	<c:forEach items="${q.tags}" var="t">
		           	 		<c:out value="${t.subject}"/>
		           	 	</c:forEach>
		            </td>
		        </tr>
	        </c:forEach>
	    </tbody>
	</table>
	<a href="/questions/new">#Nueva pregunta</a>
	
</body>
</html>