<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Lista de Funcionarios</title>
</head>
<body>

	<h1>Funcionarios: </h1> 
	<ul> <!-- Java Standart TagLib -->
		<c:forEach var="f" items="${funcionarios}">
			<li>${f}</li>
		</c:forEach>
	</ul>
	
</body>
</html>