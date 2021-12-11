<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/ExcluirPessoa" var="url"/>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Lista de Funcionarios</title>
</head>
<body>

	<h1>Funcionarios: </h1> 
	<c:import url="Logout.jsp"></c:import>
	<ul> <!-- Java Standart TagLib -->
		<c:forEach var="f" items="${funcionarios}">
			<li>
				${f.name}, ${f.genero}, ${f.id}
				<a href="${url}?id=${f.id}">Excluir</a>
			</li>
		</c:forEach>
	</ul>
	
</body>
</html>