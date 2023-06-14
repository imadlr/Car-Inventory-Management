<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css">
<meta charset="UTF-8">
<title>Modifier une commande</title>
</head>
<body class="bg-body-secondary">
<%@include file="header.jsp" %>
<div class="container container rounded mt-5 bg-white p-3">
    <h2 class="text-info m-0 mb-4">Modifier une commande</h2>
     <form class="row" action="modifierCommandeSave.php" method="post">
    <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">ID:</label>
    <input type="text" class="form-control" disabled value="${commande.id}">
    <input type="hidden" class="form-control" name="id" value="${commande.id}">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Numéro:</label>
    <input type="text" class="form-control" name="numero" value="${commande.numero}">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Date:</label>
    <input type="text" class="form-control" name="date" value="${commande.date}">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Qunatite:</label>
    <input type="text" class="form-control" name="quantite" value="${commande.quantite}">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Id Client:</label>
    <input type="text" class="form-control" name="idClient" value="${commande.idClient}">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Id Voiture:</label>
    <input type="text" class="form-control" name="idVoiture" value="${commande.idVoiture}">
  </div>
  <button type="submit" class="btn btn-primary">modifier</button>
</form>
</div>
</body>
</html>