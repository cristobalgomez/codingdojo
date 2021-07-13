<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nueva categoria</title>
</head>
<body>
<h1>¿Que quieres preguntar?</h1>
	<form:form action="/questions/new" method="post" modelAttribute="createQuestion">
		 <p>
	        <form:label path="question">Pregunta:</form:label>
	        <form:errors path="question"/>
	        <form:textarea path="question"/> 
	    </p>
	    <p>	
	    	<label for="questionTags">Tags:</label>
 			<input type="text" name="questionTags">
	    </p>
	    <input  type="submit" value="Publicar"/>
	</form:form>
</body>
</html>