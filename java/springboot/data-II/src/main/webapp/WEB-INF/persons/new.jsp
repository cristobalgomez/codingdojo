<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nueva Cancion</title>
</head>
<body>
<div class="container mt-5">
	<form:form action="/persons" method="post" modelAttribute="person">
	    <p>
	        <form:label path="firstName">Nombre:</form:label>
	        <form:errors path="firstName"/>
	        <form:input path="firstName"/>
	    </p>
	    <p>
	        <form:label path="lastName">Apellido:</form:label>
	        <form:errors  path="lastName"/>
	       	<form:input path="lastName"/>
	    </p>
	    <input  type="submit" value="Agregar Persona"/>
	</form:form>
</div>
</body>
</html>