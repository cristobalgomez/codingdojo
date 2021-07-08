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
	<form:form action="/licenses" method="post" modelAttribute="license">
	    <p>
			<form:label path="person.id">Publication Type:</form:label>
			<form:select path="person.id" cssStyle="width: 150px;">    
		        <c:forEach items="${person}" var="p">
		        	<c:if test="${empty p.license.id}">
		        		<option value="${p.id}">${p.firstName} ${p.lastName } </option>
		        	</c:if>
		        </c:forEach>
      		</form:select>
	    </p>
	   	<p>
	        <form:label path="state">Estado:</form:label>
	        <form:errors path="state"/>
	       	<form:input path="state"/>
	    </p>
	    <p>
	        <form:label path="expirationDate">Fecha de expiracion:</form:label>
	        <form:errors path="expirationDate"/>
	       	<form:input type="date" path="expirationDate" />
	    </p>
	    <input  type="submit" value="Agregar Persona"/>
	</form:form>
</div>
</body>
</html>