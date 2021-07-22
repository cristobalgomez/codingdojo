<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
        <c:forEach var="country" items="${sloveneSpeakingCountries}">                
			<c:out value="${country.name }" />
        </c:forEach>
        <hr>
        <c:forEach var="c" items="${numberOfCitiesByCountry}">                
			<c:out value="${c[0].name }" />
			<c:out value="${c[1] }" />
        </c:forEach>
        <hr>
        <c:forEach var="city" items="${mexicanCities}">                
			<c:out value="${city.name }" />
			<c:out value="${city.population }" />
        </c:forEach>
        <hr>
        
         <c:forEach var="country" items="${countriesByPoplationAndSurface}">                
			<c:out value="${country.name }" />
			<c:out value="${country.population }" />
			<c:out value="${country.surfaceArea }" />
        </c:forEach>
        
		<hr>
        
         <c:forEach var="country" items="${monarchyCountries}">                
			<c:out value="${country.name }" />
			<c:out value="${country.governmentForm }" />
			<c:out value="${country.surfaceArea }" />
			<c:out value="${country.population }" />
        </c:forEach>
        
		<hr>
        
         <c:forEach var="city" items="${citiesInBuenosAires}">                
			<c:out value="${city.name }" />
			<c:out value="${city.population }" />
        </c:forEach>
        
        <hr>
        
         <c:forEach var="lang" items="${languages}">                
			<c:out value="${lang[0].language }" />
			<c:out value="${lang[0].percentage }" />
			<c:out value="${lang[1].name }" />
        </c:forEach>
        
        <hr>
        
         <c:forEach var="country" items="${countriesByRegion}">                
			<c:out value="${country[0]}" />
			<c:out value="${country[1] }" />
        </c:forEach>
        
        
        
        
        
</body>
</html>