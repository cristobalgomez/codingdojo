<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cual es tu lenguaje favorito</title>
</head>
<body>
<h4><c:out value="${error }"/></h4>
<form action="./procesar" method="post">
	Nombre: <input type="text" name="nombre"><br>
	Ubicacion: 
	<select name="ubicacion">
  		<option value="Santiago" selected>Santiago</option>
  		<option value="Temuco">Temuco</option>
  		<option value="Valdivia">Valdivia</option>
	</select><br>
	Lenguaje favorito: 
	<select name="lenguaje">
  		<option value="Python" selected>Python</option>
  		<option value="Java">Java</option>
  		<option value="Rust">Rust</option>
	</select><br>
	Comentario: 
	<textarea name="comentario"></textarea>
	<br>
	<input type="submit" value="Publicar">

	
</form>

</body>
</html>