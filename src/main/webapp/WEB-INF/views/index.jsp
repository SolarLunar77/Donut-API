<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

	<div>
		<h1>Donut Selection</h1>
		<c:forEach items="${donuts}" var="i">
			<ul>
				<li><a href="/details?id=${i.id}">${i.name}</a></li>
			</ul>
		</c:forEach>
	</div>


</body>
</html>