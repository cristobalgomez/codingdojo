<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cat and Dog</title>
	</head>
	<body>
	<h2>Cat</h2>
		<form action="./Cats">
		  <label for="name">name:</label>
		  <input type="text" id="name" name="name" value="Juanito">
		  <label for="breed">breed:</label>
		  <input type="text" id="breed" name="breed" value="Persa">
		  <label for="weight">weight:</label>
		  <input type="text" id="weight" name="weight" value="88">
		  <input type="submit" value="Submit">
		</form>
	<h2>Dog</h2>	
		<form action="./Dogs">
		  <label for="name">name:</label>
		  <input type="text" id="name" name="name" value="Firulais">
		  <label for="breed">breed:</label>
		  <input type="text" id="breed" name="breed" value="Quiltro">
		  <label for="weight">weight:</label>
		  <input type="text" id="weight" name="weight" value="88">
		  <input type="submit" value="Submit">
		</form>
	</body>
</html>