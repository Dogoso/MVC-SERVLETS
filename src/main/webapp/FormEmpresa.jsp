<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/EmpresaCadastrada" var="url"/>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Cadastro</title>
</head>
<body>
	
	<p>${url}</p>
	<h1>Novo funcionario:</h1>
	<form action="${url}" method="POST">
		Nome: <input type="text" name="nome">
		Data: <input type="date" name="data">
		<input type="submit">
	</form>

</body>
</html>