<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<body>
<div class="container mt-4">
	<div class="row">
		<div class="col-2">
			<a class="btn btn-primary" href="/songs/new">Agregar cancion</a>
		</div>
		<div class="col-2">
			<a class="btn btn-primary" href="/topTen">Top Ten</a>
		</div>
		<div class="col-8">
			<form action="search" method="post" class="row g-2">
				<div class="col-4 offset-6">
					<input class="form-control" type="text" name="search_name" placeholder="Ingrese artista"/>
				</div>
				<div class="col-2">
					<input class="btn btn-primary" type="submit" value="Buscar"/>
				</div>
			</form>
		</div>
	</div>
	<table class="table table-hover ">
	    <thead>
	        <tr>
	            <th>Titulo</th>
	            <th>Nota</th>
	            <th>Acciones</th>
	        </tr>
	    </thead>
	    <tbody>
	        <c:forEach items="${songs}" var="song">
	        <tr>
	            <td><a href="/songs/${song.id }"><c:out value="${song.title}"/></a></td>
	            <td><c:out value="${song.rating}"/></td>
	            <td>
		            <form action="/songs/${song.id}" method="post">
		    			<input type="hidden" name="_method" value="delete">
		    			<input class="btn btn-danger" type="submit" value="Borrar">
					</form>
				</td>
	        </tr>
	        </c:forEach>
	    </tbody>
	</table>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>