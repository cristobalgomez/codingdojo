<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/style.css">
<meta charset="UTF-8">
<title>NinjaGold</title>
</head>
<body>
<h1>Tienes <c:out value="${oro }" /> monedas de oro</h1>
<form action="./generarOro" method="post">
	<h2>Granja</h2><h4>Gana entre 10 y 20 monedas de oro</h4><button name="lugar" value="granja">Buscar Oro</button>
</form>
<form action="./generarOro" method="post">
	<h2>Cueva</h2><h4>Gana entre 5 y 10 monedas de oro </h4><button name="lugar" value="cueva">Buscar Oro</button>
</form>
<form action="./generarOro" method="post">
	<h2>Casa</h2><h4>Gana entre 2 y 5 monedas de oro</h4><button name="lugar" value="casa">Buscar Oro</button>
</form>
<form action="./generarOro" method="post">
	<h2>Casino</h2><h4>Gana o pierde entre 0 y 50 monedas de oro</h4><button name="lugar" value="casino">Buscar Oro</button>
</form>
<form action="./generarOro" method="post">
	<button name="lugar" value="reset">Reset</button>
</form>

<h3>Actividad:</h3>
<div class="actividad">
<c:forEach items="${actividad }" var="act">

<c:set var="actPartes" value="${fn:split(act, ';')}" />
<p class="${actPartes[0] }"><c:out value="${ actPartes[1] }"/></p>
</c:forEach>
</div>

</body>
</html>