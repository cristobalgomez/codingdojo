<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Counter</title>
</head>
<body>
<form action="./Counter" method="post">
    <input type="submit" name="add" value="Click Me" />
</form>

	<h1>You have clicked this button <c:out value="${sessionClicks}"/> times.</h1>
</body>
</html>