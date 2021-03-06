<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lenguajes</title>
</head>
<body>
<h1>Lenguajes</h1>
	<table>
	    <thead>
	        <tr>
	            <th>Nombre</th>
	            <th>Creador</th>
	            <th>Version</th>
	            <th>Accion</th>
	        </tr>
	    </thead>
	    <tbody>
	        <c:forEach items="${languages}" var="language">
	        <tr>
	            <td><a href="/languages/${language.id}"><c:out value="${language.name}"/></a></td>
	            <td><c:out value="${language.creator}"/></td>
	            <td><c:out value="${language.currentVersion}"/></td>
	            <td>
	            <form action="/languages/${language.id}" method="post">
	            	<input type="hidden" name="_method" value="delete">
	            	<input type="submit" value="eliminar"> 
    			</form>
    			| <a href="/languages/${language.id}/edit">Editar</a>
    			</td>
	        </tr>
	        </c:forEach>
	    </tbody>
	</table>
	
	<h1>Nuevo Lenguage</h1>
	<form:form action="/languages" method="post" modelAttribute="language">
	    <p>
	        <form:label path="name">Nombre</form:label>
	        <form:errors path="name"/>
	        <form:input path="name"/>
	    </p>
	    <p>
	        <form:label path="creator">Creador</form:label>
	        <form:errors path="creator"/>
	        <form:textarea path="creator"/>
	    </p>
	    <p>
	        <form:label path="currentVersion">Version actual</form:label>
	        <form:errors path="currentVersion"/>     
	        <form:input path="currentVersion"/>
	    </p>    
	    <input type="submit" value="Submit"/>
	</form:form>
</body>
</html>