<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${category.name }</title>
</head>
<body>

	<h1><c:out value="${product.name }"/></h1>

		        <ul>
		        <c:forEach items="${product.categories}" var="category">
		        		<li><c:out value="${category.name }"/></li>
		        </c:forEach>
		        </ul>
		        
	<form:form action="/add" method="post" modelAttribute="categoryProduct">
	    <p>
			<form:label path="product">Categoria:</form:label>
			<form:select path="product">    
		        <c:forEach items="${products}" var="product">
		        		<option value="${product.id}">${product.name} </option>
		        </c:forEach>
		        <form:hidden path="category" value="${category.id}" />
      		</form:select>
	    </p>
	    <input  type="submit" value="Agregar categoria"/>
	</form:form>
</body>
</html>