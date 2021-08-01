<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nueva licencia</title>
</head>
<body>
<div class="container mt-5">
	<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
	    <p>
			<form:label path="dojo.id">Dojo:</form:label>
			<form:select path="dojo.id" cssStyle="width: 150px;">    
		        <c:forEach items="${dojos}" var="dojo">
		        		<option value="${dojo.id}">${dojo.name} </option>
		        </c:forEach>
      		</form:select>
	    </p>
	   	<p>
	        <form:label path="firstName">Nombre:</form:label>
	        <form:errors path="firstName"/>
	       	<form:input path="firstName"/>
	    </p>
	    <p>
	        <form:label path="lastName">Apellido:</form:label>
	        <form:errors path="lastName"/>
	       	<form:input path="lastName" />
	    </p>
	    <p>
	        <form:label path="age">Edad:</form:label>
	        <form:errors path="age"/>
	       	<form:input type="number" path="age" />
	    </p>
	    <input  type="submit" value="Agregar ninja"/>
	</form:form>
</div>
</body>
</html>