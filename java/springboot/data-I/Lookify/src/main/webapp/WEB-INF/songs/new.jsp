<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nueva Cancion</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container mt-5">
	<form:form action="/songs/new" method="post" modelAttribute="song">
	    <p>
	        <form:label class="form-label" path="title">Titulo:</form:label>
	        <form:errors class="alert alert-warning" role="alert" path="title"/>
	        <form:input class="form-control" path="title"/>
	    </p>
	    <p>
	        <form:label class="form-label" path="artist">Artista:</form:label>
	        <form:errors class="alert alert-warning" role="alert" path="artist"/>
	       	<form:input class="form-control" path="artist"/>
	    </p>
	    <p>
	        <form:label class="form-label" path="rating">Nota (1-10):</form:label>
	        <form:errors class="alert alert-warning" role="alert" path="rating"/>  
	        <form:input class="form-control" type="number" path="rating"/>
	    </p>    
	    <input class="btn btn-primary" type="submit" value="Agregar Cancion"/>
	</form:form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>