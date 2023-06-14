<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/main.css">
<meta charset="UTF-8">
<title>Modier une voiture</title>
</head>
<body class="bg-body-secondary">
<%@include file="header.jsp" %>
<div class="container container rounded mt-5 bg-white p-3">
    <h2 class="text-info m-0 mb-4">Modifier une voiture</h2>
     <form class="row" action="modifierVoitureSave.php" method="post">
    <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">ID:</label>
    <input type="text" class="form-control" disabled value="${voiture.id}">
    <input type="hidden" class="form-control" name="id" value="${voiture.id}">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Marque:</label>
    <input type="text" class="form-control" name="marque" value="${voiture.marque}">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Modele:</label>
    <input type="text" class="form-control" name="modele" value="${voiture.modele}">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Couleur</label>
    <input type="text" class="form-control" name="couleur" value="${voiture.couleur}">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Immatriculation:</label>
    <input type="text" class="form-control" name="matricule" value="${voiture.matricule}">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">quantite:</label>
    <input type="text" class="form-control" name="quantite" value="${voiture.quantite}">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">prix d'achat:</label>
    <input type="text" class="form-control" name="prixAchat" value="${voiture.prixAchat}">
  </div>
  <div class="mb-3 col-lg-4 col-md-6">
    <label class="form-label">Date d'achat:</label>
    <input type="text" class="form-control" name="dateAchat" value="${voiture.dateAchat}">
  </div>
  <button type="submit" class="btn btn-primary">modifier</button>
</form>
</div>
</body>
</html>