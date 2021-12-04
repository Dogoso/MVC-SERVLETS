<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Sucesso</title>
</head>
<body>

	<c:if test="${empty nome}">
		<c:redirect url="/FormEmpresa.jsp"/>
	</c:if>
	
	<c:import url="Logout.jsp"></c:import>
	<h1>Sucesso!</h1>
	<p>Funcionario <strong>'${nome}'</strong> cadastrado com sucesso! <fmt:formatDate value="${data}"/> </p>
	
</body>
</html>