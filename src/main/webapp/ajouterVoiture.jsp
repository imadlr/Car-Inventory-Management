<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css">
<meta charset="UTF-8">
<title>Ajouter une voiture</title>
</head>
<body class="bg-body-secondary">
<%@include file="header.jsp" %>
<div class="container container rounded mt-5 bg-white p-3">
    <h2 class="text-info m-0 mb-4">Ajouter une voiture</h2>
     <form class="row" action="ajouterVoiture.php" method="post">
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Marque:</label>
    <input type="text" class="form-control" name="marque" aria-describedby="emailHelp">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Modele:</label>
    <input type="text" class="form-control" name="modele" aria-describedby="emailHelp">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Couleur</label>
    <input type="text" class="form-control" name="couleur" aria-describedby="emailHelp">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Immatriculation:</label>
    <input type="text" class="form-control" name="matricule" aria-describedby="emailHelp">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">quantite:</label>
    <input type="text" class="form-control" name="quantite" aria-describedby="emailHelp">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">prix d'achat:</label>
    <input type="text" class="form-control" name="prixAchat" aria-describedby="emailHelp">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Date d'achat:</label>
    <input type="text" class="form-control" name="dateAchat" placeholder="exemple: 2020-12-31" aria-describedby="emailHelp">
  </div>
  <button type="submit" class="btn btn-primary">ajouter</button>
</form>
</div>
</body>
</html>