<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${product.name }</title>
</head>
<body>
<ul>
	<li><c:out value="${product.name }"/></li>
	<li><c:out value="${product.description }"/></li>
	<li><c:out value="${product.price }"/></li>
</ul>
		        <ul>
		        <c:forEach items="${product.categories}" var="category">
		        		<li><c:out value="${category.name }"/></li>
		        </c:forEach>
		        </ul>
		        
	<form:form action="/add" method="post" modelAttribute="categoryProduct">
	    <p>
			<form:label path="category">Categoria:</form:label>
			<form:select path="category">    
		        <c:forEach items="${categories}" var="category">
		        		<option value="${category.id}">${category.name} </option>
		        </c:forEach>
		        <form:hidden path="product" value="${product.id}" />
      		</form:select>
	    </p>
	    <input  type="submit" value="Agregar categoria"/>
	</form:form>
</body>
</html>