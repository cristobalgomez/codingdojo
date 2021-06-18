<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>show person page</title>
		<style>
		div.container {
			text-align: center;
		}
		div.container div.right {
			background-color: green;
			color: white;
			padding: 5px;
			width: 200px;
			margin: 10px auto;
		}
		div.container div.wrong {
			background-color: red;
			color: white;
			padding: 5px;
			width: 200px;
			margin: 10px auto;
		}
		</style>

	</head>
	<body>
		<div class="container">
		
			<h1>Welcome to the Great Number Game</h1>
			<h3>I'm thinking in a number between 1 and 100</h3>
			<h3>Take a guess!</h3>
			
			<c:if test="${randomNumber.getLives() != 0}">
				<c:if test="${answer != 'same'}">
					<form action="./Home" method="post">
						<input type="text" name="number">
						<input type="submit" name="submit" value="guess">
					</form>
				</c:if>
			</c:if>
						
			<c:if test="${randomNumber.getLives() == 0 || answer == 'same'}">
				<form action="./Home" method="post">
					<input type="submit" name="reset" value="reset game">
				</form>
			</c:if>
			
			<c:if test="${answered == 'yes'}">
				<div class="${answer == 'same' ? 'right' : 'wrong'}">
					<h1>
					<c:choose>
						<c:when test="${answer == 'greater'}">
							Too low!
						</c:when>
						<c:when test="${answer == 'lower'}">
							Too high!
						</c:when>
						<c:when test="${answer == 'same'}">
							<c:out value="${randomNumber.getRandomNumber()}"/> was the number!
						</c:when>
					</c:choose>
					</h1>
				</div>
			</c:if>



<%-- 			<c:out value="${randomNumber.getRandomNumber()}"/> --%>
<%-- 			<c:out value="${randomNumber.getLives()}"/> --%>
<%-- 			<c:out value="${answer}"/> --%>

		</div>
	</body>
</html>