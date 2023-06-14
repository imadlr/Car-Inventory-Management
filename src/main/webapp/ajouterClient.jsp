<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css">
<meta charset="UTF-8">
<title>Ajouter un client</title>
</head>
<body class="bg-body-secondary">
<%@include file="header.jsp" %>
<div class="container container rounded mt-5 bg-white p-3">
    <h2 class="text-info m-0 mb-4">Ajouter un Client</h2>
     <form class="row" action="ajouterClient.php" method="post">
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Cin:</label>
    <input type="text" class="form-control" name="cin" aria-describedby="emailHelp">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Nom:</label>
    <input type="text" class="form-control" name="nom" aria-describedby="emailHelp">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Prenom</label>
    <input type="text" class="form-control" name="prenom" aria-describedby="emailHelp">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Adresse:</label>
    <input type="text" class="form-control" name="adresse" aria-describedby="emailHelp">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Telephone:</label>
    <input type="text" class="form-control" name="telephone" aria-describedby="emailHelp">
  </div>
  <button type="submit" class="btn btn-primary">ajouter</button>
</form>
</div>
</body>
</html>