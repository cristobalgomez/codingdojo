<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="./style.css" rel="stylesheet" type="text/css">
		<title>Tablero</title>
		
	</head>
	<body>
<%
String _width = request.getParameter("width") != null ? request.getParameter("width") : "2";
String _height = request.getParameter("height") != null ? request.getParameter("height") : "2";
int width = Integer.parseInt(_width);
int height = Integer.parseInt(_height);
%>
	<div id="title">
		<span>
			<h1>Checkerboard: <%= width %>w X <%= height %>h </h1>
		</span>
	</div>
			<div id="board">
				<%
					for(int h = 0; h < height; h++) {
						for(int w = 0; w < width; w++) {
				%>
					<div class="square <%= (h+w)%2 == 0 ? "even" : "odd" %>"></div>
				<% 
						} 
				%> 
					<br>
				<% 
					} 
				%> 
			</div>

	</body>
</html>