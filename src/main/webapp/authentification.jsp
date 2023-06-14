<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="txt/html">
<title>Connection</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css">
</head>
<body class="bg-body-secondary">
<div class="container rounded mt-5 bg-white p-3 w-50">
	<form class="row" action="authentification.php" method="post">
		<div class="mb-3">
			<label class="form-label">Nom d'utilisateur:</label>
			<input type="text" class="form-control" name="user" aria-describedby="emailHelp">
		</div>
		<div class="mb-3">
			<label class="form-label">Mot de passe:</label>
			<input type="password" class="form-control" name="pass" aria-describedby="emailHelp">
		</div>
  		<button type="submit" class="btn btn-primary">se connecter</button>
	</form>
</div>
<script src="js/bootstrap.bundle.min.js"></script>
</body>
</html>