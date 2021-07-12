<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nuevo Producto</title>
</head>
<body>
	<form:form action="/products/new" method="post" modelAttribute="product">
	    <p>
	        <form:label path="name">Nombre:</form:label>
	        <form:errors path="name"/>
	        <form:input path="name"/>
	    </p>
	    	    <p>
	        <form:label path="description">Descripcion:</form:label>
	        <form:errors path="description"/>
	         <form:textarea path="description"/> 
	    </p>
	    	    <p>
	        <form:label path="price">Precio:</form:label>
	        <form:errors path="price"/>
	        <form:input path="price"/>
	    </p>
	    <input  type="submit" value="Agregar Producto"/>
	</form:form>
</body>
</html>