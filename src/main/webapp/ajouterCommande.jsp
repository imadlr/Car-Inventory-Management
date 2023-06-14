<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css">
<meta charset="UTF-8">
<title>Ajouter une commande</title>
</head>
<body class="bg-body-secondary">
<%@include file="header.jsp" %>
<div class="container container rounded mt-5 bg-white p-3">
    <h2 class="text-info m-0 mb-4">Ajouter une commande</h2>
     <form class="row" action="ajouterCommande.php" method="post">
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Numéro:</label>
    <input type="text" class="form-control" name="numero" aria-describedby="emailHelp">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Date:</label>
    <input type="text" class="form-control" name="date" aria-describedby="emailHelp" placeholder="exemple: 2022-12-24">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Quantité:</label>
    <input type="text" class="form-control" name="quantite" aria-describedby="emailHelp">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Id_Client:</label>
    <input type="text" class="form-control" name="idClient" aria-describedby="emailHelp">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Id_Voiture:</label>
    <input type="text" class="form-control" name="idVoiture" aria-describedby="emailHelp">
  </div>
  <button type="submit" class="btn btn-primary">ajouter</button>
</form>
</div>
</body>
</html>