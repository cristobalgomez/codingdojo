<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
        <link rel="stylesheet" type="text/css" href="css/style.css">
         <script type="text/javascript" src="js/app.js"></script>

<meta charset="UTF-8">
<title>fecha</title>
</head>
<body>
<script>fecha();</script>
	 <h1 class="fecha"><fmt:formatDate type="date" dateStyle="long" value="${date}" /></h1>
</body>
</html>