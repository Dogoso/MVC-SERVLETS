<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/ValidateLogin" var="url"/>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login</title>
</head>
<body>
	
	<p>${url}</p>
	<h1>Login</h1>
	<form action="${url}" method="POST">
		Login: <input type="text" name="login"> <br>
		Senha: <input type="password" name="password"> <br>
		<input type="submit">
	</form>

</body>
</html>