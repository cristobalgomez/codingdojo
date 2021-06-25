<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Calculadora</title>
		<style>
		form {
			width:130px;
		}
		</style>
	</head>
	<body>
		<form action="./Home" method="post">
			<input type="text" name="textcharacter" onchange="this.form.submit()">
			<button name="character" value="0">0</button>
			<button name="character" value="1">1</button>
			<button name="character" value="2">2</button>
			<button name="character" value="3">3</button>
			<button name="character" value="4">4</button>
			<button name="character" value="5">5</button>
			<button name="character" value="6">6</button>
			<button name="character" value="7">7</button>
			<button name="character" value="8">8</button>
			<button name="character" value="9">9</button>
			<button name="character" value="+">+</button>
			<button name="character" value="-">-</button>
			<button name="character" value="*">*</button>
			<button name="character" value="/">/</button>
			<button name="character" value="=">=</button>
		</form>
		<div class="results">
			<h1>Results</h1>
			<c:out value="${res }"/>
		</div>
	</body>
</html>