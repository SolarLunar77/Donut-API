<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details</title>
</head>
<body>

<a href="/">Home</a> 
<br>

<h1>Donut</h1>

<div>	
<h2>Donut Details</h2>
	<p>Name: ${donut.name} <p>
	<p>Calories: ${donut.calories}<p>			
	<p>Extras:</p>
	<ul>
		<c:forEach items="${donut.extras}" var="i">
				<li><c:out value="${i}"/></li>
		</c:forEach>
	</ul>
</div>

</body>
</html>