<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/NovoRegistro" var="url"/>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Cadastro</title>
</head>
<body>
	
	<p>${url}</p>
	<c:import url="Logout.jsp"></c:import>
	<h1>Novo funcionario:</h1>
	<form action="${url}" method="POST">
		Nome: <input type="text" name="nome"> <br>
		Genero: <input type="text" name="genero"> <br>
		Data: <input type="text" name="data"> <br>
		Id: <input type="number" name="id"> <br>
		<input type="submit">
	</form>

</body>
</html>